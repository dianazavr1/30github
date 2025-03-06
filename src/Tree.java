import java.util.*;
public class Tree {
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
        }
    }

    static Node insert(Node root, int value) {
        if (root == null) return new Node(value);
        if (value < root.value) root.left = insert(root.left, value);
        else root.right = insert(root.right, value);
        return root;
    }

    static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        int[] numbers = {5, 3, 7, 2, 4, 6, 8};

        for (int num : numbers) {
            root = insert(root, num);
        }

        inOrder(root); // Выведет: 2 3 4 5 6 7 8
    }
}
