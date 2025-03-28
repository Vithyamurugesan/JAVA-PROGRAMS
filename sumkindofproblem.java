//Sum kind of problems kattis platform problem statement.
import java.util.*;
public class sumkindofproblem{
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        int cases=in.nextInt();
        for(int i=0;i<cases;i++){
            int c=in.nextInt();
            int n=in.nextInt();
            
            int sum1=(n*(2*1+(n-1)*1))/2;
            int sum2=(n*(2*1+(n-1)*2))/2;
            int sum3=(n*(2*2+(n-1)*2))/2;
            System.out.println(c+" "+sum1+" "+sum2+" "+sum3);
            System.out.println();
        }
    }
}