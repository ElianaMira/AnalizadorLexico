package accionesSemanticas;
import dataModel.TablaSimbolo;
import dataModel.Token;
/*  Este accion semantica vacia el string en donde se fue formando el lexema comentario*/
public class AccionSemantica8 extends AccionesSemanticas
{
		public AccionSemantica8(String m)
		{
			super(m);
		}

		@Override
		public Token ejecutar(StringBuffer lexema, char caracter,TablaSimbolo tablaS, int linea)
		{
			 lexema.delete(0, lexema.length());
			 return null;
		}
}
