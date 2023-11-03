package BOLETIN1;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas posiciones quieres que tenga tu array?");

        int posiciones = sc.nextInt();
        int [] miArray = new int [posiciones];

        //Recorremos el array y por cada posicion le damos un valor introducido por teclado
        for (int i = 0; i < posiciones; i++){

            System.out.println("Introduce el numero que quieres en la posicion " + i);

            miArray[i] = sc.nextInt();


        }

        //Le damos un valor minimo y maximo como referencia
        int maximo = miArray[0];
        int minimo = miArray[0];
        int suma = miArray[0];

        for (int i = 1; i < posiciones;i++){

            if (miArray[i] > maximo){

                maximo = miArray[i];

            }
            if (miArray[i] < minimo){

                minimo = miArray[i];
            }

            suma += miArray[i];
        }
        double media = 0;
        media = (double) suma / posiciones;

        System.out.println("El numero mas pequeño es el " + minimo + " y el mas grande es " + maximo);
        System.out.println("La media es " + media);

        }
    }

