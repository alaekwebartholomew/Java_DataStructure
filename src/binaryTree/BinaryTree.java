package binaryTree;

public class BinaryTree{

        static class Node {
            int value;
            Node left, right;

            public Node(int data) {
                this.value = data;
                this.left = null;
                this.right = null;
            }
        }

    public void addChild(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                addChild(node.left, value);
            } else {
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                addChild(node.right, value);
            } else {
                node.right = new Node(value);
            }
        }
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(" " + node.value);
            inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(" " + node.value);
        }
    }

    public static void main(String[] arg){
        BinaryTree tree = new BinaryTree();
        Node root = new Node(73);
        tree.addChild(root, 78);
        tree.addChild(root, 71);
        tree.addChild(root, 70);
        tree.addChild(root, 88);
        tree.addChild(root, 74);
        tree.addChild(root, 72);
        tree.inOrderTraversal(root);
        System.out.println("");
        tree.preOrderTraversal(root);
        System.out.println("");
        tree.postOrderTraversal(root);
    }
}
