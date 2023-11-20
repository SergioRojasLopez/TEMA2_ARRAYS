package BOLETIN_MATRICES;

public class Ej6 {

    public static void main(String[] args) {

        int [][] matriz = {
                {1,3,5},
                {0,2,7}
        };

        imprimirMatrizInversa(matriz);
    }

    public static void imprimirMatrizInversa(int [][] matriz){
        for (int j = matriz[0].length - 1; j >= 0; j--){
            for (int i = matriz.length - 1; i >= 0; i--){
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
