import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        long fact = factorial(num);

        System.out.println("The factorial of " + num + " is: " + fact);

    
    }

    public static long factorial(int num) {
        long fact = 1;   
        int i = 2;

        if (num < 2) {
            return 1;
        }

        while (i <= num) {
            fact = fact * i;
            i++;
        }

        return fact;
    }
}