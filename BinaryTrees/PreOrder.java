package BinaryTrees;

public class PreOrder {
    // root -> left -> right
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int ind = -1;
        public static Node buildTree(int nodes[]){
            ind++;
            if(nodes[ind] == -1){
                return null;
            }
            Node newNode = new Node(nodes[ind]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);

    }
}
