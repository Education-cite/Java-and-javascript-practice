
package eaxmpractice;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args){
       
      Scanner s = new Scanner(System.in);
        System.out.println("Please Enter number : ");
        int a = s.nextInt();

        for (int i = 2; i <= a; i++) {
            if (i == a) {
                System.out.println(a + " is a prime number");
            } else {
                if (a % i == 0) {
                    System.out.println(a + " is not a prime number");
                    break;
                }
            }
        }
    }
}
