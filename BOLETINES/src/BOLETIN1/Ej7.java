package BOLETIN1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Cuanto tamaño va a tener tu array? ");
        int tamano = sc.nextInt();


        System.out.println("El tamaño de tu array sera de " + tamano + " posiciones");

        int[] randomArray = generarArrayRandom(tamano);

        System.out.println("Introduce un número aleatorio");
        int numAle = sc.nextInt();

        boolean encontrado = contieneElemento(randomArray, numAle);

        if (encontrado) {
            System.out.println("El array contiene el elemento.");
        } else {
            System.out.println("El array NO contiene el elemento.");
        }
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
    }


    public static int[] generarArrayRandom(int tamano) {

        Scanner sc = new Scanner(System.in);


        int[] Array = new int[tamano];


        for (int i = 0; i < Array.length; i++) {

            Array[i] = (int) (Math.random() * 1001);
        }

        return Array;


    }

    public static boolean contieneElemento(int[] array, int elemento) {

        for (int i = 0; i < array.length; i++) {
            if (elemento == array[i]) {
                return true;
            }
        }

        return false;
    }


}
