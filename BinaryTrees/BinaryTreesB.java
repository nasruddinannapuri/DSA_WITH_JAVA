package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreesB {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int ind = -1;

        public static Node buildTree(int nodes[]) {
            ind++;
            if (nodes[ind] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[ind]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // a) preOrder: root->left->right
        public static void preOrder(Node root) { // O(n) tc
            if (root == null) {
                System.out.print("-1" + " ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // b) inOrder: left->root->right
        static void inOrder(Node root) { // O(n) tc
            if (root == null) {
                System.out.print("-1" + " ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        // c) postOrder: left->right->root
        static void postOrder(Node root) { // O(n) tc
            if (root == null) {
                System.out.print("-1" + " ");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        // d) Level Order Traversal:
        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {

                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (!q.isEmpty()) {
                        q.add(null);
                    } else {
                        break;
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }

            }

        }


    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // root value

        System.out.println(root.data);
        /*
         * System.out.println(root.left.data);
         * System.out.println(root.right.data);
         */

        // preOrder: root->left->right
        System.out.println("PreOrder: ");
        tree.preOrder(root);

        // inOrder: left->root->right
        System.out.println("\nInOrder: ");
        tree.inOrder(root);

        // postOrder: left->right->root
        System.out.println("\nPostOrder: ");
        tree.postOrder(root);

        // Level Order Traversal:
        System.out.println("\nLevel Order Traversal: ");
        tree.levelOrder(root);

    }
}
