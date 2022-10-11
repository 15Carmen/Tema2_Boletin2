package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    /*
    Idear un programa que solicite al usuario un número comprendido entre 1 y 7, correspondiente a un día
    de la semana. Se debe mostrar el nombre del día de la semana al que corresponde. Por ejemplo,
    el número 1 corresponde a “Lunes” y el 6 a “Sábado”.
     */
    public static void main(String[] args) {
        //Declaramos las variables
        int dia; //Variable donde vamos a guardar el día introducido por el usuario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca por consola un numero entero del 1 al 7 y lo guardamos en
        // la variable previamente declarada
        System.out.println("Introduzca un numero del 1 al 7: ");
        dia = sc.nextInt();

        //Con un switch case asignamos un mensaje con el dia de la semana correspondiente a cada numero y
        // los imprimimos por pantalla
        switch (dia){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error, numero no valido");
                break;

        }
        //cerramos el scanner
        sc.close();
    }
}
