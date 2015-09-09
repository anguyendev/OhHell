package com.skillzdatkillz.ohhell.interfaces;

import com.skillzdatkillz.ohhell.models.Card;

import java.util.List;

/**
 * Created by Amanda on 9/8/2015.
 */
public interface IPlayer {

    String getName();
    void setName(String name);
    void playCard(Card card);

}
