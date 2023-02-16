//print the  value of a array using recursion.///
import java.util.*;
public class rec10 {
    static void value(int [] arr,int idx){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        value(arr,idx+1);
     

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
        value(arr,0);
    }
    
}
