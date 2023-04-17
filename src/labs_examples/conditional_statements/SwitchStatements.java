package labs_examples.conditional_statements;

public class SwitchStatements {
    public static void main(String[] args) {
        int day = 3;

        switch (day){
            case 0:
                System.out.println("day zero");
                break;
            case 1:
                System.out.println("Day one");
                break;
            case 2:
                System.out.println("Day two");
                break;
            case 3:
                System.out.println("Day three");
                break;
            case 4:
                System.out.println("Day Four");
                break;
            default:
                System.out.println("Default was hit.");
        }

        System.out.println("End of Switch Case Statement with break");
        System.out.println("-----------------");
        System.out.println();

        String level = "silver";

        switch (level){
            case "gold":
                System.out.println("You have access to gold membership");
            case "silver":
                System.out.println("You have access to silver membership");
            case "bronze":
                System.out.println("You have access to bronze membership");
            default:
                System.out.println("You have no subscription");
        }

        System.out.println("End of switch case statement without break.");
    }
}
