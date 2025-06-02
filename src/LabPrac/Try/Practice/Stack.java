package LabPrac.Try.Practice;

import java.util.ArrayList;

public class Stack <T>{
    ArrayList<T> elements;
    public Stack(){
        elements = new ArrayList<>();
    }
    public void push(T item){
        elements.add(item);
        System.out.println("Pushed "+item+" to stack");
    }
    public void pop(){
        if(elements.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        T ele = elements.removeLast();
        System.out.println("Popped from stack: "+ele);
    }

    public void display(){
        if (elements.isEmpty()) {
            System.err.println("Stack is empty");
        }else {
            System.out.println(elements.size());
            for(int i = elements.size() - 1 ; i >= 0 ; i--){
                System.out.println(elements.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();

        Stack<String> stackk = new Stack<>();
        stackk.push("h");
        stackk.push("e");
        stackk.push("d");
        stackk.display();

    }
}
