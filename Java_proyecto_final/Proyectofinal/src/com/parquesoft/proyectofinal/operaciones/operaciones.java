package com.parquesoft.proyectofinal.operaciones;

import com.parquesoft.proyectofinal.utilidades.herramientas;

public class operaciones {

    public static void sumar() {
        double sumandouno, sumandodos;
        sumandouno = herramientas.solicitarNumeroEntero("primer","la Suma");
        sumandodos = herramientas.solicitarNumeroEntero("segundo","la Suma");

        double resultadouno = sumandouno + sumandodos;
        String mensaje = "El resultado de la suma: " + sumandouno + "+" + sumandodos + "=" + resultadouno;
        herramientas.mostrarMensaje(mensaje);
    }
    
    public static void restar() {
        double restaruno, restardos;
        restaruno = herramientas.solicitarNumeroEntero("primer", "la resta");
        restardos = herramientas.solicitarNumeroEntero("segundo", "la resta");

        double resultados = restaruno - restardos;
        String mensaje = "El resultado de la resta: " + restaruno + "-" + restardos + "=" + resultados;
        herramientas.mostrarMensaje(mensaje);

    }

    public static void multiplicar() throws Exception {
        double multiplo, multiplodos;
        multiplo = herramientas.solicitarNumeroEntero("primer", "la multiplicacion");
        multiplodos = herramientas.solicitarNumeroEntero("segundo", "la multiplicacion");

        if (multiplodos == 0){
            throw new Exception("Todo lo que multipliques por 0 su resultado sera 0");
        }

        double resultadomulti = multiplo * multiplodos;
        String mensaje = "El resultado de la resta: " + multiplo + "*" + multiplodos +  "=" + resultadomulti;
        herramientas.mostrarMensaje(mensaje);
    }

    public static void dividir() throws Exception {
        double numerador, denominador;
        numerador = herramientas.solicitarNumeroDecimal("numerador","dividir");
        denominador = herramientas.solicitarNumeroDecimal("denominador","dividir");

        if (denominador == 0) { 
            throw new Exception("No se puede realizar una division por 0");
        }
        
        double resultado = numerador / denominador;
        String mensaje = "El resultado de dividir: " + numerador + "/" + denominador + "=" + resultado;
        herramientas.mostrarMensaje(mensaje);
    }
}
