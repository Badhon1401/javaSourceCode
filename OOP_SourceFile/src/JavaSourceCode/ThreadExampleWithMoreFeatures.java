package JavaSourceCode;

public class ThreadExampleWithMoreFeatures {

    public static void main(String[] args) {
        // Creating two threads with different features
        Thread threadD = new Thread(new ThreadD(), "ThreadD");
        Thread threadE = new Thread(new ThreadE(), "ThreadE");

        // Setting thread priorities
        threadD.setPriority(Thread.MIN_PRIORITY); // Minimum priority
        threadE.setPriority(Thread.MAX_PRIORITY); // Maximum priority

        // Starting the threads
        threadD.start();
        threadE.start();

        // Sleeping to allow threads to run
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupting threadD
        threadD.interrupt();

        // Waiting for both threads to finish
        try {
            threadD.join();
            threadE.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadD implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running with priority "
                + Thread.currentThread().getPriority());

        // Checking if the thread is alive
        System.out.println(Thread.currentThread().getName() + " is alive: " + Thread.currentThread().isAlive());

        // Performing a time-consuming task
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is working...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Handle interruption by breaking out of the loop
                System.out.println(Thread.currentThread().getName() + " was interrupted.");
                break;
            }
        }

        System.out.println(Thread.currentThread().getName() + " has finished.");
    }
}

class ThreadE implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running with priority "
                + Thread.currentThread().getPriority());

        // Performing a task with interruption points
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is working...");
            if (i == 2) {
                // Interrupting itself
                Thread.currentThread().interrupt();
            }
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted.");
                // Restore the interrupted status and continue
                Thread.currentThread().interrupt();
            }
        }

        System.out.println(Thread.currentThread().getName() + " has finished.");
    }
}
