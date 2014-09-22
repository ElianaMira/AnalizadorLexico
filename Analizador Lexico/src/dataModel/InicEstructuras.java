package dataModel;

import accionesSemanticas.AccionSemantica0;
import accionesSemanticas.AccionSemantica1;
import accionesSemanticas.AccionSemantica10;
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
		
		Matriz acciones = new Matriz(9,20);
		
		 //acciones semanticas
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
        AccionesSemanticas accionSemantica10 = new AccionSemantica10("accion10");
        
        //FILA0 Estado 0
        acciones.set(0, 0, accionSemantica1);
        acciones.set(0, 1, accionSemantica1);
        acciones.set(0, 2, accionSemantica0);
        acciones.set(0, 3, accionSemantica1);
        acciones.set(0, 4, accionSemantica1);
        acciones.set(0, 5, accionSemantica1);
        acciones.set(0, 5, accionSemantica1);
        acciones.set(0, 6, accionSemantica1);
        acciones.set(0, 7, accionSemantica1);
        acciones.set(0, 8, accionSemantica1);
        acciones.set(0, 9, accionSemantica1);
        acciones.set(0, 10, accionSemantica1);
        acciones.set(0, 11, accionSemantica1);
        acciones.set(0, 12, accionSemantica1);
        acciones.set(0, 13, accionSemantica1);
        acciones.set(0, 14, accionSemantica1);
        acciones.set(0, 15, accionSemantica1);
        acciones.set(0, 16, accionSemantica10);
        acciones.set(0, 17, accionSemantica10);
        acciones.set(0, 18, accionSemantica10);
        
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
        
        //FILA2 Estado 2
        acciones.set(2, 0, accionSemantica3);
        acciones.set(2, 1, accionSemantica1);
        acciones.set(2, 2, accionSemantica3);
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
        
        //FILA3 Estado 3
        acciones.set(3, 0, accionSemantica4);
        acciones.set(3, 1, accionSemantica1);
        acciones.set(3, 2, accionSemantica4);
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
        
        //FILA4 Estado 4
        acciones.set(4, 0, accionSemantica0);
        acciones.set(4, 1, accionSemantica1);
        acciones.set(4, 2, accionSemantica0);
        acciones.set(4, 3, accionSemantica0);
        acciones.set(4, 4, accionSemantica0);
        acciones.set(4, 5, accionSemantica1);
        acciones.set(4, 6, accionSemantica1);
        acciones.set(4, 7, accionSemantica0);
        acciones.set(4, 8, accionSemantica0);
        acciones.set(4, 9, accionSemantica0);
        acciones.set(4, 10, accionSemantica0);
        acciones.set(4, 11, accionSemantica0);
        acciones.set(4, 12, accionSemantica0);
        acciones.set(4, 13, accionSemantica0);
        acciones.set(4, 14, accionSemantica0);
        acciones.set(4, 15, accionSemantica0);
        acciones.set(4, 16, accionSemantica0);
        acciones.set(4, 17, accionSemantica0);
        acciones.set(4, 18, accionSemantica0);
        
        //FILA5 Estado 5
        acciones.set(5, 0, accionSemantica0);
        acciones.set(5, 1, accionSemantica1);
        acciones.set(5, 2, accionSemantica0);
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
        
        //FILA6 Estado 6
        acciones.set(6, 0, accionSemantica4);
        acciones.set(6, 1, accionSemantica1);
        acciones.set(6, 2, accionSemantica4);
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
        
        //FILA7 Estado7
        acciones.set(7, 0, accionSemantica0);
        acciones.set(7, 1, accionSemantica0);
        acciones.set(7, 2, accionSemantica0);
        acciones.set(7, 3, accionSemantica0);
        acciones.set(7, 4, accionSemantica0);
        acciones.set(7, 5, accionSemantica0);
        acciones.set(7, 6, accionSemantica0);
        acciones.set(7, 7, accionSemantica0);
        acciones.set(7, 8, accionSemantica5);
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
        
        //FILA8 Estado 8
        acciones.set(8, 0, accionSemantica6);
        acciones.set(8, 1, accionSemantica6);
        acciones.set(8, 2, accionSemantica6);
        acciones.set(8, 3, accionSemantica6);
        acciones.set(8, 4, accionSemantica6);
        acciones.set(8, 5, accionSemantica6);
        acciones.set(8, 6, accionSemantica6);
        acciones.set(8, 7, accionSemantica6);
        acciones.set(8, 8, accionSemantica5);
        acciones.set(8, 9, accionSemantica6);
        acciones.set(8, 10, accionSemantica6);
        acciones.set(8, 11, accionSemantica6);
        acciones.set(8, 12, accionSemantica6);
        acciones.set(8, 13, accionSemantica6);
        acciones.set(8, 14, accionSemantica6);
        acciones.set(8, 15, accionSemantica6);
        acciones.set(8, 16, accionSemantica6);
        acciones.set(8, 17, accionSemantica6);
        acciones.set(8, 18, accionSemantica6);
        
        //FILA9 Estado 9
        acciones.set(9, 0, accionSemantica6);
        acciones.set(9, 1, accionSemantica6);
        acciones.set(9, 2, accionSemantica6);
        acciones.set(9, 3, accionSemantica6);
        acciones.set(9, 4, accionSemantica6);
        acciones.set(9, 5, accionSemantica6);
        acciones.set(9, 6, accionSemantica6);
        acciones.set(9, 7, accionSemantica6);
        acciones.set(9, 8, accionSemantica5);
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
        
        //FILA10 Estado 10
        acciones.set(10, 0, accionSemantica6);
        acciones.set(10, 1, accionSemantica6);
        acciones.set(10, 2, accionSemantica6);
        acciones.set(10, 3, accionSemantica6);
        acciones.set(10, 4, accionSemantica6);
        acciones.set(10, 5, accionSemantica6);
        acciones.set(10, 6, accionSemantica6);
        acciones.set(10, 7, accionSemantica6);
        acciones.set(10, 8, accionSemantica6);
        acciones.set(10, 9, accionSemantica6);
        acciones.set(10, 10, accionSemantica6);
        acciones.set(10, 11, accionSemantica6);
        acciones.set(10, 12, accionSemantica6);
        acciones.set(10, 13, accionSemantica6);
        acciones.set(10, 14, accionSemantica6);
        acciones.set(10, 15, accionSemantica6);
        acciones.set(10, 16, accionSemantica6);
        acciones.set(10, 17, accionSemantica6);
        acciones.set(10, 18, accionSemantica6);
        
        //FILA11 Estado 11
        acciones.set(11, 0, accionSemantica6);
        acciones.set(11, 1, accionSemantica6);
        acciones.set(11, 2, accionSemantica6);
        acciones.set(11, 3, accionSemantica6);
        acciones.set(11, 4, accionSemantica6);
        acciones.set(11, 5, accionSemantica6);
        acciones.set(11, 6, accionSemantica1);
        acciones.set(11, 7, accionSemantica6);
        acciones.set(11, 8, accionSemantica6);
        acciones.set(11, 9, accionSemantica6);
        acciones.set(11, 10, accionSemantica6);
        acciones.set(11, 11, accionSemantica6);
        acciones.set(11, 12, accionSemantica6);
        acciones.set(11, 13, accionSemantica6);
        acciones.set(11, 14, accionSemantica6);
        acciones.set(11, 15, accionSemantica6);
        acciones.set(11, 16, accionSemantica6);
        acciones.set(11, 17, accionSemantica6);
        acciones.set(11, 18, accionSemantica6);
        
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
        acciones.set(12, 10, accionSemantica1);
        acciones.set(12, 11, accionSemantica1);
        acciones.set(12, 12, accionSemantica1);
        acciones.set(12, 13, accionSemantica1);
        acciones.set(12, 14, accionSemantica1);
        acciones.set(12, 15, accionSemantica1);
        acciones.set(12, 16, accionSemantica1);
        acciones.set(12, 17, accionSemantica1);
        acciones.set(12, 18, accionSemantica1);
        
        //FILA13 Estado 13
        acciones.set(13, 0, accionSemantica0);
        acciones.set(13, 1, accionSemantica0);
        acciones.set(13, 2, accionSemantica0);
        acciones.set(13, 3, accionSemantica0);
        acciones.set(13, 4, accionSemantica0);
        acciones.set(13, 5, accionSemantica0);
        acciones.set(13, 6, accionSemantica0);
        acciones.set(13, 7, accionSemantica0);
        acciones.set(13, 8, accionSemantica0);
        acciones.set(13, 9, accionSemantica0);
        acciones.set(13, 10, accionSemantica0);
        acciones.set(13, 11, accionSemantica0);
        acciones.set(13, 12, accionSemantica0);
        acciones.set(13, 13, accionSemantica0);
        acciones.set(13, 14, accionSemantica7);
        acciones.set(13, 15, accionSemantica0);
        acciones.set(13, 16, accionSemantica0);
        acciones.set(13, 17, accionSemantica0);
        acciones.set(13, 18, accionSemantica0);
        
        //FILA14 Estado 14
        acciones.set(14, 0, accionSemantica1);
        acciones.set(14, 1, accionSemantica1);
        acciones.set(14, 2, accionSemantica1);
        acciones.set(14, 3, accionSemantica1);
        acciones.set(14, 4, accionSemantica1);
        acciones.set(14, 5, accionSemantica1);
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
        acciones.set(14, 17, accionSemantica0);
        acciones.set(14, 18, accionSemantica1);
        
        
        
        return acciones;
		
	}
	
	
	public Matriz InicializarEstados(){
		
		Matriz estados = new Matriz(15,19);
		
		
		//FILA0 Estado 0
        estados.set(0, 0, 1);
        estados.set(0, 1, 2);
        estados.set(0, 2, 0);
        estados.set(0, 3, 3);
        estados.set(0, 4, 1);
        estados.set(0, 5, 10);
        estados.set(0, 6, 10);
        estados.set(0, 7, 7);
        estados.set(0, 8, 10);
        estados.set(0, 9, 8);
        estados.set(0, 10, 9);
        estados.set(0, 11, 9);
        estados.set(0, 12, 10);
        estados.set(0, 13, 11);
        estados.set(0, 14, 10);
        estados.set(0, 15, 14);
        estados.set(0, 16, 0);
        estados.set(0, 17, 0);
        estados.set(0, 18, 0);
        
        //FILA1 Estado 1
        estados.set(1, 0, 1);
        estados.set(1, 1, 1);
        estados.set(1, 2, 1);
        estados.set(1, 3, 15);
        estados.set(1, 4, 15);
        estados.set(1, 5, 15);
        estados.set(1, 6, 15);
        estados.set(1, 7, 15);
        estados.set(1, 8, 15);
        estados.set(1, 9, 15);
        estados.set(1, 10, 15);
        estados.set(1, 11, 15);
        estados.set(1, 12, 15);
        estados.set(1, 13, 15);
        estados.set(1, 14, 15);
        estados.set(1, 15, 15);
        estados.set(1, 16, 15);
        estados.set(1, 17, 15);
        estados.set(1, 18, 15);
        
        //FILA2 Estado 2
        estados.set(2, 0, 15);
        estados.set(2, 1, 2);
        estados.set(2, 2, 15);
        estados.set(2, 3, 3);
        estados.set(2, 4, 4);
        estados.set(2, 5, 15);
        estados.set(2, 6, 15);
        estados.set(2, 7, 15);
        estados.set(2, 8, 15);
        estados.set(2, 9, 15);
        estados.set(2, 10, 15);
        estados.set(2, 11, 15);
        estados.set(2, 12, 15);
        estados.set(2, 13, 15);
        estados.set(2, 14, 15);
        estados.set(2, 15, 15);
        estados.set(2, 16, 15);
        estados.set(2, 17, 15);
        estados.set(2, 18, 15);

        //FILA3 Estado 3
        estados.set(3, 0, 15);
        estados.set(3, 1, 3);
        estados.set(3, 2, 15);
        estados.set(3, 3, 15);
        estados.set(3, 4, 15);
        estados.set(3, 5, 15);
        estados.set(3, 6, 15);
        estados.set(3, 7, 15);
        estados.set(3, 8, 15);
        estados.set(3, 9, 15);
        estados.set(3, 10, 15);
        estados.set(3, 11, 15);
        estados.set(3, 12, 15);
        estados.set(3, 13, 15);
        estados.set(3, 14, 15);
        estados.set(3, 15, 15);
        estados.set(3, 16, 15);
        estados.set(3, 17, 15);
        estados.set(3, 18, 15);
        
        //FILA4 Estado 4
        estados.set(4, 0, 0);
        estados.set(4, 1, 6);
        estados.set(4, 2, 0);
        estados.set(4, 3, 0);
        estados.set(4, 4, 0);
        estados.set(4, 5, 5);
        estados.set(4, 6, 5);
        estados.set(4, 7, 0);
        estados.set(4, 8, 0);
        estados.set(4, 9, 0);
        estados.set(4, 10, 0);
        estados.set(4, 11, 0);
        estados.set(4, 12, 0);
        estados.set(4, 13, 0);
        estados.set(4, 14, 0);
        estados.set(4, 15, 0);
        estados.set(4, 16, 0);
        estados.set(4, 17, 0);
        estados.set(4, 18, 0);
        
        //FILA5 Estado 5
        estados.set(5, 0, 0);
        estados.set(5, 1, 6);
        estados.set(5, 2, 0);
        estados.set(5, 3, 0);
        estados.set(5, 4, 0);
        estados.set(5, 5, 5);
        estados.set(5, 6, 5);
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
        
        //FILA6 Estado 6
        estados.set(6, 0, 15);
        estados.set(6, 1, 6);
        estados.set(6, 2, 15);
        estados.set(6, 3, 15);
        estados.set(6, 4, 15);
        estados.set(6, 5, 15);
        estados.set(6, 6, 15);
        estados.set(6, 7, 15);
        estados.set(6, 8, 15);
        estados.set(6, 9, 15);
        estados.set(6, 10, 15);
        estados.set(6, 11, 15);
        estados.set(6, 12, 15);
        estados.set(6, 13, 15);
        estados.set(6, 14, 15);
        estados.set(6, 15, 15);
        estados.set(6, 16, 15);
        estados.set(6, 17, 15);
        estados.set(6, 18, 15);
        
        //FILA7 Estado 7
        estados.set(7, 0, 0);
        estados.set(7, 1, 0);
        estados.set(7, 2, 0);
        estados.set(7, 3, 0);
        estados.set(7, 4, 0);
        estados.set(7, 5, 0);
        estados.set(7, 6, 0);
        estados.set(7, 7, 0);
        estados.set(7, 8, 15);
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
        
        //FILA8 Estado 8
        estados.set(8, 0, 15);
        estados.set(8, 1, 15);
        estados.set(8, 2, 15);
        estados.set(8, 3, 15);
        estados.set(8, 4, 15);
        estados.set(8, 5, 15);
        estados.set(8, 6, 15);
        estados.set(8, 7, 15);
        estados.set(8, 8, 15);
        estados.set(8, 9, 15);
        estados.set(8, 10, 15);
        estados.set(8, 11, 15);
        estados.set(8, 12, 15);
        estados.set(8, 12, 15);
        estados.set(8, 13, 15);
        estados.set(8, 14, 15);
        estados.set(8, 15, 15);
        estados.set(8, 16, 15);
        estados.set(8, 17, 15);
        estados.set(8, 18, 15);
        
        //FILA9 Estado 9
        estados.set(9, 0, 15);
        estados.set(9, 1, 15);
        estados.set(9, 2, 15);
        estados.set(9, 3, 15);
        estados.set(9, 4, 15);
        estados.set(9, 5, 15);
        estados.set(9, 6, 15);
        estados.set(9, 7, 15);
        estados.set(9, 8, 15);
        estados.set(9, 9, 15);
        estados.set(9, 10, 15);
        estados.set(9, 11, 15);
        estados.set(9, 12, 15);
        estados.set(9, 13, 15);
        estados.set(9, 14, 15);
        estados.set(9, 15, 15);
        estados.set(9, 16, 15);
        estados.set(9, 17, 15);
        estados.set(9, 18, 15);
		
        //FILA10 Estado 10
        estados.set(10, 0, 15);
        estados.set(10, 1, 15);
        estados.set(10, 2, 15);
        estados.set(10, 3, 15);
        estados.set(10, 4, 15);
        estados.set(10, 5, 15);
        estados.set(10, 6, 15);
        estados.set(10, 7, 15);
        estados.set(10, 8, 15);
        estados.set(10, 9, 15);
        estados.set(10, 10, 15);
        estados.set(10, 11, 15);
        estados.set(10, 12, 15);
        estados.set(10, 13, 15);
        estados.set(10, 14, 15);
        estados.set(10, 15, 15);
        estados.set(10, 16, 15);
        estados.set(10, 17, 15);
        estados.set(10, 18, 15);
        
        //FILA11 Estado 11
        estados.set(11, 0, 15);
        estados.set(11, 1, 15);
        estados.set(11, 2, 15);
        estados.set(11, 3, 15);
        estados.set(11, 4, 15);
        estados.set(11, 5, 15);
        estados.set(11, 6, 12);
        estados.set(11, 7, 15);
        estados.set(11, 8, 15);
        estados.set(11, 9, 15);
        estados.set(11, 10, 15);
        estados.set(11, 11, 15);
        estados.set(11, 12, 15);
        estados.set(11, 13, 15);
        estados.set(11, 14, 15);
        estados.set(11, 15, 15);
        estados.set(11, 16, 15);
        estados.set(11, 17, 15);
        estados.set(11, 18, 15);
        
        //FILA12 Estado 12
        estados.set(12, 0, 12);
        estados.set(12, 1, 12);
        estados.set(12, 2, 13);
        estados.set(12, 3, 12);
        estados.set(12, 4, 12);
        estados.set(12, 5, 12);
        estados.set(12, 6, 13);
        estados.set(12, 7, 12);
        estados.set(12, 8, 12);
        estados.set(12, 9, 12);
        estados.set(12, 10, 12);
        estados.set(12, 11, 12);
        estados.set(12, 12, 12);
        estados.set(12, 13, 12);
        estados.set(12, 14, 12);
        estados.set(12, 15, 12);
        estados.set(12, 16, 12);
        estados.set(12, 17, 12);
        estados.set(12, 18, 12);
        
        //FILA13 Estado 13
        estados.set(13, 0, 0);
        estados.set(13, 1, 0);
        estados.set(13, 2, 0);
        estados.set(13, 3, 0);
        estados.set(13, 4, 0);
        estados.set(13, 5, 0);
        estados.set(13, 6, 0);
        estados.set(13, 7, 0);
        estados.set(13, 8, 0);
        estados.set(13, 9, 0);
        estados.set(13, 10, 0);
        estados.set(13, 11, 0);
        estados.set(13, 12, 0);
        estados.set(13, 13, 0);
        estados.set(13, 14, 15);
        estados.set(13, 15, 0);
        estados.set(13, 16, 0);
        estados.set(13, 17, 0);
        estados.set(13, 18, 0);
        
        //FILA14 Estado 14
        estados.set(14, 0, 14);
        estados.set(14, 1, 14);
        estados.set(14, 2, 14);
        estados.set(14, 3, 14);
        estados.set(14, 4, 14);
        estados.set(14, 5, 14);
        estados.set(14, 6, 14);
        estados.set(14, 7, 14);
        estados.set(14, 8, 14);
        estados.set(14, 9, 14);
        estados.set(14, 10, 14);
        estados.set(14, 11, 14);
        estados.set(14, 12, 14);
        estados.set(14, 13, 14);
        estados.set(14, 14, 15);
        estados.set(14, 15, 14);
        estados.set(14, 16, 14);
        estados.set(14, 17, 14);
        estados.set(14, 18, 14);
        
		
        
        return estados;
		
	}
}
