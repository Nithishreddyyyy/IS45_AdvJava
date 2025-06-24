package Test;

class TT extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Testing");
        }
    }
}

public class TryThread {
    public static void main(String[] args) {
        Runnable obj = new TT();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}