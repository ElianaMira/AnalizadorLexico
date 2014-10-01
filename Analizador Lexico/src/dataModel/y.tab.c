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
#define IF 257
#define THEN 258
#define ELSE 259
#define PRINT 260
#define IDENTIFICADOR 261
#define VECTOR 262
#define CADENA 263
#define INT 264
#define FLOAT 265
#define FOR 266
#define ASIG 267
#define YYERRCODE 256
short yylhs[] = {                                        -1,
    0,    1,    1,    2,    2,    6,    2,    2,    2,    2,
    3,    3,    3,    3,    3,   10,   10,    9,    9,    9,
    4,    4,   11,   11,   11,   12,   12,   13,   13,   13,
   13,   14,   14,   15,   15,   15,   15,   16,   16,   16,
   16,   16,   16,   16,    5,    5,    5,    5,    5,    5,
   17,   17,    8,    8,    8,    8,    7,
};
short yylen[] = {                                         2,
    1,    1,    2,    1,    2,    0,    2,    1,    1,    2,
    3,    3,    3,    3,    3,    4,    1,    1,    3,    1,
    3,    6,    1,    1,    1,    1,    1,    3,    3,    3,
    3,    1,    4,    1,    1,    1,    1,    1,    1,    1,
    1,    1,    1,    1,    8,   12,    9,    8,    5,    1,
    3,    1,    5,    5,    4,    3,   16,
};
short yydefred[] = {                                      0,
    0,    0,    0,    0,    0,    0,    0,    0,    1,    0,
    4,    0,    0,    8,    9,    0,    0,    0,    0,   17,
    0,    0,   20,   18,    0,    0,    0,    0,   10,    3,
    5,   50,    0,    7,   56,    0,    0,    0,   27,   26,
   21,    0,   24,    0,    0,    0,   15,   14,   13,    0,
   12,   11,    0,    0,    0,   55,    0,   34,   35,   36,
   37,    0,    0,    0,    0,   19,    0,   52,    0,    0,
   54,   53,    0,   31,   30,   29,   28,    0,   16,    0,
   44,   38,   39,   40,   41,   42,   43,    0,    0,   33,
   22,    0,   51,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,   48,    0,    0,    0,    0,    0,    0,
    0,   46,    0,    0,   57,
};
short yydgoto[] = {                                       8,
    9,   10,   11,   12,   34,   13,   14,   15,   25,   22,
   41,   42,   43,   44,   62,   88,   70,
};
short yysindex[] = {                                    -57,
   -9,  -81, -217, -213,  -37,    9, -200,    0,    0,  -57,
    0,   -1, -216,    0,    0, -193,  -45, -210, -210,    0,
  -17,  -35,    0,    0,  -12, -179,   -6, -186,    0,    0,
    0,    0,   39,    0,    0,   40, -176,   -8,    0,    0,
    0,   19,    0,   19,   -7, -210,    0,    0,    0, -177,
    0,    0, -174, -219,  -30,    0, -210,    0,    0,    0,
    0, -210, -210, -182,   -5,    0,   29,    0,  -56,   50,
    0,    0,    2,    0,    0,    0,    0, -210,    0, -172,
    0,    0,    0,    0,    0,    0,    0, -210, -107,    0,
    0,   34,    0,  -29,  -57, -165,  -57,  -28,  -56,  -27,
 -159, -210, -158,    0,   44,  -18, -155,  -57,   66,  -16,
  -15,    0,  -57,  -14,    0,
};
short yyrindex[] = {                                   -187,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    3,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  -34,    0,    0,
    0,  -41,    0,  -26,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    1, -187,    0, -187,    0,    0,    0,
    0,    0,   12,    0,    0,   23,    0, -187,    0,    0,
    0,    0, -187,    0,    0,
};
short yygindex[] = {                                      0,
    7,    0,    0,    0,    0,    0,    0,    0,  105,    0,
   11,   10,    0,   13,   68,   15,    0,
};
#define YYTABLESIZE 289
short yytable[] = {                                      23,
   49,    7,    2,   82,   86,   84,   32,   32,   32,   19,
   32,   45,   32,   37,   25,   95,   30,   23,   23,   23,
   23,   26,   47,   48,   32,   32,   32,   32,   72,   45,
   17,   50,   25,   25,   25,   25,   68,   50,   20,   32,
   33,   38,   23,   21,   39,   40,   49,   24,   28,   16,
   38,   23,   52,   39,   40,   29,   65,   31,   32,   49,
   60,   58,   35,   59,   69,   61,   25,   73,    6,    6,
   45,   74,   76,   46,   75,   77,   51,   53,   54,   56,
   55,   47,   57,   66,   78,   64,   67,   79,   91,   80,
   89,   92,   96,   97,   90,   99,  101,  103,   93,  104,
  106,   98,  107,  100,  108,  109,  111,  113,  112,   27,
  115,   63,  105,  102,  110,    0,    0,    0,    0,  114,
    0,    0,    0,    0,    0,   49,    0,    2,    0,    0,
    0,    0,    0,    0,    0,    0,   45,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   47,    0,    0,
   94,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   18,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,   81,
    0,    0,    1,    2,    3,    0,    4,    5,    6,    0,
    0,   83,   85,   87,   23,    0,    0,   36,   23,    0,
   47,   32,    0,   24,    0,   71,   23,   23,   23,   25,
    0,    0,    0,   32,   32,   32,    0,    0,    0,    0,
    0,   25,   25,   25,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   49,   49,    6,    6,
   49,   49,   49,    0,   49,   49,   49,   45,   45,    0,
    0,   45,   45,   45,    0,   45,   45,   45,   47,   47,
    0,    0,   47,   47,   47,    0,   47,   47,   47,
};
short yycheck[] = {                                      41,
    0,   59,    0,   60,   61,   62,   41,   42,   43,   91,
   45,    0,   47,   59,   41,  123,   10,   59,   60,   61,
   62,   59,    0,   59,   59,   60,   61,   62,   59,   19,
   40,   44,   59,   60,   61,   62,  256,   44,  256,  256,
  257,  261,  256,  261,  264,  265,   59,  261,   40,   59,
  261,   93,   59,  264,  265,  256,   46,   59,   93,   59,
   42,   43,  256,   45,   54,   47,   93,   57,  256,  257,
   59,   62,   63,   91,   62,   63,  256,  264,   40,  256,
   41,   59,   91,  261,  267,   93,  261,   93,   78,   61,
   41,  264,   59,  123,   93,  261,  125,  125,   88,  259,
  259,   95,   59,   97,  123,  261,   41,  123,  125,    5,
  125,   44,  102,   99,  108,   -1,   -1,   -1,   -1,  113,
   -1,   -1,   -1,   -1,   -1,  125,   -1,  125,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  125,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,  125,   -1,   -1,
  258,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,  267,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  256,
   -1,   -1,  260,  261,  262,   -1,  264,  265,  266,   -1,
   -1,  268,  269,  270,  256,   -1,   -1,  263,  256,   -1,
  256,  256,   -1,  261,   -1,  256,  268,  269,  270,  256,
   -1,   -1,   -1,  268,  269,  270,   -1,   -1,   -1,   -1,
   -1,  268,  269,  270,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  256,  257,  256,  257,
  260,  261,  262,   -1,  264,  265,  266,  256,  257,   -1,
   -1,  260,  261,  262,   -1,  264,  265,  266,  256,  257,
   -1,   -1,  260,  261,  262,   -1,  264,  265,  266,
};
#define YYFINAL 8
#ifndef YYDEBUG
#define YYDEBUG 0
#endif
#define YYMAXTOKEN 270
#if YYDEBUG
char *yyname[] = {
"end-of-file",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,"'('","')'","'*'","'+'","','","'-'",0,"'/'",0,0,0,0,0,0,0,0,0,0,0,
"';'","'<'","'='","'>'",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
"'['",0,"']'",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,"'{'",0,
"'}'",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,"IF","THEN","ELSE","PRINT","IDENTIFICADOR","VECTOR",
"CADENA","INT","FLOAT","FOR","ASIG","\"<=\"","\">=\"","\"^=\"",
};
char *yyrule[] = {
"$accept : programa",
"programa : sentencias",
"sentencias : sentencia",
"sentencias : sentencia sentencias",
"sentencia : declaracion",
"sentencia : asignacion ';'",
"$$1 :",
"sentencia : $$1 seleccion",
"sentencia : bucle",
"sentencia : impresion",
"sentencia : ';' error",
"declaracion : FLOAT variables ';'",
"declaracion : FLOAT ';' error",
"declaracion : INT variables ';'",
"declaracion : VECTOR vector ';'",
"declaracion : VECTOR vector error",
"vector : IDENTIFICADOR '[' expresion ']'",
"vector : error",
"variables : IDENTIFICADOR",
"variables : variables ',' IDENTIFICADOR",
"variables : error",
"asignacion : IDENTIFICADOR ASIG expresion",
"asignacion : IDENTIFICADOR '[' expresion ']' ASIG expresion",
"expresion : numero",
"expresion : operacionAritmetica",
"expresion : variable",
"numero : FLOAT",
"numero : INT",
"operacionAritmetica : variable operador variable",
"operacionAritmetica : variable operador numero",
"operacionAritmetica : numero operador variable",
"operacionAritmetica : numero operador numero",
"variable : IDENTIFICADOR",
"variable : IDENTIFICADOR '[' expresion ']'",
"operador : '+'",
"operador : '-'",
"operador : '*'",
"operador : '/'",
"comparador : '<'",
"comparador : \"<=\"",
"comparador : '>'",
"comparador : \">=\"",
"comparador : '='",
"comparador : \"^=\"",
"comparador : error",
"seleccion : IF '(' condicion ')' THEN '{' sentencias '}'",
"seleccion : IF '(' condicion ')' THEN '{' sentencias '}' ELSE '{' sentencias '}'",
"seleccion : IF '(' condicion ')' THEN '{' sentencias '}' ELSE",
"seleccion : IF '(' condicion ')' '{' sentencias '}' ELSE",
"seleccion : IF '(' condicion ')' THEN",
"seleccion : error",
"condicion : expresion comparador expresion",
"condicion : error",
"impresion : PRINT '(' CADENA ')' ';'",
"impresion : PRINT '(' CADENA ')' error",
"impresion : PRINT '(' ';' error",
"impresion : PRINT ';' error",
"bucle : FOR '(' INT IDENTIFICADOR '=' INT ';' IDENTIFICADOR comparador expresion ';' IDENTIFICADOR ')' '{' sentencias '}'",
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
#line 108 "gramatica.y"
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
#line 301 "y.tab.c"
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
case 6:
#line 26 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": Seleccion");}
break;
case 10:
#line 29 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en linea "+lexico.getLineas()+": sentencia no permitida");}
break;
case 11:
#line 32 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de un FLOAT");}
break;
case 12:
#line 33 "gramatica.y"
{logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");}
break;
case 14:
#line 35 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de un VECTOR");}
break;
case 15:
#line 36 "gramatica.y"
{logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");}
break;
case 17:
#line 40 "gramatica.y"
{logSintactico.addLog("ERROR sintactica en la linea "+lexico.getLineas()+": sintactico en el arreglo");}
break;
case 20:
#line 45 "gramatica.y"
{logSintactico.addLog("ERROR sintactica en la linea"+lexico.getLineas()+": declaracion de variables");}
break;
case 21:
#line 48 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": asignacion");}
break;
case 22:
#line 49 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": asignacion");}
break;
case 23:
#line 52 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": se encontro una expresion");}
break;
case 24:
#line 53 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": se encontro una expresion");}
break;
case 25:
#line 54 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": se encontro una expresion");}
break;
case 44:
#line 83 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": no es posible resolver la comparacion");}
break;
case 46:
#line 88 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": seleccion ifelse");}
break;
case 47:
#line 89 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
break;
case 48:
#line 90 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion falta setencia THEN ");}
break;
case 49:
#line 91 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
break;
case 50:
#line 92 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion no valida");}
break;
case 52:
#line 96 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": condicion no valida");}
break;
case 53:
#line 99 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+":salida por pantalla");}
break;
case 54:
#line 100 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba un punto y coma");}
break;
case 55:
#line 101 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una cadena");}
break;
case 56:
#line 102 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una ('cadena')");}
break;
#line 541 "y.tab.c"
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
