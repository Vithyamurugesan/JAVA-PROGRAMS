//Application of reusability in java.
import java.util.*;
class Proc {
    void m1(){
        System.out.println("This is m1");
    }
    public static void main(String[]args){
        Proc x=new Proc();
        x.m1();
        x.m1();
        x.m1();
        x.m1();
    }
}

    
