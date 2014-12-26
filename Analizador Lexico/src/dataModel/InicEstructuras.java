package dataModel;

import accionesSemanticas.AccionSemantica0;
import accionesSemanticas.AccionSemantica1;
import accionesSemanticas.AccionSemantica11;
import accionesSemanticas.AccionSemantica13;
import accionesSemanticas.AccionSemantica14;
import accionesSemanticas.AccionSemantica2;
import accionesSemanticas.AccionSemantica3;
import accionesSemanticas.AccionSemantica4;
import accionesSemanticas.AccionSemantica5;
import accionesSemanticas.AccionSemantica6;
import accionesSemanticas.AccionSemantica7;
import accionesSemanticas.AccionSemantica8;
import accionesSemanticas.AccionSemantica9;
import accionesSemanticas.AccionesSemanticas;

public class InicEstructuras {

	
	public Matriz inicializarAcciones(){
		
		Matriz acciones = new Matriz(21,21);
		
		AccionesSemanticas accionSemantica0 = new AccionSemantica0("accion0");
		AccionesSemanticas accionSemantica1 = new AccionSemantica1("accion1");
		AccionesSemanticas accionSemantica2 = new AccionSemantica2("accion2");
		AccionesSemanticas accionSemantica3 = new AccionSemantica3("accion3");
        AccionesSemanticas accionSemantica4 = new AccionSemantica4("accion4");
        AccionesSemanticas accionSemantica5 = new AccionSemantica5("accion5");
        AccionesSemanticas accionSemantica6 = new AccionSemantica6("accion6");
        AccionesSemanticas accionSemantica7 = new AccionSemantica7("accion7");
        AccionesSemanticas accionSemantica8 = new AccionSemantica8("accion8");
        AccionesSemanticas accionSemantica9 = new AccionSemantica9("accion9");
        AccionesSemanticas accionSemantica11 = new AccionSemantica11("accion11");
        AccionesSemanticas accionSemantica13 = new AccionSemantica13("accion13");
        AccionesSemanticas accionSemantica14 = new AccionSemantica14("accion14");
                
        //FILA0 Estado 0
        acciones.set(0, 0, accionSemantica0);
        acciones.set(0, 1, accionSemantica1);
        acciones.set(0, 2, accionSemantica1);
        acciones.set(0, 3, accionSemantica1);
        acciones.set(0, 4, accionSemantica1);
        acciones.set(0, 5, accionSemantica7);
        acciones.set(0, 6, accionSemantica7);
        acciones.set(0, 7, accionSemantica1);
        acciones.set(0, 8, accionSemantica1);
        acciones.set(0, 9, accionSemantica1);
        acciones.set(0, 10,accionSemantica7);
        acciones.set(0, 11, accionSemantica7);
        acciones.set(0, 12, accionSemantica7);
        acciones.set(0, 13, accionSemantica1);
        acciones.set(0, 14, accionSemantica1);
        acciones.set(0, 15, accionSemantica9);
        acciones.set(0, 16, accionSemantica9);
        acciones.set(0, 17, accionSemantica9);
        acciones.set(0, 18, accionSemantica1);
        acciones.set(0, 19, accionSemantica9);
        
        //FILA1 Estado 1
        acciones.set(1, 0, accionSemantica1);
        acciones.set(1, 1, accionSemantica1);
        acciones.set(1, 2, accionSemantica1);
        acciones.set(1, 3, accionSemantica2);
        acciones.set(1, 4, accionSemantica2);
        acciones.set(1, 5, accionSemantica2);
        acciones.set(1, 6, accionSemantica2);
        acciones.set(1, 7, accionSemantica2);
        acciones.set(1, 8, accionSemantica2);
        acciones.set(1, 9, accionSemantica2);
        acciones.set(1, 10, accionSemantica2);
        acciones.set(1, 11, accionSemantica2);
        acciones.set(1, 12, accionSemantica2);
        acciones.set(1, 13, accionSemantica2);
        acciones.set(1, 14, accionSemantica2);
        acciones.set(1, 15, accionSemantica2);
        acciones.set(1, 16, accionSemantica2);
        acciones.set(1, 17, accionSemantica2);
        acciones.set(1, 18, accionSemantica2);
        acciones.set(1, 19, accionSemantica2);
        
        //FILA2 Estado 2
        acciones.set(2, 0, accionSemantica3);
        acciones.set(2, 1, accionSemantica3);
        acciones.set(2, 2, accionSemantica1);
        acciones.set(2, 3, accionSemantica1);
        acciones.set(2, 4, accionSemantica1);
        acciones.set(2, 5, accionSemantica3);
        acciones.set(2, 6, accionSemantica3);
        acciones.set(2, 7, accionSemantica3);
        acciones.set(2, 8, accionSemantica3);
        acciones.set(2, 9, accionSemantica3);
        acciones.set(2, 10, accionSemantica3);
        acciones.set(2, 11, accionSemantica3);
        acciones.set(2, 12, accionSemantica3);
        acciones.set(2, 13, accionSemantica3);
        acciones.set(2, 14, accionSemantica3);
        acciones.set(2, 15, accionSemantica3);
        acciones.set(2, 16, accionSemantica3);
        acciones.set(2, 17, accionSemantica3);
        acciones.set(2, 18, accionSemantica3);
        acciones.set(2, 19, accionSemantica3);
        
        //FILA3 Estado 3
        acciones.set(3, 0, accionSemantica4);
        acciones.set(3, 1, accionSemantica4);
        acciones.set(3, 2, accionSemantica1);
        acciones.set(3, 3, accionSemantica4);
        acciones.set(3, 4, accionSemantica1);
        acciones.set(3, 5, accionSemantica4);
        acciones.set(3, 6, accionSemantica4);
        acciones.set(3, 7, accionSemantica4);
        acciones.set(3, 8, accionSemantica4);
        acciones.set(3, 9, accionSemantica4);
        acciones.set(3, 10, accionSemantica4);
        acciones.set(3, 11, accionSemantica4);
        acciones.set(3, 12, accionSemantica4);
        acciones.set(3, 13, accionSemantica4);
        acciones.set(3, 14, accionSemantica4);
        acciones.set(3, 15, accionSemantica4);
        acciones.set(3, 16, accionSemantica4);
        acciones.set(3, 17, accionSemantica4);
        acciones.set(3, 18, accionSemantica4);
        acciones.set(3, 19, accionSemantica9);
        
        //FILA4 Estado 4
        acciones.set(4, 0, accionSemantica0);
        acciones.set(4, 1, accionSemantica0);
        acciones.set(4, 2, accionSemantica1);
        acciones.set(4, 3, accionSemantica0);
        acciones.set(4, 4, accionSemantica0);
        acciones.set(4, 5, accionSemantica0);
        acciones.set(4, 6, accionSemantica0);
        acciones.set(4, 7, accionSemantica0);
        acciones.set(4, 8, accionSemantica0);
        acciones.set(4, 9, accionSemantica0);
        acciones.set(4, 10, accionSemantica0);
        acciones.set(4, 11, accionSemantica1);
        acciones.set(4, 12, accionSemantica1);
        acciones.set(4, 13, accionSemantica0);
        acciones.set(4, 14, accionSemantica0);
        acciones.set(4, 15, accionSemantica0);
        acciones.set(4, 16, accionSemantica0);
        acciones.set(4, 17, accionSemantica0);
        acciones.set(4, 18, accionSemantica0);
        acciones.set(4, 19, accionSemantica0);
        
        //FILA5 Estado 5
        acciones.set(5, 0, accionSemantica0);
        acciones.set(5, 1, accionSemantica0);
        acciones.set(5, 2, accionSemantica1);
        acciones.set(5, 3, accionSemantica0);
        acciones.set(5, 4, accionSemantica0);
        acciones.set(5, 5, accionSemantica0);
        acciones.set(5, 6, accionSemantica0);
        acciones.set(5, 7, accionSemantica0);
        acciones.set(5, 8, accionSemantica0);
        acciones.set(5, 9, accionSemantica0);
        acciones.set(5, 10, accionSemantica0);
        acciones.set(5, 11, accionSemantica0);
        acciones.set(5, 12, accionSemantica0);
        acciones.set(5, 13, accionSemantica0);
        acciones.set(5, 14, accionSemantica0);
        acciones.set(5, 15, accionSemantica0);
        acciones.set(5, 16, accionSemantica0);
        acciones.set(5, 17, accionSemantica0);
        acciones.set(5, 18, accionSemantica0);
        acciones.set(5, 19, accionSemantica0);
        
        //FILA6 Estado 6
        acciones.set(6, 0, accionSemantica4);
        acciones.set(6, 1, accionSemantica4);
        acciones.set(6, 2, accionSemantica1);
        acciones.set(6, 3, accionSemantica4);
        acciones.set(6, 4, accionSemantica4);
        acciones.set(6, 5, accionSemantica4);
        acciones.set(6, 6, accionSemantica4);
        acciones.set(6, 7, accionSemantica4);
        acciones.set(6, 8, accionSemantica4);
        acciones.set(6, 9, accionSemantica4);
        acciones.set(6, 10, accionSemantica4);
        acciones.set(6, 11, accionSemantica4);
        acciones.set(6, 12, accionSemantica4);
        acciones.set(6, 13, accionSemantica4);
        acciones.set(6, 14, accionSemantica4);
        acciones.set(6, 15, accionSemantica4);
        acciones.set(6, 16, accionSemantica4);
        acciones.set(6, 17, accionSemantica4);
        acciones.set(6, 18, accionSemantica4);
        acciones.set(6, 19, accionSemantica4);
        
        //FILA7 Estado7
        acciones.set(7, 0, accionSemantica0);
        acciones.set(7, 1, accionSemantica0);
        acciones.set(7, 2, accionSemantica0);
        acciones.set(7, 3, accionSemantica0);
        acciones.set(7, 4, accionSemantica0);
        acciones.set(7, 5, accionSemantica0);
        acciones.set(7, 6, accionSemantica5);
        acciones.set(7, 7, accionSemantica0);
        acciones.set(7, 8, accionSemantica0);
        acciones.set(7, 9, accionSemantica0);
        acciones.set(7, 10, accionSemantica0);
        acciones.set(7, 11, accionSemantica0);
        acciones.set(7, 12, accionSemantica0);
        acciones.set(7, 13, accionSemantica0);
        acciones.set(7, 14, accionSemantica0);
        acciones.set(7, 15, accionSemantica0);
        acciones.set(7, 16, accionSemantica0);
        acciones.set(7, 17, accionSemantica0);
        acciones.set(7, 18, accionSemantica0);
        acciones.set(7, 19, accionSemantica0);
        
        //FILA8 Estado 8
        acciones.set(8, 0, accionSemantica6);
        acciones.set(8, 1, accionSemantica6);
        acciones.set(8, 2, accionSemantica6);
        acciones.set(8, 3, accionSemantica6);
        acciones.set(8, 4, accionSemantica6);
        acciones.set(8, 5, accionSemantica6);
        acciones.set(8, 6, accionSemantica5);
        acciones.set(8, 7, accionSemantica6);
        acciones.set(8, 8, accionSemantica6);
        acciones.set(8, 9, accionSemantica6);
        acciones.set(8, 10, accionSemantica6);
        acciones.set(8, 11, accionSemantica6);
        acciones.set(8, 12, accionSemantica6);
        acciones.set(8, 13, accionSemantica6);
        acciones.set(8, 14, accionSemantica6);
        acciones.set(8, 15, accionSemantica6);
        acciones.set(8, 16, accionSemantica6);
        acciones.set(8, 17, accionSemantica6);
        acciones.set(8, 19, accionSemantica6);
        
        //FILA9 Estado 9
        acciones.set(9, 0, accionSemantica6);
        acciones.set(9, 1, accionSemantica6);
        acciones.set(9, 2, accionSemantica6);
        acciones.set(9, 3, accionSemantica6);
        acciones.set(9, 4, accionSemantica6);
        acciones.set(9, 5, accionSemantica6);
        acciones.set(9, 6, accionSemantica5);
        acciones.set(9, 7, accionSemantica6);
        acciones.set(9, 8, accionSemantica6);
        acciones.set(9, 9, accionSemantica6);
        acciones.set(9, 10, accionSemantica6);
        acciones.set(9, 11, accionSemantica6);
        acciones.set(9, 12, accionSemantica6);
        acciones.set(9, 13, accionSemantica6);
        acciones.set(9, 14, accionSemantica6);
        acciones.set(9, 15, accionSemantica6);
        acciones.set(9, 16, accionSemantica6);
        acciones.set(9, 17, accionSemantica6);
        acciones.set(9, 18, accionSemantica6);
        acciones.set(9, 19, accionSemantica6);
        
        //FILA10 Estado 10
        acciones.set(10, 0, accionSemantica0);
        acciones.set(10, 1, accionSemantica0);
        acciones.set(10, 2, accionSemantica0);
        acciones.set(10, 3, accionSemantica0);
        acciones.set(10, 4, accionSemantica0);
        acciones.set(10, 5, accionSemantica0);
        acciones.set(10, 6, accionSemantica5);
        acciones.set(10, 7, accionSemantica0);
        acciones.set(10, 8, accionSemantica0);
        acciones.set(10, 9, accionSemantica0);
        acciones.set(10, 10, accionSemantica0);
        acciones.set(10, 11, accionSemantica0);
        acciones.set(10, 12, accionSemantica0);
        acciones.set(10, 13, accionSemantica0);
        acciones.set(10, 14, accionSemantica0);
        acciones.set(10, 15, accionSemantica0);
        acciones.set(10, 16, accionSemantica0);
        acciones.set(10, 17, accionSemantica0);
        acciones.set(10, 18, accionSemantica0);
        acciones.set(10, 19, accionSemantica0);
        
        //FILA11 Estado 11
        acciones.set(11, 0, accionSemantica6);
        acciones.set(11, 1, accionSemantica6);
        acciones.set(11, 2, accionSemantica1);
        acciones.set(11, 3, accionSemantica6);
        acciones.set(11, 4, accionSemantica6);
        acciones.set(11, 5, accionSemantica6);
        acciones.set(11, 6, accionSemantica6);
        acciones.set(11, 7, accionSemantica6);
        acciones.set(11, 8, accionSemantica6);
        acciones.set(11, 9, accionSemantica6);
        acciones.set(11, 10, accionSemantica6);
        acciones.set(11, 11, accionSemantica6);
        acciones.set(11, 12, accionSemantica1);
        acciones.set(11, 13, accionSemantica6);
        acciones.set(11, 14, accionSemantica6);
        acciones.set(11, 15, accionSemantica6);
        acciones.set(11, 16, accionSemantica6);
        acciones.set(11, 17, accionSemantica6);
        acciones.set(11, 18, accionSemantica6);
        acciones.set(11, 19, accionSemantica6);
        
        //FILA12 Estado 12
        acciones.set(12, 0, accionSemantica1);
        acciones.set(12, 1, accionSemantica1);
        acciones.set(12, 2, accionSemantica1);
        acciones.set(12, 3, accionSemantica1);
        acciones.set(12, 4, accionSemantica1);
        acciones.set(12, 5, accionSemantica1);
        acciones.set(12, 6, accionSemantica1);
        acciones.set(12, 7, accionSemantica1);
        acciones.set(12, 8, accionSemantica1);
        acciones.set(12, 9, accionSemantica1);
        acciones.set(12, 10, accionSemantica8);
        acciones.set(12, 11, accionSemantica1);
        acciones.set(12, 12, accionSemantica1);
        acciones.set(12, 13, accionSemantica1);
        acciones.set(12, 14, accionSemantica1);
        acciones.set(12, 15, accionSemantica1);
        acciones.set(12, 16, accionSemantica1);
        acciones.set(12, 17, accionSemantica1);
        acciones.set(12, 18, accionSemantica1);
        acciones.set(12, 19, accionSemantica1);
        
        //FILA13 Estado 13
        acciones.set(13, 0, accionSemantica8);
        acciones.set(13, 1, accionSemantica8);
        acciones.set(13, 2, accionSemantica8);
        acciones.set(13, 3, accionSemantica8);
        acciones.set(13, 4, accionSemantica8);
        acciones.set(13, 5, accionSemantica8);
        acciones.set(13, 6, accionSemantica8);
        acciones.set(13, 7, accionSemantica8);
        acciones.set(13, 8, accionSemantica8);
        acciones.set(13, 9, accionSemantica8);
        acciones.set(13, 10, accionSemantica1);
        acciones.set(13, 11, accionSemantica8);
        acciones.set(13, 12, accionSemantica1);
        acciones.set(13, 13, accionSemantica8);
        acciones.set(13, 14, accionSemantica8);
        acciones.set(13, 15, accionSemantica8);
        acciones.set(13, 16, accionSemantica8);
        acciones.set(13, 17, accionSemantica8);
        acciones.set(13, 18, accionSemantica8);
        acciones.set(13, 19, accionSemantica8);
        
        //FILA14 Estado 14
        acciones.set(14, 0, accionSemantica1);
        acciones.set(14, 1, accionSemantica1);
        acciones.set(14, 2, accionSemantica1);
        acciones.set(14, 3, accionSemantica1);
        acciones.set(14, 4, accionSemantica1);
        acciones.set(14, 5, accionSemantica8);
        acciones.set(14, 6, accionSemantica1);
        acciones.set(14, 7, accionSemantica1);
        acciones.set(14, 8, accionSemantica1);
        acciones.set(14, 9, accionSemantica1);
        acciones.set(14, 10, accionSemantica1);
        acciones.set(14, 11, accionSemantica1);
        acciones.set(14, 12, accionSemantica1);
        acciones.set(14, 13, accionSemantica1);
        acciones.set(14, 14, accionSemantica1);
        acciones.set(14, 15, accionSemantica1);
        acciones.set(14, 16, accionSemantica1);
        acciones.set(14, 17, accionSemantica1);
        acciones.set(14, 18, accionSemantica1);
        acciones.set(14, 19, accionSemantica1);
        
        
        //FILA15 Estado 15
        acciones.set(15, 0, accionSemantica1);
        acciones.set(15, 1, accionSemantica1);
        acciones.set(15, 2, accionSemantica1);
        acciones.set(15, 3, accionSemantica1);
        acciones.set(15, 4, accionSemantica1);
        acciones.set(15, 5, accionSemantica1);
        acciones.set(15, 6, accionSemantica1);
        acciones.set(15, 7, accionSemantica1);
        acciones.set(15, 8, accionSemantica1);
        acciones.set(15, 9, accionSemantica1);
        acciones.set(15, 10, accionSemantica11);
        acciones.set(15, 11, accionSemantica1);
        acciones.set(15, 12, accionSemantica1);
        acciones.set(15, 13, accionSemantica1);
        acciones.set(15, 14, accionSemantica1);
        acciones.set(15, 15, accionSemantica1);
        acciones.set(15, 16, accionSemantica1);
        acciones.set(15, 17, accionSemantica1);
        acciones.set(15, 18, accionSemantica1);
        acciones.set(15, 19, accionSemantica1);
        
        
        //FILA16 Estado16
        acciones.set(16, 0, accionSemantica1);
        acciones.set(16, 1, accionSemantica1);
        acciones.set(16, 2, accionSemantica1);
        acciones.set(16, 3, accionSemantica1);
        acciones.set(16, 4, accionSemantica1);
        acciones.set(16, 5, accionSemantica1);
        acciones.set(16, 6, accionSemantica1);
        acciones.set(16, 7, accionSemantica1);
        acciones.set(16, 8, accionSemantica1);
        acciones.set(16, 9, accionSemantica1);
        acciones.set(16, 10, accionSemantica1);
        acciones.set(16, 11, accionSemantica1);
        acciones.set(16, 12, accionSemantica1);
        acciones.set(16, 13, accionSemantica1);
        acciones.set(16, 14, accionSemantica1);
        acciones.set(16, 15, accionSemantica1);
        acciones.set(16, 16, accionSemantica1);
        acciones.set(16, 17, accionSemantica1);
        acciones.set(16, 18, accionSemantica1);
        acciones.set(16, 19, accionSemantica13);
        
        //FILA17 Estado17
        acciones.set(17, 0, accionSemantica0);
        acciones.set(17, 1, accionSemantica0);
        acciones.set(17, 2, accionSemantica1);
        acciones.set(17, 3, accionSemantica1);
        acciones.set(17, 4, accionSemantica0);
        acciones.set(17, 5, accionSemantica0);
        acciones.set(17, 6, accionSemantica0);
        acciones.set(17, 7, accionSemantica0);
        acciones.set(17, 8, accionSemantica0);
        acciones.set(17, 9, accionSemantica0);
        acciones.set(17, 10, accionSemantica0);
        acciones.set(17, 11, accionSemantica0);
        acciones.set(17, 12, accionSemantica0);
        acciones.set(17, 13, accionSemantica0);
        acciones.set(17, 14, accionSemantica0);
        acciones.set(17, 15, accionSemantica0);
        acciones.set(17, 16, accionSemantica0);
        acciones.set(17, 17, accionSemantica0);
        acciones.set(17, 18, accionSemantica0);
        acciones.set(17, 19, accionSemantica0);
        
        //FILA17 Estado18
        acciones.set(18, 0, accionSemantica0);
        acciones.set(18, 1, accionSemantica0);
        acciones.set(18, 2, accionSemantica0);
        acciones.set(18, 3, accionSemantica1);
        acciones.set(18, 4, accionSemantica0);
        acciones.set(18, 5, accionSemantica0);
        acciones.set(18, 6, accionSemantica0);
        acciones.set(18, 7, accionSemantica0);
        acciones.set(18, 8, accionSemantica0);
        acciones.set(18, 9, accionSemantica0);
        acciones.set(18, 10, accionSemantica0);
        acciones.set(18, 11, accionSemantica0);
        acciones.set(18, 12, accionSemantica0);
        acciones.set(18, 13, accionSemantica0);
        acciones.set(18, 14, accionSemantica0);
        acciones.set(18, 15, accionSemantica0);
        acciones.set(18, 16, accionSemantica0);
        acciones.set(18, 17, accionSemantica0);
        acciones.set(18, 18, accionSemantica0);
        acciones.set(18, 19, accionSemantica0);

        //FILA17 Estado19
        acciones.set(19, 0, accionSemantica0);
        acciones.set(19, 1, accionSemantica0);
        acciones.set(19, 2, accionSemantica1);
        acciones.set(19, 3, accionSemantica0);
        acciones.set(19, 4, accionSemantica0);
        acciones.set(19, 5, accionSemantica0);
        acciones.set(19, 6, accionSemantica0);
        acciones.set(19, 7, accionSemantica0);
        acciones.set(19, 8, accionSemantica0);
        acciones.set(19, 9, accionSemantica0);
        acciones.set(19, 10, accionSemantica0);
        acciones.set(19, 11, accionSemantica0);
        acciones.set(19, 12, accionSemantica0);
        acciones.set(19, 13, accionSemantica0);
        acciones.set(19, 14, accionSemantica0);
        acciones.set(19, 15, accionSemantica0);
        acciones.set(19, 16, accionSemantica0);
        acciones.set(19, 17, accionSemantica0);
        acciones.set(19, 18, accionSemantica0);
        acciones.set(19, 19, accionSemantica0);
        
        //FILA20 Estado20
        acciones.set(20, 0, accionSemantica0);
        acciones.set(20, 1, accionSemantica0);
        acciones.set(20, 2, accionSemantica1);
        acciones.set(20, 3, accionSemantica0);
        acciones.set(20, 4, accionSemantica0);
        acciones.set(20, 5, accionSemantica0);
        acciones.set(20, 6, accionSemantica0);
        acciones.set(20, 7, accionSemantica0);
        acciones.set(20, 8, accionSemantica0);
        acciones.set(20, 9, accionSemantica0);
        acciones.set(20, 10, accionSemantica14);
        acciones.set(20, 11, accionSemantica0);
        acciones.set(20, 12, accionSemantica0);
        acciones.set(20, 13, accionSemantica0);
        acciones.set(20, 14, accionSemantica0);
        acciones.set(20, 15, accionSemantica0);
        acciones.set(20, 16, accionSemantica0);
        acciones.set(20, 17, accionSemantica0);
        acciones.set(20, 18, accionSemantica0);
        acciones.set(20, 19, accionSemantica0);
        
        return acciones;
		
	}
	
	
	public Matriz InicializarEstados(){
		
		Matriz estados = new Matriz(21,21);
		
		//FILA0 Estado 0
        estados.set(0, 0, 0);
        estados.set(0, 1, 1);
        estados.set(0, 2, 2);
        estados.set(0, 3, 3);
        estados.set(0, 4, 1);
        estados.set(0, 5, 21);
        estados.set(0, 6, 21);
        estados.set(0, 7, 7);
        estados.set(0, 8, 8);
        estados.set(0, 9, 9);
        estados.set(0, 10, 21);
        estados.set(0, 11, 21);
        estados.set(0, 12, 21);
        estados.set(0, 13, 11);
        estados.set(0, 14, 14);
        estados.set(0, 15, 0);
        estados.set(0, 16, 0);
        estados.set(0, 17, 0);
        estados.set(0, 18, 10);
        estados.set(0, 19, 16);
       
        //FILA1 Estado 1
        estados.set(1, 0, 1);
        estados.set(1, 1, 1);
        estados.set(1, 2, 1);
        estados.set(1, 3, 21);
        estados.set(1, 4, 21);
        estados.set(1, 5, 21);
        estados.set(1, 6, 21);
        estados.set(1, 7, 21);
        estados.set(1, 8, 21);
        estados.set(1, 9, 21);
        estados.set(1, 10, 21);
        estados.set(1, 11, 21);
        estados.set(1, 12, 21);
        estados.set(1, 13, 21);
        estados.set(1, 14, 21);
        estados.set(1, 15, 21);
        estados.set(1, 16, 21);
        estados.set(1, 17, 21);
        estados.set(1, 18, 21);
        estados.set(1, 19, 21);
       
        //FILA2 Estado 2
        estados.set(2, 0, 21);
        estados.set(2, 1, 21);
        estados.set(2, 2, 2);
        estados.set(2, 3, 3);
        estados.set(2, 4, 4);
        estados.set(2, 5, 21);
        estados.set(2, 6, 21);
        estados.set(2, 7, 21);
        estados.set(2, 8, 21);
        estados.set(2, 9, 21);
        estados.set(2, 10, 21);
        estados.set(2, 11, 21);
        estados.set(2, 12, 21);
        estados.set(2, 13, 21);
        estados.set(2, 14, 21);
        estados.set(2, 15, 21);
        estados.set(2, 16, 21);
        estados.set(2, 17, 21);
        estados.set(2, 18, 21);
        estados.set(2, 19, 21);
                
        //FILA3 Estado 3
        estados.set(3, 0, 21);
        estados.set(3, 1, 21);
        estados.set(3, 2, 3);
        estados.set(3, 3, 21);
        estados.set(3, 4, 4);
        estados.set(3, 5, 21);
        estados.set(3, 6, 21);
        estados.set(3, 7, 21);
        estados.set(3, 8, 21);
        estados.set(3, 9, 21);
        estados.set(3, 10, 21);
        estados.set(3, 11, 21);
        estados.set(3, 12, 21);
        estados.set(3, 13, 21);
        estados.set(3, 14, 21);
        estados.set(3, 15, 21);
        estados.set(3, 16, 21);
        estados.set(3, 17, 21);
        estados.set(3, 18, 21);
        estados.set(3, 19, 21);
             
        //FILA4 Estado 4
        estados.set(4, 0, 0);
        estados.set(4, 1, 0);
        estados.set(4, 2, 6);
        estados.set(4, 3, 0);
        estados.set(4, 4, 0);
        estados.set(4, 5, 0);
        estados.set(4, 6, 0);
        estados.set(4, 7, 0);
        estados.set(4, 8, 0);
        estados.set(4, 9, 0);
        estados.set(4, 10, 0);
        estados.set(4, 11, 5);
        estados.set(4, 12, 5);
        estados.set(4, 13, 0);
        estados.set(4, 14, 0);
        estados.set(4, 15, 0);
        estados.set(4, 16, 0);
        estados.set(4, 17, 0);
        estados.set(4, 18, 0);
        estados.set(4, 19, 0);
        
        //FILA5 Estado 5
        estados.set(5, 0, 0);
        estados.set(5, 1, 0);
        estados.set(5, 2, 6);
        estados.set(5, 3, 0);
        estados.set(5, 4, 0);
        estados.set(5, 5, 0);
        estados.set(5, 6, 0);
        estados.set(5, 7, 0);
        estados.set(5, 8, 0);
        estados.set(5, 9, 0);
        estados.set(5, 10, 0);
        estados.set(5, 11, 0);
        estados.set(5, 12, 0);
        estados.set(5, 13, 0);
        estados.set(5, 14, 0);
        estados.set(5, 15, 0);
        estados.set(5, 16, 0);
        estados.set(5, 17, 0);
        estados.set(5, 18, 0);
        estados.set(5, 19, 0);
               
        //FILA6 Estado 6
        estados.set(6, 0, 21);
        estados.set(6, 1, 21);
        estados.set(6, 2, 6);
        estados.set(6, 3, 21);
        estados.set(6, 4, 21);
        estados.set(6, 5, 21);
        estados.set(6, 6, 21);
        estados.set(6, 7, 21);
        estados.set(6, 8, 21);
        estados.set(6, 9, 21);
        estados.set(6, 10, 21);
        estados.set(6, 11, 21);
        estados.set(6, 12, 21);
        estados.set(6, 13, 21);
        estados.set(6, 14, 21);
        estados.set(6, 15, 21);
        estados.set(6, 16, 21);
        estados.set(6, 17, 21);
        estados.set(6, 18, 21);
        estados.set(6, 19, 21);
        
        //FILA7 Estado 7
        estados.set(7, 0, 0);
        estados.set(7, 1, 0);
        estados.set(7, 2, 0);
        estados.set(7, 3, 0);
        estados.set(7, 4, 0);
        estados.set(7, 5, 0);
        estados.set(7, 6, 21);
        estados.set(7, 7, 0);
        estados.set(7, 8, 0);
        estados.set(7, 9, 0);
        estados.set(7, 10, 0);
        estados.set(7, 11, 0);
        estados.set(7, 12, 0);
        estados.set(7, 13, 0);
        estados.set(7, 14, 0);
        estados.set(7, 15, 0);
        estados.set(7, 16, 0);
        estados.set(7, 17, 0);
        estados.set(7, 18, 0);
        estados.set(7, 19, 0);
        
        //FILA8 Estado 8
        estados.set(8, 0, 21);
        estados.set(8, 1, 21);
        estados.set(8, 2, 21);
        estados.set(8, 3, 1);
        estados.set(8, 4, 21);
        estados.set(8, 5, 21);
        estados.set(8, 6, 21);
        estados.set(8, 7, 21);
        estados.set(8, 8, 21);
        estados.set(8, 9, 21);
        estados.set(8, 10, 21);
        estados.set(8, 11, 21);
        estados.set(8, 12, 21);
        estados.set(8, 12, 21);
        estados.set(8, 13, 21);
        estados.set(8, 14, 21);
        estados.set(8, 15, 21);
        estados.set(8, 16, 21);
        estados.set(8, 17, 21);
        estados.set(8, 18, 21);
        estados.set(8, 19, 21);
        
        //FILA9 Estado 9
        estados.set(9, 0, 21);
        estados.set(9, 1, 21);
        estados.set(9, 2, 21);
        estados.set(9, 3, 21);
        estados.set(9, 4, 21);
        estados.set(9, 5, 21);
        estados.set(9, 6, 21);
        estados.set(9, 7, 21);
        estados.set(9, 8, 21);
        estados.set(9, 9, 21);
        estados.set(9, 10, 21);
        estados.set(9, 11, 21);
        estados.set(9, 12, 21);
        estados.set(9, 13, 21);
        estados.set(9, 14, 21);
        estados.set(9, 15, 21);
        estados.set(9, 16, 21);
        estados.set(9, 17, 21);
        estados.set(9, 18, 21);
        estados.set(9, 19, 21);
 	     
        //FILA10 Estado 10
        estados.set(10, 0, 0);
        estados.set(10, 1, 0);
        estados.set(10, 2, 0);
        estados.set(10, 3, 0);
        estados.set(10, 4, 0);
        estados.set(10, 5, 0);
        estados.set(10, 6, 21);
        estados.set(10, 7, 0);
        estados.set(10, 8, 0);
        estados.set(10, 9, 0);
        estados.set(10, 10, 0);
        estados.set(10, 11, 0);
        estados.set(10, 12, 0);
        estados.set(10, 13, 0);
        estados.set(10, 14, 0);
        estados.set(10, 15, 0);
        estados.set(10, 16, 0);
        estados.set(10, 17, 0);
        estados.set(10, 18, 0);
        estados.set(10, 19, 0);
        
        //FILA11 Estado 11
        estados.set(11, 0, 21);
        estados.set(11, 1, 21);
        estados.set(11, 2, 17);
        estados.set(11, 3, 21);
        estados.set(11, 4, 21);
        estados.set(11, 5, 21);
        estados.set(11, 6, 21);
        estados.set(11, 7, 21);
        estados.set(11, 8, 21);
        estados.set(11, 9, 21);
        estados.set(11, 10, 21);
        estados.set(11, 11, 21);
        estados.set(11, 12, 12);
        estados.set(11, 13, 21);
        estados.set(11, 14, 21);
        estados.set(11, 15, 21);
        estados.set(11, 16, 21);
        estados.set(11, 17, 21);
        estados.set(11, 18, 21);
        estados.set(11, 19, 21);
       
        //FILA12 Estado 12
        estados.set(12, 0, 12);
        estados.set(12, 1, 12);
        estados.set(12, 2, 12);
        estados.set(12, 3, 12);
        estados.set(12, 4, 12);
        estados.set(12, 5, 12);
        estados.set(12, 6, 13);
        estados.set(12, 7, 12);
        estados.set(12, 8, 12);
        estados.set(12, 9, 12);
        estados.set(12, 10, 12);
        estados.set(12, 11, 12);
        estados.set(12, 12, 13);
        estados.set(12, 13, 12);
        estados.set(12, 14, 12);
        estados.set(12, 15, 12);
        estados.set(12, 16, 12);
        estados.set(12, 17, 12);
        estados.set(12, 18, 21);        
        estados.set(12, 19, 12);
         
        //FILA13 Estado 13
        estados.set(13, 0, 13);
        estados.set(13, 1, 13);
        estados.set(13, 2, 13);
        estados.set(13, 3, 0);
        estados.set(13, 4, 0);
        estados.set(13, 5, 0);
        estados.set(13, 6, 0);
        estados.set(13, 7, 0);
        estados.set(13, 8, 0);
        estados.set(13, 9, 0);
        estados.set(13, 10, 13);
        estados.set(13, 11, 0);
        estados.set(13, 12, 13);
        estados.set(13, 13, 0);
        estados.set(13, 14, 0);
        estados.set(13, 15, 0);
        estados.set(13, 16, 0);
        estados.set(13, 17, 0);
        estados.set(13, 18, 0);
        estados.set(13, 19, 0);        
     
        //FILA14 Estado 14
        estados.set(14, 0, 14);
        estados.set(14, 1, 14);
        estados.set(14, 2, 14);
        estados.set(14, 3, 14);
        estados.set(14, 4, 14);
        estados.set(14, 5, 0);
        estados.set(14, 6, 14);
        estados.set(14, 7, 14);
        estados.set(14, 8, 14);
        estados.set(14, 9, 14);
        estados.set(14, 10, 14);
        estados.set(14, 11, 14);
        estados.set(14, 12, 14);
        estados.set(14, 13, 14);
        estados.set(14, 14, 14);
        estados.set(14, 15, 14);
        estados.set(14, 16, 14);
        estados.set(14, 17, 14);
        estados.set(14, 18, 14);
        estados.set(14, 19, 14);
       
        //FILA15 Estado 15
        estados.set(15, 0, 15);
        estados.set(15, 1, 15);
        estados.set(15, 2, 15);
        estados.set(15, 3, 15);
        estados.set(15, 4, 15);
        estados.set(15, 5, 15);
        estados.set(15, 6, 15);
        estados.set(15, 7, 15);
        estados.set(15, 8, 15);
        estados.set(15, 9, 15);
        estados.set(15, 10, 21);
        estados.set(15, 11, 15);
        estados.set(15, 12, 15);
        estados.set(15, 13, 15);
        estados.set(15, 14, 15);
        estados.set(15, 15, 15);
        estados.set(15, 16, 15);
        estados.set(15, 17, 15);
        estados.set(15, 18, 15);
        estados.set(15, 19, 15);        
	   
        //FILA16 Estado 16
        estados.set(16, 0, 16);        
        estados.set(16, 1, 16);
        estados.set(16, 2, 16);
        estados.set(16, 3, 16);
        estados.set(16, 4, 16);
        estados.set(16, 5, 16);
        estados.set(16, 6, 16);
        estados.set(16, 7, 16);
        estados.set(16, 8, 16);
        estados.set(16, 9, 16);
        estados.set(16, 10, 16);
        estados.set(16, 11, 16);
        estados.set(16, 12, 16);
        estados.set(16, 13, 16);
        estados.set(16, 14, 16);
        estados.set(16, 15, 16);
        estados.set(16, 16, 16);
        estados.set(16, 17, 16);
        estados.set(16, 18, 16);        
        estados.set(16, 19, 21);
        
      //FILA17 Estado 17
        estados.set(17, 0, 0);        
        estados.set(17, 1, 16);
        estados.set(17, 2, 17); //digito
        estados.set(17, 3, 18);  //punto
        estados.set(17, 4, 0);
        estados.set(17, 5, 0);
        estados.set(17, 6, 0);
        estados.set(17, 7, 0);
        estados.set(17, 8, 0);
        estados.set(17, 9, 0);
        estados.set(17, 10, 0);
        estados.set(17, 11, 0);
        estados.set(17, 12, 0);
        estados.set(17, 13, 0);
        estados.set(17, 14, 0);
        estados.set(17, 15, 0);
        estados.set(17, 16, 0);
        estados.set(17, 17, 0);
        estados.set(17, 18, 0);        
        estados.set(17, 19, 0);
       
      //FILA18 Estado 18
        estados.set(18, 0, 0);        
        estados.set(18, 1, 0);
        estados.set(18, 2, 0);
        estados.set(18, 3, 19);
        estados.set(18, 4, 0);
        estados.set(18, 5, 0);
        estados.set(18, 6, 0);
        estados.set(18, 7, 0);
        estados.set(18, 8, 0);
        estados.set(18, 9, 0);
        estados.set(18, 10, 0);
        estados.set(18, 11, 0);
        estados.set(18, 12, 0);
        estados.set(18, 13, 0);
        estados.set(18, 14, 0);
        estados.set(18, 15, 0);
        estados.set(18, 16, 0);
        estados.set(18, 17, 0);
        estados.set(18, 18, 0);        
        estados.set(18, 19, 0);
        
      //FILA19 Estado19
        estados.set(19, 0, 0);        
        estados.set(19, 1, 0);
        estados.set(19, 2, 20);
        estados.set(19, 3, 0);
        estados.set(19, 4, 0);
        estados.set(19, 5, 0);
        estados.set(19, 6, 0);
        estados.set(19, 7, 0);
        estados.set(19, 8, 0);
        estados.set(19, 9, 0);
        estados.set(19, 10, 0);
        estados.set(19, 11, 0);
        estados.set(19, 12, 0);
        estados.set(19, 13, 0);
        estados.set(19, 14, 0);
        estados.set(19, 15, 0);
        estados.set(19, 16, 0);
        estados.set(19, 17, 0);
        estados.set(19, 18, 0);        
        estados.set(19, 19, 0);
        
      //FILA20 Estado 20
        estados.set(20, 0, 0);        
        estados.set(20, 1, 0);
        estados.set(20, 2, 20);
        estados.set(20, 3, 0);
        estados.set(20, 4, 0);
        estados.set(20, 5, 0);
        estados.set(20, 6, 0);
        estados.set(20, 7, 0);
        estados.set(20, 8, 0);
        estados.set(20, 9, 0);
        estados.set(20, 10, 21);
        estados.set(20, 11, 0);
        estados.set(20, 12, 0);
        estados.set(20, 13, 0);
        estados.set(20, 14, 0);
        estados.set(20, 15, 0);
        estados.set(20, 16, 0);
        estados.set(20, 17, 0);
        estados.set(20, 18, 0);        
        estados.set(20, 19, 0);
        return estados;
		
	}
}
