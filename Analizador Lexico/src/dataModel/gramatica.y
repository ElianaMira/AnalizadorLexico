%{

package dataModel;
import java.io.IOException;
import java.util.Vector;
import java.util.Stack;

%}

%token  SI,SINO,ENTONCES,IMPRIMIR,IDENTIFICADOR, VECTOR, DE,CADENA, INT,FLOAT,PARA,ASIG

%start programa

%%


programa: sentencias { logSintactico.addLog("El programa finalizo correctamente"); };

sentencias:
	 sentencia  ';'
	 |sentencias sentencia  ;

sentencia:	
	declaracion 
	|asignacion			
	|seleccion
	|bucle
	|impresion ;

declaracion:
	FLOAT variables {logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de un FLOAT");}
	|FLOAT error {logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");}
  	|INT variables
  	|VECTOR IDENTIFICADOR'['INT '.''.' INT']' DE numero {logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de un VECTOR");}
	|VECTOR IDENTIFICADOR error {logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");};

variables: 
	IDENTIFICADOR 
	|variables','IDENTIFICADOR;

asignacion: 
	IDENTIFICADOR ASIG expresion {logSintactico.addLog("Linea "+lexico.getLineas()+": asignacion");}
	|IDENTIFICADOR '['expresion']' ASIG expresion {logSintactico.addLog("Linea "+lexico.getLineas()+": asignacion");};
	
numero:
	FLOAT
	|INT;
	
expresion:
	expresion '+' termino
	|expresion '-' termino
	|termino;

vector:
	IDENTIFICADOR '['expresion']';
	
termino:
	termino '*' argumento
	|termino '/' argumento
	|argumento;
	
argumento:
	IDENTIFICADOR
	|numero
	|vector;

comparador:
	'<'
	|'<''='
	|'>'
	|'>''='
	|'='
	|'^''=';		

seleccion: 
	SI'('condicion')'ENTONCES'{'sentencias'}'   
	|SI'('condicion')'ENTONCES'{'sentencias'}' SINO '{'sentencias'}'  {logSintactico.addLog("Linea "+lexico.getLineas()+": seleccion SISINO");}
	|SI'('condicion')'ENTONCES'{'sentencias'}' SINO  {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
	|SI'('condicion')''{'sentencias'}' SINO  {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion falta setencia ENTONCES ");}
	|SI'('condicion')'ENTONCES {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");};

condicion: 
	expresion comparador expresion;

impresion: 
	IMPRIMIR'(' CADENA ')'';' {logSintactico.addLog("Linea "+lexico.getLineas()+":salida por pantalla");};
    |IMPRIMIR'('CADENA')' error {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba un punto y coma");};
	|IMPRIMIR'('';' error {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una cadena");};
	|IMPRIMIR';' error {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una ('cadena')");};

bucle:
	PARA '(' INT IDENTIFICADOR '=' INT ';' IDENTIFICADOR comparador expresion ';' IDENTIFICADOR')' '{' sentencias '}';

%%
  private Log logSintactico = new Log("sintactico.log");
  private AnalizadorLexico lexico;

  public Parser(AnalizadorLexico l) {
         lexico = l;

    }

    private int yylex(){
        int yyl_return = -1;
        while (lexico.masTokens()) {
            try {
                yyl_return = lexico.yylex();
                yylval = lexico.getValorSimbolo();

            } catch (IOException e) {
                System.err.println("error de E/S:" + e);
            }
            return yyl_return;
        }
        return 0;
    }

    private void yyerror(String stack_underflow_aborting) {
//        throw new UnsupportedOperationException("Not yet implemented");
    }
public void putNegativo(String valor){
        Simbolo s = new Simbolo(new StringBuffer("-"+valor),"INT");
        lexico.getTablaSimbolos().addSimbolo(s);
        
        Simbolo raya = new Simbolo(new StringBuffer("-"),"-");
        lexico.getTablaSimbolos().eliminarSimbolo(raya);
        
        Simbolo elival = new Simbolo(new StringBuffer(valor),"INT");
        lexico.getTablaSimbolos().eliminarSimbolo(elival);
}
public void imprimirSintactico(){
    logSintactico.imprimir();
}