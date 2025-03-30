//lostlineup problem.
import java.util.*;
public class lostlineup{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        
        int n=in.nextInt();
        int[] arr=new int[n-1];
        for(int i=0;i<n-1;i++){
            int x=in.nextInt();
            arr[x]=i+2;
        }
        System.out.println(1);
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}