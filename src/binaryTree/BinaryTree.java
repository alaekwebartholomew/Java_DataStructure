package binaryTree;

import java.util.ArrayList;

public class BinaryTree implements TreeInterface{
    BinaryTree left;
    int e;
    BinaryTree right;
    private int size;

    public BinaryTree(int e){
        this.left = null;
        this.e = e;
        this.right = null;
        this.size = 0;
    }


    @Override
    public void addChild(int e) {
        if(this.e == e)
            return;
        if(this.e > e){
            if(this.right != null){
                this.right.addChild(e);
            }else {
                this.right = new BinaryTree(e);
                this.size++;
            }
        }
        if(this.e < e){
            if(this.left != null){
                this.left.addChild(e);
            }else {
                this.left = new BinaryTree(e);
                this.size++;
            }
        }
    }

    @Override
    public ArrayList<Integer> preOrderTraversal() {
        ArrayList<Integer> element = new ArrayList<>();
        if(this.size == 0)
            element.add(this.e);
        if(this.left != null)
            return this.left.preOrderTraversal();
        if(this.right != null)
            return this.right.preOrderTraversal();
        return element;
    }

    @Override
    public ArrayList<Integer> postOrderTraversal() {
        return ;
    }

    @Override
    public ArrayList<Integer> inOrderTraversal() {
        return ;
    }

    @Override
    public int findMin() {
        return 0;
    }

    @Override
    public int findMax() {
        return 0;
    }

    @Override
    public boolean isInternal() {
        return false;
    }

    @Override
    public boolean isExternal() {
        return false;
    }

    @Override
    public boolean isRoot() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int search(int e) {
        return 0;
    }

    @Override
    public void delete(int e) {

    }

    public static BinaryTree buildNode(int[] items){
        BinaryTree root = new BinaryTree(items[0]);
        for (int value: items)
            root.addChild(value);
        return root;
    }

    public static void main(String[] arg){
        int[] scores = {84, 78, 71, 70, 88, 74, 72};
        BinaryTree build = BinaryTree.buildNode(scores);
        build.postOrderTraversal();
    }
}
