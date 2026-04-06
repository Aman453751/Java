
package newjava.online;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("enter number 1 ");
        Scanner Input = new Scanner(System.in);
        int num1 = Input.nextInt();
        System.out.println("enter number 2");
        int num2= Input.nextInt();
        int sum = num1 + num2;
        System.out.print("The sum is = "+sum);
    }
    
}
