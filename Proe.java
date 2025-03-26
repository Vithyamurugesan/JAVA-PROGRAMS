//Implement the addition,subtraction,multiplication,division operations using two class
import java.util.*;
class Proe{
    void m1(int a,int b){
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        System.out.println("The add result is "+c);
        System.out.println("The subtraction result is "+d);
        System.out.println("The multiplication result is "+e);
        System.out.println("The division result is "+f);
    }
}
class main{
    public static void main(String[]args){
        Proe x=new Proe();
        x.m1(2,3);
    }
}