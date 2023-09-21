package br.com.company.brfood.view;

import br.com.company.brfood.model.Produto;
import br.com.company.brfood.service.ProdutoService;
import br.com.company.brfood.utils.custons.ModernScrollBarUI;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Point;
import java.util.List;
import javax.swing.JScrollBar;

public class FormProdutos extends javax.swing.JFrame {

    private Card card;
    private final Point point = new Point();
    private final ProdutoService produtoService;

    public FormProdutos() {
        initComponents();
        
        produtoService = new ProdutoService();
        
        setLocationRelativeTo(null);
        JScrollBar sb = scroll.getVerticalScrollBar();
        sb.setOpaque(true);
        sb.setForeground(new Color(153,153,153));
        sb.setPreferredSize(new Dimension(8, 8));
        sb.setUI(new ModernScrollBarUI());
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        
        List<Produto> produtos = produtoService.produtos(tfPesquisarProduto.getText());
        showCard(produtos);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tfPesquisarProduto = new br.com.company.brfood.utils.custons.TextFieldCustom();
        btnPesquisar = new br.com.company.brfood.utils.custons.ButtonCustom();
        btnNovo = new br.com.company.brfood.utils.custons.ButtonCustom();
        btnFechar = new br.com.company.brfood.utils.custons.ButtonCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Produtos");
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.setBackground(new java.awt.Color(187, 187, 187));
        panel.setPreferredSize(new java.awt.Dimension(32767, 32767));
        panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelMouseDragged(evt);
            }
        });
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, Short.MAX_VALUE, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, Short.MAX_VALUE, Short.MAX_VALUE)
        );

        scroll.setViewportView(panel);
        panel.getAccessibleContext().setAccessibleName("");

        jPanel1.setBackground(new java.awt.Color(187, 187, 187));

        tfPesquisarProduto.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tfPesquisarProduto.setMinimumSize(new java.awt.Dimension(100, 32));
        tfPesquisarProduto.setName(""); // NOI18N
        tfPesquisarProduto.setPreferredSize(new java.awt.Dimension(100, 34));
        tfPesquisarProduto.setSuffixIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/company/brfood/imagens/pesquisar-25.png"))); // NOI18N

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNovo.setPreferredSize(new java.awt.Dimension(72, 34));
        btnNovo.setStyle(br.com.company.brfood.utils.custons.ButtonCustom.ButtonStyle.SUCCESS);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnFechar.setStyle(br.com.company.brfood.utils.custons.ButtonCustom.ButtonStyle.SECONDARY);
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
        setCursor(new Cursor(Cursor.MOVE_CURSOR));
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        setOpacity(1f);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_formMouseReleased

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        setOpacity(0.7f);
        Point p = getLocation();
        setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
        setCursor(new Cursor(Cursor.MOVE_CURSOR));
    }//GEN-LAST:event_formMouseDragged

    private void panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
    }//GEN-LAST:event_panelMousePressed

    private void panelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseReleased
        setOpacity(1f);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_panelMouseReleased

    private void panelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseDragged
        setOpacity(0.7f);
        Point p = getLocation();
        setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
        setCursor(new Cursor(Cursor.MOVE_CURSOR));
    }//GEN-LAST:event_panelMouseDragged

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        var show = new Loading();
        show.setVisible(true);
        Thread thread = new Thread(() -> {
            List<Produto> produtos = produtoService.produtos(tfPesquisarProduto.getText());
            showCard(produtos);
            show.setVisible(false);
        });
        thread.start();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        FormCadastroProduto cadastroProduto = new FormCadastroProduto();
        cadastroProduto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void showCard(List<Produto> produtos) {
        panel.removeAll();
        int y = 10;
        int x = 10;
        int count = 0;
        int linha = 1;

        for (int i = 0; i < produtos.size(); i++) {

            if (count < 3) {
                if (count == 0) {
                    card = new Card(produtos.get(i));
                    card.setBounds(x, y, 224, 425);
                    panel.add(card);
                } else {
                    card = new Card(produtos.get(i));
                    x = (256 + 50) * count;
                    card.setBounds(x, y, 224, 425);
                    panel.add(card);
                }
            } else {
                y = 501 * linha;
                x = 10;

                card = new Card(produtos.get(i));
                card.setBounds(x, y, 224, 425);
                panel.add(card);

                x = (256 + 50) * count;
                //y = 431 * linha;

                count = 0;
                linha++;
            }
            count++;
        }
        panel.repaint();
        panel.validate();
        pack();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new FormProdutos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.company.brfood.utils.custons.ButtonCustom btnFechar;
    private br.com.company.brfood.utils.custons.ButtonCustom btnNovo;
    private br.com.company.brfood.utils.custons.ButtonCustom btnPesquisar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scroll;
    private br.com.company.brfood.utils.custons.TextFieldCustom tfPesquisarProduto;
    // End of variables declaration//GEN-END:variables
}
