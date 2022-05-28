package com.company;

public class Main {

    public static void main(String[] args) {
        Panels obj_panel=new Panels();
    }
}

class Card {
    private String suit;
    private String number;

    public Card(String suit, String number)
    {
        this.suit = suit;
        this.number = number;
    }

    public String getSuit()
    {
        return suit;
    }

    public String getNumber()
    {
        return number;
    }
}

class SolitaireGame {
    private ArrayList<Card> deck;

    public SolitaireGame()
    {
        this.deck = makeDeck();
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

    public ArrayList<Card> getDeck()
    {
        return deck;
    }
}
