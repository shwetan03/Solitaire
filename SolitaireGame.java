package com.company;

import java.util.*;

public class SolitaireGame {
    private ArrayList<Card> deck;
    private CardList cardPile;

    public SolitaireGame()
    {
        this.deck = makeDeck();
        this.cardPile = makeCardPile();
    }

    public static ArrayList<Card> makeDeck()
    {
        String[] suits = {"hearts", "diamonds", "spades", "clubs"};
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        ArrayList<Card> deck = new ArrayList<>();

        for (int i = 0; i < suits.length; i++)
        {
            for (int j = 0; j < numbers.length; j++)
            {
                deck.add(new Card(suits[i], numbers[j]));
            }
        }

        Collections.shuffle(deck);

        return deck;
    }

    public CardList makeCardPile() {
        CardList cardPile = new CardList();
        for (int i = 0; i < 24; i++)
        {
            Card a = deck.remove(0);
            cardPile.add(a);
        }
        return cardPile;
    }

    public ArrayList<Card> getDeck()
    {
        return deck;
    }
}
