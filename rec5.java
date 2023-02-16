//Program to count a digit of a given number//
import java.util.*;
public class rec5 {
    static int count(int n){
        if(n>=1 && n<=9){
            return 1;
        }
        int counts = count(n/10);
        return counts + 1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n)); 
    }
    
}
