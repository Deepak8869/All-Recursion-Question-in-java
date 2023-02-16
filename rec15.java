//Remove all occurences of 'a' form string s = "abcax"//
import java.util.*;
public class rec15 {
    static String remove(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        String smallans = remove(s,idx+1);
        char curr = s.charAt(idx);
        if(curr != 'a'){
            return curr + smallans;
        }
        else{
            return smallans;
        }
        
    }
    

    public static void main(String args[]){
        String s = "abcax aab";
        System.out.println(remove(s, 0));

    }
}
