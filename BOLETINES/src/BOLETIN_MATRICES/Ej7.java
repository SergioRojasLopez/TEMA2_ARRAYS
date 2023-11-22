package BOLETIN_MATRICES;

public class Ej7 {

    public static void main(String[] args) {
        int[][] matriz = {

                {2, 4, 1},
                {4, 2, 5}
        };
        int[][] matriz2 = {

                {2, 4, 1},
                {4, 2, 5}
        };

        if (matrizCuadrada(matriz)){

            System.out.println("La primera matriz es cuadrada ");

        }else {

            System.out.println("La primera matriz no es cuadrada");
        }

        if (matrizCuadrada(matriz2)){

            System.out.println("La segunda matriz es cuadrada");

        }else {

            System.out.println("La segunda matriz no es cuadrada");
        }

        }


    public static boolean compararMatrices(int[][] matriz,int [][] matriz2) {

        if (matriz.length != matriz2.length && matriz[0].length != matriz2[0].length){

            return false;
        }
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){

                if (matriz[i][j] != matriz2[i][j]){

                    return false;
                }
            }
        }


        return true;
    }

    public static boolean matrizCuadrada (int [][] matriz){

        return matriz.length == matriz[0].length;

    }
}
