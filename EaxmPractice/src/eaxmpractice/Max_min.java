
package eaxmpractice;

    import java.util.Scanner;

public class Max_min {
    public static void main(String[] args) {
         System.out.println("please enter N number :");
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        
        System.out.println("please enter number :");
        for (int i = 0; i <t; i++) {
            int current=s.nextInt();
            if(current>largest){
            largest=current;
            
            }
            
            if(current<smallest){
            smallest=current;
            }
        }
        
        
        System.out.println("largest number : "+largest);
        System.out.println("smallest number : "+smallest);
        
        
        
    }
   
        
    }
 




