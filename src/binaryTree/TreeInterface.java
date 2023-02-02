package binaryTree;

import java.util.ArrayList;

public interface TreeInterface {

    public void addChild(int e);
    public ArrayList<Integer> preOrderTraversal();
    public ArrayList<Integer> postOrderTraversal();
    public ArrayList<Integer> inOrderTraversal();
    public int findMin();
    public int findMax();
    public boolean isInternal();
    public boolean isExternal();
    public boolean isRoot();
    public int size();
    public int search(int e);
    public void delete(int e);

}