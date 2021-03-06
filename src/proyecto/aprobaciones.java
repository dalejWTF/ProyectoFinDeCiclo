/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Daniel
 */
public class aprobaciones extends javax.swing.JFrame {
    public static String dirArchivo; 
    private final FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Texto","txt");
    private JFileChooser fileChooser;
    private int pos=-1;
    private File files;
    private final entornoProfesorr file;
    File archivo= null;
    FileReader fr= null;
    BufferedReader br= null;
    
    /**
     * Creates new form entornoProfesor
     */
    public aprobaciones() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Respuestas");
        TableColumnModel columnModel = tabla.getColumnModel();
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        columnModel.getColumn(0).setPreferredWidth(1);
        columnModel.getColumn(1).setPreferredWidth(50);
        columnModel.getColumn(2).setPreferredWidth(100);
        txtAprobacion.setLineWrap(true);
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();	
        file= new entornoProfesorr(this.txtNumero, this.txtNombre, this.txtAprobacion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtNumero = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAprobacion = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        menuAbrirCita = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuEditarInformacion = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Nombre", "Descripcion"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        txtAprobacion.setColumns(20);
        txtAprobacion.setRows(5);
        jScrollPane5.setViewportView(txtAprobacion);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Respuesta N°:");

        jLabel2.setText("Nombre Docente:");

        jLabel3.setText("Mensaje de Aprobacion:");

        jMenu4.setText("File");

        menuAbrirCita.setText("Abir Citas Generadas");
        menuAbrirCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAbrirCitaMouseClicked(evt);
            }
        });
        menuAbrirCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirCitaActionPerformed(evt);
            }
        });
        jMenu4.add(menuAbrirCita);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Opciones");

        menuEditarInformacion.setText("Editar Informacion");
        menuEditarInformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEditarInformacionMouseClicked(evt);
            }
        });
        menuEditarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarInformacionActionPerformed(evt);
            }
        });
        jMenu5.add(menuEditarInformacion);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnModificar)
                .addGap(61, 61, 61)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuEditarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarInformacionActionPerformed
        // TODO add your handling code here:
        Runtime runtime = Runtime.getRuntime();
        try {
            Process process = runtime.exec("C:\\Windows\\notepad.exe C:\\Users\\Daniel\\OneDrive\\Proyecto\\Info\\FranciscoGonzales.txt");
        } catch (IOException ex) {
            Logger.getLogger(aprobaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuEditarInformacionActionPerformed

    private void menuEditarInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEditarInformacionMouseClicked

    }//GEN-LAST:event_menuEditarInformacionMouseClicked

    private void menuAbrirCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirCitaActionPerformed
        file.Abrir();
        
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        try {
            archivo = new File(dirArchivo);
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
              
    }//GEN-LAST:event_menuAbrirCitaActionPerformed

    private void menuAbrirCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAbrirCitaMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_menuAbrirCitaMouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        pos= tabla.getSelectedRow();
        if (pos >=0) {
            txtNumero.setText(modelo.getValueAt(pos, 0).toString());
            txtNombre.setText(modelo.getValueAt(pos, 1).toString());
            txtAprobacion.setText(modelo.getValueAt(pos, 2).toString());
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        String [] dato= {txtNumero.getText(), txtNombre.getText(), txtAprobacion.getText()};
        modelo.addRow(dato);
        String datos = this.txtNumero.getText() + "," + this.txtNombre.getText() + "," + this.txtAprobacion.getText() ;
        file.Actualizar(datos);
        this.setTitle("" + file.getFileName() + "");
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        if (pos >=0) {
            modelo.removeRow(pos);
            
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una fila.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        String searchNumero = txtNumero.getText();
        String editarNombre = txtNombre.getText();
        String editarAprobacion = txtAprobacion.getText();
        
        //Un nuevo Arreglo temporal para albergar los campos de la ventana
        ArrayList<String> tempArray = new ArrayList<>();
        //Lectura del archivo
        try{
            //Se evalua las excepciónes
            try(FileReader fr = new FileReader(dirArchivo)){
                //Un lector del archivo directo
                Scanner reader = new Scanner(fr);
                //Es el que recorre las líneas del archivo para que luego se guarden dentro del Array
                String line;
                //Para guardar los datos anteriores
                String [] lineArray;
                
                //Ciclo para verificar el archivo y que sea diferente hasta que no encuentre más líneas dentro del archivo
                while((line = reader.nextLine()) != null){
                    //Está poniendo comas en cada terminación de un campo
                    lineArray = line.split(",");
                    //Se compara para proceder a editar los parámetros de las ventanas
                    if(lineArray[0].equals(searchNumero)){
                        tempArray.add(
                        lineArray[0] + "," +
                        editarNombre  + "," +
                        editarAprobacion);
   
                    }else{
                        tempArray.add(line);
                        
                    }
                }
                fr.close();
            //Segunda ecxepción por si no hay nigún campo en el archivo con los parámetros a evaluar
            }catch(Exception e){   
            }
        //Prinera excepción para si no encuentra la dirección del archivo
        }catch(Exception e){
        }
        
        try{
            try(PrintWriter pr= new PrintWriter(dirArchivo)){
                for (String srt : tempArray) {
                    pr.println(srt);
                }
                pr.close();
            }catch(Exception e){
            }
            
        }catch(Exception e){ 
        }
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        
        if (pos >=0) {
            modelo.setValueAt(txtNumero.getText(), pos, 0);
            modelo.setValueAt(txtNombre.getText(), pos, 1);
            modelo.setValueAt(txtAprobacion.getText(), pos, 2);
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione una fila.");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(aprobaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aprobaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aprobaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aprobaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new aprobaciones().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem menuAbrirCita;
    private javax.swing.JMenuItem menuEditarInformacion;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea txtAprobacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
