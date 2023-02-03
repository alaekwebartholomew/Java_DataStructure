package hashTable;

public class HashTable<K, V> {
    int capacity;
    int[] dataBase;

    public HashTable(int capacity){
        this.capacity = capacity;
        this.dataBase = new int[this.capacity];
    }
    static int hashCode(String s) {
        int h=0;
        for (int i=0; i<s.length( ); i++) {
            h = (h << 5) | (h >>> 27);
            h += (int) s.charAt(i);
        }
        return h;
    }

    public static void main(String[] args) {
        System.out.println(HashTable.hashCode("Adfgh"));
    }
}
