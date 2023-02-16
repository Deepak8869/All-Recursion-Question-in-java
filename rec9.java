//Given two numbers x and y.Find the greatest common divisor of x and y using recursion.//
import java.util.*;
public class rec9 {
    static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x,y));
    }
}
