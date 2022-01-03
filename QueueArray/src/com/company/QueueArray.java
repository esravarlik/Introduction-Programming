package com.company;

public class QueueArray<T> {

    Object[] arrayQueue;
    int rear;
    int front;
    int maxSize;
    int nItems;

    public QueueArray(int size){
        this.maxSize = size;
        arrayQueue = new Object[this.maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(Object object){
        if(isFull() == true){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arrayQueue[rear] = object;
        nItems++;
    }

    public T dequeue(){
        if(isEmpty() == true){
            System.out.println("Queue is empty");
            return null;
        }
        T objectOut = (T) arrayQueue[front];
        for(int i = 0;i<rear+1;i++){
            T tmp;
            tmp = (T) arrayQueue[i];
            arrayQueue[i-1] = tmp;
        }
        arrayQueue[rear] = null;
        nItems--;
        rear--;
        return objectOut;
    }
    public boolean isFull(){
        return (nItems == maxSize);
    }
    public boolean isEmpty(){
        return (nItems == 0);
    }
    public void printer(){
        System.out.println("Listing the elements in the queue..");
        for(int i = 0;i<arrayQueue.length;i++){
            System.out.println("Element Order: (" + (i+1) + ")" + arrayQueue[i]);
        }
    }



}
