/*
* This program calculates energy
*
*
* @author  Lily Liu
* @version 1.0
* @since   2022-09-15
*/

import java.util.Scanner;

/**
* This is the standard calculated energy program.
*/
public final class Enrgy {
    // Constant
    /**
    * Speed of light.
    */
    static final double SPEED_OF_LIGHT = 2.998e8;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Enrgy() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);

        System.out.print("Enter mass of object (kg) : ");
        try {
            final float massObject = myObj.nextFloat();

            // Process
            final float amountOfEnergy = massObject
                           * (float) Math.pow(SPEED_OF_LIGHT, 2);

            // Output
            System.out.println(amountOfEnergy + "J of energy would be",
                "released");
        } catch (java.util.InputMismatchException errorCode) {
            System.err.print("Invalid input\n");
        }
        System.err.print("\nDone.\n");
    }
}
