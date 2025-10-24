public class QuickSortMitad {
    
    public int[] arr;


    public QuickSortMitad(int[] arr) {
        this.arr = arr;
    }//Constructor

    public void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particion(arr, inicio, fin);
            quickSort(arr, inicio, indicePivote - 1);
            quickSort(arr, indicePivote + 1, fin);
        }
    }

    private  int particion(int[] arr, int inicio, int fin) {
        // Usamos el elemento del medio como pivote
        int medio = inicio + (fin - inicio) / 2;
        int pivote = arr[medio];

        // Intercambiamos el pivote con el último elemento para facilitar la partición
        intercambiar(arr, medio, fin);

        int i = inicio;
        for (int j = inicio; j < fin; j++) {
            if (arr[j] < pivote) {
                intercambiar(arr, i, j);
                i++;
            }
        }

        // Colocamos el pivote en su posición final
        intercambiar(arr, i, fin);
        return i;
    }

    private  void intercambiar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    
    ////////////////////////////////
    /// Método auxiliar para mostrar el array
    /// //////////////////////////////

    void mostrarArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }//mostrarArray


     void mostrarArray() {
        for (int num : this.arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }//mostrarArray
}