package BOLETIN1;

import java.util.Scanner;

public class Ej8Plus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas posiciones tendra tu array?");
        int tamano = sc.nextInt();

        int[] miArray = new int[tamano];

        System.out.println("Introduce los elementos del array");

        for (int i = 0; i < tamano; i++) {

            System.out.println("elemento " + (i + 1) + ": ");

            miArray[i] = sc.nextInt();

        }

        System.out.println("Que valor quieres buscar en el array?");
        int valorBuscar = sc.nextInt();

        int posicion = encontrarposicion(miArray,valorBuscar);

        if (posicion == valorBuscar){

            System.out.println("El valor " + valorBuscar + " esta en la posicion " + posicion);

        }else {

            System.out.println("-1");
        }
    }

    public static int encontrarposicion(int[] miArray, int valorBuscar) {

        for (int i = 0; i < miArray.length;i++){

            if(miArray[i] == valorBuscar ){

                return i + 1;
            }

        }

        return -1;
    }
}
