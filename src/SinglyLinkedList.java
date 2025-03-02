public class SinglyLinkedList {
    public static void main(String[] args) {
        // Создаем узлы
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Выводим список
        printList(head);

        // Добавляем элемент в начало
        head = addFirst(head, 0);
        printList(head);

        // Удаляем элемент (например, 2)
        head = delete(head, 2);
        printList(head);
    }

    // Узел списка
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Функция вывода списка
    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Добавление в начало списка
    static Node addFirst(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    // Удаление элемента
    static Node delete(Node head, int data) {
        if (head == null) return null;

        if (head.data == data) return head.next;

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }
}
