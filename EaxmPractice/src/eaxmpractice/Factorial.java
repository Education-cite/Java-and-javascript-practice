
package eaxmpractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int t = s.nextInt();
        for (int i = 1; i <=t; i++) {
             fact=fact*i;
        }
        System.out.println(t + " factorial number is : "+fact);
    }
}
