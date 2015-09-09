package com.skillzdatkillz.ohhell.interfaces;

import com.skillzdatkillz.ohhell.enums.Suit;
import com.skillzdatkillz.ohhell.models.Player;

/**
 * Created by Amanda on 9/8/2015.
 */
public interface IRound {
    Suit getTrump();
    Player getWinner();
}
