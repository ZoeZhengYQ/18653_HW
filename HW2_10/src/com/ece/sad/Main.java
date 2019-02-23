package com.ece.sad;

public class Main {

    public static void main(String[] args) {
        Auctioneer auctioneer = new Auctioneer();
	    Bidder one = new BidderOne(auctioneer);
	    Bidder two = new BidderTwo(auctioneer);
	    Bidder three = new BidderThree(auctioneer);

	    one.bid(10);
	    auctioneer.broadcastMaxBid();

	    System.out.println(" ");
	    two.bid(50);
	    auctioneer.broadcastMaxBid();

		System.out.println(" ");
	    three.bid(40);
	    auctioneer.broadcastMaxBid();
    }
}
