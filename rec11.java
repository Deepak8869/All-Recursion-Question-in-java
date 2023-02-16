//Print the max value in a array using recurison..//
import java.util.*;
public class rec11 {
    static int max(int [] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int rec = max(arr,idx+1);
        return  Math.max(arr[idx], rec);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(max(arr,0)); 
    }
    
}
