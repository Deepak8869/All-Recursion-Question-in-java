//write a program to return all its subsequences in an arraylist.//
import java.util.*;
public class rec18 {
    static ArrayList<String> subsequences(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;
        }

       char curr = s.charAt(0);
       ArrayList<String> smallans = subsequences(s.substring(1));


       for(String ss:smallans){
        ans.add(ss); 
        ans.add(curr + ss);
       }
       return ans;
  }
   public static void main(String args[]) {
        ArrayList<String> ans = subsequences("abc");
        for(String ss:ans){
            System.out.println(ss);
        }
    }
    
}
