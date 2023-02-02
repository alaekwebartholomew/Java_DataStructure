package binaryTree;

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
    public int preOrderTraversal() {
        return 0;
    }

    @Override
    public int postOrderTraversal() {
        return 0;
    }

    @Override
    public int inOrderTraversal() {
        return 0;
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

    public static void main(String[] arg){

    }
}
