package com.ece.sad;

public class BidderThree extends Bidder {
    public BidderThree(Auctioneer auctioneer) {
        super(auctioneer);
        this.auctioneer.attach(this);
    }

    @Override
    void update() {
        System.out.println("Bidder Three update new bid: " + this.auctioneer.getMaxBid());
    }
}
