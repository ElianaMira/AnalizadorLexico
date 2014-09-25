package dataModel;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorArchivo{
		
	private int nroLinea,pos;
	private ArrayList<String> fuente;
	
	public LectorArchivo(String ruta){        
        fuente = new ArrayList<String>();
        nroLinea = 0;
        pos = 0;  
        
        try 
        {
        	FileReader fr = new FileReader(ruta);
            BufferedReader bf = new BufferedReader(fr); 
            String sCadena = "";
            while ((sCadena = bf.readLine())!= null)                        
                fuente.add(sCadena + "@");              
            sCadena = "$";
            fuente.add(sCadena); 
            bf.close();
         }
        catch (FileNotFoundException fnfe){fnfe.printStackTrace();
      }
      catch (IOException ioe){ioe.printStackTrace();
      }			        
    }
     
    public char getCaracter()
    {
        char c = 0;     
        if (nroLinea < fuente.size())
        {         
            if (pos < fuente.get(nroLinea).length())
            {
                c = fuente.get(nroLinea).charAt(pos);
                pos++;
            }
            else
            {
            	c = '@';
                nroLinea++;
                pos = 0;
            }
       }
       else
           c='#';
        return c; 
    }
    
    public void retrocederPosicion()
    {
        if (pos != 0)
            pos = pos -1;
        else{
            if (nroLinea != 0){
            	nroLinea = nroLinea - 1;
                pos = fuente.get(nroLinea).length(); 
            }
        }
    }

    public int getPos() {
        return pos;
    }

    public int getLine() {
        return nroLinea;
    }
    
    public boolean finArchivo(){
        return (nroLinea == fuente.size()-1 && pos == fuente.get(nroLinea).length());
    }
  
}
