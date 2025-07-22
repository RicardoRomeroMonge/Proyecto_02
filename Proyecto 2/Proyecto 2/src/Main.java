// Archivo: Main.java
public class Main {
    public static void main(String[] args) {
        // Pruebas para ArrayOperations
        ArrayOperations arrayOps = new ArrayOperations();
        arrayOps.insertAtPosition(0, 10);
        arrayOps.insertAtPosition(1, 20);
        arrayOps.insertAtPosition(2, 30);
        arrayOps.insertAtPosition(3, 40);
        arrayOps.insertAtPosition(4, 50);

        System.out.println("Elemento encontrado en el índice: " + arrayOps.searchElement(30));
        arrayOps.insertAtPosition(2, 25);
        arrayOps.deleteElement(40);

        // Pruebas para LinkedListOperations
        LinkedListOperations linkedListOps = new LinkedListOperations();
        linkedListOps.insertAtPosition(0, 100);
        linkedListOps.insertAtPosition(1, 200);
        linkedListOps.insertAtPosition(2, 300);
        linkedListOps.insertAtPosition(3, 400);
        linkedListOps.insertAtPosition(4, 500);

        System.out.println("Elemento encontrado en el índice: " + linkedListOps.searchElement(300));
        linkedListOps.insertAtPosition(2, 250);
        linkedListOps.deleteElement(400);
    }
}

// Archivo: ArrayOperations.java
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
            array[position] = 0; // Asumiendo que 0 es un valor por defecto
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}

// Archivo: LinkedListOperations.java
import java.util.LinkedList;

public class LinkedListOperations {
    private LinkedList<Integer> linkedList;

    public LinkedListOperations() {
        this.linkedList = new LinkedList<>();
    }

    public int searchElement(int element) {
        return linkedList.indexOf(element);
    }

    public void insertAtPosition(int position, int element) {
        if (position >= 0 && position <= linkedList.size()) {
            linkedList.add(position, element);
        } else {
            System.out.println("Posición inválida");
        }
    }

    public void deleteElement(int element) {
        if (linkedList.contains(element)) {
            linkedList.remove((Integer) element);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}
