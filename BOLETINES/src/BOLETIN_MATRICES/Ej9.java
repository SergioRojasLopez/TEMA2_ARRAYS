package BOLETIN_MATRICES;

public class Ej9 {
    public static void main(String[] args) {

        int [][] matriz = {

                {1, 3, 5, 6},
                {4, 2, 0, 8},
                {4, 2, 0, 8},
                {1, 3, 5, 6}
        };

        if (comprobarSimetria(matriz)){

            System.out.println("La matriz es simetrica eje X");
        }else {

            System.out.println("La matriz no es simetrica eje X");
        }
    }

    public static boolean comprobarSimetria (int [][] matriz){

        if(matriz.length != matriz[0].length){

            return false;
        }
        for (int i = 0; i < matriz.length / 2; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] != matriz[matriz.length - 1 - i][j]){

                    return false;
                }

            }
        }
        return true;
    }
}
