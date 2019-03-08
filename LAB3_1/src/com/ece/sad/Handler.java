package com.ece.sad;

public class Handler {
    private static java.util.Random staff_randomNumber = new java.util.Random();
    private int staff_id;

    private Handler nextHandler;

    public Handler(int staff_id) {
        this.staff_id = staff_id;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void passRequest(int requestID) {
        if (staff_randomNumber.nextInt(4) == 0) {
            handleRequest(requestID);
        } else {
            System.out.print(staff_id + "-is busy  ");
            nextHandler.passRequest(requestID);
        }
    }

    private void handleRequest(int requestID) {
        System.out.println(staff_id + "-has handled-" + requestID);
    }
}
