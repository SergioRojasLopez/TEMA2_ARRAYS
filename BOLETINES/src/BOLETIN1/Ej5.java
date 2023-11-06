package BOLETIN1;

import java.util.Random;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuanto tamaño va a tener tu array? ");
        int tamano = sc.nextInt();


        System.out.println("El tamaño de tu array sera de " + tamano + " posiciones");

        int[] randomArray = generarArrayRandom(tamano);

        System.out.print("Array de números aleatorios: ");
        for (int num : randomArray) {
            System.out.print(num + " " );
        }
    }

    public static int[] generarArrayRandom(int tamano) {

        int[] Array = new int[tamano];


        for (int i = 0; i < Array.length; i++) {

            Array[i] = (int) (Math.random() * 1001);
        }
        return Array;
    }

}



