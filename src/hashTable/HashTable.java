package hashTable;

import java.util.ArrayList;
import java.util.List;

public class HashTable<K, V> {
    int capacity;

    public HashTable(int capacity){
        this.capacity = capacity;
    }
    public int hashCode(String s) {
        int h=0;
        for (int i=0; i<s.length( ); i++) {
            h = (h << 5) | (h >>> 27);
            h += (int) s.charAt(i);
        }
        return h;
    }

    public HashTable<K, V> createTable(){
        List<HashTable<K,V>> dataBase = new ArrayList<HashTable<K, V>>(this.capacity);
        for (int i = 0; i < this.capacity; i++){
            dataBase.add()
        }
        return table;
    }

    public static void main(String[] args) {

    }
}
