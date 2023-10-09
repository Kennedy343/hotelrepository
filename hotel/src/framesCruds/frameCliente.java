/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framesCruds;

import javax.swing.ImageIcon;

/**
 *
 * @author PC
 */
public class frameCliente extends javax.swing.JFrame {

    /**
     * Creates new form frameCliente
     */
    public frameCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Formulario Cliente");
        setIconImage(new ImageIcon(getClass().getResource("/hotelIcono.png")).getImage());
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
        labelTitulo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        labelApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        labelTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        labelNit = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        labelDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        labelImageInicio = new javax.swing.JLabel();
        labelImageSave = new javax.swing.JLabel();
        labelImageEdit = new javax.swing.JLabel();
        labelImageDelete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 50, 50));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 36)); // NOI18N
        labelTitulo.setText("Formulario Cliente");
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        labelNombre.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        labelNombre.setText("Ingrese el primer nombre del cliente:");
        jPanel1.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 320, -1));

        labelApellido.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        labelApellido.setText("Ingrese el primer apellido del cliente:");
        jPanel1.add(labelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 320, -1));

        labelTelefono.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        labelTelefono.setText("Ingrese el número telefónico del cliente:");
        jPanel1.add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 290, -1));

        labelNit.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        labelNit.setText("Ingrese el NIT del cliente:");
        jPanel1.add(labelNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel1.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 250, -1));

        labelDireccion.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        labelDireccion.setText("Ingrese la dirección del cliente:");
        jPanel1.add(labelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 370, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 870, 150));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 870, 20));

        labelImageInicio.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        labelImageInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-izquierda.png"))); // NOI18N
        labelImageInicio.setText("Regresar");
        labelImageInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelImageInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelImageInicioMouseClicked(evt);
            }
        });
        jPanel1.add(labelImageInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        labelImageSave.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        labelImageSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save-solid-60.png"))); // NOI18N
        labelImageSave.setText("Guardar");
        labelImageSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(labelImageSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, -1, -1));

        labelImageEdit.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        labelImageEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        labelImageEdit.setText("Editar");
        labelImageEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(labelImageEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, -1, -1));

        labelImageDelete.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        labelImageDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrar.png"))); // NOI18N
        labelImageDelete.setText("Eliminar");
        labelImageDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(labelImageDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelImageInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImageInicioMouseClicked
        menu abrir = new menu();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelImageInicioMouseClicked

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
            java.util.logging.Logger.getLogger(frameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelImageDelete;
    private javax.swing.JLabel labelImageEdit;
    private javax.swing.JLabel labelImageInicio;
    private javax.swing.JLabel labelImageSave;
    private javax.swing.JLabel labelNit;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
