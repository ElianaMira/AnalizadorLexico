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
    4,    4,   11,   11,   11,   11,   12,   12,   13,   13,
   13,   13,   14,   14,   15,   15,   15,   15,   16,   16,
   16,   16,   16,   16,   16,    5,    5,    5,    5,    5,
    5,   17,   17,    8,    8,    8,    8,    7,
};
short yylen[] = {                                         2,
    1,    1,    2,    1,    1,    0,    2,    1,    1,    2,
    3,    3,    3,    3,    3,    4,    1,    1,    3,    1,
    4,    7,    1,    1,    1,    1,    1,    1,    3,    3,
    3,    3,    1,    4,    1,    1,    1,    1,    1,    1,
    1,    1,    1,    1,    1,    8,   12,    9,    8,    5,
    1,    3,    1,    5,    5,    4,    3,   16,
};
short yydefred[] = {                                      0,
    0,    0,    0,    0,    0,    0,    0,    0,    1,    0,
    4,    5,    0,    8,    9,    0,    0,    0,    0,   17,
    0,    0,   20,   18,    0,    0,    0,    0,   10,    3,
   51,    0,    7,   57,    0,    0,   26,    0,   28,   27,
    0,    0,   24,    0,    0,    0,   15,   14,   13,    0,
   12,   11,    0,    0,    0,   56,    0,   21,   35,   36,
   37,   38,    0,    0,    0,    0,   19,    0,    0,    0,
    0,   55,   54,    0,   32,   31,   30,   29,    0,   16,
    0,   45,   39,   40,   41,   42,   43,   44,    0,    0,
   34,    0,    0,   52,    0,    0,   22,    0,    0,    0,
    0,    0,    0,    0,    0,   49,    0,    0,    0,    0,
    0,    0,    0,   47,    0,    0,   58,
};
short yydgoto[] = {                                       8,
    9,   10,   11,   12,   33,   13,   14,   15,   25,   22,
   41,   42,   43,   44,   63,   89,   71,
};
short yysindex[] = {                                    -57,
   -8,  -75, -214, -198,  -37,   21, -186,    0,    0,  -57,
    0,    0, -212,    0,    0, -179,  -45, -215, -215,    0,
  -10,  -35,    0,    0,   -5, -171,   -4, -178,    0,    0,
    0,   47,    0,    0,   48, -168,    0,   -1,    0,    0,
   32,   31,    0,   31,    2, -215,    0,    0,    0, -169,
    0,    0, -167, -208,  -16,    0, -215,    0,    0,    0,
    0,    0, -199, -199, -174,    5,    0,   35,    0,  -56,
   58,    0,    0,    7,    0,    0,    0,    0, -215,    0,
 -163,    0,    0,    0,    0,    0,    0,    0, -215, -106,
    0,   43,   44,    0,  -19,  -57,    0, -156,  -57,  -17,
  -56,  -15, -153, -215, -150,    0,   52,  -11, -148,  -57,
   73,   -9,   -6,    0,  -57,   -7,    0,
};
short yyrindex[] = {                                   -188,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    3,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  -34,    0,    0,
    0,  -41,    0,  -26,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  -31,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    1, -188,    0,    0, -188,    0,
    0,    0,    0,    0,   12,    0,    0,   23,    0, -188,
    0,    0,    0,    0, -188,    0,    0,
};
short yygindex[] = {                                      0,
   28,    0,    0,    0,    0,    0,    0,    0,  110,    0,
   18,   16,    0,   20,   75,   19,    0,
};
#define YYTABLESIZE 289
short yytable[] = {                                      23,
   50,    7,    2,   83,   87,   85,   33,   33,   33,   53,
   33,   46,   33,   36,   25,   19,   96,   23,   23,   23,
   23,   26,   48,   48,   33,   33,   33,   33,   26,   26,
   26,   17,   25,   25,   25,   25,   45,   30,   50,   50,
   37,   20,   73,   31,   32,   38,   21,   69,   39,   40,
   16,   23,   38,   49,   52,   39,   40,   23,   33,   50,
   28,   38,   24,   66,   39,   40,   25,    6,    6,   29,
   46,   70,   61,   59,   74,   60,   34,   62,   75,   77,
   46,   48,   76,   78,   51,   53,   54,   56,   55,   57,
   58,   67,   79,   68,   65,   81,   92,   80,   90,   91,
   93,   97,   98,   99,  101,  106,   94,  103,  108,  105,
  109,  110,  111,  113,   27,  114,  115,  117,   64,  104,
    0,  107,    0,  100,    0,   50,  102,    2,    0,    0,
    0,    0,    0,    0,    0,    0,   46,  112,    0,    0,
    0,    0,  116,    0,    0,    0,    0,   48,    0,    0,
    0,   95,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,   18,    0,    0,    0,    0,    0,    0,    0,   82,
    0,    0,    1,    2,    3,    0,    4,    5,    6,    0,
    0,   84,   86,   88,   23,    0,    0,   35,   23,    0,
   47,   33,    0,   24,   26,    0,   23,   23,   23,   25,
    0,    0,    0,   33,   33,   33,   26,   26,   26,   72,
    0,   25,   25,   25,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   50,   50,    6,    6,
   50,   50,   50,    0,   50,   50,   50,   46,   46,    0,
    0,   46,   46,   46,    0,   46,   46,   46,   48,   48,
    0,    0,   48,   48,   48,    0,   48,   48,   48,
};
short yycheck[] = {                                      41,
    0,   59,    0,   60,   61,   62,   41,   42,   43,   41,
   45,    0,   47,   59,   41,   91,  123,   59,   60,   61,
   62,   59,    0,   59,   59,   60,   61,   62,   60,   61,
   62,   40,   59,   60,   61,   62,   19,   10,   44,   44,
  256,  256,   59,  256,  257,  261,  261,  256,  264,  265,
   59,   93,  261,   59,   59,  264,  265,  256,   93,   59,
   40,  261,  261,   46,  264,  265,   93,  256,  257,  256,
   59,   54,   42,   43,   57,   45,  256,   47,   63,   64,
   91,   59,   63,   64,  256,  264,   40,  256,   41,   91,
   59,  261,  267,  261,   93,   61,   79,   93,   41,   93,
  264,   59,   59,  123,  261,  259,   89,  125,  259,  125,
   59,  123,  261,   41,    5,  125,  123,  125,   44,  101,
   -1,  104,   -1,   96,   -1,  125,   99,  125,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  125,  110,   -1,   -1,
   -1,   -1,  115,   -1,   -1,   -1,   -1,  125,   -1,   -1,
   -1,  258,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,  267,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  256,
   -1,   -1,  260,  261,  262,   -1,  264,  265,  266,   -1,
   -1,  268,  269,  270,  256,   -1,   -1,  263,  256,   -1,
  256,  256,   -1,  261,  256,   -1,  268,  269,  270,  256,
   -1,   -1,   -1,  268,  269,  270,  268,  269,  270,  256,
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
"sentencia : asignacion",
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
"asignacion : IDENTIFICADOR ASIG expresion ';'",
"asignacion : IDENTIFICADOR '[' expresion ']' ASIG expresion ';'",
"expresion : numero",
"expresion : operacionAritmetica",
"expresion : variable",
"expresion : error",
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
#line 109 "gramatica.y"
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
#line 302 "y.tab.c"
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
case 26:
#line 55 "gramatica.y"
{logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": entero inexistente");}
break;
case 45:
#line 84 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": no es posible resolver la comparacion");}
break;
case 47:
#line 89 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": seleccion ifelse");}
break;
case 48:
#line 90 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
break;
case 49:
#line 91 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion falta setencia THEN ");}
break;
case 50:
#line 92 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
break;
case 51:
#line 93 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion no valida");}
break;
case 53:
#line 97 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": condicion no valida");}
break;
case 54:
#line 100 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+":salida por pantalla");}
break;
case 55:
#line 101 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba un punto y coma");}
break;
case 56:
#line 102 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una cadena");}
break;
case 57:
#line 103 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una ('cadena')");}
break;
#line 546 "y.tab.c"
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
