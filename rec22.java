//Check if given array is sorted or not...//
import java.util.*;
public class rec22 {
    static boolean sorted(int [] arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
        return sorted(arr, idx+1);
    }
    public static void main(String args[]){
        int [] arr = {1,2,3,4,5};
        sorted(arr, 0);
    }

    
}
