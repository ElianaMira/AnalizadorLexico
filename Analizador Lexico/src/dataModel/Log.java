package dataModel;

import java.io.FileWriter;
import java.util.ArrayList;

public class Log
{
	/*Loguea todo lo realizado por el Compilador*/
	private ArrayList<String> lineas;
    private String direccion;

    public Log(String dir) {
        lineas = new ArrayList<String>();
        direccion = dir;
    }

    public void addLog(String linea) {
        lineas.add(linea);
    }
    
    public void generar(){
        // abrir el archivo
	  try {
	      FileWriter archivo = new FileWriter(direccion);
	      
	      String resultado;
	      for (int i = 0; i < lineas.size(); i++) {
	          resultado = lineas.get(i);
	          archivo.write(resultado + "\r\n");
	      }
	      archivo.close();
	
	  } catch (Exception ex) {
	      ex.printStackTrace();
	  }
	
	}
    
    public boolean estaVacio(){
        return lineas.isEmpty();
    }


    public void imprimir() {
        try 
        {
            FileWriter fichero = new FileWriter(direccion);
            for (int i = 0; i < lineas.size(); i++)
            {
                String resultado = lineas.get(i);
                fichero.write(resultado + "\r\n");
            }
            fichero.close();
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
    }
}
