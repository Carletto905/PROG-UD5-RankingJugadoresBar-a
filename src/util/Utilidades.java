package util;

import java.util.Scanner;

public class Utilidades {


private static final Scanner sc = new Scanner(System.in);

public static String solicitarTexto(String mensaje) {
    String texto = "";
    while (texto.trim().isEmpty()) {
        System.out.print(mensaje);
        texto = sc.nextLine();
        if (texto.trim().isEmpty()) {
            System.out.println("El campo no puede estar vacío.");
        }
    }
    return texto.trim();
}

public static int solicitarEntero(String mensaje) {
    int numero = -1;
    boolean valido = false;

    while (!valido) {
        System.out.print(mensaje);
        try {
            numero = Integer.parseInt(sc.nextLine());
            valido = true;
        } catch (NumberFormatException e) {
            System.out.println("Debes introducir un número válido.");
        }
    }

    return numero;
}

public static int solicitarPuntuacion(String mensaje) {
    int puntuacion = -1;
    boolean valido = false;

    while (!valido) {
        System.out.print(mensaje + " (1 a 5): ");
        try {
            puntuacion = Integer.parseInt(sc.nextLine());
            if (puntuacion >= 1 && puntuacion <= 5) {
                valido = true;
            } else {
                System.out.println("La puntuación debe estar entre 1 y 5.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Debes introducir un número válido.");
        }
    }

    return puntuacion;
}

public static int solicitarIndice(String mensaje, int max) {
    int indice = -1;
    boolean valido = false;

    while (!valido) {
        System.out.print(mensaje + " (0 a " + (max - 1) + "): ");
        try {
            indice = Integer.parseInt(sc.nextLine());
            if (indice >= 0 && indice < max) {
                valido = true;
            } else {
                System.out.println("Número fuera de rango.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Debes introducir un número válido.");
        }
    }

    return indice;
}
}