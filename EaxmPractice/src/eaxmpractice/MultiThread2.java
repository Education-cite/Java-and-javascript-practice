
package eaxmpractice;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MultiThread2 {
    public static void main(String[] args) {
        AA aa = new AA();
        BB bb = new BB();
      
        aa.start();
        bb.start();
        
    }
}


class AA extends Thread{
public void run(){
    for (int i = 0; i < 5; i++) {
        System.out.println("running AA");
        try {
            sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

}


class BB extends Thread{
public void run(){
    for (int i = 0; i < 5; i++) {
        System.out.println("running BB");
        try {
            sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

}