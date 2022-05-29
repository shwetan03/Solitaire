package com.company;

public class Card {
    private String suit;
    private String number;
    private int value;

    public Card(String suit, String number)
    {
        this.suit = suit;
        this.number = number;
        try {
            this.value = Integer.parseInt(this.number);
        } catch (Exception e) {
            if (this.number.equals("A")) {
                this.value = 1;
            } else if (this.number.equals("J")) {
                this.value = 11;
            } else if (this.number.equals("Q")) {
                this.value = 12;
            } else {
                this.value = 13;
            }
        }
    }

    public String getSuit()
    {
        return suit;
    }

    public String getNumber()
    {
        return number;
    }

    public int getValue()
    {
        return value;
    }
}
