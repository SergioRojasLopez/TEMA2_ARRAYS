package BOLETIN_MATRICES;

public class Ej4 {
    public static void main(String[] args) {
        int [][] matriz = {

                {1,3,5},
                {0,2,7}
        };

        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz (int [][] matriz){
        for (int i = matriz.length - 1; i >= 0; i--){
            for (int j = matriz[i].length - 1; j >= 0; j--){
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
