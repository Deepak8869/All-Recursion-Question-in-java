// Given a number num and value k. Print k multiplkes of num..//
import java.util.*;
public class rec7 {
    static void multiple(int num , int k){
        if(k==1){
        System.out.println(num);
        return;
    }

        multiple(num , k-1);
        System.out.println(num*k);
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int k = sc.nextInt();
     multiple(num,k);
    }
    
}
