//Write a program to print reverse of a string using recursion...
import java.util.*;
public class rec16 {
    static String reverse(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        String smallans = reverse(s, idx+1);
        return smallans + s.charAt(idx);
    }
    public static void main(String args[]) {
        String s= "abcde";
        System.out.println(reverse(s, 0));
    }
    
}
