package com.company;
public enum Suit 
{ 
	CLUBS, DIAMONDS, HEARTS, SPADES; 
  
	public boolean sameColorAs(Suit suit)
	{
		assert suit != null;
		if( this == CLUBS || this == SPADES )
		{
			return suit == CLUBS || suit == SPADES;
		}
		else
		{
			return suit == DIAMONDS || suit == HEARTS;
		}
	}
}
