package com.company;

public class StackImpl<T> {

    private int maxSize;
    private Object[] stackArray;
    private int top;

    StackImpl(int size){
        this.maxSize = size;
        stackArray = new Object[this.maxSize];
        this.top = -1; //Index: 0
    }

    public void push(Object newItem){
        if(isFull() == true){
            System.out.println("The Stack is full..");
            return null;
        }
        top = top + 1;
        stackArray[top] = newItem;
    }
    public boolean isFull(){
        return (top == maxSize - 1); //Stack full
    }
    public T pop(){
        if(isEmpty() == true){
            System.out.println("The Stack is empty..");
            return null;
        }
        T item = (T) stackArray[top];
        top -= 1;
        return item;
    }
    public boolean isEmpty(){
        return (top == -1);
    }
}
