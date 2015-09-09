package com.skillzdatkillz.ohhell.models;

import com.skillzdatkillz.ohhell.interfaces.IPlayer;

import java.util.List;

/**
 * Created by Amanda on 9/8/2015.
 */
public class Player implements IPlayer {

    private String mName;
    private List<Card> mHand;

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public void setName(String name) {
        mName = name;
    }

    @Override
    public void playCard(Card card) {

    }
}
