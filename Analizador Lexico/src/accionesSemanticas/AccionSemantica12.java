package accionesSemanticas;
import dataModel.Simbolo;
import dataModel.TablaSimbolo;
import dataModel.Token;

public class AccionSemantica12 extends AccionesSemanticas{
	public AccionSemantica12(String accion) {
		super(accion);
	}

	@Override
	public Token ejecutar(StringBuffer lexema, char caracter,TablaSimbolo tablaS, int linea) {
		Simbolo s = new Simbolo(lexema,"FIN ARCHIVO");
        Token t = new Token(s.getTipo(),s);
        return t;
	}

}
