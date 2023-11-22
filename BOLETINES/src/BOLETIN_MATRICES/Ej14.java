package BOLETIN_MATRICES;

public class Ej14 {

    public static void main(String[] args) {

        int[][] matriz = {

                {1, 2, 3},
                {6, 7, 8},
                {3, 2, 5}
        };

        Ej12.imprimirMatriz(matriz);

        if (Ej12.matrizCuadrada(matriz)) {
            int[][] matrizNueva = transformarMatriz(matriz);
            System.out.println("La matriz transformada es esta: ");
            Ej12.imprimirMatriz(matrizNueva);

        } else {

            System.out.println("La matriz no es cuadrada");
        }

    }
    public static int[][] transformarMatriz(int[][] matriz) {

        int[][] matrizNueva = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizNueva[j][i] = matriz[i][j];

            }
        }

        return matrizNueva;
    }
}
