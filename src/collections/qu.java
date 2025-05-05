package collections;
import java.util.*;

class Queue{
    LinkedList<Integer> queue;

    Queue(){
        queue = new LinkedList<>();
    }
    public void add(int ele){
        queue.addLast(ele);
        System.out.println("Added");
    }
    public void remove(){
        if(queue.isEmpty()){
            System.out.println("Underfflow");
        }
        else {
            int rm = queue.removeFirst();
            System.out.println("Ele removeed: "+rm);
        }
    }
    public void disp(){
        if(queue.isEmpty()){
            System.out.println("Emptyu");
        }
        else{
            System.out.println("queue:"+queue);
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.remove();
        q.disp();
        q.remove();
    }
}