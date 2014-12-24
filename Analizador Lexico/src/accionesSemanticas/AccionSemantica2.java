package accionesSemanticas;
import dataModel.PalabrasReservadas;
import dataModel.Simbolo;
import dataModel.TablaSimbolo;
import dataModel.Token;

/* Verificar  el tam del string < 12, si es mayor lo corta
	Busca en la tabla de palabras reservadas
	Busca en la tabla de simbolos
*/
public class AccionSemantica2 extends AccionesSemanticas 
{
	private PalabrasReservadas reservadas;
	
	public AccionSemantica2(String m)
	 {
		 super(m);
		 reservadas = new PalabrasReservadas();
	 }
	 
	@Override
	public Token ejecutar(StringBuffer lexema, char caracter,TablaSimbolo ts, int linea) {
		Simbolo s = null;
		Token t;
		if (reservadas.esPalabraReservada(lexema.toString())) 
		{   
	    	s = new Simbolo(lexema,lexema.toString().toUpperCase());
	    	t = new Token(s.getTipo(),s);
		    
	    }
		else{
	    	if (lexema.length() > 12) 
	    	{
	    		lexema = lexema.delete(12, lexema.length()); // trunco el string
	            super.error = true;
	            super.msjError = "WARNING en linea "+linea+": el identificador es demasiado largo";
	        }
	    	s = new Simbolo(lexema, "IDENTIFICADOR");	
	    	t = new Token(s.getTipo(),s);
	    	if (!TablaSimbolo.existeSimbolo(t)){
	        	TablaSimbolo.addSimbolo(s);
	        }
	    }
	    
	    retroceder = true;
	    return t;
		
	}
	    	

}
