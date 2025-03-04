/* Find the sum of digits.*/
import java.util.Scanner;
public class Problema
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int sum=0;
		for(int i=a;0<a;i--){
		    sum+=a%10;
		    a=a/10;
		}
		System.out.println(sum);
	}
}
