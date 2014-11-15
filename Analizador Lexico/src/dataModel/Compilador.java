package dataModel;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Compilador {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {

        AnalizadorLexico analizadorL = new AnalizadorLexico("programa");

        Parser parser = new Parser(analizadorL);
        parser.run();
       
        analizadorL.crearToken();
        analizadorL.crearLexico();
        parser.mostrarTercetos();
        analizadorL.getTablaSimbolos().imprimirTabla();
        parser.imprimirSintactico();
         
	}
}
