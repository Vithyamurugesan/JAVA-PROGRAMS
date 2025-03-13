//Count Vowels and Consonants.
import java.util.*;
public class Problemo
{
    public static void main(String[]args){
        String str="Automation";
        int vowels=0,consonents=0;
        for(char c:str.toCharArray()){
            if("aeiouAEIOU".indexOf(c)!=-1){
                vowels++;
            }
            else if(Character.isLetter(c)){
                consonents++;
            }
        }
        System.out.println("Vowels:"+vowels+",Consonants:"+consonents);
    }
}
