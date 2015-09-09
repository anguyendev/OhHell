package com.skillzdatkillz.ohhell.models;

import com.skillzdatkillz.ohhell.enums.Suit;
import com.skillzdatkillz.ohhell.enums.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Amanda on 9/8/2015.
 */
public class StandardDeck{

    private List<Card> mDeck = new ArrayList<>();

    public StandardDeck(){
        mDeck.clear();
        for(Suit suit : Suit.values()) {
            for(Value value : Value.values()) {
                mDeck.add(new Card(suit, value));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(mDeck);
    }

    public Card getNextCard(){
        if(!mDeck.isEmpty()) {
            return mDeck.remove(0);
        }
        return null;
    }

    public int getNumCardsRemaining(){
        return mDeck.size();
    }
}
