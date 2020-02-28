/****************************************************************************
 *
 * Created by: Ben Lapuhapo
 * Created on: February 28
 * This program tells the user the Height of a foot board.
 *
 ****************************************************************************/

import java.util.Scanner;

public class BoardFoot {

    public static void main(String[] arg) {
        Scanner UserInput = new Scanner(System.in);
        double Length;
        double Width;
        double Height;
	int counter;

        Length = 0.0;
        Width = 0.0;
        counter = 0;

        // Makes sure Length and Width cannot be negative
        while (Length <= 0.0 || Width <= 0) {
	    
            if (counter != 0) {

                System.out.print("Invalid input! ");
            }

             System.out.print("Enter the Length of the board foot(in):");
             Length = UserInput.nextDouble();

             System.out.print("Enter the Width of the board foot(in):");
             Width = UserInput.nextDouble();
             counter += 1;
	}
	
        Height = FootBoard(Length, Width);

        System.out.print("\nThe Height of the board is " + Height + " inches.");	
    }
	
    public static double FootBoard(double len, double wid) {
        
            double Height;
            double VOLUME;

            // Calculates Height
            VOLUME = 144.0;
            Height = (VOLUME / len) / wid;
			
            return Height;
    }
}