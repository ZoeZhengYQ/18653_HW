package com.ece.sad;

public class Main {
    public static int HANDLER_1 = 1;
    public static int HANDLER_2 = 2;
    public static int HANDLER_3 = 3;
    public static int HANDLER_4 = 4;

    public static void main(String[] args) {
        Handler head = initializeHandler();

        for (int i = 1; i <= 9; ++i) {
            head.passRequest(i);
        }
    }

    private static Handler initializeHandler() {
        Handler handler1 = new Handler(HANDLER_1);
        Handler handler2 = new Handler(HANDLER_2);
        Handler handler3 = new Handler(HANDLER_3);
        Handler handler4 = new Handler(HANDLER_4);

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        handler3.setNextHandler(handler4);
        handler4.setNextHandler(handler1);

        return handler1;
    }
}
