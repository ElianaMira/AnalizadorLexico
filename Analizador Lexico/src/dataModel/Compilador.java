package dataModel;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Compilador {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {

        AnalizadorLexico analizadorL = new AnalizadorLexico("C:/programa.txt");        
        Parser parser = new Parser(analizadorL);
        parser.run();       
        
        analizadorL.crearToken();
        analizadorL.crearLexico();
        analizadorL.getTablaSimbolos().imprimirTabla();
        
        if (!parser.hayErrores()){
            
        	parser.mostrarTercetos();
        	parser.imprimirSintactico();
        	GeneradorCodigo generador = new GeneradorCodigo(parser.getTercetos());
        	generador.run();
        }
        else{
            System.out.println("");
            System.out.println("Su codigo posee errores");
            System.out.println("");
            parser.imprimirErrores();
        }
        
	}
}
