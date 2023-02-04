package hashTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HashTable<K, V> {

    private ArrayList<HashNode<K, V>> dataBase;
    private int capacity;
    private int size;

    public HashTable(){
        dataBase = new ArrayList<>();
        this.capacity = 15;
        this.size = 0;

        for (int i = 0; i <= this.capacity; i++)
            dataBase.add(null);
    }
    private int hashCode(K key) {
        return Objects.hashCode(key);
    }

    private int getDataBseIndex(K key){
        int hashKey = this.hashCode(key);
        int index = hashKey % this.capacity;
        index = index < 0 ? index * -1 : index;
        return index;
    }

    public int size(){return this.size;}

    public boolean isEmpty(){return this.size() == 0;}

    public void add(K key, V value){
        // Find head of chain for given key
        int index = getDataBseIndex(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = dataBase.get(index);

        // Check if key is already present
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insert key in chain
        size++;
        head = dataBase.get(index);
        HashNode<K, V> newNode = new HashNode<K, V>(key, value, hashCode);
        newNode.next = head;
        dataBase.set(index, newNode);

        // If load factor goes beyond threshold, then
        // double hash table size
        if ((1.0 * this.size) / this.capacity >= 0.7) {
            ArrayList<HashNode<K, V> > temp = this.dataBase;
            dataBase = new ArrayList<>();
            this.capacity = 2 * this.capacity;
            this.size = 0;
            for (int i = 0; i < this.capacity; i++)
                this.dataBase.add(null);
            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        HashTable<String, String> map = new HashTable<>();
        map.add("Learn", "Coding");
    }
}
