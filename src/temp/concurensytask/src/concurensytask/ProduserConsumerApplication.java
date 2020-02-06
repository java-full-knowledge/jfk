package concurensytask;

import concurensytask.applicationobject.Consumer;
import concurensytask.applicationobject.Producer;
import concurensytask.myqueue.MyLinkedList;

import java.util.Queue;
/**
 * Arman Torosyan
 */

public class ProduserConsumerApplication {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[6];
        Queue<Integer> resource = new MyLinkedList<>();
        for (int i = 0; i < 3; i++) {
            threads[i] = new Thread(new Producer(resource));
        }
        for (int i = 3; i < 6; i++) {
            threads[i] = new Thread(new Consumer(resource));
        }
        for (int i = 0; i < 6; i++) {
            threads[i].start();
        }
        for (int i = 0; i < 6; i++) {
            threads[i].join();
        }

    }
}
