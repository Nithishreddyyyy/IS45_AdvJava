package LabPrac.Try;
import java.util.*;

class Stack<T>{
    ArrayList<T> elements;

    public Stack(){
        elements = new ArrayList<>();
    }
    public void push(T item){
        elements.add(item);
        System.out.println("Pushed "+item+" to stack");
    }
    public T pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return elements.remove(elements.size()-1);
    }

    public void clear(){
        elements.clear();
        System.out.println("Cleared stack");
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack contents:");
        for (int i = elements.size()-1 ; i >= 0 ; i-- ){
            System.out.println(elements.get(i));
        }
    }
}


public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> intStk = new Stack<>();
        intStk.push(1);
        intStk.push(2);
        intStk.push(3);
        intStk.display();
        intStk.pop();
        intStk.display();
        intStk.clear();

        Stack<String> strStack = new Stack<>();
        strStack.push("Hello");
        strStack.push("World");
        strStack.push("Java");
        strStack.push("Python");
        strStack.display();
        strStack.pop();
        strStack.pop();
        strStack.display();
        strStack.clear();
        System.out.println("End of Program");

    }
}
