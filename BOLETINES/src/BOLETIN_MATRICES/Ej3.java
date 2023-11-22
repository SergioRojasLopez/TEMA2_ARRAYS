package BOLETIN_MATRICES;

public class Ej3 {
    public static void main(String[] args) {
        int [][] matriz = {

                {1,2,3},
                {0,2,7}
        };

        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz (int [][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j]+ " ");

            }

        }

    }
}
