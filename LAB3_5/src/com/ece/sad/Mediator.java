package com.ece.sad;

public class Mediator {
    private int number;
    private boolean isSlotFull = false;
    static int count = 0;

    public void storeNum(int number, int id) {
        this.number = number;
        System.out.print("p" + id + "-" + number + "   ");
        count++;
        this.isSlotFull = true;
    }

    public int retrieveNum(int id) {
        this.isSlotFull = false;
        System.out.print("c" + id + "-" + number + "   ");
        if (count % 5 == 0)
            System.out.println("");
        return number;
    }

    public boolean isSlotFull() {
        return isSlotFull;
    }
}
