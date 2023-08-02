package labs_examples.datastructures.ADS_examples;

public class NodeController {
    public static void main(String[] args) {

    }
}

class CustomLinkedList <T> {
    //LinkedList are generic in nature
    private Node head;
    public CustomLinkedList(T... data){
        if (data.length < 1){
            head = null;
        } else {
            for (int i = 0; i < data.length; i++){
                add(data[i]);
            }
        }
    }

    //adding a new node a the end of the List
    public void add(T data){
        insert(data, size());
    }

    public void insert(T data, int index){
        if (head == null){
            head = new Node(data);
        } else {
            Node iterator = head;
            Node previous = null;

            if (index == 0){
                head = new Node(data, head);
            } else if (index < size()) {
                int count = 0;

                while (count != index){
                    previous = iterator;
                    iterator = iterator.next;
                    count++;
                }

                previous.next = new Node(data, iterator);
            } else {
                while (iterator.next != null){
                    iterator = iterator.next;
                }

                iterator.next = new Node(data);
            }
        }
    }

    //remove method
    public void remove(int index){
        if (index == 0){
            head = head.next;
        } else if (index < size()) {
            try {
                int count = 0;

                Node previous = null;
                Node iterator = head;

                while (count != index){
                    previous = iterator;
                    iterator = iterator.next;
                    count++;
                }

                previous.next = iterator.next;
            } catch (NullPointerException e){
                System.out.println("Invalid Index");
            }
        } else {
            Node iterator = head;
            iterator.next=null;
        }
    }

    //getting a single node out of a list
    public T get(int index){
        try{
            int count = 0;
            Node iterator = head;

            while (count != index){
                iterator = iterator.next;
                count++;
            }

            return (T) iterator.data;
        } catch (NullPointerException e){
            return null;
        }
    }

    public void set(int index, T data){
        try{
            int count = 0;
            Node iterator = head;

            while (count != index){
                iterator = iterator.next;
            }
            iterator.data = data;
        } catch (NullPointerException e){
            System.out.println("Invalid Index");
        }
    }

    //determining the size of the list
    public int size(){
        int count = 0;
        Node iterator = head;

        while (iterator != null){
            iterator = iterator.next;
        }
        return count;
    }

    public boolean isEmpty(){
        return head == null;
    }
}

class Node<T> {
    T data;
    Node next;

    //Constructor that take in data
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    //used to add nodes to the front of the LinkedLists
    public Node(T data, Node node) {
        this.data = data;
        this.next = node;
    }
}
