package labs_examples.enumerations.labs;

public class Exercise1BController {
    public static void main(String[] args) {
        EnumPara enumPara = new EnumPara();
        for (EnumPara.Days day : EnumPara.Days.values()) {
            System.out.println("Days: " + day + ", ");
            if (day.getDay() >= 6){
                System.out.print("Weekend Vibes..");
            } else {
                System.out.print("Goota grind your ass off..");
            }

            switch (day){
                case SUNDAY:
                    System.out.println("Weekend");
                    continue;
                case WEDNESDAY:
                    System.out.println("Work");
                    continue;
                case MONDAY:
                    System.out.println("No one loves mondays");
                    continue;
                default:
                    System.out.println("Ok");
            }
        }
    }
}

class EnumPara{
    public enum Days{
        MONDAY(1), WEDNESDAY(3), FRIDAY(5), SUNDAY(7);
        private final int day;
        Days(int day){
            this.day = day;
        }

        public int getDay() {
            return day;
        }
    }
}
