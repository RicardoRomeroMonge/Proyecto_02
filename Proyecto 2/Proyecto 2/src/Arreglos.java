public class ArrayOperations {
    private int[] array;

    public ArrayOperations() {
        this.array = new int[5];
    }

    public int searchElement(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void insertAtPosition(int position, int element) {
        if (position >= 0 && position < array.length) {
            array[position] = element;
        } else {
            System.out.println("Posición inválida");
        }
    }

    public void deleteElement(int element) {
        int position = searchElement(element);
        if (position != -1) {
            array[position] = 0;
        } else {
            System.out.println("Elemento no encontrado");
        }
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
