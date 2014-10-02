package dataModel;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Compilador {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//TODO Probar Vector,Probar comentario
		
        AnalizadorLexico analizadorL = new AnalizadorLexico("programa");
        System.out.println("Analizador Sintactico");
        Parser parser = new Parser(analizadorL);
        parser.run();
       
        analizadorL.crearToken();
        analizadorL.getTablaSimbolos().imprimirTabla();
        analizadorL.crearLexico();
         
	}
}
