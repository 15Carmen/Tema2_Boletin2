package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    /*
    Queremos saber, una vez introducido un carnet de conducir, a qué corresponde. Sabiendo:
      a) E: remolques.
      b) D: autobuses.
      c) C1-C5: camiones.
      d) A: motocicletas.
      e) B1-B2: automóviles.
      f) En caso de introducir uno distinto: “Categoría no contemplada”.

     */
    public static void main(String[] args) {

        //Declaramos las variables
        String carnet; //Varaible donde vamos a guardar la reapuesta del ususario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca su tipo de carnet de conducir
        System.out.println("Introduzca el tipo de carnet de conducir que tiene: E, D, C1-C5, A o B1-B2");
        carnet=sc.next();

        //Según la respuesta introducida por el usuario se imprimirá un mensaje determinado
        switch (carnet){
            case "E"-> System.out.println("Su carnet es para remolques");
            case "D" -> System.out.println("Su carnet es para autobuses");
            case "C1-C5" -> System.out.println("Su carnet es para camiones");
            case "A" -> System.out.println("Su carnet es para motocicletas");
            case "B1-B2" -> System.out.println("Su carnet es para automoviles");
            default -> System.out.println("Categoría no contemplada");
        }

        //Cerramos el scanner
        sc.close();


    }
}
