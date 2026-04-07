import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("The number " + num + " is even");
        }
        else{
            System.out.println("The number  " + num + " is odd ");
        }

    }
    
}
