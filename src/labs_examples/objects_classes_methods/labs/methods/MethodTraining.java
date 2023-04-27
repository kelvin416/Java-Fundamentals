package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

public class MethodTraining {
    public static void main(String[] args) {
        //Method overloading
        int overloadingAdd1 = add(5, 10);
        int overloadingAdd2 = add(5, 10, 20);
        int overloadingAdd3 = add(5, 10, 20, 40);

        System.out.println("Overloaded add method 1: " + overloadingAdd1);
        System.out.println("Overloaded add method 2: " + overloadingAdd2);
        System.out.println("Overloaded add method 3: " + overloadingAdd3);

        //Pass by reference and pass by value
        Books books = new Books("Percy Jackson", "Novel", 2011, 99);
        System.out.println("Type of book before type is changed" + books.toString());
        changeTypeOfBook(books);
        System.out.println("Type of book after type is changed" + books.toString());

        int speedTrapA = 44;
        int speedTrapB = 78;
        System.out.println("Before speed Trap A: " + speedTrapA);
        System.out.println("Before speed Trap B: " + speedTrapB);
        speedOfCar(speedTrapA, speedTrapB);
        System.out.println("After speed Trap A: " + speedTrapA);
        System.out.println("After speed Trap B: " + speedTrapB);

        //3. largest number
        int l = largestNumber(5, 9, 9, 10);
        System.out.println("The largest number is: " + l);

        //4. Number of consonants
        String anyName = String.valueOf(numOfConsonants("Kelvin"));
        System.out.println("Number of consonants in the string is: " + anyName);

        //5. Prime numbers
        isPrime(77);

        //6. High and low in array.
        int[] numbers = {23, 45, 53, 132, 13425, 745, 113};
        int[] result = highAndLowNums(numbers);
        System.out.println("The high and low numbers respectively are: " + result[0] + " and " + result[1]);

        //7
        int arrays = arrayList(20, 3, 2);
        System.out.println("The length of the arraylist is: " +arrays);

        //8. Array revers

        int[] carsNumberPlates = {2, 23, 22, 56, 75, 12};
        int[] cars = reverseArray(carsNumberPlates);
        System.out.println(cars);




    }
    //1. Method overloading
    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b, int c){
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        return a + b + c + d;
    }
    //2. pass by reference and pass by value
    static void changeTypeOfBook(Books books){
        books.typeOfRead = "Child's book";
    }
    static void speedOfCar(int speed1, int speed2){
        speed1 += 40;
        System.out.println("The speed of car 1 is: " + speed1);
        speed2 += 50;
        System.out.println("The speed of car 2 is: " + speed2);
    }
    //3. Largest of four numbers
    static int largestNumber(int a, int b, int c, int d){
        int luckyNumber1 = Math.max(a, b);
        int luckyNumber2 = Math.max(b, c);
        int luckyNumber3 = Math.max(c, d);

        if (luckyNumber1 > luckyNumber2){
            return luckyNumber1;
        } else if (luckyNumber1 < luckyNumber2) {
            return luckyNumber2;
        } else if (luckyNumber2 > luckyNumber3) {
            return luckyNumber2;
        } else {
            return luckyNumber3;
        }

    }

    //4. Method to count consonants
    static int numOfConsonants(String word){
        int wordCount = 0;
        char character;
        for (int i = 0; i < word.length(); i++){
            character = word.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){

            } else{
                wordCount++;
            }
        }
        return wordCount;
    }

    //5. Prime numbers
    static void isPrime(int a){
        int prime = a;
        int diviser = 2;
        boolean flag = false;
        while (diviser <= prime / 2){
            if (prime % diviser == 0){
                flag = true;
                break;
            }
            diviser++;
        }
        if (!flag){
            System.out.println(prime + " is a prime number");
        } else {
            System.out.println(prime + " is not a prime number");
        }
    }

    //6. Highest and lowest numbers in an array.
    static int[] highAndLowNums(int... numbers){
        int[] number = numbers;
        int high = number[0];
        int low = number[0];


        for (int i = 0; i < number.length; i++){
            if (number[i] > high){
                high = number[i];
            }
            if (number[i] < low){
                low = number[i];
            }
        }
//        System.out.println("The highest number is: " + high);
//        System.out.println("The lowest number is: " + low);

        return new int[] {high, low};
    }

    //7.
    static int arrayList(int maxNum, int divisor1, int divisor2){
        int length = 0;
        ArrayList<Integer> numPopulation = new ArrayList<>();
        for (int i = 0; i < maxNum; i++){
            if (i % divisor1 == 0 && i % divisor2 == 0){
                numPopulation.add(i);
                length++;
            }
        }
        System.out.println("The numbers found are: " + numPopulation);
        return length;
    }

    //8. reverse an array.
    static int[] reverseArray(int[] carsNum){
        int cars = carsNum.length;
        for (int i = 0; i < carsNum.length; i++){
            cars = carsNum[i];
        }
        for (int i = carsNum.length - 1; i >= 0; i--){
            cars = carsNum[i];
        }

        return new int[]{cars};

        //Will continue more research on Assignment 8.
    }

}
//2. This class is needed by pass by reference method.
class Books{
    String nameOfBook;
    String typeOfRead;
    int yearOfPublication;
    int priceTag;

    public Books(String name, String type, int year, int price){
        this.nameOfBook = name;
        this.typeOfRead = type;
        this.yearOfPublication = year;
        this.priceTag = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", typeOfRead='" + typeOfRead + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", priceTag=" + priceTag +
                '}';
    }
}
