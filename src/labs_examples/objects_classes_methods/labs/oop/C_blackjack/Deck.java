package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    Player player = new Player();
    Hand playersHand = new Hand();
    Card[] card;
    Card cards;
    Random randomCard = new Random();
    int count = 0;//The number of cards generated.
    ArrayList<Integer> usedCards;
    ArrayList<String> cardList = new ArrayList<>();

    public Deck() {
    }

    public Deck(Card cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public void populate(){
        cards = new Card();
        for (int i = 0; i < cards.getFaces().length; i++){
            for (int j = 0; j < cards.getSuit().length; j++){
                int countInner = 0;
                cardList.add(cards.getSuit()[j] + " " + cards.getFaces()[i]);
                countInner++;
                count += countInner;

            }
        }
        System.out.println(count + " Deck of Cards are: ");
        for (String cards : cardList) {
//            System.out.println(cards);
        }
    }

    public void deal(){
        //shuffle the cards in beginning of method.
        Collections.shuffle(cardList);
        for (int i = 0; i < cardList.size(); i++){
            int randomCard = (int) Math.random() * cardList.size();
            if (cardList.equals(usedCards)){
                deal();
            } else {
//                card = new Card[52];
//                card.equals(cardList);
//                System.out.println(card.toString());
                System.out.println("Random Card is: " + cardList.get(randomCard));
            }
            //once a card is attained we break the loop.
            break;
        }
    }

}
