public class Action {
    ArrayList<Pile> piles;
    ArrayList<Pile> finalPiles;
    Pile drawPile, getPile;
    public final int pileNumber = 7
    public Deck deck;

    public Action () {
        resetCards();
    }

    public void resetCards () {
        deck = new Deck();
        deck.shuffle();

        drawPile = newPile (120);
        drawPile.setOffset(0);

        finalPiles = new ArrayList<Pile>();
        piles = new ArrayList<Pile> ();

        allPiles = new ArrayList<Pile>();
        allPiles.add(drawPile);
        allPiles.add(getPile);
    }

    public void setupGame () {
        drawPile.type = PileType.Draw;
        getPile.type = PileType.Get;

        for (int i = 1; i <= pileNumber; ++i) {
            Pile p = new Pile (120);

            for (int j = 1; j <= i; ++j) {
                Card card = deck.drawCard ();
                p.addCard (card);

                if (j!=i)
                    card.hide();
                else
                    card.show();
            }

            piles.add(p);
            allPiles.add(p);
        }

        for (Suit suit : Suit.values()) {
            Pile p = new Pile(100);
            p.setOffset(0);
            p.type = PileType.Final;
            finalPiles.add(p);
            allPiles.add(p);
        }

        while (deck.size () > 0) {
            Card card = deck.drawCard();
            card.hide();
            drawPile.addCard(card);
        }
    }

    public void drawCard() {
        if (!drawPile.cards.isEmpty()) {
            Card drew = drawPile.drawCard();
            drew.isReversed = false;
            getPile.addCard(drew);
        }
    }

    public void clickPile (Pile p) {
        if (!p.cards.isEmpty()) {
            Card c = p.card.get(p.cards.size() - 1);
            if (c.isReversed) {
                c.isReversed = false;
            }
        }
    }

    public void turnGetPile () {
        if (!drawPile.cards.isEmpty()) return;

        while (!getPile.cards.isEmpty()) {
            Card c = getPile.drawCard();
            c.isReversed = true;
            
            drawPile.addCard(c);
        }
    }

    public boolean checkCorrect () {
        for (Pile p : finalPiles) {
            if (p.cards.size() != 13)
                return false;
        }

        return true;
    }
}
