package dataModel;

import accionesSemanticas.AccionesSemanticas;

public class AnalizadorLexico {
	
	private Matriz estados;
	private Matriz accionesSemanticas;
	
	
	public AnalizadorLexico(){
		estados = new Matriz(9,20); //ver bien filas y columnas
		accionesSemanticas = new Matriz(9,20); //ver bien filas y columnas
		InicEstructuras inicia = new InicEstructuras();
		
		accionesSemanticas = inicia.inicializarAcciones();
		estados = inicia.InicializarEstados();
	
	}
	
	public void imprimirEstados() {
        for (int i = 0; i < 9; i++) {
            System.out.print("F:" + i);
            for (int j = 0; j < 20; j++) {
                System.out.print(" C" + j + ":" + estados.get(i, j));
            }
            System.out.println("");
        }
    }

    public void imprimirAcciones() {
        for (int i = 0; i < 14; i++) {
            System.out.print("F:" + i);
            for (int j = 0; j < 18; j++) {
                if (accionesSemanticas.get(i, j) != null) {
                    AccionesSemanticas a = (AccionesSemanticas) accionesSemanticas.get(i, j);
                    System.out.print(" C:" + j + "_" + a.getIdentificador());
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
	
}
