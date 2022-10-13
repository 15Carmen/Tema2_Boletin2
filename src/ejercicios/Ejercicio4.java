package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que haría el usuario. El algoritmo
    pregunta al usuario cuánto ha sacado en la primera tirada y el usuario le dará esa información, pero
    en formato cadena (“UNO”, “DOS” … “SEIS”).

    Después el algoritmo volverá a preguntar al usuario cuánto ha sacado en la segunda tirada y el usuario
    también dará esa información en formato cadena.
    
    Por último, el algoritmo mostrará por pantalla la suma de las dos tiradas en formato numérico.

     */
    public static void main(String[] args) {

        //Declaramos las variables
        String dado1, dado2; //Variables donde vamos a guardar los números introducidos por el usuario
        int num1, num2; //Variables numéricas a las que vamos a convertir las variables cadenas introducidas por el usuario
        int suma; //Variable donde vamos a guardar la solución a la suma de los números

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca cuanto ha sacado en la primera y segunda tirada del dado y las
        //guardaremos en las variables declaradas previamente
        System.out.println("Introduzca cuánto ha sacado en la primera tirada del dado. Por favor escriba el numero con letra");
        dado1=sc.nextLine();
        System.out.println("Introduzca cuánto ha sacado en la segunda tirada del dado. Por favor escriba el numero con letra");
        dado2=sc.nextLine();

        //Según que cadena de texto haya metido el usuario por consola guardamos un número entero en la variable num1
        num1= switch (dado1){
            case "UNO", "uno" -> 1;
            case "DOS", "dos" -> 2;
            case "TRES", "tres" -> 3;
            case "CUATRO", "cuatro" -> 4;
            case "CINCO", "cinco" -> 5;
            case "SEIS", "seis" -> 6;
            default -> {
                System.out.println("Valor introducido no válido"); //Si el usuario introduce algo diferente a esas cadenas
                yield -1;                                           //de texto lanzamos un mensaje de errory le asignamos
                                                                    // a la variable el valor -1
            }
        };

        //Según que cadena de texto haya metido el usuario por consola guardamos un número entero en la variable num2
        num2= switch (dado2){
            case "UNO", "uno" -> 1;
            case "DOS", "dos" -> 2;
            case "TRES", "tres" -> 3;
            case "CUATRO", "cuatro" -> 4;
            case "CINCO", "cinco" -> 5;
            case "SEIS", "seis" -> 6;
            default -> {
                System.out.println("Valor introducido no válido");//Si el usuario introduce algo diferente a esas cadenas
                yield -1;                                           //de texto lanzamos un mensaje de error y le asignamos
                                                                    // a la variable el valor -1
            }
        };

        //Realizamos la suma de los numeros una vez convertidos a enteros
        suma=num1+num2;

        //Si alguna de las variables es igual a -1 (es decir que se ha lanzado el mensaje de error) no imprimimos el mensaje
        //de suma
        if (num1!=-1 && num2!=-1){
            System.out.println("El resultado de la suma de los dos número es: "+suma);
        }

        //Cerramos el scanner
        sc.close();
    }
}
