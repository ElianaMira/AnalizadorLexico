package dataModel;

import accionesSemanticas.AccionSemantica0;
import accionesSemanticas.AccionSemantica1;
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
        
      //FILA0 Estado 0
        acciones.set(0, 0, accionSemantica1);
        acciones.set(0, 1, accionSemantica2);
        acciones.set(0, 2, accionSemantica2);
        acciones.set(0, 3, accionSemantica2);
        acciones.set(0, 4, accionSemantica4);
//        acciones.set(0, 5, accionSemantica12);
        acciones.set(0, 5, accionSemantica4);
        acciones.set(0, 6, accionSemantica1);
        acciones.set(0, 7, accionSemantica2);
        acciones.set(0, 8, accionSemantica2);
        acciones.set(0, 9, accionSemantica5);
        acciones.set(0, 10, accionSemantica5);
        acciones.set(0, 11, accionSemantica5);
        acciones.set(0, 12, accionSemantica1);
        acciones.set(0, 13, accionSemantica2);
        acciones.set(0, 14, accionSemantica2);
        acciones.set(0, 15, accionSemantica2);
        acciones.set(0, 16, accionSemantica2);
        acciones.set(0, 17, accionSemantica4);
//        acciones.set(0, 17, accionSemantica12);
        //FILA1 Estado 1
        acciones.set(1, 0, accionSemantica3);
        acciones.set(1, 1, accionSemantica2);
        acciones.set(1, 2, accionSemantica2);
        acciones.set(1, 3, accionSemantica3);
        acciones.set(1, 4, accionSemantica3);
        acciones.set(1, 5, accionSemantica3);
        acciones.set(1, 6, accionSemantica3);
        acciones.set(1, 7, accionSemantica3);
        acciones.set(1, 8, accionSemantica3);
        acciones.set(1, 9, accionSemantica3);
        acciones.set(1, 10, accionSemantica3);
        acciones.set(1, 11, accionSemantica3);
        acciones.set(1, 12, accionSemantica3);
        acciones.set(1, 13, accionSemantica3);
        acciones.set(1, 14, accionSemantica3);
        acciones.set(1, 15, accionSemantica3);
        acciones.set(1, 16, accionSemantica3);
        acciones.set(1, 17, accionSemantica3);
        
        //FILA2 Estado 2
        acciones.set(2, 0, accionSemantica7);
        acciones.set(2, 1, accionSemantica7);
        acciones.set(2, 2, accionSemantica7);
        acciones.set(2, 3, accionSemantica7);
        acciones.set(2, 4, accionSemantica6);
        acciones.set(2, 5, accionSemantica7);
        acciones.set(2, 6, accionSemantica7);
        acciones.set(2, 7, accionSemantica7);
        acciones.set(2, 8, accionSemantica7);
        acciones.set(2, 9, accionSemantica7);
        acciones.set(2, 10, accionSemantica7);
        acciones.set(2, 11, accionSemantica7);
        acciones.set(2, 12, accionSemantica7);
        acciones.set(2, 13, accionSemantica7);
        acciones.set(2, 14, accionSemantica7);
        acciones.set(2, 15, accionSemantica7);
        acciones.set(2, 16, accionSemantica7);
        acciones.set(2, 17, accionSemantica7);
        
        //FILA3 Estado 3
        acciones.set(3, 0, accionSemantica1);
        acciones.set(3, 1, accionSemantica1);
        acciones.set(3, 2, accionSemantica1);
        acciones.set(3, 3, accionSemantica1);
        acciones.set(3, 4, accionSemantica6);
        acciones.set(3, 5, accionSemantica1);
        acciones.set(3, 6, accionSemantica1);
        acciones.set(3, 7, accionSemantica1);
        acciones.set(3, 8, accionSemantica6);
        acciones.set(3, 9, accionSemantica1);
        acciones.set(3, 10, accionSemantica1);
        acciones.set(3, 11, accionSemantica1);
        acciones.set(3, 12, accionSemantica1);
        acciones.set(3, 13, accionSemantica1);
        acciones.set(3, 14, accionSemantica1);
        acciones.set(3, 15, accionSemantica1);
        acciones.set(3, 16, accionSemantica1);
        acciones.set(3, 17, accionSemantica1);
        
        //FILA4 Estado 4
        acciones.set(4, 0, accionSemantica1);
        acciones.set(4, 1, accionSemantica1);
        acciones.set(4, 2, accionSemantica1);
        acciones.set(4, 3, accionSemantica1);
        acciones.set(4, 4, accionSemantica6);
        acciones.set(4, 5, accionSemantica1);
        acciones.set(4, 6, accionSemantica1);
        acciones.set(4, 7, accionSemantica1);
        acciones.set(4, 8, accionSemantica1);
        acciones.set(4, 9, accionSemantica1);
        acciones.set(4, 10, accionSemantica1);
        acciones.set(4, 11, accionSemantica1);
        acciones.set(4, 12, accionSemantica1);
        acciones.set(4, 13, accionSemantica1);
        acciones.set(4, 14, accionSemantica1);
        acciones.set(4, 15, accionSemantica1);
        acciones.set(4, 16, accionSemantica1);
        acciones.set(4, 17, accionSemantica1);
        
        //FILA5 Estado 5
        acciones.set(5, 0, accionSemantica4);
        acciones.set(5, 1, accionSemantica4);
        acciones.set(5, 2, accionSemantica4);
        acciones.set(5, 3, accionSemantica4);
        acciones.set(5, 4, accionSemantica4);
        acciones.set(5, 5, accionSemantica4);
        acciones.set(5, 6, accionSemantica4);
        acciones.set(5, 7, accionSemantica4);
        acciones.set(5, 8, accionSemantica4);
        acciones.set(5, 9, accionSemantica4);
        acciones.set(5, 10, accionSemantica4);
        acciones.set(5, 11, accionSemantica4);
        acciones.set(5, 12, accionSemantica4);
        acciones.set(5, 13, accionSemantica5);
        acciones.set(5, 14, accionSemantica4);
        acciones.set(5, 15, accionSemantica4);
        acciones.set(5, 16, accionSemantica4);
        acciones.set(5, 17, accionSemantica4);
        
        //FILA6 Estado 6
        acciones.set(6, 0, accionSemantica5);
        acciones.set(6, 1, accionSemantica5);
        acciones.set(6, 2, accionSemantica5);
        acciones.set(6, 3, accionSemantica5);
        acciones.set(6, 4, accionSemantica5);
        acciones.set(6, 5, accionSemantica5);
        acciones.set(6, 6, accionSemantica5);
        acciones.set(6, 7, accionSemantica5);
        acciones.set(6, 8, accionSemantica5);
        acciones.set(6, 9, accionSemantica8);
        acciones.set(6, 10, accionSemantica5);
        acciones.set(6, 11, accionSemantica5);
        acciones.set(6, 12, accionSemantica5);
        acciones.set(6, 13, accionSemantica5);
        acciones.set(6, 14, accionSemantica5);
        acciones.set(6, 15, accionSemantica5);
        acciones.set(6, 16, accionSemantica5);
        acciones.set(6, 17, accionSemantica5);
        
        //FILA7 Estado7
        acciones.set(7, 0, accionSemantica2);
        acciones.set(7, 1, accionSemantica2);
        acciones.set(7, 2, accionSemantica2);
        acciones.set(7, 3, accionSemantica2);
        acciones.set(7, 4, accionSemantica2);
        acciones.set(7, 5, accionSemantica2);
        acciones.set(7, 6, accionSemantica5);
        acciones.set(7, 7, accionSemantica2);
        acciones.set(7, 8, accionSemantica2);
        acciones.set(7, 9, accionSemantica2);
        acciones.set(7, 10, accionSemantica2);
        acciones.set(7, 11, accionSemantica2);
        acciones.set(7, 12, accionSemantica2);
        acciones.set(7, 13, accionSemantica2);
        acciones.set(7, 14, accionSemantica9);
        acciones.set(7, 15, accionSemantica2);
        acciones.set(7, 16, accionSemantica2);
        acciones.set(7, 17, accionSemantica2);
        
        //FILA8 Estado 8
        acciones.set(8, 0, accionSemantica5);
        acciones.set(8, 1, accionSemantica5);
        acciones.set(8, 2, accionSemantica5);
        acciones.set(8, 3, accionSemantica5);
        acciones.set(8, 4, accionSemantica5);
        acciones.set(8, 5, accionSemantica5);
        acciones.set(8, 6, accionSemantica5);
        acciones.set(8, 7, accionSemantica5);
        acciones.set(8, 8, accionSemantica5);
        acciones.set(8, 9, accionSemantica5);
        acciones.set(8, 10, accionSemantica5);
        acciones.set(8, 11, accionSemantica5);
        acciones.set(8, 12, accionSemantica1);
        acciones.set(8, 13, accionSemantica5);
        acciones.set(8, 14, accionSemantica9);
        acciones.set(8, 15, accionSemantica5);
        acciones.set(8, 16, accionSemantica5);
        acciones.set(8, 17, accionSemantica5);
        
        //FILA9 Estado 9
        acciones.set(9, 0, accionSemantica1);
        acciones.set(9, 1, accionSemantica1);
        acciones.set(9, 2, accionSemantica2);
        acciones.set(9, 3, accionSemantica1);
        acciones.set(9, 4, accionSemantica1);
        acciones.set(9, 5, accionSemantica1);
        acciones.set(9, 6, accionSemantica1);
        acciones.set(9, 7, accionSemantica1);
        acciones.set(9, 8, accionSemantica1);
        acciones.set(9, 9, accionSemantica1);
        acciones.set(9, 10, accionSemantica1);
        acciones.set(9, 11, accionSemantica1);
        acciones.set(9, 12, accionSemantica1);
        acciones.set(9, 13, accionSemantica1);
        acciones.set(9, 14, accionSemantica1);
        acciones.set(9, 15, accionSemantica2);
        acciones.set(9, 16, accionSemantica2);
        acciones.set(9, 17, accionSemantica1);
        
        return acciones;
		
	}
	
	
	public Matriz InicializarEstados(){
		
		Matriz estados = new Matriz(9,20);
		//FILA0
        estados.set(0, 0, 0);
        estados.set(0, 1, 1);
        estados.set(0, 2, 9);
        estados.set(0, 3, 2);
        estados.set(0, 4, 14);
        estados.set(0, 5, 14);//final
        estados.set(0, 6, 0);
        estados.set(0, 7, 3);
        estados.set(0, 8, 4);
        estados.set(0, 9, 0);
        estados.set(0, 10, 0);
        estados.set(0, 11, 0);
        estados.set(0, 12, 14);
        estados.set(0, 13, 5);
        estados.set(0, 14, 7);
        estados.set(0, 15, 11);
        estados.set(0, 16, 7);
        estados.set(0, 17, 14);
        //FILA1
        estados.set(1, 0, 14);
        estados.set(1, 1, 1);
        estados.set(1, 2, 1);
        estados.set(1, 3, 14);
        estados.set(1, 4, 14);
        estados.set(1, 5, 14);
        estados.set(1, 6, 14);
        estados.set(1, 7, 14);
        estados.set(1, 8, 14);
        estados.set(1, 9, 14);
        estados.set(1, 10, 14);
        estados.set(1, 11, 14);
        estados.set(1, 12, 14);
        estados.set(1, 13, 14);
        estados.set(1, 14, 14);
        estados.set(1, 15, 14);
        estados.set(1, 16, 14);
        estados.set(1, 17, 14);
        //e2
        estados.set(2, 0, 0);
        estados.set(2, 1, 0);
        estados.set(2, 2, 0);
        estados.set(2, 3, 0);
        estados.set(2, 4, 14);
        estados.set(2, 5, 0);
        estados.set(2, 6, 0);
        estados.set(2, 7, 0);
        estados.set(2, 8, 0);
        estados.set(2, 9, 0);
        estados.set(2, 10, 0);
        estados.set(2, 11, 0);
        estados.set(2, 12, 0);
        estados.set(2, 13, 0);
        estados.set(2, 14, 0);
        estados.set(2, 15, 0);
        estados.set(2, 16, 0);
        estados.set(2, 17, 0);

        //FILA3
        estados.set(3, 0, 14);
        estados.set(3, 1, 14);
        estados.set(3, 2, 14);
        estados.set(3, 3, 14);
        estados.set(3, 4, 14);
        estados.set(3, 5, 14);
        estados.set(3, 6, 14);
        estados.set(3, 7, 14);
        estados.set(3, 8, 14);
        estados.set(3, 9, 14);
        estados.set(3, 10, 14);
        estados.set(3, 11, 14);
        estados.set(3, 12, 14);
        estados.set(3, 13, 14);
        estados.set(3, 14, 14);
        estados.set(3, 15, 14);
        estados.set(3, 16, 14);
        estados.set(3, 17, 14);
        //e4
        estados.set(4, 0, 14);
        estados.set(4, 1, 14);
        estados.set(4, 2, 14);
        estados.set(4, 3, 14);
        estados.set(4, 4, 14);
        estados.set(4, 5, 14);
        estados.set(4, 6, 14);
        estados.set(4, 7, 14);
        estados.set(4, 8, 14);
        estados.set(4, 9, 14);
        estados.set(4, 10, 14);
        estados.set(4, 11, 14);
        estados.set(4, 12, 14);
        estados.set(4, 13, 14);
        estados.set(4, 14, 14);
        estados.set(4, 15, 14);
        estados.set(4, 16, 14);
        estados.set(4, 17, 14);
        //FILA5
        estados.set(5, 0, 14);
        estados.set(5, 1, 14);
        estados.set(5, 2, 14);
        estados.set(5, 3, 14);
        estados.set(5, 4, 14);
        estados.set(5, 5, 14);
        estados.set(5, 6, 14);
        estados.set(5, 7, 14);
        estados.set(5, 8, 14);
        estados.set(5, 9, 14);
        estados.set(5, 10, 14);
        estados.set(5, 11, 14);
        estados.set(5, 12, 14);
        estados.set(5, 13, 6);
        estados.set(5, 14, 14);
        estados.set(5, 15, 14);
        estados.set(5, 16, 14);
        estados.set(5, 17, 14);
        //FILA6
        estados.set(6, 0, 6);
        estados.set(6, 1, 6);
        estados.set(6, 2, 6);
        estados.set(6, 3, 6);
        estados.set(6, 4, 6);
        estados.set(6, 5, 6);
        estados.set(6, 6, 6);
        estados.set(6, 7, 6);
        estados.set(6, 8, 6);
        estados.set(6, 9, 0);
        estados.set(6, 10, 6);
        estados.set(6, 11, 6);
        estados.set(6, 12, 6);
        estados.set(6, 13, 6);
        estados.set(6, 14, 6);
        estados.set(6, 15, 6);
        estados.set(6, 16, 6);
        estados.set(6, 17, 6);
        //e7
        estados.set(7, 0, 7);
        estados.set(7, 1, 7);
        estados.set(7, 2, 7);
        estados.set(7, 3, 7);
        estados.set(7, 4, 7);
        estados.set(7, 5, 7);
        estados.set(7, 6, 8);
        estados.set(7, 7, 7);
        estados.set(7, 8, 7);
        estados.set(7, 9, 14);
        estados.set(7, 10, 7);
        estados.set(7, 11, 7);
        estados.set(7, 12, 7);
        estados.set(7, 13, 7);
        estados.set(7, 14, 14);
        estados.set(7, 15, 7);
        estados.set(7, 16, 7);
        estados.set(7, 17, 7);
        //FILA8
        estados.set(8, 0, 8);
        estados.set(8, 1, 8);
        estados.set(8, 2, 8);
        estados.set(8, 3, 8);
        estados.set(8, 4, 8);
        estados.set(8, 5, 8);
        estados.set(8, 6, 7);
        estados.set(8, 7, 8);
        estados.set(8, 8, 8);
        estados.set(8, 9, 8);
        estados.set(8, 10, 8);
        estados.set(8, 11, 8);
        //estados.set(8, 12, 8);
        estados.set(8, 12, 0);
        estados.set(8, 13, 8);
        estados.set(8, 14, 14);
        estados.set(8, 15, 8);
        estados.set(8, 16, 8);
        estados.set(8, 17, 8);
        //FILA9
        estados.set(9, 0, 0);
        estados.set(9, 1, 0);
        estados.set(9, 2, 9);
        estados.set(9, 3, 0);
        estados.set(9, 4, 0);
        estados.set(9, 5, 0);
        estados.set(9, 6, 0);
        estados.set(9, 7, 0);
        estados.set(9, 8, 0);
        estados.set(9, 9, 0);
        estados.set(9, 10, 0);
        estados.set(9, 11, 0);
        estados.set(9, 12, 0);
        estados.set(9, 13, 0);
        estados.set(9, 14, 0);
        estados.set(9, 15, 12);
        estados.set(9, 16, 10);
        estados.set(9, 17, 0);
		
		return estados;
		
	}
}
