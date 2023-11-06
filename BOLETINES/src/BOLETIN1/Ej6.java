package BOLETIN1;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas posiciones tendra tu array?");


        int tamano = sc.nextInt();
        int[] miArray = Ej5.generarArrayRandom(tamano);


        System.out.println("Los numeros aleatorios ya se han generado");

        System.out.println("Que posicion quieres ver?");

        int posicion = sc.nextInt();

        if (posicion >= 0 && posicion < miArray.length) {

            System.out.println("El numero en la posicion " + posicion + " es " + miArray[posicion]);

        } else {

            System.out.println("La posicion pedida esta fuera de rango");
        }

    }

}
