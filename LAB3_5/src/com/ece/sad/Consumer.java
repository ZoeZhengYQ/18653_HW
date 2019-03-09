package com.ece.sad;

public class Consumer extends Thread {
    private int id;
    private Mediator mediator;

    static int count = 1;
    static Object consumerLock = new Object();

    public Consumer(Mediator mediator) {
        this.mediator = mediator;
        id = count++;
    }

    @Override
    public void run() {
        int num;
        while (true) {
            synchronized (consumerLock) {
                if (mediator.isSlotFull()) {
                    num = mediator.retrieveNum(id);
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
