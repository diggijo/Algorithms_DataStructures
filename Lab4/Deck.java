package Lab4;

class Deck {
    private Card[] cards = new Card[52];
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    int[] values = {1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public Deck()
    {
        for(int i = 0; i < values.length; i++)
        {
            for (int j = 0; j < suits.length; j++)
            {
                cards[suits.length*i + j] = new Card(values[i], suits[j]);
            }
        }
    }

    public void shuffle()
    {
        for (int i = 0; i < 52; i++)
        {
            int r = i + (int) (Math.random() * (52-i));
            Card temp = cards[r];
            cards[r] = cards[i];
            cards[i] = temp;
        }
    }

    public void printDeck()
    {
        for (int i = 0; i < 52; i++)
        {
            System.out.println(cards[i]);
        }
    }
}
