package concurensytask.applicationobject;

import concurensytask.more.Access;

import java.util.Queue;
import java.util.Random;


public class Producer implements Runnable {

    private final Queue<Integer> store;
    Random random = new Random();

    public Producer(Queue<Integer> store) {
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
                if(store.size()==5) {
                    Access.setTrue();
                    System.out.println();
                }
                if (!Access.isAccess()) {
                    int temp=random.nextInt(100);
                    store.add(temp);
                    System.out.println("Is the input element " + temp + ",to work " + Thread.currentThread().getName());
                }
                try {
                    store.wait(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Override
    public String toString() {
        return "Producer{" +
                "store=" + store +
                ", random=" + random +
                '}';
    }
}
