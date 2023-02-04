package hashTable;

import java.util.ArrayList;
import java.util.List;

public class HashTable<K, V> {

    private ArrayList<HashNode<K, V>> dataBase;
    private final int capacity;
    private int size;

    public HashTable(){
        dataBase = new ArrayList<>();
        this.capacity = 15;
        this.size = 0;

        for (int i = 0; i <= this.capacity; i++)
            dataBase.add(null);
    }
    public int hashCode(String s) {
        int h=0;
        for (int i=0; i<s.length( ); i++) {
            h = (h << 5) | (h >>> 27);
            h += (int) s.charAt(i);
        }
        return h;
    }

    public int size(){return this.size;}

    public boolean isEmpty(){return this.size() == 0;}

    public static void main(String[] args) {

    }
}
