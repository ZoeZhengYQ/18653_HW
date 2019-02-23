package com.ece.sad;

public abstract class Bidder {
    protected Auctioneer auctioneer;

    Bidder(Auctioneer auctioneer) {
        this.auctioneer = auctioneer;
    }

    protected void bid(int amount) {
        auctioneer.setMaxBid(amount);
    }

    abstract void update();
}
