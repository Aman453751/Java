
import java.util.Scanner;



public class ArraySearching {
    public static void main(String[] args) {
        int[] arr ={10,13,23,56,78,3,45,67,89,99};
        System.out.println("welcome to array searching");
        System.out.println("enter the number you want to search");
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        boolean isfound = isfound(arr,num);
        if(isfound){
            System.out.println("the number is found in array");
        }
        else{
            System.out.println("the number not found in array");
        }



    }
    public static boolean isfound(int[] arr, int num){
        int index=0;
        while(index<arr.length){
            if(arr[index]==num){
                return true;
            }
            index++;
        }

        return false;

    }
    
}
