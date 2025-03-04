/*Finding the sum of digits until it become single digit*/
import java.util.Scanner;
public class Problemb
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    int n=obj.nextInt();
	    while(n>9){
        int sum=0;
        while(n!=0){
            int last=n%10;
            sum=sum+last;
            n=n/10;
        }
        n=sum;
    }
    System.out.println(n);
	}
}
