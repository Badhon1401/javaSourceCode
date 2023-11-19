package JavaSourceCode;

public class ThreadExample {

    public static void main(String[] args) {
        // Creating two threads
        Thread thread1 = new Thread(new CounterRunnable("Thread 1"));
        Thread thread2 = new Thread(new CounterRunnable("Thread 2"));

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}

class CounterRunnable implements Runnable {
    private String threadName;

    public CounterRunnable(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + ": " + i);

                // Sleep for a random time between 0 and 500 milliseconds
                Thread.sleep((long) (Math.random() * 500));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(threadName + " finished.");
    }
}
