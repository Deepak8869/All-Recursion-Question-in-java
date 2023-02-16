//Given an array of intgers ,print sum of all subsets in it.Output sum can be printed in any order//
import java.util.*;
public class rec20 {
   static void subsetsum(int [] arr,int idx,int sum){
    if(idx>=arr.length){
        System.out.print(sum + " ");
        return;
    }


    subsetsum(arr,idx+1,sum + arr[idx]);
    subsetsum(arr, idx+1 , sum);

   } 
   public static void main(String args[]){
    int [] arr = {2,4,5};
    subsetsum(arr,0,0);  
   }
}
