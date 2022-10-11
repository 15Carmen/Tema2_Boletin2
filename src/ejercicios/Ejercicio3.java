package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    /*
    Escribe un algoritmo que le pida al usuario dos números. A continuación debe mostrar el siguiente menú
    por pantalla:
        SUMAR LOS NÚMEROS
        RESTAR LOS NÚMEROS
        MULTIPLICAR LOS NÚMEROS
        DIVIDIR LOS NÚMEROS
	Después, el algoritmo debe pedirle al usuario que selecciona una opción y que haga la operación que
	marca esa opción, mostrando por último el resultado de la operación elegida por el usuario. Si el
	usuario elige una opción incorrecta, el algoritmo se lo hace saber al usuario y no haría nada.
     */
    public static void main(String[] args) {

        //Declaramos las variables
        int num1, num2; //Variables donde vamos a guardar los números introducidos por el usuario
        int resultado; //Variable donde vamos a guardar el resultado de las operaciones
        String menu; //Variable donde vamos a guardar la opción del menu introducida por el usuario

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca por consola dos números enteros y lo guardamos en las variables
        // previamente declaradas
        System.out.println("Introduzca un numero entero: ");
        num1 = sc.nextInt();
        System.out.println("Introduzca un numero entero: ");
        num2 = sc.nextInt();

        System.out.println("""
                        ¿Qué desea hacer con los números?
                        
                        [A] SUMAR LOS NÚMEROS
                        [B] RESTAR LOS NÚMEROS
                        [C] MULTIPLICAR LOS NÚMEROS
                        [D] DIVIDIR LOS NÚMEROS
                            """);
        menu=sc.next();

        switch (menu){
            case "A", "a"->{
                resultado=num1+num2;
                System.out.println("El resultado de la suma es "+resultado);
            }
            case "B", "b"->{
                resultado=num1-num2;
                System.out.println("El resultado de la resta es "+resultado);
            }
            case "C", "c"->{
                resultado=num1*num2;
                System.out.println("El resultado de la multiplicación es "+resultado);
            }
            case "D", "d"->{
                resultado=num1/num2;
                System.out.println("El resultado de la división es "+resultado);
            }
        }

        //Cerramos el scanner
        sc.close();

    }
}
