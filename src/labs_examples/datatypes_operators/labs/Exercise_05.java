package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }
        // write your code below

        if (a || b){
            System.out.println("a is true"); // this will print only the left side of the operation since it has evaluated to be true.
        }
        if (a & b){
            System.out.println("a and b is false.");// this will not print since the result evaluates a false value
        }
        if (a && b){
            System.out.println("a is true and b is false");//will not print since both of the operations need to be true.
        }
        if (a ^ b){
            System.out.println("a is true");// XOR will print since only one value need be true but not both values
        }
        if (!b){
            System.out.println("b is not false");// this will print since the value of b has been converted to true
        }


    }

}

