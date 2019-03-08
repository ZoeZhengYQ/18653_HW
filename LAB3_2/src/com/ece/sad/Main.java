package com.ece.sad;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Jobs> queue = produceRequests();
        workOffRequest(queue);
    }

    private static List<Jobs> produceRequests() {
        List<Jobs> request = new ArrayList<>();
        request.add(new DomesticEngineer());
        request.add(new Politician());
        request.add(new SoftwareEngineer());

        return request;
    }

    private static void workOffRequest(List<Jobs> list) {
        Broker broker = new Broker();
        broker.processRequest(list);
    }
}
