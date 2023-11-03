package BOLETIN1;

public class Ej2 {

    public static void main(String[] args) {
        int [] miArray = {2,4,-9,22,-8,-33};
        int numNegativo = 0;

        for (int i = 0; i < miArray.length;i++) {


            if (miArray[i] < 0)
                numNegativo++;
        }
        System.out.println("Hay un total de " + numNegativo + " numeros negativos");
    }
}
