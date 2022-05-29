package com.company;

public class CardListNode {
    private Card card;
    private Card next;

    public CardListNode()
    {
        this.card = null;
        this.next = null;
    }

    public CardListNode(Card card)
    {
        this.card = card;
        this.next = null;
    }
}
