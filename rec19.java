//Given a string ,write a method to print all its subsequences//
import java.util.*;
public class rec19 {
    static void print(String s,String curans){
        if(s.length()==0){
            System.out.print(curans+ " ");
            return;
        }
        char cur = s.charAt(0); 
        String rem = s.substring(1);
        print(rem,curans+cur);//add cur
        print(rem,curans);//do not add cur
    }
    public static void main(String args[]){
        print("abc","");
    }    
}
