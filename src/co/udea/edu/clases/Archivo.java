/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.edu.clases;

import java.awt.*;
import java.io.*;


/**
 *
 * @author lixander.cadavid
 */
public class Archivo {
    /**
     * Este metodo obtiene la ruta del archivo que se desea cargar al programa.
     * @return Retorna una variable de tipo String con la ruta del archivo especificado.
     */
    public  String obtenerRuta()

    {
        javax.swing.JFileChooser j= new javax.swing.JFileChooser();
        j.showOpenDialog(j);
        try
        {
            String path = j.getSelectedFile().getAbsolutePath();
            return path;
        }catch(NullPointerException e)
        {

            javax.swing.JOptionPane.showMessageDialog(j, "Ha finalizado el programa");
            System.exit(0);

        }
        return null;

    }
    /**
     * Este método retorna lo que contiene el archivo de texto .txt en una estructura String.
     * @param rutaArchivo Es la ruta del archivo con el cual se va a trabajar, esta variable es de tipo String.
     * @return Retorna el texto almacenado en el .txt como un String.
     */
    public String realizarCalculos(String rutaArchivo)
    {
        String lectura = "";
        File f = new File(rutaArchivo);
            try{
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String aux;
                while((aux = br.readLine())!=null)
                {
                    lectura = lectura + aux;
                }
            }catch(IOException e){
                
            }
            return lectura;
    }
    /**
     * Este método carga el archivo Ayuda.pdf, el cual contiene las instrucciones para seguir el programa.
     */
    public void abrirAyuda()
    {
        try {
            File path = new File ("Ayuda.pdf");
            Desktop.getDesktop().open(path);
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    /**
     * Este método verifica si el archivo especificado si sea .txt
     * @param ruta Es una variable de tipo String, la cual contiene la ruta del archivo especificado.
     * @return Retorna booleano verdadero si existe en el String mayor, y booleano falso si el String no tiene.
     */
    public boolean comprobarArchivo(String ruta)
    {
        boolean respuesta;
        respuesta = ruta.contains(".txt");
        return respuesta;
    }

}

