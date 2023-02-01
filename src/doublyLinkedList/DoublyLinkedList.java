package doublyLinkedList;

public class DoublyLinkedList<E> {

    private static class Node<E>{
        private Node<E> prev;
        private final E e;
        private Node<E> next;

        public Node(Node<E> prev, E e, Node<E> next){
            this.prev = prev;
            this.e = e;
            this.next = next;
        }
    }
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Return is size of the list
    public int size(){
        return this.size;
    }

    // Check whether the list is empty
    public boolean isEmpty(){
        return size <= 0;
    }

    // Return the first element
    public E first(){
        if(this.head == null)
            return null;
        return this.head.e;
    }

    // Returns the last element
    public E last(){
        if(this.tail == null)
            return null;
        return this.tail.e;
    }

    // Add element at first node
    public void addFirst(E e){
        Node<E> new_node = new Node<>(null, e, null);
        if(this.head == null){
            this.head = new_node;
            this.tail = new_node;
        } else {
            new_node.next = this.head;
            this.head.prev = new_node;
            this.head = new_node;
        }
        this.size++;
    }

    // Add element at the last node
    public void addLast(E e){
        Node<E> new_node = new Node<>(null, e, null);
        if(this.tail == null){
            this.tail = new_node;
            this.head = new_node;
        } else {
            new_node.prev = this.tail;
            this.tail.next = new_node;
            this.tail = new_node;
        }
        this.size++;
    }

    // Remove the first element and return it
    public E removeFirst(){
        if(this.head == null)
            return null;
        E e = this.head.e;
        if(this.head.next == null){
            this.head = null;
            this.tail = null;
            this.size--;
            return e;
        }
        this.head.next.prev = null;
        this.head = this.head.next;
        this.size--;
        return e;
    }

    // Remove the last element and return it
    public E removeLast(){
        if(this.tail == null)
            return null;
        E e = this.tail.e;
        if(this.tail.prev == null){
            this.tail = null;
            this.head = null;
            this.size--;
            return e;
        }
        this.tail.prev.next = null;
        this.tail = this.tail.prev;
        this.size--;
        return e;
    }

    public static void main(String[] arg){
        DoublyLinkedList<String> dll = new DoublyLinkedList<>();
        dll.addFirst("coding");
        dll.addFirst("Reading");
        dll.addLast("Eating");
        dll.addLast("Swimming");
        System.out.println("deleted First item: " + dll.removeFirst());
        System.out.println("deleted Last item: " + dll.removeLast());
        System.out.println("First item: " + dll.first());
        System.out.println("Last item: " + dll.last());
        System.out.println("deleted First item: " + dll.removeFirst());
        System.out.println("deleted Last item: " + dll.removeLast());
        System.out.println(dll.size());
        System.out.println(dll.isEmpty());
    }
}
