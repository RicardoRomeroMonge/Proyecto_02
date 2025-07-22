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

    public void printList() {
        for (Integer element : linkedList) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
