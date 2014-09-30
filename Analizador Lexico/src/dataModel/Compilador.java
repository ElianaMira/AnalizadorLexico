package dataModel;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Compilador {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
        AnalizadorLexico analizadorL = new AnalizadorLexico("C:/Users/Elita/git/AnalizadorLexico/Analizador Lexico/programa.c");
        System.out.println("Analizador Sintactico");
        Parser parser = new Parser(analizadorL);
        parser.run();
       
        analizadorL.crearToken();
        analizadorL.getTablaSimbolos().imprimirTabla();
        analizadorL.crearLexico();
         
	}
}
