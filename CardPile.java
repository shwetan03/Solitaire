package com.company;

import java.util.*;

public class CardPile {
    private ArrayList<Card> deck;
    private Stack<Card> cardStack;

    public CardPile(ArrayList<Card> deck)
    {
        this.deck = deck;
        this.cardStack = deal();
    }

    public Stack<Card> deal() {
        Stack<Card> cardStack = new Stack<>();

        for (int i = 0; i < (52-28); i++)
        {
            cardStack.push(deck.get(i));
        }
        return cardStack;
    }
}
