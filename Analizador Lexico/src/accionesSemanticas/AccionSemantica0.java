package accionesSemanticas;
import dataModel.TablaSimbolo;
import dataModel.Token;

/* Informa que es un caracter no valido */
public class AccionSemantica0 extends AccionesSemanticas
{
	 public AccionSemantica0(String m)
	 {
	        super(m);	        
	 }
	
	@Override
	public Token ejecutar(StringBuffer lexema, char caracter, TablaSimbolo tablaS,int linea) 
	{
		linea++;
        if(caracter == '@')
            this.msjError = "Error lexico en linea "+linea+ " salto de línea inesperado";
        else
            if  (caracter == '#')
                this.msjError = "Error lexico en linea "+linea+" se esperaba un cierre de cadena";
            else
                this.msjError = "Error lexico en linea "+linea+" caracter no valido "+caracter;
        this.error = true;
        return null;		
	}
	
	
}
