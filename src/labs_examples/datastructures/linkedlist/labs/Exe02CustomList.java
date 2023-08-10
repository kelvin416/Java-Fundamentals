package labs_examples.datastructures.linkedlist.labs;

public class Exe02CustomList<T>{
    private CustomNode head;


    //constructor
    public Exe02CustomList(T... data){
        if (data.length < 1){
            head = null;
        } else {
            for (int i = 0; i < data.length; i++) {
                //add(data[1])
            }
        }
    }

    public void add(T data){
        insert(data, size());
    }

    //get based on Node's data not its index
    public T get(int index){
        try {
            int count = 0;
            CustomNode iterator = head;

            while (count != index){
                iterator = iterator.next;
            }
            return (T) iterator.data;
        } catch (NullPointerException e) {
            return null;
        }
    }
    //Use data not index
    public void set(int index, T data){
        try {
            int count = 0;
            CustomNode iterator = head;

            while (count != index){
                iterator = iterator.next;
                count++;
            }

            iterator.data = data;
        } catch (NullPointerException e){
            System.out.println("Invalid Index");
        }
    }

    public void insert(T data, int size){
        if (head == null){
            head = new CustomNode<>(data);
        } else {
            CustomNode iterator = head;

            if (iterator.data == null){
                head = new CustomNode<>(data, head);
            } else {
                while (iterator.next != null){
                    iterator = iterator.next;
                }

                iterator.next = new CustomNode<>(data);
            }
        }
    }

    //remove based on Node's Value not its index
    public void remove(){
        if (head.data == null){
            head = head.next;
        } else {
            CustomNode iterator = head;
            while (iterator.next != null){
                iterator = iterator.next;
            }

            iterator.next = null;
        }
    }


    public int size(){
        int count = 0;
        CustomNode iterator = head;

        while (iterator != null){
            count++;
            iterator = iterator.next;
        }

        return count;
    }



    public String toString(){
        CustomNode iterator = head;
        String output = "";

        while (iterator != null){
            output += iterator.data + " ";
            iterator = iterator.next;
        }
        return output;
    }

    public boolean isEmpty(){
        return head == null;
    }


}

class CustomNode<T> {
    T data;
    CustomNode next;

    public CustomNode(T data) {
        this.data = data;
        this.next = null;
    }

    public CustomNode(T data, CustomNode node){
        this.data = data;
        this.next = node;
    }

}
