package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Arrays;

public class Card {
    private String[] suit = {"♠", "♦", "♥", "♣"};
    private String[] faces = {null, "Aces", "Deuces", "Threes", "Fours", "Fives", "Sixes", "Sevens", "Eights", "Nines", "Tens", "Jacks", "Queens", "Kings"};
    //This POJO contains card data
    private int cardValue;
    private int cardSuit;


    String s = faces[cardValue] + " of " + suit[cardSuit];
    public Card() {
    }

    public Card(int cardValue, int cardSuit) {
        this.cardValue = cardValue;
        this.cardSuit = cardSuit;
    }

    public Card(String[] suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public String[] getSuit() {
        for (String card : suit) {
        }
        return suit;
    }

    public void setSuit(String[] suit) {
        this.suit = suit;
    }

    public String[] getFaces(){
        for (String face : faces) {
        }
        return faces;
    }

    public void setFaces(String[] faces) {
        this.faces = faces;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    @Override
    public String toString() {
        return suit[this.cardSuit] + "of" + faces[this.cardValue];
    }
}
