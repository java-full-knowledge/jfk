package com.jfk.croducerconsumer;

import java.util.Queue;

public class Consumer implements Runnable {

    private Queue<Integer> store;

    public Consumer(Queue<Integer> store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (;;)
            System.out.println("Consumer pop element : " + this.store.poll());
    }
}
