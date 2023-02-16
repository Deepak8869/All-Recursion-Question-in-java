//Given two number p and q , find the value of p^q using a recursive functions..//
import java.util.*;
public class rec6 {
    static int find(int p ,int q){
        if(q==0){
            return 1;
        }
        int power = (int)Math.pow(p,q-1);
        return power *p;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.println(find(p,q));
    }
    
}
