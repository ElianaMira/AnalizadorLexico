package accionesSemanticas;
import dataModel.Simbolo;
import dataModel.TablaSimbolo;
import dataModel.Token;

/* Guardar el numero entero,Verifica que se encuentre en el rango,Retorna el ultima caracter leido*/
public class AccionSemantica3 extends AccionesSemanticas{
	public AccionSemantica3(String m){
		super(m);
	}

	@Override
	public Token ejecutar(StringBuffer lexema, char caracter,TablaSimbolo ts, int linea) {		
		Token t = null;		
	    Integer number = Integer.valueOf(lexema.toString()).intValue();  
	    if ((number < -32768) && (number > 32767)) {
	            Simbolo s = new Simbolo(lexema,"INT");
	            t = new Token(s.getTipo(),s);
	            ts.addSimbolo(s);	            
	    }
	    else{
	    	 this.error = true;
	         linea++;
	         this.msjError = "ERROR entero fuera de rango "+linea;

	    }
	    lexema = new StringBuffer();               
	    retroceder = true;
        return t;
	}
}
