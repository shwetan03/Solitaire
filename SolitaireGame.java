package com.company;

import java.util.*;

public class SolitaireGame {
    private ArrayList<Card> deck;
    private CardList cardPile;
    private ArrayList<Stack<Card>> cardStacks;

    public SolitaireGame()
    {
        this.deck = makeDeck();
        this.cardPile = makeCardPile();
        this.cardStacks = makeCardStacks();
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

    public ArrayList<Stack<Card>> makeCardStacks() {
        ArrayList<Stack<Card>> cardStacks = new ArrayList<>();
        for (int i = 0; i < 7; i++)
        {
            cardStacks.add(new Stack<>());
        }

        for (int i = 0; i < deck.size(); i++)
        {
            if (i == 0) {
                cardStacks.get(0).push(deck.get(i));
            } else if (i < 3) {
                cardStacks.get(1).push(deck.get(i));
            } else if (i < 6) {
                cardStacks.get(2).push(deck.get(i));
            } else if (i < 10) {
                cardStacks.get(3).push(deck.get(i));
            } else if (i < 15) {
                cardStacks.get(4).push(deck.get(i));
            } else if (i < 21) {
                cardStacks.get(5).push(deck.get(i));
            } else {
                cardStacks.get(6).push(deck.get(i));
            }
        }
        return cardStacks;
    }
    
    public ArrayList<Card> showTopCards() {
        ArrayList<Card> topCards = new ArrayList<>();
        for (int i = 0; i < cardStacks.size(); i++)
        {
            topCards.add(cardStacks.get(i).peek());
            System.out.println(cardStacks.get(i).peek().getNumber() + " " + cardStacks.get(i).peek().getSuit());
        }
        return topCards;
    }

    public ArrayList<Card> getDeck()
    {
        return deck;
    }

    public CardList getCardPile()
    {
        return cardPile;
    }

    public ArrayList<Stack<Card>> getCardStacks()
    {
        return cardStacks;
    }
}
