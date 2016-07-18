/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * 
 * @author Daniel
 */
public class leerFicheros {
    //File chooser es para buscar un archivo
    private JFileChooser fileChooser;
    //Cuando se abra la ventana solo aparezcan archiivos txt
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Texto","txt");
    private File file = null;
    private boolean isopen =false;//bandera de control para saber si se abrio un archivo
    private ArrayList contenido = new ArrayList();//almacena los registros leidos de *.txt
    private int index = 0; //lleva control del registro actualmente visible
    //controles swing
    private JTextField nombre;
    private JTextField mail;
    private JTextField contraseña;

    //Constructor de clase
    public leerFicheros(){}

    public leerFicheros(JTextField nombre , JTextField mail , JTextField contraseña )
    {
        //Toma los valores ingresados en el texto area
        this.nombre = nombre;
        this.mail = mail;
        this.contraseña = contraseña;
        System.out.println();
    }

    
    //Retorna el nombre del archivo abierto
    public String getFileName()
    {
        //Si el archivo es diferente de nulo toma el nombre del archivo, sino Sin Titulo
        if( file != null)
            return file.getName();
        else
            return "Sin Titulo";
    }

    /* Cuando se de registrar aparece la ventanade Guardar */
    public void GuardarComo(String texto)
    {     
       //Nuevo objeto
       fileChooser = new JFileChooser();
       //Solo para que busque archivos txt
       fileChooser.setFileFilter(filter);
       //Para que aparezca la ventana de guardar
       int result = fileChooser.showSaveDialog(null);
       //Si la ventana de guardar = aprueba el guardado
       if ( result == JFileChooser.APPROVE_OPTION ){
                //Para que cierra la el archivo donde se guarda la descripcion
                this.isopen = false;
                //Para limpiar los campos del array
                this.contenido.clear();
                //Para que se aumente en 1 la posición
                this.index = 1;
                //Llama al metodo escribir para que guarde el contenido
                if ( escribir( fileChooser.getSelectedFile(),  texto) )
                {
                    //Para guardar el archivo con su propio nombre
                    JOptionPane.showMessageDialog(null, "Archivo '" + fileChooser.getSelectedFile().getName() + "' guardado ");
                    this.isopen = true;
                }
        }
    }

    /* Actualiza nuevo registro al final de la lista
     * input: String de la forma "campo1,campo2,campo3"
     */
    public void Actualizar(String texto)
    {
        //Si existe archivo abierto
        if( this.file != null)
        {
            //Llama al metodo escribir para actualizar el archivo
            if ( escribir( this.file ,  texto) )
            {
                JOptionPane.showMessageDialog(null, "Archivo '" + this.file.getName() + "' actualizado ");
            }                        
        }
        else //sino crear nuevo archivo
        {            
            GuardarComo( texto );
        }
    }

    /* Muestra la ventana de dialogo Abrir archivo
     */
    public void Abrir()
    {
       //Genera una nueva instancia del archivo
       fileChooser = new JFileChooser();
       //Filtro para que busque en carpeta 
       fileChooser.setFileFilter(filter);
       //Filtro para que busque en una carpeta especificada
       fileChooser.setCurrentDirectory(new java.io.File("e:/"));    
       int result = fileChooser.showOpenDialog(null);
       //Si el filtro de la carpeta = panel que se abrió
       if ( result == JFileChooser.APPROVE_OPTION ){
            this.file = fileChooser.getSelectedFile();        
            //LLama al metodo de leer
            leer( this.file );
            //La bandera la hace validar
            this.isopen=true;
        }
    }

    /* Función que escribe un registro en el archivo de texto
     * Si el archivo ya contaba con registros re-escribe estos y al final
     * escribe el nuevo registro
     */
    private boolean escribir(File fichero, String texto)
    {
        boolean res = false;
        //Para que escriba en un archivo         
        PrintWriter writer = null;
        try {
            String f = fichero.toString();
            //verifica que extension exista sino lo agrega
            if(!f.substring( f.length()-4, f.length()).equals(".txt") )
            {
                f = f + ".txt";
                fichero = new File(f);
            }            
            writer = new PrintWriter( fichero );
            //si hay un archivo abierto
            if( this.isopen )
            {   //añade primero linea por linea conenido anterior
                Iterator It = contenido.iterator();
                while (It.hasNext())
                {
                    writer.println( It.next() );
                }
                //se añade fila de texto al archivo
                writer.println( texto );
                this.contenido.add(texto);
            }
            else //esta guardando por primera vez
            {
                this.contenido.add(texto);
                writer.println( texto );    
            }            
            this.file = fichero;
            writer.close();            
            res = true;
        } catch (FileNotFoundException ex) {
            System.out.println("Error:" + ex);
        } finally {
            writer.close();
        }
        return res;
    }

    /* Lee linea por linea un archivo de texto y almacena los registros
     * en un ArrayList segun orden de lectura
     * input: File
     */
    public boolean leer( File fichero )
    {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fichero));
            this.contenido.clear();
            String linea;
            while ( (linea = reader.readLine() ) != null) {                
                this.contenido.add( linea );
            }
            //muestra el primer registro en la interfaz
            Siguiente();
            return true;
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }  finally {
            try {
                reader.close();
            } catch (IOException ex) {
                System.out.println("Error: " + ex);
            }
        }
        return false;
    }
    public boolean LogeoE(String user, String pass){
        boolean existe=false;
        String nombreE,correo,contraseñaC;
        File archivo = new File("C:\\Users\\Daniel\\OneDrive\\Proyecto\\Registro\\registroAlumno.txt");
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(archivo);
            while (entrada.hasNext()) {
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()) {
                    nombreE = st.nextToken();
                    correo = st.nextToken();
                    contraseñaC = st.nextToken();
                    if (user.equals(correo)&&pass.equals(contraseñaC)) {
                        existe=true;
                    }
                    
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha Podido Abrir el archivo " + e.getMessage());
        } finally {
            entrada.close();
        }
        return existe;
    }
    public boolean LogeoP(String user, String pass){
        boolean existe=false;
        String nombreE,correo,contraseñaC;
        File archivo = new File("C:\\Users\\Daniel\\OneDrive\\Proyecto\\Registro\\registroProfesor.txt");
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(archivo);
            while (entrada.hasNext()) {
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()) {
                    nombreE = st.nextToken();
                    correo = st.nextToken();
                    contraseñaC = st.nextToken();
                    if (user.equals(correo)&&pass.equals(contraseñaC)) {
                        existe=true;
                    }
                    
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha Podido Abrir el archivo " + e.getMessage());
        } finally {
            entrada.close();
        }
        return existe;
    }
    /* funcion qye avanza al siguiente registro del ArrayList y lo muestra en pantalla
     */
    public void Siguiente()
    {
        if( this.file != null )
        {
        //incrementa en 1 la variable "index", si se supera el tamaño de lineas, vuelve a valor 1
        this.index = (index>=contenido.size())? 1 : index + 1;
        int count =1;
        Iterator It = contenido.iterator();
        //comienza busqueda
        while (It.hasNext())
        {
            String tmp = It.next().toString();
            if( count == index)//si lo encuentra asiga valores
            {   //separa el registro por campos. Separador = ","
                String[] datos = tmp.split(",");                                
                this.nombre.setText(datos[0]);
                this.mail.setText(datos[1]);
                this.contraseña.setText(datos[2]);
                break;
            }
            count ++;
        }
        }
    }

}
