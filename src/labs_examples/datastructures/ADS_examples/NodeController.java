package labs_examples.datastructures.ADS_examples;

public class NodeController {
    public static void main(String[] args) {

    }
}

class CustomLinkedList <T> {
    //always keep track of the head node
    private Node head;

    //In the constructor we use VarArgs
    public CustomLinkedList(T... data){
        if (data.length < 1){
            head = null;
        } else {
            for (int i = 0; i < data.length; i++) {
                add(data[i]);
            }
        }
    }
    public void add(T data){
        insert(data, size());
    }

    public int size(){
        int count = 0;
        Node iterator = head;

        //itterate Through the list
        while (iterator != null){
            count++;
            iterator = iterator.next;
        }
        return count;
    }

    public void insert(T size, int index){
        if (head == null){
            head = new Node(data);
        } else {
            Node iterator = head;

            while (iterator != null){
                iterator = iterator.next;
            }

            iterator.next = new Node(data);
        }
    }
}

class Node<T> {
    T data;
    Node next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }

    public Node(T data, Node node){
        this.data = data;
        this.next = node;
    }
}
