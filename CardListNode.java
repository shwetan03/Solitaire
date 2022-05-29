package com.company;

public class CardListNode {
    private Card card;
    private CardListNode next;

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

    public CardListNode(Card card, CardListNode next)
    {
        this.card = card;
        this.next = next;
    }

    public Card getCard()
    {
        return card;
    }

    public void setCard(Card card)
    {
        this.card = card;
    }

    public CardListNode getNext()
    {
        return next;
    }

    public void setNext(CardListNode next)
    {
        this.next = next;
    }
}
