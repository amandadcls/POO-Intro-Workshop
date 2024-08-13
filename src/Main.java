public class Main {
    public static void main(String[] args) {

        // # Starting with Variables
        startingWithVariables();

        // # Primitive types
        primitiveTypes();

        // # Conditionals
        short age = 24;
        conditionals(age);

        // # Arrays
        arrays();
    }

    public static void startingWithVariables() {

        // # Working with variables
        // -> type variableName = value;

        // ### int (integer) -> works with int (inteiros) values
        int height = 170;
        int weight = 90;


        // -> var variableName = value
        /*
         * If we declare it this way:
         * - The var will only work in a local scope.
         * - And we don't have to pass the type, but it will be inferred from our value.
         * - Which makes so that we cant start ir without an initial value, cause if so it won't be able to infer the
         * type
         * */
        var nome = "Amanda";
    }

    public static void primitiveTypes () {

        // # Primitive types
        // -> byte, short, int, long -> Used by integer numbers
        integerPrimitiveTypes();

        // -> float, double -> Used by non integer numbers
        nonIntegerPrimitiveTypes();

        // -> boolean
        boolean isJavaFun = true;
        boolean amIBeingHonest = false;

        // -> char -> used by single characters
        char gender = 'F';
        char grade = 'a';

        // -> String -> NOT a primitive type, is a Class
        String name = "Amanda";
    }

    public static void integerPrimitiveTypes () {
        // # Primitive types
        // -> byte, short, int, long -> Used by integers
        /*
         * All that changes is the range they can represent and the width they use:
         * byte: {range: -128 to 127 , width: 8}
         * short: {range: -32.768 to 32.767 , width: 16}
         * int: {range: -2.147.483.648 to 2.147.483.647 , width: 32}
         * long: {range: -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807, width: 64}
         * */

        byte byteTest = 127;
        short shortTest = 32767;
        int intTest = 2147483647;
        long longTest = 9223372036854775807L;

    }

    public static void nonIntegerPrimitiveTypes () {
        // -> float, double -> Used by non integer numbers
        /*
         * All that changes is the range they can represent and the width they use:
         * float: {range: 6-7 decimal digits , width: 32}
         * double: {range: 15 decimal digits , width: 64}
         * */

        float floatTest = 123.456f;
        double doubleTest = 123.456;
    }

    public static void conditionals (short age) {
        // # Conditionals
        if (age > 18) {
            System.out.println("Adult");
        } else if (age == 18) {
            System.out.println("Just turned Adult");
        } else {
            System.out.println("Child");
        }
    }

    public static void arrays () {
        // # Arrays
    }
}