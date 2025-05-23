package LabPrac._2Queue;

public class Queue {
    int [] queue;
    int cap,front,rear,size;

    public Queue(int cap){
        if(cap <= 0){
            throw new IllegalArgumentException("Queue capacity must be greater than 0");
        }
        this.cap = cap;
        this.queue = new int[cap];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void Enqueue(int item){
        if(isFull()){
            throw new QueueOverFlowException("Queue is full");
        }
        queue[++rear] = item;
        size++;
        System.out.println("enqueued" + item);
    }

    public void Dequeue(){
        if(isEmpty()){
            throw new QueueUnderFlowException("Queue is full");
        }
        int item = queue[front--];
        size--;
        System.out.println("dequeued" + item);
    }

    public void display(){
        if(isEmpty()){
            throw new QueueUnderFlowException("Queue is empty");
        }
        System.out.println("Queue elements are:");
        for(int i = 0 ; i <= rear ; i++){
            System.out.println(queue[i]+"\t");
        }
        System.out.println("end of queue");
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == cap;
    }

    public static void main(String[] args) {
        System.out.println("--- Queue operations ---");
        Queue Q = new Queue(5);

        try{
            Q.Enqueue(1);
            Q.Enqueue(2);
            Q.display();
            Q.Dequeue();
            Q.display();
        }catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
}
