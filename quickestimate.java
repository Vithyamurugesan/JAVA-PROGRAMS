//Quick estimate Kattis platform problem Statement.
import java.util.Scanner;
public class quickestimate{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            for(int i=0;i<n;i++){
                String number=input.next();
                System.out.println(number.length());
            }
    }
}
