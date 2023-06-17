package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    Player player = new Player();
    Card[] cards;
    Random random = new Random();
    int count = 0;//The number of cards generated.
    ArrayList<Integer> usedCards;
    String[] cardFaces = {"Aces", "Deuces", "Threes", "Fours", "Fives", "Sixes", "Sevens", "Eights", "Nines", "Tens", "Jacks", "Queens", "Kings"};

    public Deck() {
    }

    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public void populate(){
        cards = new Card[4];
        for (int i = 0; i < cardFaces.length; i++){
            for (int j = 0; j < cards.length; j++){
                int countInner = 0;
                System.out.println(cards[j] + " " + cardFaces[i]);
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
