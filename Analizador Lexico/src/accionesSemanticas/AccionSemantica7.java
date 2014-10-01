package accionesSemanticas;
import dataModel.Simbolo;
import dataModel.TablaSimbolo;
import dataModel.Token;

/* Guardo simbolo y retorno lexema + - * / = { } ] ( ) */
public class AccionSemantica7 extends AccionesSemanticas{
	
	public AccionSemantica7(String m){
		super(m);
	}

	@Override
	public Token ejecutar(StringBuffer lexema, char caracter,TablaSimbolo ts, int linea) 
	{
		Simbolo s = null;
        if(lexema.length() != 0){  
            retroceder = true;
            s = new Simbolo(lexema,lexema.toString());        
            
        }
        else{
            s = new Simbolo(lexema.append(caracter),lexema.toString());        
        }
        Token t = new Token(s.getTipo(),s);
        lexema = new StringBuffer();
        return t;
    }
	
	
}
