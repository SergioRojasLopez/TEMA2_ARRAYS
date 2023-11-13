package BOLETIN1;

public class Ej12 {

    public static void main(String[] args) {

        // Ejemplo de uso
        int[] array = {5, 2, 9, 1, 5, 6};

        System.out.println("Array sin ordenar:");
        imprimirArray(array);

        // Llamada al método de ordenación de burbuja
        ordenarBurbuja(array);

        System.out.println("Array ordenado:");
        imprimirArray(array);

    }

    //BURBUJA
    public static void ordenarBurbuja(int[] array) {
        int n = array.length;
        boolean intercambio;

        do {
            intercambio = false;
            for (int i = 1; i < n; i++) {
                // Compara elementos adyacentes y realiza el intercambio si están en el orden incorrecto
                if (array[i - 1] > array[i]) {
                    // Intercambio de elementos
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    intercambio = true;
                }
            }
            n--;
        } while (intercambio);
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}