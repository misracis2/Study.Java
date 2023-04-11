package data_structure;

import java.util.Arrays;

public class MyStack {

    int top;
    int[] stack;

    public MyStack() {
        top = 0;
        stack = new int[1];
    }

    public MyStack(int size) {
        top = 0;
        stack = new int[size];
    }

    public void push(int data) {
        if(isFull()){
            stack = Arrays.copyOf(stack, stack.length + 1);
        }
        stack[top] = data;
        top++;
    }

    public int pop(){
        int obj = peek();
        stack[--top] = 0;
        return obj;
    }

    public int peek(){
        if(isEmpty()){
            throw new IllegalArgumentException("stack is empty");
        }
        return stack[top-1];
    }

    private boolean isEmpty(){
        return top == 0;
    }
    private boolean isFull(){
        return top >= stack.length;
    }

    public int size(){
        return stack.length;
    }

}
