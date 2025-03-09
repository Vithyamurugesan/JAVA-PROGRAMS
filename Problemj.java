/*Shuffle the String*/
import java.util.Scanner;
public class Problemj{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
int n=s.length();
int[] indices=new int[n];
for(int i=0;i<n;i++){
indices[i]=sc.nextInt();
}
sc.close();
char[] shuffled=new char[n];
for(int i=0;i<n;i++){
shuffled[indices[i]]=s.charAt(i);
}
String result=new String(shuffled);
System.out.println(result);
}
}