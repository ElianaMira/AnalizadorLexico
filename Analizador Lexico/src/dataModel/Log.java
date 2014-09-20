package dataModel;

import java.io.FileWriter;
import java.util.ArrayList;

public class Log
{
	/*Loguea todo lo realizado por el Compilador*/
	private ArrayList<String> lineas;
    private String direccion;

    public Log(String dir) 
    {
        lineas = new ArrayList<String>();
        direccion = dir;
    }

    public void addLog(String linea) 
    {
        lineas.add(linea);
    }

    public void imprimir() 
    {
        // abrir el archivo
        System.out.println("");
        try 
        {
        	//creo archivo
            FileWriter fichero = new FileWriter(direccion);
            //Muestro el log
            for (int i = 0; i < lineas.size(); i++)
            {
                String resultado = lineas.get(i);
                System.out.println(resultado);
                fichero.write(resultado + "\r\n");
            }
            //cerramos el fichero
            fichero.close();
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
    }
}
