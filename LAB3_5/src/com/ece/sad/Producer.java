package com.ece.sad;

import java.util.Random;

public class Producer extends Thread {
    private int id;
    private Mediator mediator;
    private Random rand = new Random();

    static int count = 1;
    static Object producerLock = new Object();

    public Producer(Mediator mediator) {
        this.mediator = mediator;
        id = count++;
    }

    @Override
    public void run() {
        int num;
        while (true) {
            synchronized (producerLock) {
                if (!mediator.isSlotFull()) {
                    num = rand.nextInt(100);
                    mediator.storeNum(num, id);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
