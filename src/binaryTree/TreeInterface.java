package binaryTree;

public interface TreeInterface {

    public void addChild(int e);
    public int preOrderTraversal();
    public int postOrderTraversal();
    public int inOrderTraversal();
    public int findMin();
    public int findMax();
    public boolean isInternal();
    public boolean isExternal();
    public boolean isRoot();
    public int size();
    public int search(int e);
    public void delete(int e);

}