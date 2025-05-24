package Test;

import java.time.Duration;

public class ThreadLifecycleMain {
    public static void main(String[] args) throws InterruptedException {
        // Define a new thread with a simple task
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread is running...");
                Thread.sleep(1000); // simulate work
                System.out.println("Thread finished.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Before starting, the state is: " + thread.getState());
        System.out.println("Is alive: " + thread.isAlive());

        thread.start();
        System.out.println("After starting, the state is: " + thread.getState());

        Thread.sleep(500); // give time while thread is sleeping
        System.out.println("During thread execution, the state is: " + thread.getState());

        thread.join(); // wait for thread to finish
        System.out.println("After thread has finished, the state is: " + thread.getState());

        thread.join(Duration.ofMinutes(5));
        System.out.println("After thread has finished, the state is: " + thread.getState());
    }
}
