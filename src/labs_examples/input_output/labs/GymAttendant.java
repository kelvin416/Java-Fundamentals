package labs_examples.input_output.labs;
//Exercise4
public class GymAttendant {
    private int id;
    private String FirstName;
    private String SecondName;
    private double startingWeight;

    public GymAttendant(){}

    public GymAttendant(int id, String firstName, String secondName, double startingWeight) {
        this.id = id;
        FirstName = firstName;
        SecondName = secondName;
        this.startingWeight = startingWeight;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }
    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public double getStartingWeight() {
        return startingWeight;
    }
    public void setStartingWeight(double startingWeight) {
        this.startingWeight = startingWeight;
    }

    @Override
    public String toString() {
        return "GymAttendant{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", SecondName='" + SecondName + '\'' +
                ", startingWeight=" + startingWeight +
                '}';
    }
}
