
import java.util.Scanner;



public class Pnz {
 public static void main(String[] args) {
     System.out.println("enter the number ");
     Scanner input = new Scanner(System.in);
     int num = input.nextInt();
     if(num>0){
        System.out.println("The number is " +num+" and this is positive");
     }
     else{
        if(num<0){
            System.out.println("The number is " +num+" and this is Negative");
        }
        else{
            System.out.println("The number is " +num+" and this is Zero");
        }
     }
 }
    
}
