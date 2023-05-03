package labs_examples.constructors_inheritance;

class RestaurantTester {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
    }
}

class Restaurant{
    private String name;
    private int capacity;
    private String style;

    public Restaurant(){}

    public Restaurant(String name, int capacity, String style){
        this.name = name;
        this.capacity = capacity;
        this.style = style;
    }

    class Fries extends Restaurant{
        private int waitTime;

        private Fries(){
            super();
        }

        private Fries(String name, int capacity, String style, int waitTime){
            super(name, capacity, style);
            this.waitTime = waitTime;
        }
    }
}
