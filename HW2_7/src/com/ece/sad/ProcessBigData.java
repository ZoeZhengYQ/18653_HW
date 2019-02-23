package com.ece.sad;

public abstract class ProcessBigData {
    abstract void receiveData();
    abstract void analyzeData();
    abstract void gainInsight();
    abstract void makeDecision();

    public final void processBigData(){
        receiveData();
        analyzeData();
        gainInsight();
        makeDecision();
    }
}
