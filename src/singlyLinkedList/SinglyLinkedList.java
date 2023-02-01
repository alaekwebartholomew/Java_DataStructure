package singlyLinkedList;

import doublyLinkedList.DoublyLinkedList;

public class SinglyLinkedList<T> {

    private static class Node<T> {
        private final T data;
        private Node<T> next;
        public Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> head;
    private int size = 0;
    public SinglyLinkedList(){
        this.head = null;
    }

    // This will return the size of the list
    public int size(){
        return this.size;
    }

    // This will check whether the list is empty
    public boolean isEmpty(){
        return this.size <= 0;
    }

    // This will return the first element in the linked list
    public T first(){
        if(this.head == null)
            return null;
        return this.head.data;
    }

    // This will return the last element in the linked list
    public T last(){
        if(this.head == null)
            return null;
        Node<T> itr = this.head;
        while (true){
            if(itr.next == null){
                return itr.data;
            }
            itr = itr.next;
        }
    }

    // This will add element at the beginning of the linked list
    public void addFirst(T data){
        Node<T> new_node = new Node<>(data, null);
        if (this.head != null) {
            new_node.next = this.head;
        }
        this.head = new_node;
        this.size++;
    }

    // This will add element at the end of the linked list
    public void addLast(T data){
        Node<T> new_node = new Node<>(data, null);
        if(this.head == null){
            this.head = new_node;
        } else {
            Node<T> itr = this.head;
            while (true){
                if (itr.next == null){
                    itr.next = new_node;
                    this.size++;
                    return;
                }
                itr = itr.next;
            }
        }
    }

    // This will remove and return the first element
    public T removeFirst(){
        if(this.head == null)
            return null;
        T data = this.head.data;
        this.head = this.head.next;
        this.size--;
        return data;
    }

    // This will remove and return the last element
    public T removeLast(){
        if(this.head == null)
            return null;
        Node<T> itr = this.head;
        while (true){
            if(itr.next.next == null){
                T data = itr.next.data;
                itr.next = null;
                this.size--;
                return data;
            }
            itr = itr.next;
        }
    }

    // Print items
    public void print(){
        if(this.head == null){
            System.out.println("Empty List");
        } else {
            String database = "";
            Node<T> itr = this.head;
            while (itr != null){
                database += itr.data + "->";
                itr = itr.next;
            }
            System.out.println(database);
        }
    }

    public static void main(String[] arg){
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.addFirst(74);
        sll.addFirst(78);
        sll.addLast(72);
        sll.addLast(70);
        sll.print();
        System.out.println("First item: " + sll.first());
        System.out.println("Last item: " + sll.last());
        System.out.println("deleted First item: " + sll.removeFirst());
        System.out.println("deleted Last item: " + sll.removeLast());
        System.out.println("First item: " + sll.first());
        System.out.println("Last item: " + sll.last());
        System.out.println(sll.isEmpty());
        System.out.println(sll.size());
    }
}
