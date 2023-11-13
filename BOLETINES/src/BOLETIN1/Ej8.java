package BOLETIN1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] Array = {2, 6, -4, 78, 32, -43};
        int elementoBuscar = -4;

        int posicion = encontrarPosicion (Array,elementoBuscar);

        if (posicion != -1){

            System.out.println("El valor " + elementoBuscar + " se encuentra en la posicion " + posicion);
        } else {

            System.out.println("El valor " + elementoBuscar + " no esta en el array");
        }
    }

    public static int encontrarPosicion(int[] Array, int elementoBuscar) {

        for (int i = 0; i < Array.length; i++) {

            if (Array[i] == elementoBuscar) {

                return i + 1;
            }
        }

        return -1;
    }
}
