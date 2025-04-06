//How to read a number from Standard input.
import java.io.*;
import java.util.Scanner;
public class Basicc{
    public static void main(String[]args){
        int num;
        System.out.println("Enter the integer:");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        System.out.println("Entered integer is: "+num);
        s.close();
    }
}
