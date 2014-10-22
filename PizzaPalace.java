/**
 * Determines the number of pizza pies required to feed an after school club.
 * 
 * Basic program
 * 	Prompt the user to enter the number of people to be fed, the number of
 * 	slices allowed for each person, and the number of slices in each whole pie.
 * 	Given these inputs, determine and display the number of pizzas to purchase.
 * 
 * For guidance, refer to the flowchart PizzaPalace.pdf distributed with this file
 * 
 * @author <Sam Rooney>
 * @version <22/10/14>
 */
 
import java.util.Scanner;

   public class PizzaPalace {


	   public static void main(String[] args) {
   		
         Scanner bobby = new Scanner(System.in);
         
         System.out.println ("How many people must you feed?");
         
         
         double PeopleFeed = bobby.nextDouble();
         
         System.out.println ("How many slices are necessary to feed each person?");
         
         double SlicesPerPerson = bobby.nextDouble();
         
         System.out.println ("How many slices are in each pie?");
         
         double PiecesInPie = bobby.nextDouble();
         
         double dog = ((PeopleFeed * SlicesPerPerson) / PiecesInPie);
         
         System.out.print ( new Float( Math.round(dog)) );
         
         System.out.print (" is the number of pizzas you must buy.");  
		
		// NOTE
		// The Math class provides a function, ceil() short for 'ceiling', which will take a double
		// and return the next higher integer value.
		// For example, Math.ceil(4.125) would evaluate to 5

	}

}
