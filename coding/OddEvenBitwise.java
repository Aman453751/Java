import java.util.Scanner;
public class OddEvenBitwise {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if((num&1)==1){
            System.out.println("ODD NUMBER");
        }
        else{
            System.out.println("EVEN NUMBER");
        }
    }
    
}
