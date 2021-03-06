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
		Simbolo s = new Simbolo(lexema,"INT");
		t = new Token(s.getTipo(),s);
		TablaSimbolo.addSimbolo(s);	
		lexema = new StringBuffer();               
		retroceder = true;
		return t;
	}
}
