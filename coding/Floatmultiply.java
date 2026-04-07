
import java.util.Scanner;

public class Floatmultiply {
    public static void main(String[] args) {
        System.out.println("enter the number 1");
        Scanner Input= new Scanner(System.in);
        float num1 = Input.nextFloat();
        System.out.println("enter the number 2");
        float num2 = Input.nextFloat();
        float multiply = num1 * num2;
        System.out.println("the floating multiplication is : "+multiply);
    }
    
}
