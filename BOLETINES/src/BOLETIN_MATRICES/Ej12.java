package BOLETIN_MATRICES;

public class Ej12 {
    public static void main(String[] args) {

        int[][] matriz = {

                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {3, 2, 1, 4, 5},
                {9, 5, 8, 6, 7},
                {0, 9, 8, 5, 4}

        };

        System.out.println("Matriz original: ");
        imprimirMatriz(matriz);

        int[][] matrizReflejada = matrizReflejada(matriz);

        if (matrizCuadrada(matriz)) {

            System.out.println("La matriz reflejada es la siguiente: ");

            imprimirMatriz(matrizReflejada);

        } else {
            System.out.println("La matriz no es cuadrada");
        }
    }

    public static int[][] matrizReflejada(int[][] matriz) {

        if (!matrizCuadrada(matriz)) {
            return null;
        }
        int[][] matrizReflejada = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizReflejada[i][j] = matriz[j][i];
            }
        }

        return matrizReflejada;
    }

    public static boolean matrizCuadrada(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            if (matriz.length != matriz[i].length) {
                return false;
            }
        }

        return matriz.length == matriz[0].length;
    }

    public static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
