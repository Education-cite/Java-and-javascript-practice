
package eaxmpractice;

import java.util.Scanner;


public class Truck extends Vehicle{
    double weight;
    
    
    @Override
     double getsaleprice(){
          Scanner s = new Scanner(System.in);
        System.out.println("please Enter weight");
        double weight=s.nextDouble();
        System.out.println("please Enter regularprice ");
        double regularprice=s.nextDouble();
         if(weight>2000){
             System.out.println("Discount");
         double dis = regularprice*10/100;
         double totalprice=dis+regularprice;
             System.out.println("The total price is : "+totalprice); 
         }else{
             System.out.println("No discount");
         double dis1=regularprice;
             System.out.println("The total price is : "+dis1);
         }
        return 0;
      
    
                
    }
    
    public static void main(String[] args) {
    
        Truck t = new Truck();
       
        System.out.println( t.getsaleprice());
    }
    
}
