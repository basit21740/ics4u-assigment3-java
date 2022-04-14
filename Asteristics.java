/*
* This program prints out
* the Magic Sqaures.
*
* @author Abdul Basit
* @version 1.0
* @since   2022-02-03
*/

import java.util.Scanner;

/**
 * This is the main class.
 */
final class Asteristics {
    /**
    * Asteristic.
    */
    public static final String AST = "*";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException ok
    */
    private Asteristics() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The asteristics function .
    *
    * @param integer is an integer
    * @param spacesNum number of spaces
    */
    public static void asteristics(final int integer, final int spacesNum) {
        String outPut = "";

        for (int counter = 0; counter < spacesNum; counter++) {
            outPut = " " + outPut;
        }

        if (integer == 1) {
            System.out.println(outPut + AST);
            System.out.println(outPut + AST);
        } else {
            for (int counter = 0; counter < integer; counter++) {
                outPut = outPut + AST;
            }

            System.out.println(outPut);

            asteristics(integer - 1, spacesNum + 1);

            System.out.println(outPut);
        }
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // main stub, get user input here
        final Scanner userInput = new Scanner(System.in);
        System.out.println("Insert an integer:");
        final String input = userInput.nextLine();

        try {
            final int inputInt = Integer.parseInt(input);
            asteristics(inputInt, 0);
        } catch (java.lang.NumberFormatException error) {
            System.out.println("Not a number.");
        }

        System.out.println("Done.");
    }
}
