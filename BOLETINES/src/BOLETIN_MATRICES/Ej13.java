package BOLETIN_MATRICES;

import BOLETIN1.Ej5;

public class Ej13 {

    public static void main(String[] args) {
        int[][] matriz = {

                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5},
                {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4}

        };

        Ej12.imprimirMatriz(matriz);

        if (Ej12.matrizCuadrada(matriz)) {
            int[][] matriz2 = reflejoDiagonal(matriz);
            Ej12.imprimirMatriz(matriz2);

        }else {

            System.out.println("La matriz no es cuadrada");
        }

    }

    public static int[][] reflejoDiagonal(int[][] matriz) {

        int[][] matrizInversa = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matrizInversa[i][j] = matriz[matriz.length - 1 - j][matriz.length - 1 - i];
            }
        }

        return matrizInversa;
    }

}


