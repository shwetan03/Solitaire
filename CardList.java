package com.company;

public class CardList
{
    private CardListNode head;
    private CardListNode tail;

    public CardListNode getHead()
    {
        return head;
    }

    public CardListNode getTail()
    {
        return tail;
    }
    
    public void add(Card card) {
        if (head == null) {
            head = new CardListNode(card);
            tail = head;
            head.setNext(head);

        } else {
            tail.setNext(new CardListNode(card, head));
            tail = tail.getNext();
        }
    }
}
