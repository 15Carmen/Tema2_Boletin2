package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    /*
     * Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: insuficiente (de 0 a 4),
     * suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).
     */
    public static void main(String[] args) {
        //Declaramos las variables
        int nota; //Variable donde vamos a guardar la nota introducida por el usuario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca por consola la nota del alumno
        System.out.println("Introduzca la nota del alumno: ");
        nota = sc.nextInt();

        //Con un switch case asignamos un mensaje a cada nota y los imprimimos por pantalla
        switch (nota) {
            case 0, 1, 2, 3, 4 -> {
                System.out.println("Insuficiente");
            }
            case 5 -> {
                System.out.println("Suficiente");
            }
            case 6 -> {
                System.out.println("Bien");
            }
            case 7, 8 -> {
                System.out.println("Notable");
            }
            case 9, 10 -> {
                System.out.println("Sobresaliente");
            }
            default -> {
                System.out.println("Nota no válida");
            }
        }

        //cerramos el scanner
        sc.close();

    }
}
