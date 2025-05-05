package operatingThread;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        try {
            Thread.sleep(1000); // Pause for 1 second (1000 ms)
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        t1.start();
    }
}
