package BOLETIN1;

public class Ej10 {

    public static void main(String[] args) {
        int [] a1 = {1,2,3};
        int [] a2 = {5,1,5};

    }

    public static int [] eliminarDuplicados(int[]a1, int []a2){

        int [] a3 = new int [a2.length];
        int elementoAnadido = 0;

        for (int i = 0; i < a2.length;i++){

            if (indexOf(a1,a2[i])==-1){

                a3[elementoAnadido++] = a2[i];


            }
        }
    }

    public static int indexOf(int[]a, int elem){

        int pos = -1;

        for (int i =0; i < a.length;i++){

            if (a[i] == elem){

                pos = 1;
            }
        }
        return pos;
    }
}
