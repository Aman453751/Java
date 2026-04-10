
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = addition(num);
        System.out.println("The sum is "+sum);
    }
    public static int addition(int num){
        int sum =0,digit;
        int n= num;
        while(n>0){
            digit = n%10;
            sum = sum + digit;
            n=n/10;
        }
        return sum;
        

    }
}
