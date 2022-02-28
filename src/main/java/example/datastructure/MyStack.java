package example.datastructure;

import java.util.Arrays;

public class MyStack {
    private int capacity;
    private int top;
    private Object[] stack;

    public MyStack(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        this.stack = new Object[capacity];
    }

    public void push(Object data) {
        this.stack[++top] = data;
    }

    public Object pop(){
        return stack[top--];
    }

    public Object peek(){
        return stack[top];
    }

    public void display(){
        Arrays.stream(stack).forEach(System.out::println);
    }
}

class MyStackImplementation {
    public static void main(String[] args) {
        MyStack stack = new MyStack(4);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();

        System.out.println("peek : "+stack.peek());
        System.out.println("pop : "+stack.pop());
        stack.push(50);
        System.out.println("peek : "+stack.peek());
        stack.display();
    }
}
