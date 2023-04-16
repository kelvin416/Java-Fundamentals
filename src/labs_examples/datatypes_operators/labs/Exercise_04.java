package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below
        if (a <= b){
            System.out.println("a is less than or equal to b");
        }
        if (a > b){
            System.out.println("a is greater than b");// Will not be printed since its boolean value is false.
        }
        if (a >= b){
            System.out.println("a is greater or equals b");// Will not be printed since its boolean value is false.
        }
        if (a == b){
            System.out.println("a equals b"); // Will not be printed since its boolean value is false.
        }
        if (a != b){
            System.out.println("a does not equals b");
        }

    }

}

