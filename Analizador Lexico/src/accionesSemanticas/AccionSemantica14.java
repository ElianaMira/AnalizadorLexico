package accionesSemanticas;

import dataModel.Simbolo;
import dataModel.TablaSimbolo;
import dataModel.Token;

//dimension vector
public class AccionSemantica14 extends AccionesSemanticas {

	public AccionSemantica14(String m){
		super(m);
	}
	
	@Override
	public Token ejecutar(StringBuffer lexema, char caracter,TablaSimbolo ts, int linea) {
		 
		lexema.append(caracter);
		Simbolo s = new Simbolo(lexema, "DIMENSION");
		Token t = new Token(s.getTipo(),s);
		return t;
	}
}
