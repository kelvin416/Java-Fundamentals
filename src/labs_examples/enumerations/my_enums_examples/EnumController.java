package labs_examples.enumerations.my_enums_examples;

public class EnumController {
    public static void main(String[] args) {
        EnumTest firsDay = new EnumTest(Day.MONDAY);
        firsDay.tellDayLikeThis();
        EnumTest secondDay = new EnumTest(Day.TUESDAY);
        secondDay.tellDayLikeThis();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.tellDayLikeThis();
        EnumTest forthDay = new EnumTest(Day.THURSDAY);
        forthDay.tellDayLikeThis();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.tellDayLikeThis();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellDayLikeThis();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tellDayLikeThis();
    }
}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class EnumTest{
    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    public void tellDayLikeThis(){
        switch (day){
            case MONDAY:
                System.out.println("Monday ni kazi");
                break;
            case TUESDAY:
                System.out.println("Tuesday ni kaa tu monday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday sijali");
                break;
            case THURSDAY:
                System.out.println("Thurday nangoja tu Friday");
                break;
            case FRIDAY:
                System.out.println("Friday olalala");
                break;
            default:
                System.out.println("Weekend to relax and wind up.");
        }
    }
}
