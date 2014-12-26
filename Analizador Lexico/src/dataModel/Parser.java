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
//#line 22 "Parser.java"




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
public final static short FLOTANTE=266;
public final static short PARA=267;
public final static short ASIG=268;
public final static short MAYOR_IGUAL=269;
public final static short MENOR_IGUAL=270;
public final static short DISTINTO=271;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    0,    1,    1,    2,    2,    2,    2,    2,    3,    3,
    3,    3,    9,    9,    4,    4,    8,    8,   10,   10,
   10,   12,   11,   11,   11,   11,   11,   13,   13,   13,
   14,   14,   14,   14,   14,   14,    5,    5,   19,   15,
   15,   18,   18,   17,   17,   17,   20,   21,   21,   21,
   21,   21,   21,   21,   21,   21,   21,   21,   23,   16,
   24,   16,   25,   22,   26,   22,   27,   22,    6,    6,
    6,    7,    7,    7,    7,    7,    7,
};
final static short yylen[] = {                            2,
    1,    1,    2,    1,    2,    1,    2,    1,    3,    2,
   11,    3,    1,    3,    3,    6,    1,    1,    1,    3,
    3,    4,    1,    3,    3,    3,    3,    1,    1,    1,
    1,    1,    1,    1,    1,    1,    1,    1,    0,    4,
    3,    3,    1,    5,    4,    4,    4,    4,    4,    4,
    4,    4,    3,    3,    3,    3,    3,    3,    0,    7,
    0,    4,    0,    4,    0,    5,    0,    5,    3,    2,
    3,    5,    3,    2,    3,    3,    2,
};
final static short yydefred[] = {                         0,
    0,    0,    0,    0,   18,   17,    0,    0,    0,    2,
    4,    0,    6,    0,    8,    0,    0,    0,   30,   23,
   37,   38,    0,    0,    0,    0,   63,   61,   77,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    3,    5,
    7,   13,   10,    0,   32,   34,   36,    0,    0,   31,
   33,   35,    0,    0,    0,    0,    0,    0,   29,   67,
    0,    0,   75,    0,   76,    0,    0,   12,    0,    0,
    0,   41,    0,    0,    0,    9,    0,    0,    0,   71,
    0,   26,   24,   27,   25,   42,    0,    0,    0,    0,
    0,   62,    0,    0,    0,    0,    0,    0,   43,   40,
    0,    0,    0,    0,    0,    0,    0,   14,    0,    0,
   59,    0,   64,   72,    0,    0,   47,    0,    0,   58,
   54,    0,   56,    0,   57,    0,   55,    0,   53,    0,
   46,   66,   22,    0,   68,    0,    0,   44,   48,   50,
   52,   49,   51,   60,    0,    0,    0,    0,   11,
};
final static short yydgoto[] = {                          8,
   25,   39,   11,   12,   13,   14,   15,   59,   44,   17,
   18,   19,   20,   53,   21,   22,   37,   27,   73,   38,
   75,   28,  134,   62,   61,   87,   90,
};
final static short yysindex[] = {                      -156,
  -11,  -40,  -77, -242,    0,    0,  -22,    0, -156,    0,
    0,  -20,    0,   -7,    0,  -23,   34,   -5,    0,    0,
    0,    0, -156,  -84,   51,    0,    0,    0,    0,   20,
  -31,  -84,  -84,  -16, -205, -153,   54, -141,    0,    0,
    0,    0,    0,   -9,    0,    0,    0,  -84,  -84,    0,
    0,    0, -132, -126, -120,   75,   30,   82,    0,    0,
 -131,   85,    0,  101,    0,    3,    6,    0, -116,  -84,
 -141,    0, -107,   28,  -84,    0, -110,   -5,   -5,    0,
    3,    0,    0,    0,    0,    0, -101,  -84,  -97,  -95,
 -107,    0,  111,  -80,  125,  127,  -84, -156,    0,    0,
  136, -118, -100,  -46,   15,   83,  155,    0, -107,   10,
    0, -107,    0,    0,  -84,  156,    0,  160,   75,    0,
    0,  145,    0,  146,    0,  150,    0,  158,    0,  166,
    0,    0,    0,  -93,    0,    3,  -36,    0,    0,    0,
    0,    0,    0,    0,  141,  -19, -221,  181,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,   25,    0,    0,    0,    0,    0,  245,    0,
    0,    0,    0,    0,    0,   31,    0,  -34,    0,    0,
    0,    0,    0,    0,    0,  -68,    0,    0,    0,    1,
    0,    0,    0,    0,    0,    0,  -82,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   -3,    0,    0,  -10,  -39,    0,    0,    0,
    0,    0,    0,   12,    0,  188,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  -28,   21,    0,
   -1,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,   55,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  -54,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  193,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
   24,  286,    0,    0,    0,  229,    0,  306,    0,   99,
   70,    0,  268,    0,    0,    0,    0,   16,    0,  221,
  189,  130,    0,    0,    0,    0,    0,
};
final static int YYTABLESIZE=453;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                         31,
   74,   28,   28,   28,   45,   28,   19,   28,   19,   65,
   19,   73,   20,   33,   20,   98,   20,   36,   34,   28,
   28,   28,   28,    9,   19,   19,   19,   19,   24,   23,
   20,   20,   20,   20,   77,   43,   54,   70,   40,   69,
   39,   55,   68,    5,    6,   48,   56,   49,   48,   76,
   49,   41,   48,   28,   49,   70,    2,   69,   19,   74,
   63,   21,   70,   21,   20,   21,   28,   28,   45,   28,
   73,   28,   29,   29,   69,   29,   48,   29,   49,   21,
   21,   21,   21,   28,   28,   28,   28,  105,  100,  106,
   29,   29,   29,   50,   52,   51,   22,   22,   94,   22,
    1,   22,  133,    2,    3,    4,  113,   35,    5,    6,
    7,   23,   72,   21,   22,   22,   22,   78,   79,   74,
   88,  119,   89,   80,  132,   74,   91,  135,   57,   82,
   66,   67,    5,    6,   57,   84,   73,  121,    5,    6,
   57,   93,   57,   92,    5,    6,    5,    6,   95,    1,
  108,   81,    2,    3,    4,  123,  109,    5,    6,    7,
   57,  111,  112,    1,    5,    6,    2,    3,    4,  114,
  116,    5,    6,    7,   39,   60,   57,   39,   39,   39,
    5,    6,   39,   39,   39,  117,  110,  115,    2,   43,
   32,    2,    2,    2,  120,  131,    2,    2,    2,   86,
  138,  137,   45,  139,  140,   45,   45,   45,  141,  125,
   45,   45,   45,  136,   57,   29,  142,   28,    5,    6,
   28,   28,   28,   30,  143,   28,   28,   28,  145,   28,
   28,   28,   64,  146,   19,   19,   19,   42,   35,  149,
   20,   20,   20,  147,    1,    1,   15,   65,    2,    3,
    4,   16,   58,    5,    6,    7,   71,   74,   74,   97,
   74,   74,   74,  144,    0,   74,   74,   74,   73,   73,
  127,   73,   73,   73,    0,   57,   73,   73,   73,    5,
    6,    0,    0,  101,    0,   10,   26,    0,    0,   21,
   21,   21,    0,   28,   28,   28,  102,  103,  104,   29,
   29,   29,   45,   46,   47,   16,   16,    1,   10,    0,
    2,    3,    4,    0,   16,    5,    6,    7,    0,    0,
    0,   83,   85,   22,   22,   22,    0,    0,   16,    0,
   16,    1,    0,    0,    2,    3,    4,   96,  129,    5,
    6,    7,  107,   57,    0,    0,    0,    5,    6,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   99,    0,
    0,   16,    0,    0,  118,    0,    0,    0,    0,  122,
  124,  126,  128,  130,    0,    0,   99,    0,   16,    0,
    0,    0,    0,   10,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   99,    0,   16,   99,    0,    0,
    0,    0,    0,   16,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   16,    0,    0,   16,    0,   26,
    0,    0,    0,    0,   16,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,   16,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  148,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         40,
    0,   41,   42,   43,   59,   45,   41,   47,   43,   41,
   45,    0,   41,   91,   43,  123,   45,   40,  261,   59,
   60,   61,   62,    0,   59,   60,   61,   62,   40,  123,
   59,   60,   61,   62,   44,   59,   42,   41,   59,   41,
  123,   47,   59,  265,  266,   43,   23,   45,   43,   59,
   45,   59,   43,   93,   45,   59,  125,   59,   93,   59,
   41,   41,  268,   43,   93,   45,   42,   43,  123,   45,
   59,   47,   42,   43,   91,   45,   43,   47,   45,   59,
   60,   61,   62,  123,   60,   61,   62,   60,   73,   62,
   60,   61,   62,   60,   61,   62,   42,   43,   93,   45,
  257,   47,   93,  260,  261,  262,   91,  261,  265,  266,
  267,  123,   59,   93,   60,   61,   62,   48,   49,  261,
   91,   98,   41,  256,  109,  125,  258,  112,  261,  256,
   32,   33,  265,  266,  261,  256,  125,  256,  265,  266,
  261,   41,  261,   59,  265,  266,  265,  266,  265,  257,
  261,   53,  260,  261,  262,  256,  258,  265,  266,  267,
  261,  259,  258,  257,  265,  266,  260,  261,  262,   59,
   46,  265,  266,  267,  257,  125,  261,  260,  261,  262,
  265,  266,  265,  266,  267,   59,   88,  268,  257,  258,
  268,  260,  261,  262,   59,   41,  265,  266,  267,  125,
   41,   46,  257,   59,   59,  260,  261,  262,   59,  256,
  265,  266,  267,  115,  261,  256,   59,  257,  265,  266,
  260,  261,  262,  264,   59,  265,  266,  267,  265,  269,
  270,  271,  264,   93,  269,  270,  271,  261,  261,   59,
  269,  270,  271,  263,    0,  257,   59,  258,  260,  261,
  262,   59,   24,  265,  266,  267,   36,  257,  258,   71,
  260,  261,  262,  134,   -1,  265,  266,  267,  257,  258,
  256,  260,  261,  262,   -1,  261,  265,  266,  267,  265,
  266,   -1,   -1,  256,   -1,    0,    1,   -1,   -1,  269,
  270,  271,   -1,  269,  270,  271,  269,  270,  271,  269,
  270,  271,  269,  270,  271,    0,    1,  257,   23,   -1,
  260,  261,  262,   -1,    9,  265,  266,  267,   -1,   -1,
   -1,   54,   55,  269,  270,  271,   -1,   -1,   23,   -1,
   25,  257,   -1,   -1,  260,  261,  262,   70,  256,  265,
  266,  267,   75,  261,   -1,   -1,   -1,  265,  266,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   73,   -1,
   -1,   56,   -1,   -1,   97,   -1,   -1,   -1,   -1,  102,
  103,  104,  105,  106,   -1,   -1,   91,   -1,   73,   -1,
   -1,   -1,   -1,   98,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,  109,   -1,   91,  112,   -1,   -1,
   -1,   -1,   -1,   98,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,  109,   -1,   -1,  112,   -1,  134,
   -1,   -1,   -1,   -1,  119,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  134,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  147,
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
"IDENTIFICADOR","VECTOR","DE","CADENA","INT","FLOTANTE","PARA","ASIG",
"MAYOR_IGUAL","MENOR_IGUAL","DISTINTO",
};
final static String yyrule[] = {
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
"declaracion : numero ';'",
"declaracion : VECTOR IDENTIFICADOR '[' INT '.' '.' INT ']' DE numero ';'",
"declaracion : VECTOR IDENTIFICADOR ';'",
"variables : IDENTIFICADOR",
"variables : variables ',' IDENTIFICADOR",
"asignacion : IDENTIFICADOR ASIG expresion",
"asignacion : IDENTIFICADOR '[' expresion ']' ASIG expresion",
"numero : FLOTANTE",
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
"impresion : IMPRIMIR error",
};

//#line 360 "gramatica.y"
  private Log logSintactico = new Log("sintactico.log");
  private Log sintacticoError = new Log("errores_sintacticos.log");
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
         sintacticoError.generar();

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

public void imprimirErrores(){
    sintacticoError.imprimir();
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

public boolean hayErrores(){
    return !(sintacticoError.estaVacio());
}

public boolean isEntero(String elem){
	return (elem.charAt(0)>='0' && elem.charAt(0)<='9');
}

public Vector<Tercetos> getTercetos(){
    return vectorTercetos;
}
//#line 511 "Parser.java"
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
//#line 15 "gramatica.y"
{ logSintactico.addLog("El programa finalizo correctamente"); }
break;
case 2:
//#line 18 "gramatica.y"
{indiceSentencias = indiceSentencia;}
break;
case 5:
//#line 23 "gramatica.y"
{indiceSentencia = indiceAsignacion;}
break;
case 9:
//#line 29 "gramatica.y"
{ yyval.sval = val_peek(2).sval;}
break;
case 10:
//#line 30 "gramatica.y"
{sintacticoError.addLog("Error sintactico -> Declaracion invalida.");}
break;
case 11:
//#line 31 "gramatica.y"
{lexico.getTablaSimbolos().addTipo(val_peek(10).sval,"VECTOR FLOTANTE");}
break;
case 12:
//#line 32 "gramatica.y"
{sintacticoError.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");}
break;
case 13:
//#line 36 "gramatica.y"
{	val_peek(0).obj = varTipo;
					lexico.getTablaSimbolos().addTipo(yyval.sval,varTipo); }
break;
case 14:
//#line 38 "gramatica.y"
{ val_peek(0).obj = varTipo; }
break;
case 15:
//#line 42 "gramatica.y"
{
		Token identificador = obtenerToken(val_peek(2).sval,nroAmbito,(String)val_peek(2).obj);
		if(!existeToken(identificador))
			sintacticoError.addLog("Error: la variable "+ identificador.getPuntero().getValor() +" no se encuentra declarada.");
		indiceAsignacion = vectorTercetos.size();
		String operador1 = val_peek(2).sval;
		if (indiceExpresion != 0){
			vectorTercetos.add(new Tercetos(":=",operador1,indiceExpresion,varTipo));
			indiceExpresion = 0;
		}
		else	
			vectorTercetos.add(new Tercetos(":=",operador1,val_peek(0).sval,varTipo));
	}
break;
case 16:
//#line 58 "gramatica.y"
{
		String operador1 = val_peek(5).sval + val_peek(4).sval + val_peek(3).sval + val_peek(2).sval;
		if (indiceExpresion != 0){
			vectorTercetos.add(new Tercetos(":=",operador1,indiceExpresion));
			indiceExpresion = 0;	
		}
		else{
			vectorTercetos.add(new Tercetos(":=",operador1,val_peek(0).sval));
		}				
	}
break;
case 17:
//#line 70 "gramatica.y"
{	varTipo = "flotante";}
break;
case 18:
//#line 71 "gramatica.y"
{ varTipo = "int";
	  }
break;
case 19:
//#line 76 "gramatica.y"
{
		yyval.sval = val_peek(0).sval;
		yyval.obj = val_peek(0).obj;
	}
break;
case 20:
//#line 81 "gramatica.y"
{	
		Token operador1 = obtenerToken(val_peek(2).sval,nroAmbito,(String)val_peek(2).obj);
		Token operador2 = obtenerToken(val_peek(0).sval,nroAmbito,(String)val_peek(0).obj);
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());		
		vectorTercetos.add(new Tercetos("+",op1,op2,varTipo));
		indiceExpresion = vectorTercetos.size();
		
		 
	}
break;
case 21:
//#line 92 "gramatica.y"
{
		Token operador1 = obtenerToken(val_peek(2).sval,nroAmbito,(String)val_peek(2).obj);
		Token operador2 = obtenerToken(val_peek(0).sval,nroAmbito,(String)val_peek(0).obj);
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());			
		vectorTercetos.add(new Tercetos("-",op1,op2,varTipo));
		indiceExpresion = vectorTercetos.size();
		
	}
break;
case 22:
//#line 104 "gramatica.y"
{
	  yyval.sval = val_peek(3).sval + val_peek(2).sval + val_peek(1).sval + val_peek(0).sval;
}
break;
case 23:
//#line 110 "gramatica.y"
{
		yyval.sval = val_peek(0).sval;	
		yyval.obj = val_peek(0).obj;
	}
break;
case 24:
//#line 115 "gramatica.y"
{
		Token operador1 = obtenerToken(val_peek(2).sval,nroAmbito,(String)val_peek(2).obj);
		Token operador2 = obtenerToken(val_peek(0).sval,nroAmbito,(String)val_peek(0).obj);
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());			
		vectorTercetos.add(new Tercetos("*",op1,op2,varTipo));
		indiceExpresion = vectorTercetos.size();
		
	}
break;
case 25:
//#line 125 "gramatica.y"
{
		Token operador1 = obtenerToken(val_peek(2).sval,nroAmbito,(String)val_peek(2).obj);
		Token operador2 = obtenerToken(val_peek(0).sval,nroAmbito,(String)val_peek(0).obj);
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());			
		vectorTercetos.add(new Tercetos("/",op1,op2,varTipo));
		indiceExpresion = vectorTercetos.size();
		
	}
break;
case 26:
//#line 134 "gramatica.y"
{ sintacticoError.addLog("Error sintactico-> Falta el factor del lado derecho del operador *"); }
break;
case 27:
//#line 135 "gramatica.y"
{ sintacticoError.addLog("Error sintactico-> Falta el factor del lado derecho del operador /"); }
break;
case 28:
//#line 139 "gramatica.y"
{
		val_peek(0).ival = nroAmbito;
		val_peek(0).obj = "IDENTIFICADOR";
		Token identificador = obtenerToken(val_peek(0).sval,nroAmbito,(String)val_peek(0).obj);
		existeVariable(identificador);
		val_peek(0).sval = identificador.getPuntero().getValor().toString();
		yyval.sval = val_peek(0).sval;
		yyval.obj = val_peek(0).obj;
		yyval.ival = val_peek(0).ival;
	}
break;
case 30:
//#line 150 "gramatica.y"
{}
break;
case 31:
//#line 153 "gramatica.y"
{ yyval.sval = "<"; }
break;
case 32:
//#line 154 "gramatica.y"
{ yyval.sval = "MAYOR_IGUAL"; }
break;
case 33:
//#line 155 "gramatica.y"
{ yyval.sval = ">"; }
break;
case 34:
//#line 156 "gramatica.y"
{ yyval.sval = "MENOR_IGUAL"; }
break;
case 35:
//#line 157 "gramatica.y"
{ yyval.sval = "="; }
break;
case 36:
//#line 158 "gramatica.y"
{ yyval.sval = "DISTINTO"; }
break;
case 39:
//#line 166 "gramatica.y"
{
				vectorTercetos.add(new Tercetos("BF",val_peek(0).sval,"_","",vectorTercetos.size()+1,true)); 
				pila.push(String.valueOf(vectorTercetos.size()-1));
			}
break;
case 40:
//#line 171 "gramatica.y"
{
				String topePilaFin = pila.pop();
				Tercetos tercetoBF = vectorTercetos.elementAt(Integer.parseInt(topePilaFin));
				tercetoBF.setElem3("["+String.valueOf(vectorTercetos.size()+3)+"]");
				String topePilaBI =  pila.pop();
				String topePilaIndice = pila.pop();	
				vectorTercetos.add(new Tercetos("+",topePilaIndice,incrementoSentFor,varTipo,vectorTercetos.size()+1,true)); 
				vectorTercetos.add(new Tercetos("BI","["+topePilaBI+"]","_","",vectorTercetos.size()+1,true)); 
			}
break;
case 41:
//#line 180 "gramatica.y"
{sintacticoError.addLog("Error sintactico->Falta el cuerpo de la sentencia FOR.");}
break;
case 44:
//#line 188 "gramatica.y"
{	
					yyval.sval = val_peek(2).sval;
					Token aux = obtenerToken(val_peek(1).sval,nroAmbito,(String)val_peek(1).obj); 
					incrementoSentFor = aux.getPuntero().getValor().toString();
				
				}
break;
case 45:
//#line 194 "gramatica.y"
{sintacticoError.addLog("Error sintactico->Falta cerrar parentesis en sentencia FOR.");}
break;
case 46:
//#line 195 "gramatica.y"
{sintacticoError.addLog("Error sintactico->Falta abrir parentesis en sentencia FOR.");}
break;
case 47:
//#line 199 "gramatica.y"
{	
					StringBuffer sb1 = new StringBuffer();
					sb1.append(val_peek(3).sval); 
					Simbolo s1 = new Simbolo(sb1,"");
					Simbolo simb1 = getSimbolo(s1);
					val_peek(3).obj = simb1.getTipo();
					
					StringBuffer sb2 = new StringBuffer();
					sb2.append(val_peek(1).sval); 
					Simbolo s2 = new Simbolo(sb2,"");
					Simbolo simb2 = getSimbolo(s2);
					val_peek(1).obj = simb2.getTipo();
					
					Token aux = obtenerToken(val_peek(3).sval,nroAmbito,(String)val_peek(3).obj); 
					Token aux2 = obtenerToken(val_peek(1).sval,nroAmbito,(String)val_peek(1).obj);				
					val_peek(3).sval= aux.getPuntero().getValor().toString();
					String posTofloat = new String(aux2.getPuntero().getValor().toString());
					
					posTofloat = new String("["+String.valueOf(vectorTercetos.size()+"]"));					
					vectorTercetos.add(new Tercetos(":=",aux.getPuntero().getValor().toString(),val_peek(1).sval,varTipo,vectorTercetos.size()+1,true)); 					
					pila.push(val_peek(3).sval);
					pila.push(String.valueOf(vectorTercetos.size()+1));
				}
break;
case 48:
//#line 225 "gramatica.y"
{
					Token aux = obtenerToken(val_peek(3).sval,nroAmbito,(String)val_peek(3).obj);
					Token aux2 =obtenerToken(val_peek(1).sval,nroAmbito,(String)val_peek(1).obj);
					val_peek(3).sval=aux.getPuntero().getValor().toString();
					val_peek(3).obj = aux.getTipo();
					vectorTercetos.add(new Tercetos(">=",aux.getPuntero().getValor().toString(),aux2.getPuntero().getValor().toString(),varTipo,vectorTercetos.size()+1,true)); 
					
					yyval.sval = new String("["+String.valueOf(vectorTercetos.size()+"]"));
				}
break;
case 49:
//#line 235 "gramatica.y"
{
					StringBuffer sb1 = new StringBuffer();
					sb1.append(val_peek(3).sval); 
					Simbolo s1 = new Simbolo(sb1,"");
					Simbolo simb1 = getSimbolo(s1);
					val_peek(3).obj = simb1.getTipo();
					
					StringBuffer sb2 = new StringBuffer();
					sb2.append(val_peek(1).sval); 
					Simbolo s2 = new Simbolo(sb2,"");
					Simbolo simb2 = getSimbolo(s2);
					val_peek(1).obj = simb2.getTipo();
					
					Token aux = obtenerToken(val_peek(3).sval,nroAmbito,(String)val_peek(3).obj); 
					Token aux2 = obtenerToken(val_peek(1).sval,nroAmbito,(String)val_peek(1).obj); 
					val_peek(3).sval=aux.getPuntero().getValor().toString();
					val_peek(3).obj = aux.getTipo();
					
					vectorTercetos.add(new Tercetos("<",aux.getPuntero().getValor().toString(),aux2.getPuntero().getValor().toString(),varTipo,vectorTercetos.size()+1,true)); 
					yyval.sval = new String("["+String.valueOf(vectorTercetos.size() +"]"));
				}
break;
case 50:
//#line 257 "gramatica.y"
{
					Token aux = obtenerToken(val_peek(3).sval,nroAmbito,(String)val_peek(3).obj);
					Token aux2 = obtenerToken(val_peek(1).sval,nroAmbito,(String)val_peek(1).obj);
					val_peek(3).sval=aux.getPuntero().getValor().toString();
					val_peek(3).obj = aux.getTipo();
					if(aux2.getTipo().equals("IDENTIFICADOR"))
						sintacticoError.addLog("Error: la variable <'" +aux2.getPuntero().getValor().toString()+"'> no se encuentra declarada.");					
					if(aux.getTipo().equals("IDENTIFICADOR"))
						sintacticoError.addLog("Error: la variable <'" +aux.getPuntero().getValor().toString()+"'> no se encuentra declarada.");									
					if(!aux.getTipo().equals("INT")||!aux2.getTipo().equals("INT"))
						sintacticoError.addLog("Error-> No se permiten identificadores de tipo float en la comparacion de la sentencia 'FOR'. ");
					vectorTercetos.add(new Tercetos("<=",aux.getPuntero().getValor().toString(),aux2.getPuntero().getValor().toString(),varTipo,vectorTercetos.size()+1,true)); 
					yyval.sval = new String("["+String.valueOf(vectorTercetos.size()+"]"));
				}
break;
case 51:
//#line 272 "gramatica.y"
{
					Token aux =obtenerToken(val_peek(3).sval,nroAmbito,(String)val_peek(3).obj);
					Token aux2 = obtenerToken(val_peek(1).sval,nroAmbito,(String)val_peek(1).obj);
					val_peek(3).sval=aux.getPuntero().getValor().toString();
					val_peek(3).obj = aux.getTipo();
					if(aux2.getTipo().equals("IDENTIFICADOR"))
						sintacticoError.addLog("Error: la variable <'" +aux2.getPuntero().getValor().toString()+"'> no se encuentra declarada.");					
					if(aux.getTipo().equals("IDENTIFICADOR"))
						sintacticoError.addLog("Error: la variable <'" +aux.getPuntero().getValor().toString()+"'> no se encuentra declarada.");									
					if(!aux.getTipo().equals("INT")||!aux2.getTipo().equals("INT"))
						sintacticoError.addLog("Error-> No se permiten identificadores de tipo float en la comparacion de la sentencia 'FOR'. ");
					vectorTercetos.add(new Tercetos(">",aux.getPuntero().getValor().toString(),aux2.getPuntero().getValor().toString(),varTipo,vectorTercetos.size()+1,true));  
					yyval.sval = new String("["+String.valueOf(vectorTercetos.size()+"]"));
				}
break;
case 52:
//#line 287 "gramatica.y"
{
					Token aux = obtenerToken(val_peek(3).sval,nroAmbito,(String)val_peek(3).obj);
					Token aux2 =obtenerToken(val_peek(1).sval,nroAmbito,(String)val_peek(1).obj);
					val_peek(3).sval=aux.getPuntero().getValor().toString();
					val_peek(3).obj = aux.getTipo();
					if(aux2.getTipo().equals("IDENTIFICADOR"))
						sintacticoError.addLog("Error: la variable <'" +aux2.getPuntero().getValor().toString()+"'> no se encuentra declarada.");					
					if(aux.getTipo().equals("IDENTIFICADOR"))
						sintacticoError.addLog("Error: la variable <'" +aux.getPuntero().getValor().toString()+"'> no se encuentra declarada.");									
					if(!aux.getTipo().equals("INT")||!aux2.getTipo().equals("INT"))
						sintacticoError.addLog("Error-> No se permiten identificadores de tipo float en la comparacion de la sentencia 'FOR'. ");
					vectorTercetos.add(new Tercetos("<>",aux.getPuntero().getValor().toString(),aux2.getPuntero().getValor().toString(),varTipo,vectorTercetos.size()+1,true)); 
					yyval.sval = new String("["+String.valueOf(vectorTercetos.size()+"]"));
				}
break;
case 53:
//#line 301 "gramatica.y"
{sintacticoError.addLog("Error sintactico->Se esperaba un Factor en la comparacion de la sentencia FOR.");}
break;
case 54:
//#line 302 "gramatica.y"
{sintacticoError.addLog("Error sintactico->Se esperaba un Factor en la comparacion de la sentencia FOR.");}
break;
case 55:
//#line 303 "gramatica.y"
{sintacticoError.addLog("Error sintactico->Se esperaba un Factor en la comparacion de la sentencia FOR.");}
break;
case 56:
//#line 304 "gramatica.y"
{sintacticoError.addLog("Error sintactico->Se esperaba un Factor en la comparacion de la sentencia FOR.");}
break;
case 57:
//#line 305 "gramatica.y"
{sintacticoError.addLog("Error sintactico->Se esperaba un Factor en la comparacion de la sentencia FOR.");}
break;
case 58:
//#line 306 "gramatica.y"
{sintacticoError.addLog("Error sintactico->Error en la comparacion de la sentencia FOR.");}
break;
case 59:
//#line 310 "gramatica.y"
{
			vectorTercetos.add(new Tercetos("BF",val_peek(2).sval,"")); 
			pila.push(String.valueOf(vectorTercetos.size()-1));			
			}
break;
case 61:
//#line 314 "gramatica.y"
{sintacticoError.addLog("Error sintactico->Falta la condicion en la sentencia IF.");}
break;
case 63:
//#line 319 "gramatica.y"
{
				vectorTercetos.add(new Tercetos("BI","","_")); 
				String topePila = pila.pop();
				Tercetos tercetoBF = vectorTercetos.elementAt(Integer.parseInt(topePila));
				tercetoBF.setElem3("["+String.valueOf(vectorTercetos.size()+1)+"]");
				pila.push(String.valueOf(vectorTercetos.size()-1));
			}
break;
case 64:
//#line 327 "gramatica.y"
{
				String topePila = pila.pop();
				Tercetos tercetoBI = vectorTercetos.elementAt(Integer.parseInt(topePila));
				tercetoBI.setElem2("["+String.valueOf(vectorTercetos.size()+1)+"]");
			}
break;
case 65:
//#line 332 "gramatica.y"
{sintacticoError.addLog("Error sintactico->Falta cerrar llave en el cuerpo de la sentencia IF.");}
break;
case 67:
//#line 333 "gramatica.y"
{sintacticoError.addLog("Error sintactico->Falta abrir llave en el cuerpo de la sentencia IF.");}
break;
case 69:
//#line 339 "gramatica.y"
{
		if(val_peek(2).obj != val_peek(0).obj)
			Warning("Warning: Los tipos de los operandos en la comparacion de la sentencia son distintos");
		vectorTercetos.add(new Tercetos(val_peek(1).sval,val_peek(2).sval,val_peek(0).sval,varTipo));
	}
break;
case 70:
//#line 344 "gramatica.y"
{ sintacticoError.addLog("Error sintactico-> Falta lado derecho de la expresion.");}
break;
case 71:
//#line 345 "gramatica.y"
{ sintacticoError.addLog("Error sintactico-> Falta abrir parentisis en la expresion.");}
break;
case 72:
//#line 349 "gramatica.y"
{
		vectorTercetos.add(new Tercetos("IMPRIMIR",val_peek(2).sval,"_"));
	}
break;
case 73:
//#line 352 "gramatica.y"
{sintacticoError.addLog("Error sintactico->Falta cerrar parentesis en la instruccion Imprimir.");}
break;
case 74:
//#line 353 "gramatica.y"
{sintacticoError.addLog("Error sintactico->La cadena de la sentencia Imprimir debe estar entre parentesis.");}
break;
case 75:
//#line 354 "gramatica.y"
{sintacticoError.addLog("Error sintactico->Falta abrir parentesis en la instruccion 'Imprimir'.");}
break;
case 76:
//#line 355 "gramatica.y"
{sintacticoError.addLog("Error sintactico->Falta la cadena en la instruccion Imprimir.");}
break;
case 77:
//#line 356 "gramatica.y"
{sintacticoError.addLog("Error sintactico en la instrucion 'Imprimir'.");}
break;
//#line 1109 "Parser.java"
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
