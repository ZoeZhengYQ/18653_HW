package com.ece.sad;

import java.util.List;

public class Broker {

    public void processRequest(List<Jobs> list) {
        for (Jobs jobs : list) {
            jobs.doJob();
        }
    }
}
