
import java.util.Scanner;

public class FunctionTable {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        PrintMultiplicationTable(num);
    }
    public static void PrintMultiplicationTable(int num){
      int i=1;
      while(i<=10){
        System.out.println(num+"*"+i+"="+(num*i));
        i++;
      }
    }
    
}
