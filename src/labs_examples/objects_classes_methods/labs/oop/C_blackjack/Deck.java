package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    Player player = new Player();
    Card[] card;
    ArrayList<Card> cards1;
    Card cards;
    Random random = new Random();
    int count = 0;//The number of cards generated.
    ArrayList<Integer> usedCards;

    public Deck() {
    }

    public Deck(Card cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public void populate(){
        cards1 = new ArrayList<Card>();
        cards = new Card();
        for (int i = 0; i < cards.getFaces().length; i++){
            for (int j = 0; j < cards.getSuit().length; j++){
                int countInner = 0;
                System.out.println(cards.getSuit()[j] + " " + cards.getFaces()[i]);
//                cards1.add(cards.getSuit()[j], cards.getFaces()[i]);
//                System.out.println(cards1);
                countInner++;
                count += countInner;

            }
        }
        System.out.println(count + " Deck");
    }

    public void deal(){
        int randomCard = random.nextInt(count);
        while (randomCard <= 52){

        }
        System.out.println(randomCard);

    }

}
