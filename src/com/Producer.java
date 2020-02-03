package com.jfk.croducerconsumer;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable {

    private Random random = new Random();
    private final Queue<Integer> store;

    public Producer(Queue<Integer> store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (;;)
            synchronized (this.store) {
                if (this.store.size() < 5) {
                    this.store.add(this.random.nextInt(100));
                } else {
                    notifyAll();
                    wait();
                }
            }

    }
}
