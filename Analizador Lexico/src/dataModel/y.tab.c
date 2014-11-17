#ifndef lint
static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";
#endif
#define YYBYACC 1
#line 2 "gramatica.y"

package dataModel;
import java.io.IOException;
import java.util.Vector;
import java.util.Stack;

#line 13 "y.tab.c"
#define SI 257
#define SINO 258
#define ENTONCES 259
#define IMPRIMIR 260
#define IDENTIFICADOR 261
#define VECTOR 262
#define DE 263
#define CADENA 264
#define INT 265
#define FLOAT 266
#define PARA 267
#define ASIG 268
#define MAYOR_IGUAL 269
#define MENOR_IGUAL 270
#define DISTINTO 271
#define YYERRCODE 256
short yylhs[] = {                                        -1,
    0,    1,    1,    2,    2,    2,    2,    2,    3,    3,
    3,    3,    9,    9,    4,    4,    8,    8,   10,   10,
   10,   12,   11,   11,   11,   11,   11,   13,   13,   13,
   14,   14,   14,   14,   14,   14,    5,    5,   19,   15,
   15,   18,   18,   17,   17,   17,   20,   21,   21,   21,
   21,   21,   21,   21,   21,   21,   21,   21,   23,   16,
   24,   16,   25,   22,   26,   22,   27,   22,    6,    6,
    6,    7,    7,    7,    7,    7,    7,    7,
};
short yylen[] = {                                         2,
    1,    1,    2,    1,    2,    1,    2,    1,    3,    2,
   11,    3,    1,    3,    3,    6,    1,    1,    1,    3,
    3,    4,    1,    3,    3,    3,    3,    1,    1,    1,
    1,    1,    1,    1,    1,    1,    1,    1,    0,    4,
    3,    3,    1,    5,    4,    4,    4,    4,    4,    4,
    4,    4,    3,    3,    3,    3,    3,    3,    0,    7,
    0,    4,    0,    4,    0,    5,    0,    5,    3,    2,
    3,    5,    3,    2,    3,    3,    4,    2,
};
short yydefred[] = {                                      0,
    0,    0,    0,    0,   18,   17,    0,    0,    0,    2,
    4,    0,    6,    0,    8,    0,    0,    0,   30,   23,
   37,   38,    0,    0,    0,    0,   63,   61,   78,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    3,    5,
    7,   10,   13,    0,   32,   34,   36,    0,    0,   31,
   33,   35,    0,    0,    0,    0,    0,    0,   29,   67,
    0,    0,   75,    0,    0,   76,    0,    0,   12,    0,
    0,    0,   41,    0,    0,    0,    9,    0,    0,    0,
   71,    0,   26,   24,   27,   25,   42,    0,    0,    0,
    0,    0,   62,   77,    0,    0,    0,    0,    0,    0,
   43,   40,    0,    0,    0,    0,    0,    0,    0,   14,
    0,    0,   59,    0,   64,   72,    0,    0,   47,    0,
    0,   58,   54,    0,   56,    0,   57,    0,   55,    0,
   53,    0,   46,   66,   22,    0,   68,    0,    0,   44,
   48,   50,   52,   49,   51,   60,    0,    0,    0,    0,
   11,
};
short yydgoto[] = {                                       8,
   25,   39,   11,   12,   13,   14,   15,   59,   44,   17,
   18,   19,   20,   53,   21,   22,   37,   27,   74,   38,
   76,   28,  136,   62,   61,   88,   91,
};
short yysindex[] = {                                     87,
  -11,  -40,  -77, -222,    0,    0,  -22,    0,   87,    0,
    0,  -17,    0,   -9,    0, -128,   34,   89,    0,    0,
    0,    0,   87, -221,   51,    0,    0,    0,    0,   22,
  -31, -221, -221,  -75, -193, -172,   49, -142,    0,    0,
    0,    0,    0,   -7,    0,    0,    0, -221, -221,    0,
    0,    0, -155, -143, -127,   75,   39,   91,    0,    0,
 -118,   92,    0,  107,  111,    0,    3,    6,    0, -106,
 -221, -142,    0, -104,   28, -221,    0, -101,   89,   89,
    0,    3,    0,    0,    0,    0,    0,  -92, -221,  -94,
  -88, -104,    0,    0,  123,  -81,  140,  129, -221,   87,
    0,    0,  136, -111,  -46,   15,   90,  102,  155,    0,
 -104,   10,    0, -104,    0,    0, -221,  156,    0,  160,
   75,    0,    0,  145,    0,  150,    0,  158,    0,  170,
    0,  175,    0,    0,    0,  -93,    0,    3,  -51,    0,
    0,    0,    0,    0,    0,    0,  147,  -25, -161,  185,
    0,
};
short yyrindex[] = {                                      0,
    0,    0,   25,    0,    0,    0,    0,    0,  245,    0,
    0,    0,    0,    0,    0,   31,    0,  -34,    0,    0,
    0,    0,    0,    0,    0,  -68,    0,    0,    0,    1,
    0,    0,    0,    0,    0,    0,  -82,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   -3,    0,    0,  -10,  -39,    0,    0,    0,
    0,    0,    0,    0,   12,    0,  188,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  -28,   21,
    0,    2,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   55,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,  -54,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  193,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,
};
short yygindex[] = {                                      0,
   24,   35,    0,    0,    0,  229,    0,  306,    0,   88,
   94,    0,  267,    0,    0,    0,    0,   33,    0,  221,
  192,  124,    0,    0,    0,    0,    0,
};
#define YYTABLESIZE 455
short yytable[] = {                                      31,
   74,   28,   28,   28,   45,   28,   19,   28,   19,   66,
   19,   73,   20,   33,   20,   70,   20,   36,  100,   28,
   28,   28,   28,    9,   19,   19,   19,   19,   24,   23,
   20,   20,   20,   20,   10,   26,   78,   70,   34,   57,
   39,   40,   69,    5,    6,   48,   56,   49,   48,   41,
   49,   77,   48,   28,   49,   70,    2,   10,   19,   74,
   69,   21,   63,   21,   20,   21,   28,   28,   45,   28,
   73,   28,   29,   29,   71,   29,   48,   29,   49,   21,
   21,   21,   21,   28,   28,   28,   28,  107,   35,  108,
   29,   29,   29,   50,   52,   51,   22,   22,   96,   22,
   81,   22,  135,    5,    6,   57,  102,   73,  101,    5,
    6,   23,   83,   21,   22,   22,   22,   57,   75,   67,
   68,    5,    6,  121,  115,   74,  101,   42,   85,   89,
   54,   90,   43,   57,   10,   55,   73,    5,    6,   92,
   82,   79,   80,  134,  123,  101,  137,   94,  101,   57,
   93,   95,    1,    5,    6,    2,    3,    4,   97,  110,
    5,    6,    7,    1,  113,  111,    2,    3,    4,  114,
   26,    5,    6,    7,   39,   60,  112,   39,   39,   39,
   69,  116,   39,   39,   39,  118,  117,  119,    2,   43,
   32,    2,    2,    2,  122,  133,    2,    2,    2,   87,
  140,  139,   45,  141,  138,   45,   45,   45,  142,  125,
   45,   45,   45,  147,   57,   29,  143,   28,    5,    6,
   28,   28,   28,   30,   64,   28,   28,   28,  144,   28,
   28,   28,   65,  145,   19,   19,   19,  149,   35,  148,
   20,   20,   20,  151,    1,    1,   15,   65,    2,    3,
    4,   16,   58,    5,    6,    7,   72,   74,   74,  146,
   74,   74,   74,   99,    0,   74,   74,   74,   73,   73,
  127,   73,   73,   73,    0,   57,   73,   73,   73,    5,
    6,    0,    0,  103,    0,    0,    0,    0,    0,   21,
   21,   21,    0,   28,   28,   28,  104,  105,  106,   29,
   29,   29,   45,   46,   47,   16,   16,    1,    0,    0,
    2,    3,    4,    0,   16,    5,    6,    7,    0,    0,
   84,   86,    0,   22,   22,   22,    0,    0,   16,    0,
   16,    1,    0,    0,    2,    3,    4,   98,    0,    5,
    6,    7,  109,    1,    0,  129,    2,    3,    4,    0,
   57,    5,    6,    7,    5,    6,    0,  131,    0,    0,
    0,   16,   57,    0,    0,  120,    5,    6,    0,    0,
  124,  126,  128,  130,  132,    0,    0,    0,    0,   16,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   16,    0,    0,
    0,    0,    0,    0,    0,   16,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   16,    0,    0,   16,
    0,    0,    0,    0,    0,    0,   16,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,   16,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  150,
};
short yycheck[] = {                                      40,
    0,   41,   42,   43,   59,   45,   41,   47,   43,   41,
   45,    0,   41,   91,   43,   91,   45,   40,  123,   59,
   60,   61,   62,    0,   59,   60,   61,   62,   40,  123,
   59,   60,   61,   62,    0,    1,   44,   41,  261,  261,
  123,   59,   41,  265,  266,   43,   23,   45,   43,   59,
   45,   59,   43,   93,   45,   59,  125,   23,   93,   59,
   59,   41,   41,   43,   93,   45,   42,   43,  123,   45,
   59,   47,   42,   43,  268,   45,   43,   47,   45,   59,
   60,   61,   62,  123,   60,   61,   62,   60,  261,   62,
   60,   61,   62,   60,   61,   62,   42,   43,   93,   45,
  256,   47,   93,  265,  266,  261,   74,   59,   74,  265,
  266,  123,  256,   93,   60,   61,   62,  261,  261,   32,
   33,  265,  266,  100,   92,  125,   92,  256,  256,   91,
   42,   41,  261,  261,  100,   47,  125,  265,  266,  258,
   53,   48,   49,  111,  256,  111,  114,   41,  114,  261,
   59,   41,  257,  265,  266,  260,  261,  262,  265,  261,
  265,  266,  267,  257,  259,  258,  260,  261,  262,  258,
  136,  265,  266,  267,  257,  125,   89,  260,  261,  262,
  256,   59,  265,  266,  267,   46,  268,   59,  257,  258,
  268,  260,  261,  262,   59,   41,  265,  266,  267,  125,
   41,   46,  257,   59,  117,  260,  261,  262,   59,  256,
  265,  266,  267,  265,  261,  256,   59,  257,  265,  266,
  260,  261,  262,  264,  256,  265,  266,  267,   59,  269,
  270,  271,  264,   59,  269,  270,  271,  263,  261,   93,
  269,  270,  271,   59,    0,  257,   59,  258,  260,  261,
  262,   59,   24,  265,  266,  267,   36,  257,  258,  136,
  260,  261,  262,   72,   -1,  265,  266,  267,  257,  258,
  256,  260,  261,  262,   -1,  261,  265,  266,  267,  265,
  266,   -1,   -1,  256,   -1,   -1,   -1,   -1,   -1,  269,
  270,  271,   -1,  269,  270,  271,  269,  270,  271,  269,
  270,  271,  269,  270,  271,    0,    1,  257,   -1,   -1,
  260,  261,  262,   -1,    9,  265,  266,  267,   -1,   -1,
   54,   55,   -1,  269,  270,  271,   -1,   -1,   23,   -1,
   25,  257,   -1,   -1,  260,  261,  262,   71,   -1,  265,
  266,  267,   76,  257,   -1,  256,  260,  261,  262,   -1,
  261,  265,  266,  267,  265,  266,   -1,  256,   -1,   -1,
   -1,   56,  261,   -1,   -1,   99,  265,  266,   -1,   -1,
  104,  105,  106,  107,  108,   -1,   -1,   -1,   -1,   74,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   92,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,  100,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  111,   -1,   -1,  114,
   -1,   -1,   -1,   -1,   -1,   -1,  121,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,  136,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,  149,
};
#define YYFINAL 8
#ifndef YYDEBUG
#define YYDEBUG 0
#endif
#define YYMAXTOKEN 271
#if YYDEBUG
char *yyname[] = {
"end-of-file",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,"'('","')'","'*'","'+'","','","'-'","'.'","'/'",0,0,0,0,0,0,0,0,0,0,
0,"';'","'<'","'='","'>'",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,"'['",0,"']'",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,"'{'",
0,"'}'",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,"SI","SINO","ENTONCES","IMPRIMIR","IDENTIFICADOR",
"VECTOR","DE","CADENA","INT","FLOAT","PARA","ASIG","MAYOR_IGUAL","MENOR_IGUAL",
"DISTINTO",
};
char *yyrule[] = {
"$accept : programa",
"programa : sentencias",
"sentencias : sentencia",
"sentencias : sentencias sentencia",
"sentencia : declaracion",
"sentencia : asignacion ';'",
"sentencia : sentenciaestructurada",
"sentencia : condicion ';'",
"sentencia : impresion",
"declaracion : numero variables ';'",
"declaracion : numero error",
"declaracion : VECTOR IDENTIFICADOR '[' INT '.' '.' INT ']' DE numero ';'",
"declaracion : VECTOR IDENTIFICADOR error",
"variables : IDENTIFICADOR",
"variables : variables ',' IDENTIFICADOR",
"asignacion : IDENTIFICADOR ASIG expresion",
"asignacion : IDENTIFICADOR '[' expresion ']' ASIG expresion",
"numero : FLOAT",
"numero : INT",
"expresion : termino",
"expresion : expresion '+' termino",
"expresion : expresion '-' termino",
"vector : IDENTIFICADOR '[' expresion ']'",
"termino : argumento",
"termino : termino '*' argumento",
"termino : termino '/' argumento",
"termino : termino '*' error",
"termino : termino '/' error",
"argumento : IDENTIFICADOR",
"argumento : numero",
"argumento : vector",
"comparador : '<'",
"comparador : MAYOR_IGUAL",
"comparador : '>'",
"comparador : MENOR_IGUAL",
"comparador : '='",
"comparador : DISTINTO",
"sentenciaestructurada : sentenciafor",
"sentenciaestructurada : sentenciaif",
"$$1 :",
"sentenciafor : PARA condicion_for $$1 bloque_sentencias",
"sentenciafor : PARA condicion_for ';'",
"bloque_sentencias : '{' sentencias '}'",
"bloque_sentencias : sentencia",
"condicion_for : '(' asignacion_for exp_logica_for argumento ')'",
"condicion_for : '(' asignacion_for exp_logica_for argumento",
"condicion_for : asignacion_for exp_logica_for argumento ')'",
"asignacion_for : IDENTIFICADOR ASIG argumento ';'",
"exp_logica_for : IDENTIFICADOR MAYOR_IGUAL argumento ';'",
"exp_logica_for : IDENTIFICADOR '<' argumento ';'",
"exp_logica_for : IDENTIFICADOR MENOR_IGUAL argumento ';'",
"exp_logica_for : IDENTIFICADOR '>' argumento ';'",
"exp_logica_for : IDENTIFICADOR DISTINTO argumento ';'",
"exp_logica_for : IDENTIFICADOR '>' error",
"exp_logica_for : IDENTIFICADOR MAYOR_IGUAL error",
"exp_logica_for : IDENTIFICADOR '<' error",
"exp_logica_for : IDENTIFICADOR MENOR_IGUAL error",
"exp_logica_for : IDENTIFICADOR DISTINTO error",
"exp_logica_for : IDENTIFICADOR error ';'",
"$$2 :",
"sentenciaif : SI '(' condicion ')' ENTONCES $$2 bloque_if",
"$$3 :",
"sentenciaif : SI bloque_if $$3 ';'",
"$$4 :",
"bloque_if : bloque_sentencias $$4 SINO bloque_sentencias",
"$$5 :",
"bloque_if : '{' sentencias $$5 SINO bloque_sentencias",
"$$6 :",
"bloque_if : sentencias '}' $$6 SINO bloque_sentencias",
"condicion : expresion comparador expresion",
"condicion : expresion comparador",
"condicion : expresion comparador error",
"impresion : IMPRIMIR '(' CADENA ')' ';'",
"impresion : IMPRIMIR '(' CADENA",
"impresion : IMPRIMIR CADENA",
"impresion : IMPRIMIR CADENA ')'",
"impresion : IMPRIMIR '(' ')'",
"impresion : IMPRIMIR '(' error ')'",
"impresion : IMPRIMIR error",
};
#endif
#ifndef YYSTYPE
typedef int YYSTYPE;
#endif
#define yyclearin (yychar=(-1))
#define yyerrok (yyerrflag=0)
#ifdef YYSTACKSIZE
#ifndef YYMAXDEPTH
#define YYMAXDEPTH YYSTACKSIZE
#endif
#else
#ifdef YYMAXDEPTH
#define YYSTACKSIZE YYMAXDEPTH
#else
#define YYSTACKSIZE 500
#define YYMAXDEPTH 500
#endif
#endif
int yydebug;
int yynerrs;
int yyerrflag;
int yychar;
short *yyssp;
YYSTYPE *yyvsp;
YYSTYPE yyval;
YYSTYPE yylval;
short yyss[YYSTACKSIZE];
YYSTYPE yyvs[YYSTACKSIZE];
#define yystacksize YYSTACKSIZE
#line 364 "gramatica.y"
  private Log logSintactico = new Log("sintactico.log");
  private AnalizadorLexico lexico;
  private Vector<Tercetos> vectorTercetos;
  private boolean errores;
  String varTipo;
  String incrementoSentFor;
  Stack<String> pila;
  int nroAmbito = 1;
  int indiceExpresion = 0;
  int indiceSentencia = 0;
  int indiceTermino = 0;
  int indiceArgumento = 0;
  int indiceSentencias = 0;
  int indiceAsignacion=0;
  
  public Parser(AnalizadorLexico l) {
         lexico = l;
         pila = new Stack<String>();
         vectorTercetos = new Vector<Tercetos>(); 
         logSintactico.generar();

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

public Simbolo getSimbolo(Simbolo s){
	return TablaSimbolo.obtenerSimbolo(s);
}

public boolean existeToken(Token t){
	return  TablaSimbolo.existeSimbolo(t);	
}

public Token obtenerToken(String lexema,int ambito,String tipo){
	StringBuffer sb = new StringBuffer();
	sb.append(lexema);
	Simbolo simb = new Simbolo(sb,tipo);
	return TablaSimbolo.getToken(simb,ambito);
}

void yyerror(String s)
{
	errores = true;
	System.out.println("Linea "+lexico.getLineas()+": "+s);
}

public boolean TieneErrores(){
	return errores;
}


void Warning(String s){
	System.out.println("Linea "+lexico.getLineas()+": "+s);
}
//imprime error si la variable no existe
public void existeVariable(Token t){
	TablaSimbolo.existeVariable(t);	
}


public void mostrarTercetos(){
	vectorTercetos.add(new Tercetos("FIN","_","_"));
	for(int i= 0; i < vectorTercetos.size();i++){
		System.out.print((i+1)+" ");
		vectorTercetos.elementAt(i).mostrarTerceto();
	}
}

public boolean isEntero(String elem){
	return (elem.charAt(0)>='0' && elem.charAt(0)<='9');
}

public Vector<Tercetos> getTercetos(){
    return vectorTercetos;
}
#line 443 "y.tab.c"
#define YYABORT goto yyabort
#define YYACCEPT goto yyaccept
#define YYERROR goto yyerrlab
int
yyparse()
{
    register int yym, yyn, yystate;
#if YYDEBUG
    register char *yys;
    extern char *getenv();

    if (yys = getenv("YYDEBUG"))
    {
        yyn = *yys;
        if (yyn >= '0' && yyn <= '9')
            yydebug = yyn - '0';
    }
#endif

    yynerrs = 0;
    yyerrflag = 0;
    yychar = (-1);

    yyssp = yyss;
    yyvsp = yyvs;
    *yyssp = yystate = 0;

yyloop:
    if (yyn = yydefred[yystate]) goto yyreduce;
    if (yychar < 0)
    {
        if ((yychar = yylex()) < 0) yychar = 0;
#if YYDEBUG
        if (yydebug)
        {
            yys = 0;
            if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
            if (!yys) yys = "illegal-symbol";
            printf("yydebug: state %d, reading %d (%s)\n", yystate,
                    yychar, yys);
        }
#endif
    }
    if ((yyn = yysindex[yystate]) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
    {
#if YYDEBUG
        if (yydebug)
            printf("yydebug: state %d, shifting to state %d (%s)\n",
                    yystate, yytable[yyn],yyrule[yyn]);
#endif
        if (yyssp >= yyss + yystacksize - 1)
        {
            goto yyoverflow;
        }
        *++yyssp = yystate = yytable[yyn];
        *++yyvsp = yylval;
        yychar = (-1);
        if (yyerrflag > 0)  --yyerrflag;
        goto yyloop;
    }
    if ((yyn = yyrindex[yystate]) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
    {
        yyn = yytable[yyn];
        goto yyreduce;
    }
    if (yyerrflag) goto yyinrecovery;
#ifdef lint
    goto yynewerror;
#endif
yynewerror:
    yyerror("syntax error");
#ifdef lint
    goto yyerrlab;
#endif
yyerrlab:
    ++yynerrs;
yyinrecovery:
    if (yyerrflag < 3)
    {
        yyerrflag = 3;
        for (;;)
        {
            if ((yyn = yysindex[*yyssp]) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
#if YYDEBUG
                if (yydebug)
                    printf("yydebug: state %d, error recovery shifting\
 to state %d\n", *yyssp, yytable[yyn]);
#endif
                if (yyssp >= yyss + yystacksize - 1)
                {
                    goto yyoverflow;
                }
                *++yyssp = yystate = yytable[yyn];
                *++yyvsp = yylval;
                goto yyloop;
            }
            else
            {
#if YYDEBUG
                if (yydebug)
                    printf("yydebug: error recovery discarding state %d\n",
                            *yyssp);
#endif
                if (yyssp <= yyss) goto yyabort;
                --yyssp;
                --yyvsp;
            }
        }
    }
    else
    {
        if (yychar == 0) goto yyabort;
#if YYDEBUG
        if (yydebug)
        {
            yys = 0;
            if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
            if (!yys) yys = "illegal-symbol";
            printf("yydebug: state %d, error recovery discards token %d (%s)\n",
                    yystate, yychar, yys);
        }
#endif
        yychar = (-1);
        goto yyloop;
    }
yyreduce:
#if YYDEBUG
    if (yydebug)
        printf("yydebug: state %d, reducing by rule %d (%s)\n",
                yystate, yyn, yyrule[yyn]);
#endif
    yym = yylen[yyn];
    yyval = yyvsp[1-yym];
    switch (yyn)
    {
case 1:
#line 17 "gramatica.y"
{ logSintactico.addLog("El programa finalizo correctamente"); }
break;
case 2:
#line 20 "gramatica.y"
{indiceSentencias = indiceSentencia;}
break;
case 5:
#line 25 "gramatica.y"
{indiceSentencia = indiceAsignacion;}
break;
case 9:
#line 31 "gramatica.y"
{ yyval.sval = yyvsp[-2].sval;
							}
break;
case 10:
#line 33 "gramatica.y"
{yyerror("Error sintactico -> Declaracion invalida.");}
break;
case 11:
#line 34 "gramatica.y"
{lexico.getTablaSimbolos().addTipo(yyvsp[-10].sval,"VECTOR FLOAT");}
break;
case 12:
#line 35 "gramatica.y"
{logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");}
break;
case 13:
#line 39 "gramatica.y"
{	yyvsp[0].obj = varTipo;
					lexico.getTablaSimbolos().addTipo(yyval.sval,varTipo); }
break;
case 14:
#line 41 "gramatica.y"
{ yyvsp[0].obj = varTipo; }
break;
case 15:
#line 45 "gramatica.y"
{
		Token identificador = obtenerToken(yyvsp[-2].sval,nroAmbito,(String)yyvsp[-2].obj);
		if(!existeToken(identificador))
			yyerror("Error: la variable "+ identificador.getPuntero().getValor() +" no se encuentra declarada.");
		indiceAsignacion = vectorTercetos.size();
		String operador1 = yyvsp[-2].sval;
		if (indiceExpresion != 0){
			vectorTercetos.add(new Tercetos(":=",operador1,indiceExpresion,varTipo));
			indiceExpresion = 0;
		}
		else	
			vectorTercetos.add(new Tercetos(":=",operador1,yyvsp[0].sval,varTipo));
	}
break;
case 16:
#line 61 "gramatica.y"
{
		String operador1 = yyvsp[-5].sval + yyvsp[-4].sval + yyvsp[-3].sval + yyvsp[-2].sval;
		if (indiceExpresion != 0){
			vectorTercetos.add(new Tercetos(":=",operador1,indiceExpresion));
			indiceExpresion = 0;	
		}
		else{
			vectorTercetos.add(new Tercetos(":=",operador1,yyvsp[0].sval));
		}				
	}
break;
case 17:
#line 73 "gramatica.y"
{	varTipo = "float";}
break;
case 18:
#line 74 "gramatica.y"
{ varTipo = "int";
	  }
break;
case 19:
#line 79 "gramatica.y"
{
		yyval.sval = yyvsp[0].sval;
		yyval.obj = yyvsp[0].obj;
	}
break;
case 20:
#line 84 "gramatica.y"
{	
		Token operador1 = obtenerToken(yyvsp[-2].sval,nroAmbito,(String)yyvsp[-2].obj);
		Token operador2 = obtenerToken(yyvsp[0].sval,nroAmbito,(String)yyvsp[0].obj);
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());		
		vectorTercetos.add(new Tercetos("+",op1,op2,varTipo));
		indiceExpresion = vectorTercetos.size();
		
		 
	}
break;
case 21:
#line 95 "gramatica.y"
{
		Token operador1 = obtenerToken(yyvsp[-2].sval,nroAmbito,(String)yyvsp[-2].obj);
		Token operador2 = obtenerToken(yyvsp[0].sval,nroAmbito,(String)yyvsp[0].obj);
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());			
		vectorTercetos.add(new Tercetos("-",op1,op2,varTipo));
		indiceExpresion = vectorTercetos.size();
		
	}
break;
case 22:
#line 107 "gramatica.y"
{
	  yyval.sval = yyvsp[-3].sval + yyvsp[-2].sval + yyvsp[-1].sval + yyvsp[0].sval;
}
break;
case 23:
#line 113 "gramatica.y"
{
		yyval.sval = yyvsp[0].sval;	
		yyval.obj = yyvsp[0].obj;
	}
break;
case 24:
#line 118 "gramatica.y"
{
		Token operador1 = obtenerToken(yyvsp[-2].sval,nroAmbito,(String)yyvsp[-2].obj);
		Token operador2 = obtenerToken(yyvsp[0].sval,nroAmbito,(String)yyvsp[0].obj);
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());			
		vectorTercetos.add(new Tercetos("*",op1,op2,varTipo));
		indiceExpresion = vectorTercetos.size();
		
	}
break;
case 25:
#line 128 "gramatica.y"
{
		Token operador1 = obtenerToken(yyvsp[-2].sval,nroAmbito,(String)yyvsp[-2].obj);
		Token operador2 = obtenerToken(yyvsp[0].sval,nroAmbito,(String)yyvsp[0].obj);
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());			
		vectorTercetos.add(new Tercetos("/",op1,op2,varTipo));
		indiceExpresion = vectorTercetos.size();
		
	}
break;
case 26:
#line 137 "gramatica.y"
{ yyerror("Error sintactico-> Falta el factor del lado derecho del operador *"); }
break;
case 27:
#line 138 "gramatica.y"
{ yyerror("Error sintactico-> Falta el factor del lado derecho del operador /"); }
break;
case 28:
#line 142 "gramatica.y"
{
		yyvsp[0].ival = nroAmbito;
		yyvsp[0].obj = "IDENTIFICADOR";
		Token identificador = obtenerToken(yyvsp[0].sval,nroAmbito,(String)yyvsp[0].obj);
		existeVariable(identificador);
		yyvsp[0].sval = identificador.getPuntero().getValor().toString();
		yyval.sval = yyvsp[0].sval;
		yyval.obj = yyvsp[0].obj;
		yyval.ival = yyvsp[0].ival;
	}
break;
case 30:
#line 153 "gramatica.y"
{}
break;
case 31:
#line 156 "gramatica.y"
{ yyval.sval = "<"; }
break;
case 32:
#line 157 "gramatica.y"
{ yyval.sval = "MAYOR_IGUAL"; }
break;
case 33:
#line 158 "gramatica.y"
{ yyval.sval = ">"; }
break;
case 34:
#line 159 "gramatica.y"
{ yyval.sval = "MENOR_IGUAL"; }
break;
case 35:
#line 160 "gramatica.y"
{ yyval.sval = "="; }
break;
case 36:
#line 161 "gramatica.y"
{ yyval.sval = "DISTINTO"; }
break;
case 39:
#line 169 "gramatica.y"
{
				vectorTercetos.add(new Tercetos("BF",yyvsp[0].sval,"_","",vectorTercetos.size(),true)); 
				pila.push(String.valueOf(vectorTercetos.size()-1));
			}
break;
case 40:
#line 174 "gramatica.y"
{
				String topePilaFin = pila.pop();
				Tercetos tercetoBF = vectorTercetos.elementAt(Integer.parseInt(topePilaFin));
				tercetoBF.setElem3("["+String.valueOf(vectorTercetos.size()+2)+"]");
				String topePilaBI =  pila.pop();
				String topePilaIndice = pila.pop();	
				vectorTercetos.add(new Tercetos("+",topePilaIndice,incrementoSentFor,"uint",vectorTercetos.size()+1,true)); 
				vectorTercetos.add(new Tercetos("BI","["+topePilaBI+"]","_","",vectorTercetos.size()+1,true)); 
			}
break;
case 41:
#line 183 "gramatica.y"
{yyerror("Error sintactico->Falta el cuerpo de la sentencia FOR.");}
break;
case 44:
#line 191 "gramatica.y"
{	
					yyval.sval = yyvsp[-2].sval;
					Token aux = obtenerToken(yyvsp[-1].sval,nroAmbito,(String)yyvsp[-1].obj); 
					incrementoSentFor = aux.getPuntero().getValor().toString();
				
				}
break;
case 45:
#line 197 "gramatica.y"
{yyerror("Error sintactico->Falta cerrar parentesis en sentencia FOR.");}
break;
case 46:
#line 198 "gramatica.y"
{yyerror("Error sintactico->Falta abrir parentesis en sentencia FOR.");}
break;
case 47:
#line 202 "gramatica.y"
{	
					StringBuffer sb1 = new StringBuffer();
					sb1.append(yyvsp[-3].sval); 
					Simbolo s1 = new Simbolo(sb1,"");
					Simbolo simb1 = getSimbolo(s1);
					yyvsp[-3].obj = simb1.getTipo();
					
					StringBuffer sb2 = new StringBuffer();
					sb2.append(yyvsp[-1].sval); 
					Simbolo s2 = new Simbolo(sb2,"");
					Simbolo simb2 = getSimbolo(s2);
					yyvsp[-1].obj = simb2.getTipo();
					
					Token aux = obtenerToken(yyvsp[-3].sval,nroAmbito,(String)yyvsp[-3].obj); 
					Token aux2 = obtenerToken(yyvsp[-1].sval,nroAmbito,(String)yyvsp[-1].obj);				
					yyvsp[-3].sval= aux.getPuntero().getValor().toString();
					String posTofloat = new String(aux2.getPuntero().getValor().toString());
					
					posTofloat = new String("["+String.valueOf(vectorTercetos.size()+"]"));					
					vectorTercetos.add(new Tercetos(":=",aux.getPuntero().getValor().toString(),yyvsp[-1].sval,(String)yyvsp[-3].obj,vectorTercetos.size(),true)); 					
					pila.push(yyvsp[-3].sval);
					pila.push(String.valueOf(vectorTercetos.size()));
				}
break;
case 48:
#line 228 "gramatica.y"
{
					Token aux = obtenerToken(yyvsp[-3].sval,nroAmbito,(String)yyvsp[-3].obj);
					Token aux2 =obtenerToken(yyvsp[-1].sval,nroAmbito,(String)yyvsp[-1].obj);
					yyvsp[-3].sval=aux.getPuntero().getValor().toString();
					yyvsp[-3].obj = aux.getTipo();
					vectorTercetos.add(new Tercetos(">=",aux.getPuntero().getValor().toString(),aux2.getPuntero().getValor().toString(),"INT")); 
					
					yyval.sval = new String("["+String.valueOf(vectorTercetos.size()-1+"]"));
				}
break;
case 49:
#line 238 "gramatica.y"
{
					StringBuffer sb1 = new StringBuffer();
					sb1.append(yyvsp[-3].sval); 
					Simbolo s1 = new Simbolo(sb1,"");
					Simbolo simb1 = getSimbolo(s1);
					yyvsp[-3].obj = simb1.getTipo();
					
					StringBuffer sb2 = new StringBuffer();
					sb2.append(yyvsp[-1].sval); 
					Simbolo s2 = new Simbolo(sb2,"");
					Simbolo simb2 = getSimbolo(s2);
					yyvsp[-1].obj = simb2.getTipo();
					
					Token aux = obtenerToken(yyvsp[-3].sval,nroAmbito,(String)yyvsp[-3].obj); 
					Token aux2 = obtenerToken(yyvsp[-1].sval,nroAmbito,(String)yyvsp[-1].obj); 
					yyvsp[-3].sval=aux.getPuntero().getValor().toString();
					yyvsp[-3].obj = aux.getTipo();
					
					vectorTercetos.add(new Tercetos("<",aux.getPuntero().getValor().toString(),aux2.getPuntero().getValor().toString(),"INT",vectorTercetos.size()+1,true)); 
					yyval.sval = new String("["+String.valueOf(vectorTercetos.size()-1 +"]"));
				}
break;
case 50:
#line 260 "gramatica.y"
{
					Token aux = obtenerToken(yyvsp[-3].sval,nroAmbito,(String)yyvsp[-3].obj);
					Token aux2 = obtenerToken(yyvsp[-1].sval,nroAmbito,(String)yyvsp[-1].obj);
					yyvsp[-3].sval=aux.getPuntero().getValor().toString();
					yyvsp[-3].obj = aux.getTipo();
					if(aux2.getTipo().equals("IDENTIFICADOR"))
						yyerror("Error: la variable <'" +aux2.getPuntero().getValor().toString()+"'> no se encuentra declarada.");					
					if(aux.getTipo().equals("IDENTIFICADOR"))
						yyerror("Error: la variable <'" +aux.getPuntero().getValor().toString()+"'> no se encuentra declarada.");									
					if(!aux.getTipo().equals("INT")||!aux2.getTipo().equals("uint"))
						yyerror("Error-> No se permiten identificadores de tipo float en la comparacion de la sentencia 'FOR'. ");
					vectorTercetos.add(new Tercetos("<=",aux.getPuntero().getValor().toString(),aux2.getPuntero().getValor().toString(),"INT",vectorTercetos.size()+1,true)); 
					yyval.sval = new String("["+String.valueOf(vectorTercetos.size()+"]"));
				}
break;
case 51:
#line 275 "gramatica.y"
{
					Token aux =obtenerToken(yyvsp[-3].sval,nroAmbito,(String)yyvsp[-3].obj);
					Token aux2 = obtenerToken(yyvsp[-1].sval,nroAmbito,(String)yyvsp[-1].obj);
					yyvsp[-3].sval=aux.getPuntero().getValor().toString();
					yyvsp[-3].obj = aux.getTipo();
					if(aux2.getTipo().equals("IDENTIFICADOR"))
						yyerror("Error: la variable <'" +aux2.getPuntero().getValor().toString()+"'> no se encuentra declarada.");					
					if(aux.getTipo().equals("IDENTIFICADOR"))
						yyerror("Error: la variable <'" +aux.getPuntero().getValor().toString()+"'> no se encuentra declarada.");									
					if(!aux.getTipo().equals("INT")||!aux2.getTipo().equals("INT"))
						yyerror("Error-> No se permiten identificadores de tipo float en la comparacion de la sentencia 'FOR'. ");
					vectorTercetos.add(new Tercetos(">",aux.getPuntero().getValor().toString(),aux2.getPuntero().getValor().toString(),"INT",vectorTercetos.size()+1,true));  
					yyval.sval = new String("["+String.valueOf(vectorTercetos.size()+"]"));
				}
break;
case 52:
#line 290 "gramatica.y"
{
					Token aux = obtenerToken(yyvsp[-3].sval,nroAmbito,(String)yyvsp[-3].obj);
					Token aux2 =obtenerToken(yyvsp[-1].sval,nroAmbito,(String)yyvsp[-1].obj);
					yyvsp[-3].sval=aux.getPuntero().getValor().toString();
					yyvsp[-3].obj = aux.getTipo();
					if(aux2.getTipo().equals("IDENTIFICADOR"))
						yyerror("Error: la variable <'" +aux2.getPuntero().getValor().toString()+"'> no se encuentra declarada.");					
					if(aux.getTipo().equals("IDENTIFICADOR"))
						yyerror("Error: la variable <'" +aux.getPuntero().getValor().toString()+"'> no se encuentra declarada.");									
					if(!aux.getTipo().equals("INT")||!aux2.getTipo().equals("INT"))
						yyerror("Error-> No se permiten identificadores de tipo float en la comparacion de la sentencia 'FOR'. ");
					vectorTercetos.add(new Tercetos("<>",aux.getPuntero().getValor().toString(),aux2.getPuntero().getValor().toString(),"INT",vectorTercetos.size()+1,true)); 
					yyval.sval = new String("["+String.valueOf(vectorTercetos.size()+"]"));
				}
break;
case 53:
#line 304 "gramatica.y"
{yyerror("Error sintactico->Se esperaba un Factor en la comparacion de la sentencia FOR.");}
break;
case 54:
#line 305 "gramatica.y"
{yyerror("Error sintactico->Se esperaba un Factor en la comparacion de la sentencia FOR.");}
break;
case 55:
#line 306 "gramatica.y"
{yyerror("Error sintactico->Se esperaba un Factor en la comparacion de la sentencia FOR.");}
break;
case 56:
#line 307 "gramatica.y"
{yyerror("Error sintactico->Se esperaba un Factor en la comparacion de la sentencia FOR.");}
break;
case 57:
#line 308 "gramatica.y"
{yyerror("Error sintactico->Se esperaba un Factor en la comparacion de la sentencia FOR.");}
break;
case 58:
#line 309 "gramatica.y"
{yyerror("Error sintactico->Error en la comparacion de la sentencia FOR.");}
break;
case 59:
#line 313 "gramatica.y"
{
			vectorTercetos.add(new Tercetos("BF",yyvsp[-2].sval,"")); 
			pila.push(String.valueOf(vectorTercetos.size()-1));			
			}
break;
case 61:
#line 317 "gramatica.y"
{yyerror("Error sintactico->Falta la condicion en la sentencia IF.");}
break;
case 63:
#line 322 "gramatica.y"
{
				vectorTercetos.add(new Tercetos("BI","","_")); 
				String topePila = pila.pop();
				Tercetos tercetoBF = vectorTercetos.elementAt(Integer.parseInt(topePila));
				tercetoBF.setElem3("["+String.valueOf(vectorTercetos.size()-1)+"]");
				pila.push(String.valueOf(vectorTercetos.size()-1));
			}
break;
case 64:
#line 330 "gramatica.y"
{
				String topePila = pila.pop();
				Tercetos tercetoBI = vectorTercetos.elementAt(Integer.parseInt(topePila));
				tercetoBI.setElem2("["+String.valueOf(vectorTercetos.size()-1)+"]");
			}
break;
case 65:
#line 335 "gramatica.y"
{yyerror("Error sintactico->Falta cerrar llave en el cuerpo de la sentencia IF.");}
break;
case 67:
#line 336 "gramatica.y"
{yyerror("Error sintactico->Falta abrir llave en el cuerpo de la sentencia IF.");}
break;
case 69:
#line 342 "gramatica.y"
{
		if(yyvsp[-2].obj != yyvsp[0].obj)
			Warning("Warning: Los tipos de los operandos en la comparacion de la sentencia son distintos");
		vectorTercetos.add(new Tercetos(yyvsp[-1].sval,yyvsp[-2].sval,yyvsp[0].sval,varTipo));
	}
break;
case 70:
#line 347 "gramatica.y"
{ yyerror("Error sintactico-> Falta lado derecho de la expresion.");}
break;
case 71:
#line 348 "gramatica.y"
{ yyerror("Error sintactico-> Falta abrir parentisis en la expresion.");}
break;
case 72:
#line 352 "gramatica.y"
{
		vectorTercetos.add(new Tercetos("IMPRIMIR",yyvsp[-2].sval,"_","CADENA"));
	}
break;
case 73:
#line 355 "gramatica.y"
{yyerror("Error sintactico->Falta cerrar parentesis en la instruccion Imprimir.");}
break;
case 74:
#line 356 "gramatica.y"
{yyerror("Error sintactico->La cadena de la sentencia Imprimir debe estar entre parentesis.");}
break;
case 75:
#line 357 "gramatica.y"
{yyerror("Error sintactico->Falta abrir parentesis en la instruccion 'Imprimir'.");}
break;
case 76:
#line 358 "gramatica.y"
{yyerror("Error sintactico->Falta la cadena en la instruccion Imprimir.");}
break;
case 77:
#line 359 "gramatica.y"
{yyerror("Error sintactico->La cadena es incorrecta en la instruccion Imprimir.");}
break;
case 78:
#line 360 "gramatica.y"
{yyerror("Error sintactico en la instrucion 'Imprimir'.");}
break;
#line 1037 "y.tab.c"
    }
    yyssp -= yym;
    yystate = *yyssp;
    yyvsp -= yym;
    yym = yylhs[yyn];
    if (yystate == 0 && yym == 0)
    {
#if YYDEBUG
        if (yydebug)
            printf("yydebug: after reduction, shifting from state 0 to\
 state %d\n", YYFINAL);
#endif
        yystate = YYFINAL;
        *++yyssp = YYFINAL;
        *++yyvsp = yyval;
        if (yychar < 0)
        {
            if ((yychar = yylex()) < 0) yychar = 0;
#if YYDEBUG
            if (yydebug)
            {
                yys = 0;
                if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
                if (!yys) yys = "illegal-symbol";
                printf("yydebug: state %d, reading %d (%s)\n",
                        YYFINAL, yychar, yys);
            }
#endif
        }
        if (yychar == 0) goto yyaccept;
        goto yyloop;
    }
    if ((yyn = yygindex[yym]) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn];
    else
        yystate = yydgoto[yym];
#if YYDEBUG
    if (yydebug)
        printf("yydebug: after reduction, shifting from state %d \
to state %d\n", *yyssp, yystate);
#endif
    if (yyssp >= yyss + yystacksize - 1)
    {
        goto yyoverflow;
    }
    *++yyssp = yystate;
    *++yyvsp = yyval;
    goto yyloop;
yyoverflow:
    yyerror("yacc stack overflow");
yyabort:
    return (1);
yyaccept:
    return (0);
}
