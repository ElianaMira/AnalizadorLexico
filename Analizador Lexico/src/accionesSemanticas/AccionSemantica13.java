package accionesSemanticas;

import dataModel.Simbolo;
import dataModel.TablaSimbolo;
import dataModel.Token;

public class AccionSemantica13 extends AccionesSemanticas {

	public AccionSemantica13(String m){
		super(m);
	}
	
	@Override
	public Token ejecutar(StringBuffer lexema, char caracter,TablaSimbolo ts, int linea) {
		 
		 lexema.append(caracter);
		 if (lexema.toString().contains("\n")){
			 this.msjError = "Error lexico en linea "+linea+", cadena de mas de una linea";
			 this.error = true;
			 lexema.delete(0, lexema.length());
			 return null;
		 }
		 else {
			 Simbolo s = new Simbolo(lexema, "CADENA");
		     ts.addSimbolo(s);
		     Token t = new Token(s.getTipo(),s);
		     return t;
		 }
	}
}
