package BOLETIN_MATRICES;

public class Ej11 {
    public static void main(String[] args) {

        int [][] matriz1 = {

                {5, 8, 9, 0},
                {4, 7, 5, 2},
                {1, 7, 3, 2}
        };
        int [][] matriz2 = {

                {2, 3, 7, 1},
                {2, 5, 7, 4},
                {0, 9, 8, 5}
        };

        if (matrizInversa(matriz1,matriz2)){

            System.out.println("Son inversas");
        }else {

            System.out.println("No son inversas");
        }

    }

    public static boolean matrizInversa(int[][] matriz1, int [][] matriz2){


        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[i].length; j++){

                if (matriz1[i][j] != matriz2[matriz1.length - 1 - i][matriz1[0].length - 1 - j])

                    return false;
            }
        }

        return true;
    }
}
