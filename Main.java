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
  static long gravitationalConstant = ((long)0.00000000006743); /*N*meter^2 / kg^2 */
  static int cpeedOfLight = (-299792458); /*meters/seconds*/
  public static void main(String[] args)
  {
    /***** INTRO SECTION *****/
    System.out.println("What is the mass?: ");
    try (
    Scanner Mass = new Scanner(System.in))
    {
      int M = Mass.nextInt();
    
    /***** PROCESSING SECTION *****/ 
    
    /***** OUTPUT SECTION *****/
    math(gravitationalConstant, cpeedOfLight);
    System.out.println(SchwarzschildRadius);
    Mass.close();
    }
  }
public static void math (long gravitationalConstant, long cpeedOfLight)
    {
    long SchwarzschildRadius = (2 * gravitationalConstant) * (cpeedOfLight * cpeedOfLight) * ;
    }
}
