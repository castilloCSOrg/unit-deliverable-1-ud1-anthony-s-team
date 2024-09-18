/********************************************
*	AUTHORS:	Petyr Dimmick, 
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
  static long speedOfLight = 299792458L; /* meters/second */
  static double solarMassInKg = 1.988416e30; /* Solar mass in kg */
  
  public static void main(String[] args)
  {
    /***** INTRO SECTION *****/
    System.out.print("Enter the mass (you can append 'SM' for solar masses): ");
    try (Scanner scanner = new Scanner(System.in))
    {
      String input = scanner.nextLine().trim();
      double massInKg;
      
      if (input.toUpperCase().endsWith("SM")) {
        // If the user enters "SM", treat the input as solar mass
        double massInSolarMass = Double.parseDouble(input.substring(0, input.length() - 2).trim()); //Ensures that the characters SM are not used when doing math in #'s
        massInKg = massInSolarMass * solarMassInKg;
      } else {
        // If no "SM", treat the input as kilograms
        massInKg = Double.parseDouble(input);
      }
      
      /***** PROCESSING SECTION *****/ 
      double schwarzschildRadius = calculateSchwarzschildRadius(gravitationalConstant, speedOfLight, massInKg);
      
      /***** OUTPUT SECTION *****/
      System.out.println("The Schwarzschild radius is: " + schwarzschildRadius + " meters");
    }
  }

  public static double calculateSchwarzschildRadius(double gravitationalConstant, long speedOfLight, double mass)
  {
    // Schwarzschild radius formula: (2 * G * M) / (c^2)
    return (2 * gravitationalConstant * mass) / (speedOfLight * speedOfLight);
  }
}