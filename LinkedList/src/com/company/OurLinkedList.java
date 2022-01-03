package com.company;

public class OurLinkedList<T> {

    Node headNode;
    public OurLinkedList(){
        headNode = null;
    }
    public void add(Object val){
        Node newNode = new Node(val,null);
        if(headNode == null){
            headNode = newNode;

        }else{
            newNode.next = headNode;
            headNode = newNode;
        }
    }
    public void delete(){
        headNode = headNode.next;
    }

    public void display(){
        Node n = headNode;
        while(n!= null){
            System.out.println((T)n.value);
            n = n.next;
        }
    }
}

