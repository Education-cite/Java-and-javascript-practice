
package eaxmpractice;
 //import java.util.Random; 
import java.util.Random;   
public class RandomNumber  
{   int r;


public static void main(String args[])   
{   
// creating an object of Random class 
  
Random random = new Random();   
// Generates random integers 0 to 49  
int x = random.nextInt(222225);   
  
// Prints random integer values  
System.out.println("Randomly Generated Integers Values");  
System.out.println(x);   
}
}


    

