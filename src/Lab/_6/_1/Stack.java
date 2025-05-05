package Lab._6._1;

public class Stack<T> {
    public int maxSize;
    public T[] stackArray;
    public int top;

    public Stack(int size){
        this.maxSize = size;
        stackArray = (T[]) new Object[maxSize];
        top = -1;
    }

    public void push(T item){
        if(top == maxSize - 1){
            System.out.println("Stack is fail.... Can't Push"+item);;
        }else{
            stackArray[++top] = item;
        }
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public T pop(){
        if(isEmpty()){
            System.out.println("Stack is empty. Can't pop");
            return null;
        }
        else{
            return stackArray[top-- ];
        }
    }
    public void clear(){
        top = -1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack elements are: ");
            for (int i = top ; i>=0 ; i--){
                System.out.println(stackArray[i]+"\t");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Stack <Integer> intStack = new Stack<>(5);
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.push(40);
        intStack.push(50);
        intStack.display();
        intStack.pop();
        intStack.display();
        intStack.clear();


        //Stack of String
        Stack<String> stringStack = new Stack<>(5);
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("Hello");
        stringStack.display();
        stringStack.pop();
        stringStack.display();
        stringStack.clear();
    }
}
