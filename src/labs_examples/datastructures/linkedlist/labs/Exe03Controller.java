package labs_examples.datastructures.linkedlist.labs;

class Node<T> {
    T data;
    Node prev;
    Node next;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public Node() {

    }
}

class CustomDoublyList<T>{

    private Node head = null;
    private Node tail = null;

    public CustomDoublyList(T... data){
        if (data.length < 1){
            head = null;
            tail = null;
        } else {
            for (int i = 0; i < data.length; i++){
                addNode(data[i]);
            }
        }
    }

    public void addNode(T data){
        Node newNode = new Node<>(data);
        if (head == null){
            head = newNode;
            tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void get(){
        Node iterator = head;
        if (head == null){
            System.out.println("List Is Empty");
        } else {
            System.out.println("The doubly linkedList nodes are: ");
            while (iterator != null){
                System.out.println(iterator.data + " ");
                iterator = iterator.next;
            }
        }
    }


}
public class Exe03Controller {
    public static void main(String[] args) {
        CustomDoublyList dList = new CustomDoublyList<>();
        dList.addNode("Kelvin");
        dList.addNode(27);
        dList.get();
    }
}
