//Print number in decreasing order from n to 1....
import java.util.*;
public class rec21 {
    static void decreasing(int n){
        if(n==0){
            return;
        }

       System.out.print(n +" ");
       decreasing(n-1);
    }
    public static void main(String args[]){
        int n = 10;
        decreasing(n);
    }
    
}
