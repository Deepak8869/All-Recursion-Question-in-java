//Givan sn  integer.Find out sum of digit using recursion...//
import java.util.*;
public class rec4 {
    static int sum(int n ){
        if(n>=1 && n<=9){
            return n;
        } 
        int  smallans = sum(n/10);  
        return  smallans + n%10;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(sum(n)); 
    }
}
