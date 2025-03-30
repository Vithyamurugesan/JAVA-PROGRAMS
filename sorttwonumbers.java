//Sort two numbers.
import java.util.*;
public class sorttwonumbers{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        if(a<b){
            System.out.println(a+" "+b);
        }
        else if(b<a){
            System.out.println(b+" "+a);
        }
        else{
            System.out.println(a+" "+b);
        }
    }
}