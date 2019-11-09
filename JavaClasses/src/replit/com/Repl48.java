package replit.com;
import java.util.Scanner;

public class Repl48 {
	 public static void main(String[] args){
         Scanner scan=new Scanner(System.in);
         System.out.println(" is it sunny?");
        
      boolean isSunny=scan.nextBoolean();
       int temp=80;
       
       if (isSunny) {
               System.out.println("It is a sunny day, I should go somewhere!");
               if ( temp>=85){
                       System.out.println("I am going to the beach!");
               }else{
                       System.out.println("I am going to the park");
               }
       }else{
               System.out.println("I stay home and practice Java!");
       }
        
        
        
        
}

}
