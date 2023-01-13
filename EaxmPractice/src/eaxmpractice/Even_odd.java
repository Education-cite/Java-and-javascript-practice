
package eaxmpractice;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
          
        Scanner s = new Scanner(System.in);
        System.out.println("please enter number :");
        int t = s.nextInt();
        
        String evenodd=(t%2==0)?"even":"odd";
        System.out.println(t+" number is = "+evenodd);
    }
}
