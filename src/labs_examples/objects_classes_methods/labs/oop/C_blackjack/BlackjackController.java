package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class BlackjackController {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("Welcome to BlackJack!");

        deck.populate();
//        deck.deal();

    }
}
