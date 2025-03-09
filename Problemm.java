//To take an integer as input and print it.
import java.io.*;
import java.util.Scanner;
public class Problemm{
    public static void main(){
        int num;
        System.out.println("Enter the integer:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Entered integer is "+num);
        sc.close();
    }
}
