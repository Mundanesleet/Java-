package com.parquesoft.proyectofinal;

import com.parquesoft.proyectofinal.operaciones.operaciones;
import com.parquesoft.proyectofinal.utilidades.herramientas;

public class Proyecto_Final {

	public static void main(String[] args) {
		int opcionSeleccionada = herramientas.mostrarMenu();
		try {
			switch (opcionSeleccionada) {
				case 1:
					operaciones.sumar();
					break;
				case 2:
					operaciones.restar();
					break;
				case 3:
					operaciones.multiplicar();
					break;
				case 4:
					operaciones.dividir();
					break;
				default:
					break;
		    }
		} catch (Exception e) {
            herramientas.mostrarMensaje(e.getMessage());
		}
	}
}	

	