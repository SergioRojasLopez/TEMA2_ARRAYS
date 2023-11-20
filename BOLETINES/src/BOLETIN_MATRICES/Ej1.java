package BOLETIN_MATRICES;

public class Ej1 {
    public static void main(String[] args) {
        int[][] matriz = {

                {33, 33, 33},
                {-14, 33, 33}
        };

        if (comprobarValorNegativo(matriz)) {
            System.out.println("En la matriz hay numeros negativos");

        } else {
            System.out.println("No hay numeros negativos");
        }

    }

    public static boolean comprobarValorNegativo(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] < 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
