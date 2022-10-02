package com.parquesoft.proyectofinal.utilidades;

import javax.swing.JOptionPane;


public class herramientas {
    public static int mostrarMenu() {

		String [] arregloMenu = {
                 "Bienvendido a nuestra calculadora",
                 "Sumar", 
				 "Restar",
				 "Multiplicar",
				 "Dividir"
                 };
        return seleccionarOpcion(arregloMenu);
    }
    public static int seleccionarOpcion(String[] arreglo) {
        String menuString = "";
        for (int i = 0; i < arreglo.length; i++) {
            menuString += (i != 0 ? (i + ". ") : "") + arreglo[i] + "\n";
        }
        int opcionSeleccionada = Integer.parseInt(JOptionPane.showInputDialog(menuString));
        return opcionSeleccionada;
    }

    public static int solicitarNumeroEntero(String ordenNumero, String operacion) {
        String mensajeSolicitarNumero = "Ingrese el " + ordenNumero + " numero para " + operacion;
        int numeroSolicitado = Integer.parseInt(JOptionPane.showInputDialog(mensajeSolicitarNumero));
        return numeroSolicitado;
    }

    public static double solicitarNumeroDecimal(String ordenNumero, String operacion) {
        String mensajeSolicitarNumero = "Ingrese el " + ordenNumero + " numero para " + operacion;
        double numeroSolicitado = Double.parseDouble(JOptionPane.showInputDialog(mensajeSolicitarNumero));
        return numeroSolicitado;
    }

    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
