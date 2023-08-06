package labs_examples.datastructures.linkedlist.labs;

import labs_examples.datastructures.linkedlist.examples.Node;

import java.util.LinkedList;

public class Exe01CustomList <T>{
    private CustomNode head;

    public Exe01CustomList(T... data){
        if (data.length < 1){
            head = null;
        } else {
            for (int i = 0; i < data.length; i++) {
                //add(data[1])
            }
        }
    }

    public void add(){}
    public void get(){}
    public void remove(){}

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
