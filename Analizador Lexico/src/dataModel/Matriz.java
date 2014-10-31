package dataModel;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Matriz 
{
    private Object celdas[][];
    private int fila;
    private int columna;
    
    public Matriz(int fila, int columna)
    {
        this.fila = fila;
        this.columna = columna;
        this.celdas = new Object[fila][columna];        
    }
    
    public Object getCelda(char caracter, int eActual)
    {                
        Object celda = null;       
        
        if (Character.isLetter(caracter) && !(((eActual == 2)||(eActual == 3)) && (caracter == 'f' ||caracter == 'F')))
            	return get(eActual,1);    //Es una letra
        else if (Character.isDigit(caracter) )
                return get(eActual,2);//Es un digito
        else if (caracter ==  '#')
                return get(eActual,12);
        else if(Character.isWhitespace(caracter))
                return get(eActual,15);
        else 
        	switch(caracter)
        	{
        		case '$' :  celda = get(eActual,0); break;
        		case '_' :  celda = get(eActual,0); break;
        		case '&' :  celda = get(eActual,0); break;
        		case '@' :  celda = get(eActual,16); break;
        		case '.' :  celda = get(eActual,3); break;
        		case 'F' :  celda = get(eActual,4); break;
        		case 'f' :  celda = get(eActual,4); break;
        		case '+' :  celda = get(eActual,11); break;
        		case '-' :  celda = get(eActual,12); break;        		        		
        		case ':' :  celda = get(eActual,7); break;
        		case '=' :  celda = get(eActual,6); break;
        		case '>' :  celda = get(eActual,8);break;
        		case '<' :  celda = get(eActual,9);break;
        		case '^' :  celda = get(eActual,18);break;
        		case '{' :  celda = get(eActual,5);break;
        		case '}' :  celda = get(eActual,5);break; 
        		case '(' :  celda = get(eActual,5);break;
        		case ')' :  celda = get(eActual,5);break;
        		case '/' :  celda = get(eActual,5);break;
        		case '*' :  celda = get(eActual,5);break;
        		case ',' :  celda = get(eActual,5);break;
        		case ';' :  celda = get(eActual,5);break;       		
           		case '[' :  celda = get(eActual,13);break;
        		case ']' :  celda = get(eActual,10);break;
        		case '"' :  celda = get(eActual,14);break;        		       	
        		case '\n':  celda = get(eActual,16);break;
        		case '\t':  celda = get(eActual,17);break;        		
        		
        	}        
        if(celda == null) // eof
            celda = get(eActual, 0);
        return celda;
    }
    
    public Matriz(Object celdas[][], int fila, int columna) 
    {
        this.celdas = celdas;
        this.fila = fila;
        this.columna = columna;
    }
    
    public void set(int fila, int columna, Object elem)
    {
    	// Verifico que no me vaya de rango
        if (fila < this.fila & columna < this.columna)         
            this.celdas[fila][columna]=elem;   
    }
    
    public Object get(int fila, int columna) 
    {
        // Verifico que no me vaya de rango
        if (fila < this.fila & columna < this.columna){
        	return this.celdas[fila][columna];
        }
        Logger.getLogger(getClass().getName()).log(Level.WARNING, "La posicion "+fila+":"+columna+" se encuentra fuera de rango ");
        return null;
        
    }
        
}

