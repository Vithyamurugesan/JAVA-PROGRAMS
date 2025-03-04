/*Check whether the given number is Palindrome or not*/
import java.util.Scanner;
public class Problemc
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int original=a;
		int temp=0;
		while(0<a){
		    temp=(temp*10)+(a%10);
		    a=a/10;
		}
		if(original==temp){
		    System.out.println("It is a palindrome");
		}
		else{
		    System.out.println("Not a palindrome");
		    }
	
	}
}
