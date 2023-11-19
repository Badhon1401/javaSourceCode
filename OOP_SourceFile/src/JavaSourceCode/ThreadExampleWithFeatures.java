package JavaSourceCode;

public class ThreadExampleWithFeatures {

    public static void main(String[] args) {
        // Creating a thread group
        ThreadGroup threadGroup = new ThreadGroup("ExampleThreadGroup");

        // Creating three threads with different features
        Thread threadA = new Thread(threadGroup, new ThreadA(), "ThreadA");
        Thread threadB = new Thread(threadGroup, new ThreadB(), "ThreadB");
        Thread threadC = new Thread(threadGroup, new ThreadC(), "ThreadC");

        // Starting the threads
        threadA.start();
        threadB.start();
        threadC.start();

        // Waiting for all threads to finish using join
        try {
            threadA.join();
            threadB.join();
            threadC.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Displaying information about the threads in the thread group
        threadGroup.list();
    }
}

class ThreadA implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");

        // Using yield to give up the CPU briefly
        Thread.yield();

        System.out.println(Thread.currentThread().getName() + " continues its execution.");

        // Using sleep to pause the thread for a specified time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " has finished.");
    }
}

class ThreadB implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");

        // Using wait and notify to synchronize threads
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " is waiting.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " has been notified.");
        }

        System.out.println(Thread.currentThread().getName() + " has finished.");
    }
}

class ThreadC implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");

        // Using notifyAll to wake up all waiting threads
        synchronized (ThreadB.class) {
            System.out.println(Thread.currentThread().getName() + " is notifying.");
            ThreadB.class.notifyAll();
        }

        System.out.println(Thread.currentThread().getName() + " has finished.");
    }
}
