/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framesCruds;

import java.awt.Color;

/**
 *
 * @author PC
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Menu");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTexto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelImageUsuarios = new javax.swing.JLabel();
        txtusuario = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtCliente = new javax.swing.JLabel();
        labelImageCliente = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtRegistro = new javax.swing.JLabel();
        labelImageRegistro = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        labelImageClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(50, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTexto.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 48)); // NOI18N
        labelTexto.setText("Menu");
        jPanel1.add(labelTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 140, 51));

        jPanel2.setBackground(new java.awt.Color(50, 51, 51));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelImageUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        jPanel2.add(labelImageUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 80));

        txtusuario.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        txtusuario.setText("Usuarios");
        jPanel2.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 120, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 460, 80));

        jPanel4.setBackground(new java.awt.Color(50, 51, 51));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCliente.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        txtCliente.setText("Clientes");
        jPanel4.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 120, -1));

        labelImageCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cliente.png"))); // NOI18N
        jPanel4.add(labelImageCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 70, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 460, 100));

        jPanel3.setBackground(new java.awt.Color(50, 51, 51));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRegistro.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        txtRegistro.setText("Registros");
        jPanel3.add(txtRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 120, -1));

        labelImageRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verificar.png"))); // NOI18N
        jPanel3.add(labelImageRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 70));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 460, 90));

        jPanel5.setBackground(new java.awt.Color(50, 51, 51));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });
        jPanel5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel5KeyPressed(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelImageClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar-sesion.png"))); // NOI18N
        jPanel5.add(labelImageClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 60, 70));

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        jLabel1.setText("Cerrar Sesion");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 160, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 460, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        jPanel2.setBackground(new Color(0x1a1b1f));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        jPanel2.setBackground(new Color(0x323333));
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        jPanel4.setBackground(new Color(0x1a1b1f));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBackground(new Color(0x323333));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        jPanel3.setBackground(new Color(0x1a1b1f));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(new Color(0x323333));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(new Color(0x1a1b1f));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setBackground(new Color(0x323333));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel5KeyPressed
//        login abrir = new login();
//        abrir.setVisible(true);
        //codigo de error
    }//GEN-LAST:event_jPanel5KeyPressed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        login abrir = new login();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labelImageCliente;
    private javax.swing.JLabel labelImageClose;
    private javax.swing.JLabel labelImageRegistro;
    private javax.swing.JLabel labelImageUsuarios;
    private javax.swing.JLabel labelTexto;
    private javax.swing.JLabel txtCliente;
    private javax.swing.JLabel txtRegistro;
    private javax.swing.JLabel txtusuario;
    // End of variables declaration//GEN-END:variables
}
