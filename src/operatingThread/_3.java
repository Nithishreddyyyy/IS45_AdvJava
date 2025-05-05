package operatingThread;
// Using runnable interface

class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Thread is running in the runnable class");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        t1.start();
        t2.start();
    }
}