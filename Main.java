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
}

class SolitaireGame {
    public static ArrayList<Card> makeDeck()
    {
        String[] suits = {"heart", "diamond", "spade", "clubs"};
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
        
        ArrayList<Card> deck = new ArrayList<>();

        for (int i = 0; i < suits.length; i++)
        {
            for (int j = 0; j < numbers.length; j++)
            {
                deck.add(new Card(suits[i], numbers[j]));
            }
        }
        
        return deck;
    }
}
