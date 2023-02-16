//Program to print fibonacci number..//
import java.util.*;
public class rec3 {
    static int fib(int n){
        int a =0;
        int b=1;
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n)); 
    }
}
