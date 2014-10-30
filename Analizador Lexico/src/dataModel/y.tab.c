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
#define YYERRCODE 256
short yylhs[] = {                                        -1,
    0,    1,    1,    2,    2,    2,    2,    2,    3,    3,
    3,    3,    3,    8,    8,    4,    4,    9,    9,   10,
   10,   10,   12,   11,   11,   11,   13,   13,   13,   14,
   14,   14,   14,   14,   14,    5,    5,    5,    5,    5,
   15,    7,    7,    7,    7,    6,
};
short yylen[] = {                                         2,
    1,    2,    2,    1,    1,    1,    1,    1,    2,    2,
    2,   10,    3,    1,    3,    3,    6,    1,    1,    3,
    3,    1,    4,    3,    3,    1,    1,    1,    1,    1,
    2,    1,    2,    1,    2,    8,   12,    9,    8,    5,
    3,    5,    5,    4,    3,   16,
};
short yydefred[] = {                                      0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    4,    5,    6,    7,    8,    0,    0,    0,    0,    0,
    0,   14,    0,   10,    0,    0,    3,    2,    0,   19,
   18,   28,    0,    0,   29,   26,    0,   45,    0,    0,
    0,    0,   13,    0,    0,    0,    0,    0,    0,    0,
   34,    0,    0,    0,    0,    0,    0,    0,   44,    0,
    0,   15,    0,    0,    0,    0,   31,   33,   35,    0,
   24,   25,    0,    0,   43,   42,    0,    0,    0,   23,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   39,    0,    0,    0,    0,    0,    0,   12,    0,    0,
    0,   37,    0,    0,    0,    0,   46,
};
short yydgoto[] = {                                       8,
    9,   10,   11,   12,   13,   14,   15,   23,   32,   33,
   34,   35,   36,   54,   37,
};
short yysindex[] = {                                    -25,
  -22,  -31,  -88, -237, -231, -235,   -1,    0,  -25,  -12,
    0,    0,    0,    0,    0, -216, -202,  -59, -216, -216,
  -87,    0,   25,    0,   25, -185,    0,    0,   -4,    0,
    0,    0,  -29,   -6,    0,    0,   47,    0,   50, -166,
  -23,  -26,    0, -169, -164, -163, -216, -216, -216,   38,
    0,   52,   54, -216, -216, -216, -118,  -57,    0, -158,
   76,    0,   62,  -18,   -6,   -6,    0,    0,    0,  -23,
    0,    0,    2,  -25,    0,    0, -216,   84, -132,    0,
  -25,  -90,  -23, -129,   83,  -69, -115,   51, -116, -112,
    0, -113,  -54,   24, -255, -216,  -25,    0,  -30,  -47,
 -107,    0,  115,   35,  -25,  -36,    0,
};
short yyrindex[] = {                                      0,
    0,    0,    0,    0,    0,    0,    0,    0,  157,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   34,    0,   70,    0,    0,    0,    1,    0,
    0,    0,    0,   12,    0,    0,    0,    0,    0,    0,
   81,    0,    0,    0,    0,    0,    0,    0,    0, -154,
    0, -127,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   23,   59,    0,    0,    0,  119,
    0,    0,   92,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  103,    0,    0,    0,    0,    0,    0,  114,
    0,    0,    0,  127,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,
};
short yygindex[] = {                                      0,
   27,   49,    0,    0,    0,    0,    0,  155,   68,   32,
  -11,    0,   21,   71,    0,
};
#define YYTABLESIZE 394
short yytable[] = {                                      40,
   27,   76,   20,   44,   74,   50,   51,   52,   18,   30,
   31,   22,   48,   48,   49,   49,   48,   16,   49,   48,
   24,   49,   20,   21,   48,   22,   49,   17,  101,   22,
   50,   51,   52,   11,   87,   55,   65,   66,   26,   53,
   56,   27,   27,   27,   29,   27,   28,   27,   30,   31,
   41,   42,   22,   38,   22,   90,   22,   27,   21,   27,
   27,   27,   27,   20,   53,   20,   60,   20,   45,    9,
   22,   22,   22,   22,   80,   71,   72,  102,   64,   46,
   16,   20,   20,   20,   20,   70,   47,   57,  107,   59,
   58,   40,   11,   27,   27,   61,   62,   63,   67,   21,
   82,   21,   17,   21,   22,   22,   30,   86,   83,   77,
   30,   30,   68,   36,   69,   20,   20,   21,   21,   21,
   21,   78,   79,  100,   81,   27,   38,   99,    9,   84,
   27,  106,   85,   32,   27,   88,   22,   32,   32,   16,
   73,   89,   91,   92,   93,   94,   97,   20,   27,   95,
   40,   21,   21,  103,   27,  104,    1,  105,   11,   41,
   25,   17,   98,   96,    0,    0,    1,    0,   43,    2,
    3,    4,   36,    0,    5,    6,    7,    0,    0,   19,
    0,    0,    0,   21,    0,   38,    0,    1,    0,    0,
    2,    3,    4,    0,    9,    5,    6,    7,   75,    0,
    0,    0,    0,    0,   39,   16,    0,    0,    0,    1,
    0,    0,    2,    3,    4,    0,   40,    5,    6,    7,
    1,    0,    0,    2,    3,    4,    0,   17,    5,    6,
    7,    1,    0,    0,    2,    3,    4,    0,   36,    5,
    6,    7,    0,    0,    0,    0,    0,    0,    0,    0,
    0,   38,    0,    0,    0,    0,    0,   27,    0,    0,
   27,   27,   27,    0,    0,   27,   27,   27,   22,    0,
    0,   22,   22,   22,    0,    0,   22,   22,   22,   20,
    0,    0,   20,   20,   20,    0,    0,   20,   20,   20,
   11,    0,    0,   11,   11,   11,    0,    0,   11,   11,
   11,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   21,    0,    0,   21,   21,
   21,    0,    0,   21,   21,   21,    9,    0,    0,    9,
    9,    9,    0,    0,    9,    9,    9,   16,    0,    0,
   16,   16,   16,    0,    0,   16,   16,   16,   40,    0,
    0,   40,   40,   40,    0,    0,   40,   40,   40,   17,
    0,    0,   17,   17,   17,    0,    0,   17,   17,   17,
   36,    0,    0,   36,   36,   36,    0,    0,   36,   36,
   36,    0,    0,   38,    0,    0,   38,   38,   38,    0,
    0,   38,   38,   38,
};
short yycheck[] = {                                      59,
    0,   59,   91,   91,  123,   60,   61,   62,   40,  265,
  266,    0,   43,   43,   45,   45,   43,   40,   45,   43,
  256,   45,    0,  261,   43,  261,   45,   59,   59,  261,
   60,   61,   62,    0,  125,   42,   48,   49,   40,   94,
   47,   41,   42,   43,  261,   45,   59,   47,  265,  266,
   19,   20,   41,  256,   43,  125,   45,    9,    0,   59,
   60,   61,   62,   41,   94,   43,   93,   45,   44,    0,
   59,   60,   61,   62,   93,   55,   56,  125,   47,  265,
    0,   59,   60,   61,   62,   54,   91,   41,  125,  256,
   41,    0,   59,   93,   94,  265,  261,  261,   61,   41,
   74,   43,    0,   45,   93,   94,  261,   81,   77,  268,
  265,  266,   61,    0,   61,   93,   94,   59,   60,   61,
   62,   46,   61,   97,  123,  125,    0,   96,   59,   46,
   82,  105,  265,  261,   86,  265,  125,  265,  266,   59,
  259,   59,  258,   93,  261,  258,  123,  125,  100,  263,
   59,   93,   94,  261,  106,   41,    0,  123,  125,   41,
    6,   59,   95,   93,   -1,   -1,  257,   -1,  256,  260,
  261,  262,   59,   -1,  265,  266,  267,   -1,   -1,  268,
   -1,   -1,   -1,  125,   -1,   59,   -1,  257,   -1,   -1,
  260,  261,  262,   -1,  125,  265,  266,  267,  256,   -1,
   -1,   -1,   -1,   -1,  264,  125,   -1,   -1,   -1,  257,
   -1,   -1,  260,  261,  262,   -1,  125,  265,  266,  267,
  257,   -1,   -1,  260,  261,  262,   -1,  125,  265,  266,
  267,  257,   -1,   -1,  260,  261,  262,   -1,  125,  265,
  266,  267,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,  125,   -1,   -1,   -1,   -1,   -1,  257,   -1,   -1,
  260,  261,  262,   -1,   -1,  265,  266,  267,  257,   -1,
   -1,  260,  261,  262,   -1,   -1,  265,  266,  267,  257,
   -1,   -1,  260,  261,  262,   -1,   -1,  265,  266,  267,
  257,   -1,   -1,  260,  261,  262,   -1,   -1,  265,  266,
  267,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,  257,   -1,   -1,  260,  261,
  262,   -1,   -1,  265,  266,  267,  257,   -1,   -1,  260,
  261,  262,   -1,   -1,  265,  266,  267,  257,   -1,   -1,
  260,  261,  262,   -1,   -1,  265,  266,  267,  257,   -1,
   -1,  260,  261,  262,   -1,   -1,  265,  266,  267,  257,
   -1,   -1,  260,  261,  262,   -1,   -1,  265,  266,  267,
  257,   -1,   -1,  260,  261,  262,   -1,   -1,  265,  266,
  267,   -1,   -1,  257,   -1,   -1,  260,  261,  262,   -1,
   -1,  265,  266,  267,
};
#define YYFINAL 8
#ifndef YYDEBUG
#define YYDEBUG 0
#endif
#define YYMAXTOKEN 268
#if YYDEBUG
char *yyname[] = {
"end-of-file",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,"'('","')'","'*'","'+'","','","'-'","'.'","'/'",0,0,0,0,0,0,0,0,0,0,
0,"';'","'<'","'='","'>'",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,"'['",0,"']'","'^'",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
"'{'",0,"'}'",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,"SI","SINO","ENTONCES","IMPRIMIR",
"IDENTIFICADOR","VECTOR","DE","CADENA","INT","FLOAT","PARA","ASIG",
};
char *yyrule[] = {
"$accept : programa",
"programa : sentencias",
"sentencias : sentencia ';'",
"sentencias : sentencias sentencia",
"sentencia : declaracion",
"sentencia : asignacion",
"sentencia : seleccion",
"sentencia : bucle",
"sentencia : impresion",
"declaracion : FLOAT variables",
"declaracion : FLOAT error",
"declaracion : INT variables",
"declaracion : VECTOR IDENTIFICADOR '[' INT '.' '.' INT ']' DE numero",
"declaracion : VECTOR IDENTIFICADOR error",
"variables : IDENTIFICADOR",
"variables : variables ',' IDENTIFICADOR",
"asignacion : IDENTIFICADOR ASIG expresion",
"asignacion : IDENTIFICADOR '[' expresion ']' ASIG expresion",
"numero : FLOAT",
"numero : INT",
"expresion : expresion '+' termino",
"expresion : expresion '-' termino",
"expresion : termino",
"vector : IDENTIFICADOR '[' expresion ']'",
"termino : termino '*' argumento",
"termino : termino '/' argumento",
"termino : argumento",
"argumento : IDENTIFICADOR",
"argumento : numero",
"argumento : vector",
"comparador : '<'",
"comparador : '<' '='",
"comparador : '>'",
"comparador : '>' '='",
"comparador : '='",
"comparador : '^' '='",
"seleccion : SI '(' condicion ')' ENTONCES '{' sentencias '}'",
"seleccion : SI '(' condicion ')' ENTONCES '{' sentencias '}' SINO '{' sentencias '}'",
"seleccion : SI '(' condicion ')' ENTONCES '{' sentencias '}' SINO",
"seleccion : SI '(' condicion ')' '{' sentencias '}' SINO",
"seleccion : SI '(' condicion ')' ENTONCES",
"condicion : expresion comparador expresion",
"impresion : IMPRIMIR '(' CADENA ')' ';'",
"impresion : IMPRIMIR '(' CADENA ')' error",
"impresion : IMPRIMIR '(' ';' error",
"impresion : IMPRIMIR ';' error",
"bucle : PARA '(' INT IDENTIFICADOR '=' INT ';' IDENTIFICADOR comparador expresion ';' IDENTIFICADOR ')' '{' sentencias '}'",
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
#line 95 "gramatica.y"
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
#line 308 "y.tab.c"
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
case 9:
#line 31 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de un FLOAT");}
break;
case 10:
#line 32 "gramatica.y"
{logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");}
break;
case 12:
#line 34 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de un VECTOR");}
break;
case 13:
#line 35 "gramatica.y"
{logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");}
break;
case 16:
#line 42 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": asignacion");}
break;
case 17:
#line 43 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": asignacion");}
break;
case 37:
#line 77 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": seleccion SISINO");}
break;
case 38:
#line 78 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
break;
case 39:
#line 79 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion falta setencia ENTONCES ");}
break;
case 40:
#line 80 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
break;
case 42:
#line 86 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+":salida por pantalla");}
break;
case 43:
#line 87 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba un punto y coma");}
break;
case 44:
#line 88 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una cadena");}
break;
case 45:
#line 89 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una ('cadena')");}
break;
#line 508 "y.tab.c"
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
