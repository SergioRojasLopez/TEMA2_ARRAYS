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

        compararMatrices(matriz,matriz2);
    }

    public static void compararMatrices(int[][] matriz,int [][] matriz2) {

        if (matriz == matriz2){
            System.out.println("Las matrices son iguales ");

        }else {
            System.out.println("Las matrices no son iguales");
        }

    }
}
