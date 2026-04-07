

import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        System.out.print("enter num1 ");
        Scanner Input= new Scanner (System.in);
        int Num1= Input.nextInt();
        System.out.print("enter num2 ");
        int Num2= Input.nextInt();
        int temp=0;
        temp=Num1;
        Num1=Num2;
        Num2=temp;
        System.out.println("after swapping Num1 = "+Num1);
        System.out.println("after swapping Num2 = "+Num2);


    }
    
}

    

