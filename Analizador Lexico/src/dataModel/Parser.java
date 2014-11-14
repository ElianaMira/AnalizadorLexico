//### This file created by BYACC 1.8(/Java extension  1.15)
//### Java capabilities added 7 Jan 97, Bob Jamison
//### Updated : 27 Nov 97  -- Bob Jamison, Joe Nieten
//###           01 Jan 98  -- Bob Jamison -- fixed generic semantic constructor
//###           01 Jun 99  -- Bob Jamison -- added Runnable support
//###           06 Aug 00  -- Bob Jamison -- made state variables class-global
//###           03 Jan 01  -- Bob Jamison -- improved flags, tracing
//###           16 May 01  -- Bob Jamison -- added custom stack sizing
//###           04 Mar 02  -- Yuval Oren  -- improved java performance, added options
//###           14 Mar 02  -- Tomas Hurka -- -d support, static initializer workaround
//### Please send bug reports to tom@hukatronic.cz
//### static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";






//#line 2 "gramatica.y"

package dataModel;
import java.io.IOException;
import java.util.Vector;
import java.util.Stack;

//#line 24 "Parser.java"




public class Parser
{

boolean yydebug;        //do I want debug output?
int yynerrs;            //number of errors so far
int yyerrflag;          //was there an error?
int yychar;             //the current working character

//########## MESSAGES ##########
//###############################################################
// method: debug
//###############################################################
void debug(String msg)
{
  if (yydebug)
    System.out.println(msg);
}

//########## STATE STACK ##########
final static int YYSTACKSIZE = 500;  //maximum stack size
int statestk[] = new int[YYSTACKSIZE]; //state stack
int stateptr;
int stateptrmax;                     //highest index of stackptr
int statemax;                        //state when highest index reached
//###############################################################
// methods: state stack push,pop,drop,peek
//###############################################################
final void state_push(int state)
{
  try {
		stateptr++;
		statestk[stateptr]=state;
	 }
	 catch (ArrayIndexOutOfBoundsException e) {
     int oldsize = statestk.length;
     int newsize = oldsize * 2;
     int[] newstack = new int[newsize];
     System.arraycopy(statestk,0,newstack,0,oldsize);
     statestk = newstack;
     statestk[stateptr]=state;
  }
}
final int state_pop()
{
  return statestk[stateptr--];
}
final void state_drop(int cnt)
{
  stateptr -= cnt; 
}
final int state_peek(int relative)
{
  return statestk[stateptr-relative];
}
//###############################################################
// method: init_stacks : allocate and prepare stacks
//###############################################################
final boolean init_stacks()
{
  stateptr = -1;
  val_init();
  return true;
}
//###############################################################
// method: dump_stacks : show n levels of the stacks
//###############################################################
void dump_stacks(int count)
{
int i;
  System.out.println("=index==state====value=     s:"+stateptr+"  v:"+valptr);
  for (i=0;i<count;i++)
    System.out.println(" "+i+"    "+statestk[i]+"      "+valstk[i]);
  System.out.println("======================");
}


//########## SEMANTIC VALUES ##########
//public class ParserVal is defined in ParserVal.java


String   yytext;//user variable to return contextual strings
ParserVal yyval; //used to return semantic vals from action routines
ParserVal yylval;//the 'lval' (result) I got from yylex()
ParserVal valstk[];
int valptr;
//###############################################################
// methods: value stack push,pop,drop,peek.
//###############################################################
void val_init()
{
  valstk=new ParserVal[YYSTACKSIZE];
  yyval=new ParserVal();
  yylval=new ParserVal();
  valptr=-1;
}
void val_push(ParserVal val)
{
  if (valptr>=YYSTACKSIZE)
    return;
  valstk[++valptr]=val;
}
ParserVal val_pop()
{
  if (valptr<0)
    return new ParserVal();
  return valstk[valptr--];
}
void val_drop(int cnt)
{
int ptr;
  ptr=valptr-cnt;
  if (ptr<0)
    return;
  valptr = ptr;
}
ParserVal val_peek(int relative)
{
int ptr;
  ptr=valptr-relative;
  if (ptr<0)
    return new ParserVal();
  return valstk[ptr];
}
final ParserVal dup_yyval(ParserVal val)
{
  ParserVal dup = new ParserVal();
  dup.ival = val.ival;
  dup.dval = val.dval;
  dup.sval = val.sval;
  dup.obj = val.obj;
  return dup;
}
//#### end semantic value section ####
public final static short SI=257;
public final static short SINO=258;
public final static short ENTONCES=259;
public final static short IMPRIMIR=260;
public final static short IDENTIFICADOR=261;
public final static short VECTOR=262;
public final static short DE=263;
public final static short CADENA=264;
public final static short INT=265;
public final static short FLOAT=266;
public final static short PARA=267;
public final static short ASIG=268;
public final static short MAYOR_IGUAL=269;
public final static short MENOR_IGUAL=270;
public final static short DISTINTO=271;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    0,    1,    1,    2,    2,    2,    2,    2,    2,    3,
    3,    3,    3,   10,   10,    4,    4,    9,    9,   11,
   11,   11,   13,   12,   12,   12,   12,   12,   14,   14,
   14,   15,   15,   15,   15,   15,   15,    5,    5,    5,
    5,    5,    7,    7,    7,    8,    8,    8,    8,    8,
    8,    8,    6,
};
final static short yylen[] = {                            2,
    1,    1,    2,    1,    2,    1,    1,    2,    1,    3,
    2,   11,    3,    1,    3,    3,    6,    1,    1,    1,
    3,    3,    4,    1,    3,    3,    3,    3,    1,    1,
    1,    1,    1,    1,    1,    1,    1,    8,   12,    9,
    8,    5,    3,    2,    3,    5,    3,    2,    3,    3,
    4,    2,   18,
};
final static short yydefred[] = {                         0,
    0,    0,    0,    0,   19,   18,    0,    0,    0,    2,
    4,    0,    6,    7,    0,    9,    0,    0,    0,   31,
   24,    0,   52,    0,    0,    0,    0,    0,    0,    3,
    5,    8,   11,   14,    0,   33,   35,   37,    0,    0,
   32,   34,   36,    0,    0,    0,    0,    0,   30,   49,
    0,    0,   50,    0,    0,   13,    0,    0,   10,    0,
    0,    0,   45,    0,   27,   25,   28,   26,    0,    0,
   51,    0,    0,    0,    0,   15,    0,    0,    0,   46,
    0,    0,    0,   23,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   41,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   12,    0,   39,    0,    0,    0,
    0,    0,    0,   53,
};
final static short yydgoto[] = {                          8,
    9,   10,   11,   12,   13,   14,   15,   16,   49,   35,
   18,   19,   20,   21,   44,
};
final static short yysindex[] = {                       -10,
  -18,  -37,  -86, -246,    0,    0,    4,    0,  -10,    0,
    0,  -13,    0,    0,   20,    0, -194,  -29,   39,    0,
    0, -191,    0,   22,  -31, -191, -191,  -85, -180,    0,
    0,    0,    0,    0,   -3,    0,    0,    0, -191, -191,
    0,    0,    0, -188, -147, -101,  -20,   52,    0,    0,
   54,   60,    0,    5,   -5,    0, -161, -137,    0, -133,
   39,   39,    0,    5,    0,    0,    0,    0, -191, -106,
    0,   70, -138,   87,   74,    0,    6,   15,  -10,    0,
 -191,   99, -119,    0,  -10,  -82,    5, -113,   95,  -71,
 -102,   64, -103,  -96,    0, -100,  -25,   44, -205, -191,
  -10,  107,   10,  -60,    0,  -93,    0,  129,  132,   53,
  -10,  -49,  115,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,   55,    0,    0,    0,    0,    0,  177,    0,
    0,    0,    0,    0,    0,    0,   80,    0,  -41,    0,
    0,    0,    0,    1,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  -17,    0,    0,  -34,    0,    0,    0,
    0,   12,    0,  122,    0,    0,    0,    0,    0,    0,
   46,   51,    0,   -2,    0,    0,    0,    0,    0,    0,
    0,    0,   89,    0,    0,    0,    0,   23,    0,    0,
    0,    0,    0,    0,    0,    0,  128,    0,    0,    0,
    0,    0,    0,   34,    0,    0,    0,   45,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
  -21,   57,    0,    0,    0,    0,  166,    0,  304,    0,
    3,   43,    0,   75,   96,
};
final static int YYTABLESIZE=416;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                         20,
   48,   20,   25,   20,   27,   57,   29,   29,   29,   53,
   29,   47,   29,   39,   28,   40,   79,   20,   20,   20,
   20,   22,   42,   44,   29,   29,   29,   29,   54,   55,
   41,   43,   42,   38,   41,   43,   42,   39,   43,   40,
   60,   44,   91,   29,   40,   31,   64,   39,   39,   40,
   40,   20,   39,   94,   40,   59,   43,   86,   29,    5,
    6,   33,   50,   90,  107,   30,   34,   63,  106,   47,
   69,   77,   47,    5,    6,  113,    5,    6,   32,  104,
   45,   61,   62,   87,   58,   46,   21,   73,   21,  112,
   21,   22,   70,   22,   71,   22,   29,   29,   84,   29,
   72,   29,  103,   74,   21,   21,   21,   21,   65,   22,
   22,   22,   22,   47,   29,   29,   29,    5,    6,   66,
   68,   30,   30,   75,   30,   48,   30,   76,   80,   81,
   23,   23,   82,   23,   83,   23,   47,   85,   21,   30,
   30,   30,   30,   22,   88,   89,   30,   42,   23,   23,
   23,   92,   78,   93,   67,   95,   96,   97,   38,   47,
   30,   98,   99,    5,    6,  105,  101,  108,   30,   40,
   56,  109,  110,  114,    1,  111,    1,    2,    3,    4,
   16,   26,    5,    6,    7,    1,   17,   48,    2,    3,
    4,    0,  100,    5,    6,    7,    1,    0,    0,    2,
    3,    4,    0,    0,    5,    6,    7,    1,    0,    0,
    2,    3,    4,    0,    0,    5,    6,    7,   23,    0,
    0,    0,    0,    0,   51,    0,   24,   20,   20,   20,
    0,    0,   52,    0,   29,   29,   29,    0,    0,   36,
   37,   38,    0,   36,   37,   38,    1,    0,    0,    2,
    3,    4,    0,    0,    5,    6,    7,   48,    0,    0,
   48,   48,   48,    0,    0,   48,   48,   48,   47,    0,
    0,   47,   47,   47,    0,    0,   47,   47,   47,   42,
    0,    0,   42,   42,   42,    0,    0,   42,   42,   42,
   38,    0,    0,   38,   38,   38,    0,    0,   38,   38,
   38,   40,    0,   17,   40,   40,   40,    0,    0,   40,
   40,   40,   17,    0,   21,   21,   21,    0,    0,   22,
   22,   22,    0,   29,   29,   29,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   30,   30,
   30,    0,    0,    0,    0,    0,    0,   23,   23,   23,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   17,    0,    0,    0,    0,    0,   17,   17,
    0,    0,    0,   17,    0,    0,    0,    0,    0,    0,
    0,    0,  102,    0,   17,    0,    0,   17,    0,    0,
    0,    0,    0,    0,   17,   17,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         41,
    0,   43,   40,   45,   91,   91,   41,   42,   43,   41,
   45,    0,   47,   43,  261,   45,  123,   59,   60,   61,
   62,   40,    0,   41,   59,   60,   61,   62,   26,   27,
   60,   61,   62,    0,   60,   61,   62,   43,   41,   45,
   44,   59,  125,   40,    0,   59,   44,   43,   43,   45,
   45,   93,   43,  125,   45,   59,   59,   79,   93,  265,
  266,  256,   41,   85,  125,    9,  261,  256,   59,  261,
   91,   69,  261,  265,  266,  125,  265,  266,   59,  101,
   42,   39,   40,   81,  265,   47,   41,   93,   43,  111,
   45,   41,   41,   43,   41,   45,   42,   43,   93,   45,
   41,   47,  100,  265,   59,   60,   61,   62,  256,   59,
   60,   61,   62,  261,   60,   61,   62,  265,  266,   45,
   46,   42,   43,  261,   45,  125,   47,  261,   59,  268,
   42,   43,   46,   45,   61,   47,  125,  123,   93,   60,
   61,   62,   86,   93,   46,  265,   90,  125,   60,   61,
   62,  265,  259,   59,  256,  258,   93,  261,  125,  261,
  104,  258,  263,  265,  266,   59,  123,  261,  112,  125,
  256,   43,   41,   59,  257,  123,    0,  260,  261,  262,
   59,  268,  265,  266,  267,  257,   59,   22,  260,  261,
  262,   -1,   97,  265,  266,  267,  257,   -1,   -1,  260,
  261,  262,   -1,   -1,  265,  266,  267,  257,   -1,   -1,
  260,  261,  262,   -1,   -1,  265,  266,  267,  256,   -1,
   -1,   -1,   -1,   -1,  256,   -1,  264,  269,  270,  271,
   -1,   -1,  264,   -1,  269,  270,  271,   -1,   -1,  269,
  270,  271,   -1,  269,  270,  271,  257,   -1,   -1,  260,
  261,  262,   -1,   -1,  265,  266,  267,  257,   -1,   -1,
  260,  261,  262,   -1,   -1,  265,  266,  267,  257,   -1,
   -1,  260,  261,  262,   -1,   -1,  265,  266,  267,  257,
   -1,   -1,  260,  261,  262,   -1,   -1,  265,  266,  267,
  257,   -1,   -1,  260,  261,  262,   -1,   -1,  265,  266,
  267,  257,   -1,    0,  260,  261,  262,   -1,   -1,  265,
  266,  267,    9,   -1,  269,  270,  271,   -1,   -1,  269,
  270,  271,   -1,  269,  270,  271,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  269,  270,
  271,   -1,   -1,   -1,   -1,   -1,   -1,  269,  270,  271,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   79,   -1,   -1,   -1,   -1,   -1,   85,   86,
   -1,   -1,   -1,   90,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   99,   -1,  101,   -1,   -1,  104,   -1,   -1,
   -1,   -1,   -1,   -1,  111,  112,
};
}
final static short YYFINAL=8;
final static short YYMAXTOKEN=271;
final static String yyname[] = {
"end-of-file",null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,"'('","')'","'*'","'+'","','",
"'-'","'.'","'/'",null,null,null,null,null,null,null,null,null,null,null,"';'",
"'<'","'='","'>'",null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
"'['",null,"']'",null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,"'{'",null,"'}'",null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,"SI","SINO","ENTONCES","IMPRIMIR",
"IDENTIFICADOR","VECTOR","DE","CADENA","INT","FLOAT","PARA","ASIG",
"MAYOR_IGUAL","MENOR_IGUAL","DISTINTO",
};
final static String yyrule[] = {
"$accept : programa",
"programa : sentencias",
"sentencias : sentencia",
"sentencias : sentencias sentencia",
"sentencia : declaracion",
"sentencia : asignacion ';'",
"sentencia : seleccion",
"sentencia : bucle",
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
"seleccion : SI '(' condicion ')' ENTONCES '{' sentencias '}'",
"seleccion : SI '(' condicion ')' ENTONCES '{' sentencias '}' SINO '{' sentencias '}'",
"seleccion : SI '(' condicion ')' ENTONCES '{' sentencias '}' SINO",
"seleccion : SI '(' condicion ')' '{' sentencias '}' SINO",
"seleccion : SI '(' condicion ')' ENTONCES",
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
"bucle : PARA '(' INT IDENTIFICADOR '=' INT ';' IDENTIFICADOR comparador expresion ';' IDENTIFICADOR '+' ')' '{' sentencias '}' ';'",
};

//#line 170 "gramatica.y"
  private Log logSintactico = new Log("sintactico.log");
  private AnalizadorLexico lexico;
  private Vector<Tercetos> vectorTercetos;
  private boolean errores;
  
  public Parser(AnalizadorLexico l) {
         lexico = l;
         vectorTercetos = new Vector<Tercetos>();
 		 pila = new Stack<String>();  
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
	for(int i= 0; i<vectorTercetos.size();i++){
		System.out.print((i+1)+" ");
		vectorTercetos.elementAt(i).mostrarTerceto();
	}
}
//#line 434 "Parser.java"
//###############################################################
// method: yylexdebug : check lexer state
//###############################################################
void yylexdebug(int state,int ch)
{
String s=null;
  if (ch < 0) ch=0;
  if (ch <= YYMAXTOKEN) //check index bounds
     s = yyname[ch];    //now get it
  if (s==null)
    s = "illegal-symbol";
  debug("state "+state+", reading "+ch+" ("+s+")");
}





//The following are now global, to aid in error reporting
int yyn;       //next next thing to do
int yym;       //
int yystate;   //current parsing state from state table
String yys;    //current token string


//###############################################################
// method: yyparse : parse input and execute indicated items
//###############################################################
int yyparse()
{
boolean doaction;
  init_stacks();
  yynerrs = 0;
  yyerrflag = 0;
  yychar = -1;          //impossible char forces a read
  yystate=0;            //initial state
  state_push(yystate);  //save it
  val_push(yylval);     //save empty value
  while (true) //until parsing is done, either correctly, or w/error
    {
    doaction=true;
    if (yydebug) debug("loop"); 
    //#### NEXT ACTION (from reduction table)
    for (yyn=yydefred[yystate];yyn==0;yyn=yydefred[yystate])
      {
      if (yydebug) debug("yyn:"+yyn+"  state:"+yystate+"  yychar:"+yychar);
      if (yychar < 0)      //we want a char?
        {
        yychar = yylex();  //get next token
        if (yydebug) debug(" next yychar:"+yychar);
        //#### ERROR CHECK ####
        if (yychar < 0)    //it it didn't work/error
          {
          yychar = 0;      //change it to default string (no -1!)
          if (yydebug)
            yylexdebug(yystate,yychar);
          }
        }//yychar<0
      yyn = yysindex[yystate];  //get amount to shift by (shift index)
      if ((yyn != 0) && (yyn += yychar) >= 0 &&
          yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
        {
        if (yydebug)
          debug("state "+yystate+", shifting to state "+yytable[yyn]);
        //#### NEXT STATE ####
        yystate = yytable[yyn];//we are in a new state
        state_push(yystate);   //save it
        val_push(yylval);      //push our lval as the input for next rule
        yychar = -1;           //since we have 'eaten' a token, say we need another
        if (yyerrflag > 0)     //have we recovered an error?
           --yyerrflag;        //give ourselves credit
        doaction=false;        //but don't process yet
        break;   //quit the yyn=0 loop
        }

    yyn = yyrindex[yystate];  //reduce
    if ((yyn !=0 ) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
      {   //we reduced!
      if (yydebug) debug("reduce");
      yyn = yytable[yyn];
      doaction=true; //get ready to execute
      break;         //drop down to actions
      }
    else //ERROR RECOVERY
      {
      if (yyerrflag==0)
        {
        yyerror("syntax error");
        yynerrs++;
        }
      if (yyerrflag < 3) //low error count?
        {
        yyerrflag = 3;
        while (true)   //do until break
          {
          if (stateptr<0)   //check for under & overflow here
            {
            yyerror("stack underflow. aborting...");  //note lower case 's'
            return 1;
            }
          yyn = yysindex[state_peek(0)];
          if ((yyn != 0) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
            if (yydebug)
              debug("state "+state_peek(0)+", error recovery shifting to state "+yytable[yyn]+" ");
            yystate = yytable[yyn];
            state_push(yystate);
            val_push(yylval);
            doaction=false;
            break;
            }
          else
            {
            if (yydebug)
              debug("error recovery discarding state "+state_peek(0)+" ");
            if (stateptr<0)   //check for under & overflow here
              {
              yyerror("Stack underflow. aborting...");  //capital 'S'
              return 1;
              }
            state_pop();
            val_pop();
            }
          }
        }
      else            //discard this token
        {
        if (yychar == 0)
          return 1; //yyabort
        if (yydebug)
          {
          yys = null;
          if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
          if (yys == null) yys = "illegal-symbol";
          debug("state "+yystate+", error recovery discards token "+yychar+" ("+yys+")");
          }
        yychar = -1;  //read another
        }
      }//end error recovery
    }//yyn=0 loop
    if (!doaction)   //any reason not to proceed?
      continue;      //skip action
    yym = yylen[yyn];          //get count of terminals on rhs
    if (yydebug)
      debug("state "+yystate+", reducing "+yym+" by rule "+yyn+" ("+yyrule[yyn]+")");
    if (yym>0)                 //if count of rhs not 'nil'
      yyval = val_peek(yym-1); //get current semantic value
    yyval = dup_yyval(yyval); //duplicate yyval if ParserVal is used as semantic value
    switch(yyn)
      {
//########## USER-SUPPLIED ACTIONS ##########
case 1:
//#line 17 "gramatica.y"
{ logSintactico.addLog("El programa finalizo correctamente"); }
break;
case 10:
//#line 32 "gramatica.y"
{ yyval.sval = val_peek(2).sval; }
break;
case 11:
//#line 33 "gramatica.y"
{yyerror("Error sintactico-> Declaracion invalida.");}
break;
case 12:
//#line 34 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de un VECTOR");}
break;
case 13:
//#line 35 "gramatica.y"
{logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");}
break;
case 14:
//#line 38 "gramatica.y"
{	val_peek(0).stipo = varTipo; }
break;
case 15:
//#line 39 "gramatica.y"
{ val_peek(0).stipo = varTipo; }
break;
case 16:
//#line 43 "gramatica.y"
{
		Token identificador = obtenerToken(val_peek(2).sval,nroAmbito,val_peek(2).stipo);
		if(!existeToken(identificador))
			yyerror("Error: la variable <'" +aux.getLexema()+"'> no se encuentra declarada.");
		
		String operador1 = val_peek(2).sval;
		String operador2 = new String(val_peek(0).sval);
		vectorTercetos.add(new Tercetos(":-",operador1,operador2));
			
		Imprimir("Asignacion.");
	}
break;
case 17:
//#line 54 "gramatica.y"
{ VER BIENN QUE PONER}
break;
case 18:
//#line 57 "gramatica.y"
{	varTipo = "float";}
break;
case 19:
//#line 58 "gramatica.y"
{ varTipo = "int";
	  }
break;
case 20:
//#line 63 "gramatica.y"
{
		yyval.sval = val_peek(0).sval;
		yyval.stipo = val_peek(0).stipo;
	}
break;
case 21:
//#line 68 "gramatica.y"
{	
		Token operador1 = obtenerToken(val_peek(2).sval,nroAmbito,obtenerToken);
		Token operador2 = obtenerToken(val_peek(0).sval,nroAmbito,obtenerToken);
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());			
		vectorTercetos.add(new Tercetos("+",op1,op2); 
	}
break;
case 22:
//#line 76 "gramatica.y"
{
		Token operador1 = obtenerToken(val_peek(2).sval,nroAmbito,val_peek(2).stipo);
		Token operador2 = obtenerToken(val_peek(0).sval,nroAmbito,val_peek(2).stipo);
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());			
		vectorTercetos.add(new Tercetos("-",op1,op2); 
	}
break;
case 24:
//#line 89 "gramatica.y"
{
		yyval.sval = val_peek(0).sval;	
		yyval.stipo = val_peek(0).stipo;
	}
break;
case 25:
//#line 94 "gramatica.y"
{
		Token operador1 = obtenerToken(val_peek(2).sval,nroAmbito,val_peek(2).stipo);
		Token operador2 = obtenerToken(val_peek(0).sval,nroAmbito,val_peek(2).stipo);
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());			
		vectorTercetos.add(new Tercetos("*",op1,op2);
	}
break;
case 26:
//#line 102 "gramatica.y"
{
		Token operador1 = obtenerToken(val_peek(2).sval,nroAmbito,val_peek(2).stipo);
		Token operador2 = obtenerToken(val_peek(0).sval,nroAmbito,val_peek(2).stipo);
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());			
		vectorTercetos.add(new Tercetos("/",op1,op2);
	}
break;
case 27:
//#line 109 "gramatica.y"
{ yyerror("Error sintactico-> Falta el factor del lado derecho del operador *"); }
break;
case 28:
//#line 110 "gramatica.y"
{ yyerror("Error sintactico-> Falta el factor del lado derecho del operador /"); }
break;
case 29:
//#line 114 "gramatica.y"
{
		val_peek(0).simb.setAmbito(nroAmbito);
		
		Token identificador = obtenerToken(val_peek(0).sval,nroAmbito,val_peek(0).stipo);
		val_peek(0).stipo = identificador.getTipo();
		existeVariable(val_peek(0).simb);
		val_peek(0).sval = identificor.getPuntero().getValor();
		yyval.sval = val_peek(0).sval;
		yyval.stipo = val_peek(0).stipo;
		yyval.simb = val_peek(0).simb;
		
	}
break;
case 32:
//#line 129 "gramatica.y"
{ yyval.sval = "<"; }
break;
case 33:
//#line 130 "gramatica.y"
{ yyval.sval = "MAYOR_IGUAL"; }
break;
case 34:
//#line 131 "gramatica.y"
{ yyval.sval = ">"; }
break;
case 35:
//#line 132 "gramatica.y"
{ yyval.sval = "MENOR_IGUAL"; }
break;
case 36:
//#line 133 "gramatica.y"
{ yyval.sval = "="; }
break;
case 37:
//#line 134 "gramatica.y"
{ yyval.sval = "DISTINTO"; }
break;
case 38:
//#line 137 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": seleccion SI ENTONCES");}
break;
case 39:
//#line 138 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": seleccion SI ENTONCES SINO");}
break;
case 40:
//#line 139 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
break;
case 41:
//#line 140 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion falta setencia ENTONCES ");}
break;
case 42:
//#line 141 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
break;
case 43:
//#line 145 "gramatica.y"
{
		if(!val_peek(2).stipo.equals(val_peek(0).stipo))
			Warning("Warning: Los tipos de los operandos en la comparacion de la sentencia son distintos");
		vectorTercetos.add(new Tercetos(val_peek(1).sval,val_peek(2).sval,val_peek(0).sval));
	}
break;
case 44:
//#line 150 "gramatica.y"
{ yyerror("Error sintactico-> Falta lado derecho de la expresion.");}
break;
case 45:
//#line 151 "gramatica.y"
{ yyerror("Error sintactico-> Falta abrir parentisis en la expresion.");}
break;
case 46:
//#line 155 "gramatica.y"
{
		vectorTercetos.add(new Tercetos("IMPRIMIR",val_peek(2).sval,"_"));
		Imprimir("Fin de la sentencia Print.");
	}
break;
case 47:
//#line 159 "gramatica.y"
{yyerror("Error sintactico->Falta cerrar parentesis en la instruccion Imprimir.");}
break;
case 48:
//#line 160 "gramatica.y"
{yyerror("Error sintactico->La cadena de la sentencia Imprimir debe estar entre parentesis.");}
break;
case 49:
//#line 161 "gramatica.y"
{yyerror("Error sintactico->Falta abrir parentesis en la instruccion 'Imprimir'.");}
break;
case 50:
//#line 162 "gramatica.y"
{yyerror("Error sintactico->Falta la cadena en la instruccion Imprimir.");}
break;
case 51:
//#line 163 "gramatica.y"
{yyerror("Error sintactico->La cadena es incorrecta en la instruccion Imprimir.");}
break;
case 52:
//#line 164 "gramatica.y"
{yyerror("Error sintactico en la instrucion 'Imprimir'.");}
break;
case 53:
//#line 167 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+":bucle");}
break;
//#line 809 "Parser.java"
//########## END OF USER-SUPPLIED ACTIONS ##########
    }//switch
    //#### Now let's reduce... ####
    if (yydebug) debug("reduce");
    state_drop(yym);             //we just reduced yylen states
    yystate = state_peek(0);     //get new state
    val_drop(yym);               //corresponding value drop
    yym = yylhs[yyn];            //select next TERMINAL(on lhs)
    if (yystate == 0 && yym == 0)//done? 'rest' state and at first TERMINAL
      {
      if (yydebug) debug("After reduction, shifting from state 0 to state "+YYFINAL+"");
      yystate = YYFINAL;         //explicitly say we're done
      state_push(YYFINAL);       //and save it
      val_push(yyval);           //also save the semantic value of parsing
      if (yychar < 0)            //we want another character?
        {
        yychar = yylex();        //get next character
        if (yychar<0) yychar=0;  //clean, if necessary
        if (yydebug)
          yylexdebug(yystate,yychar);
        }
      if (yychar == 0)          //Good exit (if lex returns 0 ;-)
         break;                 //quit the loop--all DONE
      }//if yystate
    else                        //else not done yet
      {                         //get next state and push, for next yydefred[]
      yyn = yygindex[yym];      //find out where to go
      if ((yyn != 0) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn]; //get new state
      else
        yystate = yydgoto[yym]; //else go to new defred
      if (yydebug) debug("after reduction, shifting from state "+state_peek(0)+" to state "+yystate+"");
      state_push(yystate);     //going again, so push state & val...
      val_push(yyval);         //for next action
      }
    }//main loop
  return 0;//yyaccept!!
}
//## end of method parse() ######################################



//## run() --- for Thread #######################################
/**
 * A default run method, used for operating this parser
 * object in the background.  It is intended for extending Thread
 * or implementing Runnable.  Turn off with -Jnorun .
 */
public void run()
{
  yyparse();
}
//## end of method run() ########################################



//## Constructors ###############################################
/**
 * Default constructor.  Turn off with -Jnoconstruct .

 */
public Parser()
{
  //nothing to do
}


/**
 * Create a parser, setting the debug to true or false.
 * @param debugMe true for debugging, false for no debug.
 */
public Parser(boolean debugMe)
{
  yydebug=debugMe;
}
//###############################################################



}
//################### END OF CLASS ##############################
