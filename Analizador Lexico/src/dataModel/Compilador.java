package dataModel;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Compilador {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
        AnalizadorLexico analizadorL = new AnalizadorLexico(args[0]);
        System.out.println("Analizador Sintactico");
        //PolacaInversa pi = new PolacaInversa();
        //Parser p = new Parser(analizadorL);
        //p.run();
        
        analizadorL.crearToken();
        analizadorL.getTablaSimbolos().imprimirTabla();
        analizadorL.crearLexico();
        /*if (!p.hayErrores()){
            
            p.imprimirPolacaInversa();
            p.imprimirSintactico();
            GeneradorCodigo c = new GeneradorCodigo(analizadorL.getTabla(), p.getLabels(),args[0]);

            c.addTablaSimbolo();
            c.recorrerPolaca(p.getPolaca());
            c.imprimir();
        }else
        {
            System.out.println("");
            System.out.println("Su codigo posee errores");
            System.out.println("");
            p.imprimirErroresSintactico();
        }*/
	
         
	}
}
