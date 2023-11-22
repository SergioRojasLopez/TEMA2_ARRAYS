package BOLETIN_MATRICES;

public class Ej10 {
    public static void main(String[] args) {

        int [][] matriz = {

                {1, 3, 0, 3, 1},
                {4, 2, 7, 2, 4},
                {6, 1, 9, 1, 6},
                {0, 8, 8, 8, 0}
        };

        if (comprobarSimetria(matriz)){

            System.out.println("La matriz es simetrica eje Y");
        }else {

            System.out.println("La matriz no es simetrica");
        }
    }

    public static boolean comprobarSimetria (int [][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length / 2; j++){
                if (matriz[i][j] != matriz[i][matriz[i].length - 1 - j]){
                    return false;
                }
            }
        }
        return true;
    }
}

