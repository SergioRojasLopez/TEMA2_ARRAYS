package BOLETIN1;

public class Ej1 {
    public static void main(String[] args) {
        int [] miArray = {4,6,5,22,33,1};

        int suma = 0;

        for (int i = 0;i < miArray.length;i++){

            if (i % 2 == 0){

                suma += miArray[i];
            }
        }
        System.out.println("La suma de los numero es " + suma);

    }
}
