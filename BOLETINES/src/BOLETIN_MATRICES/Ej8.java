package BOLETIN_MATRICES;

public class Ej8 {

    public static void main(String[] args) {

        int[][] matriz1 = {

                {1, 2},
                {4, 6}
        };
        int[][] matriz2 = {

                {4, 1},
                {1, 0}
        };

        int[][] matriz3 = sumarMatrices(matriz1, matriz2);
        mostrarMatriz(matriz3);
    }

    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {

        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] matriz3 = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matriz3;
    }

    public static void mostrarMatriz(int[][] matriz3) {

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {

                System.out.println(matriz3[i][j] + " ");
            }
        }
    }

}
