package collections;
import java.util.*;

class Stack{
    static int Max=5;
    int [] st;
    int top;

    public Stack(){
        st = new int [Max];
        top = -1;
    }

    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==Max-1;
    }
    public void Push(int ele){
        if(isFull()){
            throw new IllegalStateException("Overflow");
        }
        else{
            st[++top] = ele;
            System.out.println("Ele pushed");
        }
    }
    public void Pop(){
        if(isEmpty()){
            System.out.println("underflow");
        }else{
            System.out.println("Poped"+st[top--]);
        }
    }
    public void Disp(){
        if(isEmpty()){
            System.out.println("Underflow");
        }
        else{
            for(int i = top ; i>=0;i--){
                System.out.print(st[i]+"\t");
            }
            System.out.println(" ");
        }
    }
}

class StkOP{
    public static void main(String[] args) {
        Stack stk = new Stack();
        Scanner S = new Scanner(System.in);

        while(true){
            System.out.println("Operations:");
            System.out.println("Choose:");
            int choice = S.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the element to Push: ");
                    int ele = S.nextInt();
                    stk.Push(ele);
                    break;
                case 2:
                    stk.Pop();
                    break;
                case 3:
                    stk.Disp();
                    break;
                case 4:
                    System.exit(1);
            }
        }
    }
}