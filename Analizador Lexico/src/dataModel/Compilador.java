package dataModel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Compilador {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {

        AnalizadorLexico analizadorL = new AnalizadorLexico("C:/programa.txt");
        
        Parser parser = new Parser(analizadorL);
        parser.run();
        analizadorL.crearToken();
        analizadorL.crearLexico();
        analizadorL.getTablaSimbolos().imprimirTabla();
        
        parser.mostrarTercetos();
        parser.imprimirSintactico();
        
        GeneradorCodigo generador = new GeneradorCodigo(parser.getTercetos());
        generador.run();
        
	}
}
