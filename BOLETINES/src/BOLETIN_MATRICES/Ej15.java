package BOLETIN_MATRICES;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fila = 6;
        int columna = 6;

        System.out.println("Introduce la fila del valor que quieres saber");
        int numFila = sc.nextInt();
        System.out.println("Introduce la columna del valor que quieres saber");
        int numColu = sc.nextInt();

        int numeroCasilla = obtenerNumero(fila, columna, numFila, numColu);

        if (numeroCasilla != -1) {
            System.out.println("La casilla [" + numFila + "," + numColu + "] " + "hace referencia al numero " + numeroCasilla);
        } else {
            System.out.println("Posicion desconocida");
        }
    }

    public static int obtenerNumero(int fila, int columna, int numFila, int numColu) {

        if (numFila >= 0 && numFila < fila && numColu >= 0 && numColu < columna) {
            return numFila * columna + numColu + 1;
        } else {
            return -1;
        }
    }
}
