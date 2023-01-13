
package eaxmpractice;

import java.util.Scanner;

public class Greatest_common_divisior {
    public static void main(String[] args) {
       // int a,b,gcd=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
      int   a = input.nextInt();
        System.out.println("Enter 2nd number : ");
     int    b = input.nextInt();
     int    gcd=findgcd(a,b);
         System.out.println("Gcd of "+"a "+ "and "+" b "+" = "+gcd);
    }

    public static int findgcd(int a, int b) {
        while(b!=0){
        if(a>b){
        a=a-b;
        }else{
        b=b-a;
        }
        }
        return a;    
    }

}
