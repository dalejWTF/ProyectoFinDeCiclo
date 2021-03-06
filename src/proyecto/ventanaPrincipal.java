/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Daniel
 */
public class ventanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPrincipal
     */
    public ventanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Generador de Citas");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloEntorno = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        btnDocente = new javax.swing.JButton();
        btnEstudiante = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloEntorno.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        lblTituloEntorno.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloEntorno.setText("ENTORNO GENERADOR DE CITAS");
        getContentPane().add(lblTituloEntorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 430, 90));

        lblAdmin.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Downloads\\1468874805_Admin.png")); // NOI18N
        lblAdmin.setText("Modo Administrador");
        lblAdmin.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        lblAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminMouseClicked(evt);
            }
        });
        getContentPane().add(lblAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 190, 60));

        btnDocente.setText("Docente");
        btnDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 87, -1));

        btnEstudiante.setText("Estudiante");
        btnEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Desktop\\videoconferencia1-130716103209-phpapp02-thumbnail-4.jpg")); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocenteActionPerformed
        // TODO add your handling code here:
        profesor obj= new profesor();
        obj.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_btnDocenteActionPerformed

    private void btnEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudianteActionPerformed
        // TODO add your handling code here:
        estudiante obj= new estudiante();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEstudianteActionPerformed

    private void lblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseClicked
        administrador obj= new administrador();
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_lblAdminMouseClicked

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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocente;
    private javax.swing.JButton btnEstudiante;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTituloEntorno;
    // End of variables declaration//GEN-END:variables
}
