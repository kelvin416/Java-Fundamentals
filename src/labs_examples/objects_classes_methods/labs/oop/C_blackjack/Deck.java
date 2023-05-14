package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    Card[] cards;
    ArrayList<Integer> usedCards;
    String[] suits = {"Spades", "Hearts", "Diamonds", "Flowers"};
    String[] faces = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};


    public Deck() {
        cards = new Card[52];
        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < faces.length; j++) {
                cards[index++] = new Card(i, j);
            }
        }
    }

    //Shuffling the deck
    public void shuffle(){
        Random random = new Random();

        for (Card c : cards) {
            int x = random.nextInt(52);
            Card temp = c;
            c = cards[x];
            cards[x] = temp;
        }
    }



}
