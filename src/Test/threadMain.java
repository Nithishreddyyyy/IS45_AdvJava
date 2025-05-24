package Test;
class ThreadClass extends Thread {
    public void run() {
        System.out.println("ThreadClass is running");
    }
}

class RunnableClass implements Runnable {
    public void run() {
        System.out.println("RunnableClass is running");
    }
}

public class threadMain {
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        threadClass.start(); // Start ThreadClass

        RunnableClass run = new RunnableClass();
        Thread thread = new Thread(run); // Corrected variable name
        thread.start(); // Start RunnableClass

        Thread thread1 = new Thread(() -> System.out.println("Lambda thread is running"));
        thread1.start(); // Start lambda thread
    }
}
