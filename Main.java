/********************************************
*	AUTHORS:	<your names>
* COLLABORATORS: <name of peer, tutor, instructor, anyone else who helped>
*	LAST MODIFIED:	<date of last change>
********************************************/

/********************************************
*	<TITLE OF PROGRAM>
*********************************************
*	PROGRAM DESCRIPTION:
*	<1-2 sentences describing overall program>
*********************************************
*	ALGORITHM:
*	<Pseudocode here>
*********************************************
*	STATIC METHODS:
* <list of static methods and which teammate made each>
*********************************************/
import java.util.Scanner;

public class Main 
{
  static double gravitationalConstant = 0.00000000006743; /* N*meter^2 / kg^2 */
  static int speedOfLight = 299792458; /* meters/second */
  
  public static void main(String[] args)
  {
    /***** INTRO SECTION *****/
    System.out.print("What is the mass (in kg)?: ");
    try (Scanner scanner = new Scanner(System.in))
    {
      double mass = scanner.nextDouble();
    
      /***** PROCESSING SECTION *****/ 
      double schwarzschildRadius = calculateSchwarzschildRadius(gravitationalConstant, speedOfLight, mass);
      
      /***** OUTPUT SECTION *****/
      System.out.println("The Schwarzschild radius is: " + schwarzschildRadius + " meters");
    }
  }

  public static double calculateSchwarzschildRadius(double gravitationalConstant, int speedOfLight, double mass)
  {
    // Schwarzschild radius formula: (2 * G * M) / (c^2)
    return (2 * gravitationalConstant * mass) / (speedOfLight * speedOfLight);
  }
}
