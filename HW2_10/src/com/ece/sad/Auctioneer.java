package com.ece.sad;

import java.util.ArrayList;
import java.util.List;

public class Auctioneer {
    private List<Bidder> bidderList;
    private int maxBid;
    private boolean bidChange;

    public Auctioneer() {
        this.bidderList = new ArrayList<>();
        this.bidChange = false;
        this.maxBid = 0;
    }

    public int getMaxBid() {
        return maxBid;
    }

    public void setMaxBid(int newBid) {
        if (this.maxBid < newBid) {
            this.maxBid = newBid;
            this.bidChange = true;
        }
    }

    public void attach(Bidder bidder) {
        bidderList.add(bidder);
    }

    public void broadcastMaxBid() {
        if (this.bidChange) {
            for (Bidder b : bidderList) {
                b.update();
            }
        } else {
            System.out.println("Max bid do not change.");
        }
        this.bidChange = false;
    }
}
