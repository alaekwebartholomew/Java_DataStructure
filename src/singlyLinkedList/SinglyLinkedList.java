package singlyLinkedList;

public class SinglyLinkedList<T> {

    private static class Node<T> {
        private final Node<T> data;
        private Node<T> next;
        public Node(Node<T> data, Node<T> next){
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
    public Node<T> first(){
        if(this.head == null)
            return null;
        return this.head.data;
    }

    // This will return the last element in the linked list
    public Node<T> last(){
        if(this.head == null)
            return null;
        Node<T> itr = this.head;
        while (itr != null){
            itr = itr.next;
        }
        return itr.data;
    }

    // This will add element at the beginning of the linked list
    public void addFirst(Node<T> data){
        Node<T> new_node = new Node<>(data, null);
        if (this.head != null) {
            new_node.next = this.head;
        }
        this.head = new_node;
        this.size++;
    }

    // This will add element at the end of the linked list
    public void addLast(Node<T> data){
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
    public Node<T> removeFirst(){
        if(this.head == null)
            return null;
        Node<T> data = this.head.data;
        this.head = this.head.next;
        this.size--;
        return data;
    }

    // This will remove and return the last element
    public Node<T> removeLast(){
        if(this.head == null)
            return null;
        Node<T> itr = this.head;
        while (true){
            if(itr.next == null){
                Node<T> data = itr;
                itr = null;
                this.size--;
                return data;
            }
            itr = itr.next;
        }
    }

    public static void main(String[] arg){
        SinglyLinkedList<String> sll = new SinglyLinkedList<>();
        System.out.println(sll.isEmpty());
        System.out.println(sll.size());
    }
}
