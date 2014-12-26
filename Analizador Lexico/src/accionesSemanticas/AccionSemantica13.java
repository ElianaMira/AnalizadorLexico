package accionesSemanticas;

import dataModel.Simbolo;
import dataModel.TablaSimbolo;
import dataModel.Token;

//cadena de impresion 
public class AccionSemantica13 extends AccionesSemanticas {

	public AccionSemantica13(String m){
		super(m);
	}
	
	@Override
	public Token ejecutar(StringBuffer lexema, char caracter,TablaSimbolo ts, int linea) {
		 
		
		 Simbolo s = new Simbolo(lexema, "CADENA");
		 Token t = new Token(s.getTipo(),s);
	
		 return t;
	}
}
