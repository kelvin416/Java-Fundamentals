package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    //This POJO contains card data
    private char[] suit = {'♠', '♦', '♥', '♣'};
    private String[] faces = {null, "Aces", "Deuces", "Threes", "Fours", "Fives", "Sixes", "Sevens", "Eights", "Nines", "Tens", "Jacks", "Queens", "Kings"};
    int cardValue;
    String s = faces[];

    public Card() {
    }

    public Card(char[] suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public char[] getSuit() {
        for (char card : suit) {
        }
        return suit;
    }

    public void setSuit(char[] suit) {
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
}
