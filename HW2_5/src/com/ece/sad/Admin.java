package com.ece.sad;

public class Admin implements User{
    private final boolean IS_ADMIN = true;

    @Override
    public boolean isEligible() {
        return IS_ADMIN;
    }

}
