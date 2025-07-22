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
        arrayOps.printArray();

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
        linkedListOps.printList();
    }