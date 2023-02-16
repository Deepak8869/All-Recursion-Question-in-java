// Program to find the sum of element of array...
import java.util.*;
public class rec12 {
    static int sumarray(int [] arr , int idx){
        if(idx==arr.length-1){
              return arr[idx];
        }
        sumarray(arr, idx+1);
        return arr[idx] + sumarray(arr,idx+1);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,5,20,1};
     System.out.println(sumarray(arr,0));
    }
    
}
