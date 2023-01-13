
package eaxmpractice;

import java.util.Scanner;

public class PowerNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Base number : ");
        int base = input.nextInt();
        int temp=base;
        System.out.println("Enter the Exponent number : ");
        int ex = input.nextInt();
        for (int i = 1; i < ex; i++) {
            temp=temp*base;
        }
        
      System.out.println("Result of "+base+" power "+ex+" is = "+temp);
    }
}
