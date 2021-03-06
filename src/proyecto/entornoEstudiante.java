/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import static proyecto.aprobaciones.dirArchivo;
import static proyecto.entornoProfesor1.ruta;

/**
 *
 * @author Daniel
 */
public class entornoEstudiante extends javax.swing.JFrame {
    public static String ruta;
    private final FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Texto","txt");
    private JFileChooser fileChooser;
    private File files;
    File archivo= null;
    FileReader fr= null;
    BufferedReader br= null;
    /**
     * Creates new form entornoEstudiante
     */
    public entornoEstudiante() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Entorno Estudiante");
        TableColumnModel columnas = tabla.getColumnModel();
        columnas.getColumn(0).setPreferredWidth(005);
        columnas.getColumn(1).setPreferredWidth(035);
        columnas.getColumn(2).setPreferredWidth(100);
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();	
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblProfesor1 = new javax.swing.JLabel();
        btnInformacionProfesor1 = new javax.swing.JButton();
        lblProfesor2 = new javax.swing.JLabel();
        btnInformacionProfesor2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnInformacionProfesor3 = new javax.swing.JButton();
        btnInformacionProfesor4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAbrir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnCerrarSesionEstudiante = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Docentes"));

        lblProfesor1.setText("Ing. Francisco Gonzales");

        btnInformacionProfesor1.setText("Más Información");
        btnInformacionProfesor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionProfesor1ActionPerformed(evt);
            }
        });

        lblProfesor2.setText("Ing. Mario Zambrano");

        btnInformacionProfesor2.setText("Más Información");
        btnInformacionProfesor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionProfesor2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ing Santiago Quiñones");
        jLabel1.setMaximumSize(new java.awt.Dimension(91, 16));
        jLabel1.setMinimumSize(new java.awt.Dimension(91, 16));

        btnInformacionProfesor3.setText("Más Información");
        btnInformacionProfesor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionProfesor3ActionPerformed(evt);
            }
        });

        btnInformacionProfesor4.setText("Más Información");
        btnInformacionProfesor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionProfesor4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ing. Cadme Samaniego");
        jLabel2.setMaximumSize(new java.awt.Dimension(91, 16));
        jLabel2.setMinimumSize(new java.awt.Dimension(91, 16));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblProfesor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblProfesor1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInformacionProfesor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInformacionProfesor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInformacionProfesor4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInformacionProfesor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfesor1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInformacionProfesor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfesor2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInformacionProfesor2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInformacionProfesor3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInformacionProfesor4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profesores", jPanel1);

        btnAbrir.setText("Abrir Citas");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nombre Docente", "Mensaje de Aprobacion"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                    .addComponent(btnAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnAbrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Citas Aprobadas", jPanel3);

        btnCerrarSesionEstudiante.setText("Cerrar Sesión");
        btnCerrarSesionEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionEstudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(btnCerrarSesionEstudiante)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarSesionEstudiante)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionEstudianteActionPerformed
        // TODO add your handling code here:
        ventanaPrincipal obj= new ventanaPrincipal();
        obj.setVisible(true);
        dispose();
         
    }//GEN-LAST:event_btnCerrarSesionEstudianteActionPerformed

    private void btnInformacionProfesor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionProfesor1ActionPerformed
        // TODO add your handling code here:
        profesor1 obj= new profesor1();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInformacionProfesor1ActionPerformed

    private void btnInformacionProfesor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionProfesor2ActionPerformed
        profesor2 obj= new profesor2();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInformacionProfesor2ActionPerformed

    private void btnInformacionProfesor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionProfesor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInformacionProfesor3ActionPerformed

    private void btnInformacionProfesor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionProfesor4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInformacionProfesor4ActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:
        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        fileChooser.setCurrentDirectory(new java.io.File("C:\\Users\\Daniel\\OneDrive\\Citas"));
        int result = fileChooser.showOpenDialog(null);
        if ( result == JFileChooser.APPROVE_OPTION ){
            this.files = fileChooser.getSelectedFile();
            ruta= files.getAbsolutePath();
            System.out.println(ruta);
        }
                DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        try {
            archivo = new File(ruta);
            if (archivo.exists()) {
                br = new BufferedReader(new FileReader(archivo));
                String linea;
                
                while ((linea = br.readLine()) != null) {
                    StringTokenizer token = new StringTokenizer(linea, ",");
                    
                    
                    String numero = token.nextToken().trim();
                    String nombre = token.nextToken().trim();
                    String aprobacion = token.nextToken().trim();
                    
                    Object[] obj = new Object[] {
                        numero,nombre, aprobacion
                    };
                    modelo.addRow(obj);
                }
                br.close();
            }
            else
                JOptionPane.showMessageDialog(null, "No existe el archivo");
        }
        catch (IOException ex) {
            System.out.println("Error al leer el archivo\n" + ex.getMessage());
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

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
            java.util.logging.Logger.getLogger(entornoEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entornoEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entornoEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entornoEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entornoEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCerrarSesionEstudiante;
    private javax.swing.JButton btnInformacionProfesor1;
    private javax.swing.JButton btnInformacionProfesor2;
    private javax.swing.JButton btnInformacionProfesor3;
    private javax.swing.JButton btnInformacionProfesor4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblProfesor1;
    private javax.swing.JLabel lblProfesor2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
