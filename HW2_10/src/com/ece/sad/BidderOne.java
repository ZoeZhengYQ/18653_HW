package com.ece.sad;

public class BidderOne extends Bidder {
    public BidderOne(Auctioneer auctioneer) {
        super(auctioneer);
        this.auctioneer.attach(this);
    }

    @Override
    void update() {
        System.out.println("Bidder One update new bid: " + this.auctioneer.getMaxBid());
    }
}
