
package br.com.company.brfood.view;

import java.awt.Color;
import javax.swing.JFrame;

public class Home extends javax.swing.JFrame {
    
    
    public Home() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        panelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbDashboard = new javax.swing.JLabel();
        lbPedidos = new javax.swing.JLabel();
        lbProdutos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        desktopPane.setBackground(new java.awt.Color(153, 153, 153));
        desktopPane.setForeground(new java.awt.Color(153, 153, 153));

        panelMenu.setBackground(new java.awt.Color(187, 187, 187));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/company/brfood/imagens/logo.png"))); // NOI18N

        lbDashboard.setBackground(new java.awt.Color(187, 187, 187));
        lbDashboard.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        lbDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lbDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/company/brfood/imagens/dashboard-60.png"))); // NOI18N
        lbDashboard.setText("Dashboard");
        lbDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbDashboardMouseExited(evt);
            }
        });

        lbPedidos.setBackground(new java.awt.Color(255, 255, 255));
        lbPedidos.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        lbPedidos.setForeground(new java.awt.Color(255, 255, 255));
        lbPedidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/company/brfood/imagens/pedidos-60.png"))); // NOI18N
        lbPedidos.setText("Pedidos");
        lbPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbPedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbPedidosMouseExited(evt);
            }
        });

        lbProdutos.setBackground(new java.awt.Color(255, 255, 255));
        lbProdutos.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        lbProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lbProdutos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/company/brfood/imagens/produtos-60.png"))); // NOI18N
        lbProdutos.setText("Produtos");
        lbProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbProdutosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbProdutosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbProdutosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(lbDashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(lbPedidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(lbDashboard)
                .addGap(18, 18, 18)
                .addComponent(lbPedidos)
                .addGap(22, 22, 22)
                .addComponent(lbProdutos)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        desktopPane.setLayer(panelMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(613, Short.MAX_VALUE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDashboardMouseClicked
        
    }//GEN-LAST:event_lbDashboardMouseClicked

    private void lbDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDashboardMouseEntered
        lbDashboard.setOpaque(true);
        lbDashboard.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_lbDashboardMouseEntered

    private void lbDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDashboardMouseExited
        lbDashboard.setOpaque(true);
        lbDashboard.setBackground(new Color(187,187,187));
    }//GEN-LAST:event_lbDashboardMouseExited

    private void lbPedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPedidosMouseEntered
        lbPedidos.setOpaque(true);
        lbPedidos.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_lbPedidosMouseEntered

    private void lbPedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPedidosMouseExited
        lbPedidos.setOpaque(true);
        lbPedidos.setBackground(new Color(187,187,187));
    }//GEN-LAST:event_lbPedidosMouseExited

    private void lbProdutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProdutosMouseEntered
        lbProdutos.setOpaque(true);
        lbProdutos.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_lbProdutosMouseEntered

    private void lbProdutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProdutosMouseExited
        lbProdutos.setOpaque(true);
        lbProdutos.setBackground(new Color(187,187,187));
    }//GEN-LAST:event_lbProdutosMouseExited

    private void lbProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbProdutosMouseClicked
        var show = new Loading();
        show.setVisible(true);
        Thread thread = new Thread(() -> {
            FormProdutos formProdutos = new FormProdutos();
            formProdutos.setVisible(true);
            show.setVisible(false);
        });
        thread.start();
    }//GEN-LAST:event_lbProdutosMouseClicked


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbDashboard;
    private javax.swing.JLabel lbPedidos;
    private javax.swing.JLabel lbProdutos;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
