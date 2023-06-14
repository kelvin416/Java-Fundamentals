package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    //This POJO contains card data
//    char[] suit = {'♠', '♦', '♥', '♣'};
    String[] suit = {"♠", "♦", "♥", "♣"};
    int cardValue;

    public Card() {
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

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }
}
