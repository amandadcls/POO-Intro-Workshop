import java.util.ArrayList;
import java.util.Arrays;

public class BasicSyntax {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------");
        System.out.println("********** *** Basic Syntax *** **********");

        // # Starting with Variables
        startingWithVariables();

        // # Primitive types
        primitiveTypes();

        // # Conditionals
        short age = 24;
        conditionals(age);

        // # Arrays
        arrays(); // The length is fixed on initialization

        // # ArrayLists
        arrayLists();

        // # Loops
        loops();

        // # Casting -> reassign different type
        casting();
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
        System.out.println("----------------------------------------------");
        System.out.println("# Conditionals #");

        System.out.println("Given the age: " + age + " years old.");
        System.out.println("The individual is a(n):");
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
        System.out.println("----------------------------------------------");
        System.out.println("# Arrays #");
        // -> type[] variableName;
        // There are 2 ways of initializing an array.
        // One is to set the values when declaring it, and then the length will be fixed.
        int[] intArray = {1, 2, 3};
        System.out.print("Array de inteiros: ");
        System.out.println(Arrays.toString(intArray));
        // The other is:
        char[] charArray = new char[4]; //new type[length]
        charArray[3] = 'd';
        charArray[2] = 'c';
        charArray[1] = 'b';
        charArray[0] = 'a';
        System.out.print("Array de chars: ");
        System.out.println(Arrays.toString(charArray));
        System.out.println("Length: " + charArray.length);
    }

    public static void arrayLists () {
        // # ArrayLists
        System.out.println("----------------------------------------------");
        System.out.println("# ArrayLists #");

        // It's a Class from java.util -> Need to import it:
        // import java.util.arrayList;

        // ArrayLists is made to solve array fixed length problem.
        // Works as a dynamic list.

        // -> ArrayList<type> variableName

        // Inicialização: new ArrayList<type>();

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        // We can add new spaces, since its length is not fixed
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(5);
        integerArrayList.add(7);

        System.out.print("ArrayList de inteiros: ");
        System.out.println(integerArrayList);
        System.out.print("Size: ");
        System.out.println(integerArrayList.size());
        System.out.print("Element at index 2: ");
        System.out.println(integerArrayList.get(2));
        System.out.print("Removing element at index 1: ");
        System.out.println(integerArrayList.remove(1));
        System.out.print("ArrayList de inteiros: ");
        System.out.println(integerArrayList);

    }

    public static void loops () {
        // # Loops
        System.out.println("---------------------------------------------");
        System.out.println("# Loops #");

        // while and for

        // -> for (type variableName = value; variableName < 10; variableName++ ) {...}
        /*
         * type variableName -> Creates the var that will serve as a counter, controlling the cycle.
         * variableName < 10 -> Represents the condition in which the cycle will keep cycling. Once that comparison returns true, the cycle stops.
         * variableName++ -> Represents an action that will occur to the variableName everyCycle. Doesn't have to be necessarily ++.
         * */

        System.out.print("Countdown: ");
        for (short counter = 10; counter >= 0; counter-- ) {
            if (counter > 0) System.out.print(counter + " ");
            else System.out.println("BOOM!!!");
        }

        // -> while (variableName > 0) {... variableName--;}
        /*
         * variableName -> The var has to be declared beforehand, not on the while declaration.
         * (variableName > 0) -> Represents the condition in which the cycle will keep cycling. Once that comparison returns true, the cycle stops.
         * variableName--; -> Remember to alter the controlled variable inside the function scope, else it will loop endlessly.
         * */

        System.out.print("Counter: ");
        short counter = 0;
        while (counter <= 10) {
            if (counter < 10) System.out.print(counter + " ");
            else System.out.println("YAY!!!");

            // Need to alter counter here, or else the loop never ends.
            counter++;
        }
    }

    public static void casting () {
        // # Casting
        System.out.println("--------------------------------------------");
        System.out.println("# Casting #");

        // To change a variable type.
        // Can occur implicitly or explicitly:

        // Implicit -> We don't need to declare it, but it will be automatically done.
        int weightInt = 85;
        double weightDouble = weightInt; // It will automatically convert the int to a double;

        System.out.println("Declared int: " + weightInt);
        System.out.println("Declared double: " + weightDouble);
        weightDouble++; // Taking out redundant warning
        weightDouble--;

        // Explicit -> We need to use the converting function needed in each case, because it can't be automatically done.
        // -> (newType) variableThatNeedsToChangeType
        int newWeightInt = (int) weightDouble;
        System.out.println("Casted double to int: " + newWeightInt);

        // char to String Example:
        // -> String.valueOf(charToBeConverted)
        char letter = 'a';
        String grade = String.valueOf(letter);
        grade = grade.toUpperCase() + "+";

        System.out.println("Letter: " + letter);
        System.out.println("Grade: " + grade);

        // String to char Example:
        String name = "Amanda";
        char middleLetter = name.charAt(3);

        System.out.println("Name: " + name);
        System.out.println("Middle Letter: " + middleLetter);

    }
}
