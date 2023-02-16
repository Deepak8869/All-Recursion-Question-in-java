//Wrtie a program to check given string is palindrome or not....
import java.util.*;
public class rec17 {
    //First we check the reverse of a given string//
    //if a reverse of strings is equal to the original string then string is palindrome..
    static String reverse(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        String smallans = reverse(s, idx+1);
        return smallans + s.charAt(idx);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rev = reverse(s, 0);
        if(rev.equals(s)){
            System.out.printf("%s is Palindrome",s);
        }
        else{
            System.out.printf(" %s is Not Palindrome",s);
        }
        
    }
    
}
