%{

package utils;
import java.io.IOException;

%}

%token  IF,THEN, ELSE,PRINT,IDENTIFICADOR, VECTOR, CADENA, INT,FLOAT,FOR

%start programa

%%

programa: sentencias { logSintactico.addLogger("El programa finalizo correctamente"); };

sentencias:
	 sentencia  
	 |sentencias sentencia ;

sentencia:	
	declaracion 
	|asignacion';'			
	|{logSintactico.addLogger("Linea "+lexico.getLineas()+": Seleccion");} seleccion
	|bucle
	|impresion 
    |  ';' error {logSintactico.addLogger("ERROR sintactico en linea "+lexico.getLineas()+": sentencia no permitida");};

declaracion:
	FLOAT variables';' {logSintactico.addLogger("Linea "+lexico.getLineas()+": declaracion de un FLOAT");}
	|FLOAT';' error {logSintactico.addLogger("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");}
  	|VECTOR vector ';' {logSintactico.addLogger("Linea "+lexico.getLineas()+": declaracion de un VECTOR");}
	|VECTOR vector error {logSintactico.addLogger("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");};

vector: 
	IDENTIFICADOR '[' expresion ']' 
	|error {logSintactico.addLogger("ERROR sintactica en la linea "+lexico.getLineas()+": sintactico en el arreglo");};

variables: 
	IDENTIFICADOR 
	|variables','IDENTIFICADOR
	|error {logSintactico.addLogger("ERROR sintactica en la linea"+lexico.getLineas()+": declaracion de variables");} ;

asignacion: 
	IDENTIFICADOR ASIG expresion {logSintactico.addLogger("Linea "+lexico.getLineas()+": asignacion");}
	|IDENTIFICADOR '[' expresion ']' ASIG expresion {logSintactico.addLogger("Linea "+lexico.getLineas()+": asignacion");};

expresion:
	numero {logSintactico.addLogger("Linea "+lexico.getLineas()+": se encontro una expresion");}
  	|operacionAritmetica {logSintactico.addLogger("Linea "+lexico.getLineas()+": se encontro una expresion");}
	| variable  {logSintactico.addLogger("Linea "+lexico.getLineas()+": se encontro una expresion");};
	
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
	'<'
	|'<='
	|'>'
	|'>='
	|'='
	|'^='
	|error {logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": no es posible resolver la comparacion");}
;		

seleccion: 
	IF'('condicion')'THEN'{'sentencias'}'   
	|IF'('condicion')'THEN'{'sentencias'}' ELSE '{'sentencias'}'  {logSintactico.addLogger("Linea "+lexico.getLineas()+": seleccion ifelse");}
	|IF'('condicion')'THEN'{'sentencias'}' ELSE  {logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
	|IF'('condicion')''{'sentencias'}' ELSE  {logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion falta setencia THEN ");}
	|IF'('condicion')'THEN {logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
	|error {logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion no valida");};

condicion: 
	expresion comparador expresion 
	|error {logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": condicion no valida");};

impresion: 
	PRINT'('CADENA')'';' {logSintactico.addLogger("Linea "+lexico.getLineas()+":salida por pantalla");}
    |PRINT'('CADENA')' error {logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba un punto y coma");}
	|PRINT'('';' error {logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una cadena");}
	|PRINT';' error {logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una ('cadena')");};

bucle:
	FOR '(' INT IDENTIFICADOR '=' INT ; iIDENTIFICADOR COMPARADOR EXPRESION ; IDENTIFICADOR ++ ')' '{' sentencias '}';

%%
  private Logger logSintactico = new Logger("sintactico.log");
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
         Simbolo s = new Simbolo(new StringBuffer("-"+valor),"NUMERO");
        lexico.getTabla().addSimbolo(s);
        
        Simbolo raya = new Simbolo(new StringBuffer("-"),"-");
        lexico.getTabla().eliminarSimbolo(raya);
        
        Simbolo elival = new Simbolo(new StringBuffer(valor),"NUMERO");
        lexico.getTabla().eliminarSimbolo(elival);
}
public void imprimirSintactico(){
    logSintactico.imprimir();
}