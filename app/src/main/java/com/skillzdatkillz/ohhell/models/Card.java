package com.skillzdatkillz.ohhell.models;

import com.skillzdatkillz.ohhell.enums.Suit;
import com.skillzdatkillz.ohhell.enums.Value;
import com.skillzdatkillz.ohhell.interfaces.ICard;

/**
 * Created by Amanda on 9/8/2015.
 */
public class Card implements ICard {

    private Suit mSuit;
    private Value mValue;

    public Card(Suit suit, Value value){
        mSuit = suit;
        mValue = value;
    }

    @Override
    public Suit getSuit() {
        return mSuit;
    }

    @Override
    public Value getValue() {
        return mValue;
    }
}
