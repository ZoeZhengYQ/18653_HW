package com.ece.sad;

public class NormalUser implements User{
    private final boolean IS_NORMAL_USER = false;

    @Override
    public boolean isEligible() {
        return IS_NORMAL_USER;
    }
}
