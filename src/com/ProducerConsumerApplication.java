package com.jfk.croducerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerApplication {

    public static void main(String[] args) throws InterruptedException {
        Thread[] producers = new Thread[3];
        Thread[] consumers = new Thread[3];
        Queue<Integer> store = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            producers[i] = new Thread(new Producer(store));
            consumers[i] = new Thread(new Consumer(store));
        }

        for (int i = 0; i < 3; i++) {
            producers[i].start();
            consumers[i].start();
        }

        for (int i = 0; i < 3; i++) {
            producers[i].join();
            consumers[i].join();
        }
    }
}
