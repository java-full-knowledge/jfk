package concurensytask.applicationobject;

import concurensytask.more.Access;

import java.util.Queue;

/**
 * Arman Torosyan
 */

public class Consumer implements Runnable {
    private final Queue<Integer> store;

    public Consumer(Queue<Integer> store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (store) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (store.size() == 0) {
                    Access.setFalse();
                    System.out.println();
                }
                if (Access.isAccess()) {
                    System.out.println("Is the output element " + store.poll() + ",to work " + Thread.currentThread().getName());
                    store.notify();
                }
                try {
                    store.wait(0, 100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
