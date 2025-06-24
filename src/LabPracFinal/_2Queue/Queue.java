package LabPracFinal._2Queue;

import LabPrac._2Queue.QueueUnderFlowException;

public class Queue{
    int [] queue;
    int cap , front , rear;

    public Queue(int cap){
        if (cap <= 0){
            System.err.println("cap can't be less than 0");
        }
        this.cap = cap;
        this.front = 0;
        this.rear = 0;
        this.queue = new int[cap];
    }

    public void Enqueue(int item){
        if(isFull()){
            throw new QueueUnderFlowException("Queue is full");
        }
        queue[++rear] = item;
        System.out.println("Enqueue " + item);
    }

    public void Dequeue(){
        if(isEmpty()){
            throw new QueueUnderFlowException("Queue is empty");
        }
        int item = queue[front++];
        System.out.println("Dequeue " + item);
    }

    public boolean isEmpty(){
        return front > rear;
    }
    public boolean isFull(){
        return rear == cap - 1 ;
    }

    public void disp(){
        if(isEmpty()){
            throw new QueueUnderFlowException("Queue is empty");
        }
        System.out.println("Queue elements are:");
        for (int i = front ; i <= rear ; i++){
            System.out.println(queue[i]);
        }
        System.out.println("---End of Queue---");
    }


    public static void main(String[] args) {
        System.out.println("###Queue Operations###");
        Queue Q = new Queue(5);
        try {
            Q.Enqueue(1);
            Q.Enqueue(2);
            Q.Enqueue(3);
            Q.Enqueue(4);
            Q.Enqueue(5);
            Q.Enqueue(6);
            Q.disp();
            Q.Dequeue();
            Q.disp();
        }catch(Exception e){
            System.err.println("ERROR:"+e.getMessage());
        }



    }
}