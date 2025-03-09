//Convert String to Lowercase.
import java.util.Scanner;
public class Problemk{
public static String toLowerCase(String s){
return s.toLowerCase();
}
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
String s=scanner.nextLine();
String result=toLowerCase(s);
System.out.println(result);
scanner.close();
}
}