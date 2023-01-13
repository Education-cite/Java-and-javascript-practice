
package eaxmpractice;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiThread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
          Thread t = new Thread( a);
        Thread t1 = new Thread(b);
        t.start();
        t1.start();
        
    }
}

class A implements Runnable{
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


class B implements Runnable{
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



