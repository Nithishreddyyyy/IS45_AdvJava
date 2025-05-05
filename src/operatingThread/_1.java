package operatingThread;

class first extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        first t1 = new first();
        t1.start();

    }
}
