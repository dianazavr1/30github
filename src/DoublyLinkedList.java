public class DoublyLinkedList {
    public static void main(String[] args) {
        // Создаем узлы
        DoublyNode head = new DoublyNode(1);
        head.next = new DoublyNode(2);
        head.next.prev = head;
        head.next.next = new DoublyNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new DoublyNode(4);
        head.next.next.next.prev = head.next.next;

        // Выводим список
        printList(head);

        // Добавляем элемент в начало
        head = addFirst(head, 0);
        printList(head);

        // Удаляем элемент (например, 2)
        head = delete(head, 2);
        printList(head);
    }

    // Узел двусвязного списка
    static class DoublyNode {
        int data;
        DoublyNode next;
        DoublyNode prev;

        DoublyNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Функция вывода списка
    static void printList(DoublyNode head) {
        DoublyNode current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Добавление в начало списка
    static DoublyNode addFirst(DoublyNode head, int data) {
        DoublyNode newNode = new DoublyNode(data);
        newNode.next = head;
        if (head != null) head.prev = newNode;
        return newNode;
    }

    // Удаление элемента
    static DoublyNode delete(DoublyNode head, int data) {
        if (head == null) return null;

        if (head.data == data) {
            head = head.next;
            if (head != null) head.prev = null;
            return head;
        }

        DoublyNode current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current != null) {
            if (current.prev != null) current.prev.next = current.next;
            if (current.next != null) current.next.prev = current.prev;
        }

        return head;
    }
}
