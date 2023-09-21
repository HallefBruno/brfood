package br.com.company.brfood.conexao;

import br.com.company.brfood.utils.ReadProperties;
import java.math.BigDecimal;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Blob;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class ConnectionFactory {

    static final Logger logger = Logger.getLogger(ConnectionFactory.class.getName());
    private static ConnectionFactory connectionFactory;
    public PreparedStatement ps;
    public Statement st;
    public ResultSet rs;
    public Connection conn;

    private ConnectionFactory() {
    }

    public static ConnectionFactory getInstance() {
        if (connectionFactory == null) {
            connectionFactory = new ConnectionFactory();
        }
        return connectionFactory;
    }

    public void conexao() {
        try {
            var config = ReadProperties.getInstance().configConnection();
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(config.get("url"), config.get("user"), config.get("password"));
            logger.info("Abrindo conexão!");
            abrirTransacao();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }
    
    @Deprecated
    public void executaSql(String sql) {
        try {
            logger.info("Executando SQL!");
            //statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = ps.executeQuery(sql);
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    public void executaPS(String sql, Map<String, Object> map) {
        try {
            logger.info("Executando executaPS!");
            ps = conn.prepareStatement(sql);
            setParameter(map);
            rs = ps.executeQuery();
            logger.info(ps.toString());
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    private void setParameter(Map<String, Object> params) {
        if (!params.isEmpty()) {
            int paramNumber = 1;
            for (String paramName : params.keySet()) {
                Object paramValue = params.get(paramName);
                if (Objects.nonNull(paramValue)) {
                    try {
                        if (paramValue instanceof Date) {
                            ps.setDate(paramNumber, (java.sql.Date) paramValue);
                        } else if (paramValue instanceof Integer integer) {
                            ps.setInt(paramNumber, integer);
                        } else if (paramValue instanceof String) {
                            ps.setString(paramNumber, paramValue.toString());
                        } else if (paramValue instanceof BigDecimal bigDecimal) {
                            ps.setBigDecimal(paramNumber, bigDecimal);
                        } else if (paramValue instanceof Float f) {
                            ps.setFloat(paramNumber, f);
                        } else if (paramValue instanceof Double d) {
                            ps.setDouble(paramNumber, d);
                        } else if (paramValue instanceof Blob blob) {
                            ps.setBlob(paramNumber, blob);
                        } else if (paramValue instanceof Boolean boo) {
                            ps.setBoolean(paramNumber, boo);
                        }
                        paramNumber++;
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex.getMessage(), ex);
                    }
                }
            }
        }
    }

    public void desconecta() {
        try {
            fecharTransacao();
            conn.close();
            logger.info("Fechando conexão!");
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    public void abrirTransacao() {
        try {
            logger.info("Abrindo transação!");
            conn.setAutoCommit(false);
        } catch (SQLException ex) {
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                throw new RuntimeException(ex.getMessage(), ex1);
            }
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    public void fecharTransacao() {
        try {
            logger.info("Fechando transação!");
            conn.commit();
            conn.setAutoCommit(true);
        } catch (SQLException ex) {
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                throw new RuntimeException(ex.getMessage(), ex1);
            }
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }
}
