package com.ece.sad;

public class BigDataProcessor extends ProcessBigData {
    @Override
    void receiveData() {
        System.out.println("Data has been received.");
    }

    @Override
    void analyzeData() {
        System.out.println("Analyzing data...");
    }

    @Override
    void gainInsight() {
        System.out.println("Gaining insight from data...");
    }

    @Override
    void makeDecision() {
        System.out.println("Decision has been made.");
    }
}
