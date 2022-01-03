package com.company;

public class Main {

    public static void main(String[] args) {
        StackImpl<Integer> stack = new StackImpl<>(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);


        while(!stack.isEmpty()){
            int val = stack.pop();
            System.out.println(val);
        }
    }
}
