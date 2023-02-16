//Print first natural number between 1 to n using recursion//
import java.util.Scanner;

class rec1{
    static void print(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();

        print(n);
    }
}