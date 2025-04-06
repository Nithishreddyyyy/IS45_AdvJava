package Lab._3;

import java.util.Scanner;

class Queue{
    static int MAX = 5;
    int [] qu;
    int front , rear;

    public Queue(){
        qu = new int [MAX];
        front = 0;
        rear = -1;
    }
    public boolean isEmpty(){
        return front>rear;
    }
    public boolean isFull(){
        return rear == MAX - 1;
    }
    public void enqueue(int item){
        if(isFull()){
            throw new ArrayIndexOutOfBoundsException("Queue over flow");
        }
        else{
            qu[++rear] = item;
            System.out.println("Inserted element: "+item);
        }
    }
    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue Underflow");
        }
        else{
            return qu[front++];
        }
    }
    public void disp(){
        if(isEmpty()){
            throw new IllegalStateException("Queue Underflow");
        }
        for (int i = front ; i<=rear ; i++){
            System.out.print(qu[i]+"\t");
        }
        System.out.println("\n");
    }
}
class QueueOP{
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner S = new Scanner(System.in);

        while(true){
            System.out.println("The following operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Choose the operations:");
            int choice = S.nextInt();
            try{
                switch(choice){
                    case 1:
                        System.out.println("Enter element : ");
                        int ele = S.nextInt();
                        queue.enqueue(ele);
                        break;
                    case 2:
                        int rm = queue.dequeue();
                        System.out.println(rm+"Has been removed");
                        break;
                    case 3:
                        queue.disp();
                        break;
                    case 4:
                        System.out.println("Terminating the program");
                        System.exit(1);
                    default:
                        System.out.println("Try again");
                }
            }catch(IllegalStateException e){
                System.out.println(e.getMessage());
            }
        }
    }
}