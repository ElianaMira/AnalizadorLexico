%{

package dataModel;
import java.io.IOException;
import java.util.Vector;
import java.util.Stack;

%}

%token  IF,THEN, ELSE,PRINT,IDENTIFICADOR, VECTOR, CADENA, INT,FLOAT,FOR,ASIG

%start programa

%%


programa: sentencias { logSintactico.addLog("El programa finalizo correctamente"); };

sentencias:
	 sentencia  
	 |sentencia sentencias  ;

sentencia:	
	declaracion 
	|asignacion			
	|{logSintactico.addLog("Linea "+lexico.getLineas()+": Seleccion");} seleccion
	|bucle
	|impresion 
    |  ';' error {logSintactico.addLog("ERROR sintactico en linea "+lexico.getLineas()+": sentencia no permitida");};

declaracion:
	FLOAT variables';' {logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de un FLOAT");}
	|FLOAT';' error {logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");}
  	|INT variables ';'
  	|VECTOR vector ';' {logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de un VECTOR");}
	|VECTOR vector error {logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");};

vector: 
	IDENTIFICADOR '[' expresion ']' 
	|error {logSintactico.addLog("ERROR sintactica en la linea "+lexico.getLineas()+": sintactico en el arreglo");};

variables: 
	IDENTIFICADOR 
	|variables','IDENTIFICADOR
	|error {logSintactico.addLog("ERROR sintactica en la linea"+lexico.getLineas()+": declaracion de variables");} ;

asignacion: 
	IDENTIFICADOR ASIG expresion ';'  {logSintactico.addLog("Linea "+lexico.getLineas()+": asignacion");}
	|IDENTIFICADOR '[' expresion ']' ASIG expresion ';' {logSintactico.addLog("Linea "+lexico.getLineas()+": asignacion");};

expresion:
	numero {logSintactico.addLog("Linea "+lexico.getLineas()+": se encontro una expresion");}
  	|operacionAritmetica {logSintactico.addLog("Linea "+lexico.getLineas()+": se encontro una expresion");}
	| variable  {logSintactico.addLog("Linea "+lexico.getLineas()+": se encontro una expresion");};
	
numero:
	FLOAT
	|INT;
	
operacionAritmetica:
	variable operador variable
	|variable operador numero
	|numero operador variable
	|numero operador numero;

variable:
	IDENTIFICADOR
	|IDENTIFICADOR '[' expresion ']';

operador:
	'+'
	|'-'
	|'*'
	|'/';
	
comparador:
	'<'
	|'<='
	|'>'
	|'>='
	|'='
	|'^='
	|error {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": no es posible resolver la comparacion");}
;		

seleccion: 
	IF'('condicion')'THEN'{'sentencias'}'   
	|IF'('condicion')'THEN'{'sentencias'}' ELSE '{'sentencias'}'  {logSintactico.addLog("Linea "+lexico.getLineas()+": seleccion ifelse");}
	|IF'('condicion')'THEN'{'sentencias'}' ELSE  {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
	|IF'('condicion')''{'sentencias'}' ELSE  {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion falta setencia THEN ");}
	|IF'('condicion')'THEN {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
	|error {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion no valida");};

condicion: 
	expresion comparador expresion 
	|error {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": condicion no valida");};

impresion: 
	PRINT'(' CADENA ')'';' {logSintactico.addLog("Linea "+lexico.getLineas()+":salida por pantalla");};
    |PRINT'('CADENA')' error {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba un punto y coma");};
	|PRINT'('';' error {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una cadena");};
	|PRINT';' error {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una ('cadena')");};

bucle:
	FOR '(' INT IDENTIFICADOR '=' INT ';' IDENTIFICADOR comparador expresion ';' IDENTIFICADOR')' '{' sentencias '}';

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