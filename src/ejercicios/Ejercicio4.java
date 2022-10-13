package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que haría el usuario. El algoritmo
    pregunta al usuario cuánto ha sacado en la primera tirada y el usuario le dará esa información pero
    en formato cadena (“UNO”, “DOS” … “SEIS”).

    Después el algoritmo volverá a preguntar al usuario cuánto ha sacado en la segunda tirada y el usuario
    también dará esa información en formato cadena.
    
    Por último, el algoritmo mostrará por pantalla la suma de las dos tiradas en formato numérico.

     */
    public static void main(String[] args) {

        //Declaramos las variables
        String dado1, dado2;
        int suma = 0;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca cuanto ha sacado en la primera y segunda tirada del dado y las
        //guardaremos en las variables declaradas previamente
        System.out.println("Introduzca cuánto ha sacado en la primera tirada del dado. Por favor escriba el numero" +
                            " con letra");
        dado1=sc.nextLine();
        System.out.println("Introduzca cuánto ha sacado en la segunda tirada del dado. Por favor escriba el numero" +
                " con letra");
        dado2=sc.nextLine();


        //Esta solucion es horrible y la odio, pero es lo unico que se ma ha ocurrido por el momento TT^TT
        switch (dado1){
            case "UNO", "uno" ->{
               switch (dado2){
                   case "UNO", "uno"->{
                       suma=1+1;
                   }
                   case "DOS", "dos" ->{
                       suma=1+2;
                   }
                   case "TRES", "tres" ->{
                       suma=1+3;
                   }
                   case "CUATRO", "cuatro" ->{
                       suma=1+4;
                   }
                   case "CINCO", "cinco" ->{
                       suma=1+5;
                   }
                   case "SEIS", "seis" ->{
                       suma=1+6;
                   }
                   default -> System.out.println("Valor introducido no válido");
               }
                
            }
            case "DOS", "dos" ->{
                switch (dado2){
                    case "UNO", "uno"->{
                        suma=2+1;
                    }
                    case "DOS", "dos"->{
                        suma=2+2;
                    }
                    case "TRES", "tres" ->{
                        suma=2+3;
                    }
                    case "CUATRO", "cuatro" ->{
                        suma=2+4;
                    }
                    case "CINCO", "cinco" ->{
                        suma=2+5;
                    }
                    case "SEIS", "seis" ->{
                        suma=2+6;
                    }
                    default -> System.out.println("Valor introducido no válido");
                }
            }
            case "TRES", "tres" ->{
                switch (dado2){
                    case "UNO", "uno"->{
                        suma=3+1;
                    }
                    case "DOS", "dos" ->{
                        suma=3+2;
                    }
                    case "TRES", "tres" ->{
                        suma=3+3;
                    }
                    case "CUATRO", "cuatro" ->{
                        suma=3+4;
                    }
                    case "CINCO", "cinco" ->{
                        suma=3+5;
                    }
                    case "SEIS", "seis" ->{
                        suma=3+6;
                    }
                    default -> System.out.println("Valor introducido no válido");
                }
            }
            case "CUATRO", "cuatro" ->{
                switch (dado2){
                    case "UNO", "uno"->{
                        suma=4+1;
                    }
                    case "DOS", "dos" ->{
                        suma=4+2;
                    }
                    case "TRES", "tres" ->{
                        suma=4+3;
                    }
                    case "CUATRO", "cuatro" ->{
                        suma=4+4;
                    }
                    case "CINCO", "cinco" ->{
                        suma=4+5;
                    }
                    case "SEIS", "seis" ->{
                        suma=4+6;
                    }
                    default -> System.out.println("Valor introducido no válido");
                }
            }
            case "CINCO", "cinco" ->{
                switch (dado2){
                    case "UNO", "uno"->{
                        suma=5+1;
                    }
                    case "DOS", "dos" ->{
                        suma=5+2;
                    }
                    case "TRES", "tres" ->{
                        suma=5+3;
                    }
                    case "CUATRO", "cuatro" ->{
                        suma=5+4;
                    }
                    case "CINCO", "cinco" ->{
                        suma=5+5;
                    }
                    case "SEIS", "seis" ->{
                        suma=5+6;
                    }
                    default -> System.out.println("Valor introducido no válido");
                }
            }
            case "SEIS", "seis" ->{
                switch (dado2){
                    case "UNO", "uno"->{
                        suma=6+1;
                    }
                    case "DOS", "dos" ->{
                        suma=6+2;
                    }
                    case "TRES", "tres" ->{
                        suma=6+3;
                    }
                    case "CUATRO", "cuatro" ->{
                        suma=6+4;
                    }
                    case "CINCO", "cinco" ->{
                        suma=6+5;
                    }
                    case "SEIS", "seis" ->{
                        suma=6+6;
                    }
                    default -> System.out.println("Valor introducido no válido");
                }
            }
            default -> System.out.println("Valor introducido no válido");
        }

        if (suma!=0){
            System.out.println("El resultado de la suma de los dos número es: "+suma);
        }

    }
}
