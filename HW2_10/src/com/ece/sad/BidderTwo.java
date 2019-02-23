package com.ece.sad;

public class BidderTwo extends Bidder {
    public BidderTwo(Auctioneer auctioneer) {
        super(auctioneer);
        this.auctioneer.attach(this);
    }

    @Override
    void update() {
        System.out.println("Bidder Two update new bid: " + this.auctioneer.getMaxBid());
    }
}
