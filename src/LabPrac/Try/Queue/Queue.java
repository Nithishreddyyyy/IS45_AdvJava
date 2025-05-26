package LabPrac.Try.Queue;

class QueueOverFlowException extends Exception{
    public QueueOverFlowException(){
        super("Queue overflow");
    }
}

class QueueUnderFlowException extends Exception{
    public QueueUnderFlowException(){
        super("Queue underflow");
    }
}

public class Queue {

    int [] queue;
    int front , rear , capacity;

    public Queue(int capacity){
        this.queue = new int [capacity];
        this.capacity = capacity;
        this.front = 0;
        this.rear = -1;
    }

    public void Enqueue(int item) throws QueueOverFlowException {
        if(isFull()){
            throw new QueueOverFlowException();
        }
        queue[++rear] = item;
        System.out.println("Enqueue " + item);
    }

    public void Dequeue() throws QueueUnderFlowException{
        if(isEmpty()){
            throw new QueueUnderFlowException();
        }
        System.out.println("Dequeued: "+ queue[front++]);
    }
    boolean isEmpty(){
        return front > rear;
    }
    boolean isFull(){
        return rear == capacity-1;
    }

    public void Displ() throws QueueUnderFlowException{
        if(isEmpty()){
            throw new QueueUnderFlowException();
        }
        for (int i = front; i <= rear ; i++){
            System.out.println(queue[i] + "\t");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        System.out.println("-----Queue operations----");

        Queue Q = new Queue(2);
        try{
            Q.Enqueue(10);
            Q.Enqueue(20);
            Q.Enqueue(30);
            Q.Enqueue(40);
            Q.Displ();
            Q.Dequeue();
            Q.Dequeue();
            Q.Dequeue();
            Q.Dequeue();
            Q.Displ();


        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }


}
