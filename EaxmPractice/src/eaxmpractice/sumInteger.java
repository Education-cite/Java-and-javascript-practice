
package eaxmpractice;

import java.util.Scanner;

public class sumInteger {
    public static void main(String[] args) {
          int sum=0;
    Scanner input = new Scanner (System.in);
  
    //int i;
        for (int i = 0; i>=0; i++) {
            System.out.println("Enter value");
            int s = input.nextInt();
            if (s==0){
            break;
            }else{
            sum+=s;
            }
        }
        System.out.println("Total number : "+sum);
    }
    
    }

