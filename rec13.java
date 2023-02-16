//Given an array of n integers and a target value of x.Print whether x exists in the array or not...
import java.util.*;
public class rec13 {
    static boolean search(int [] arr, int x,int idx){
        if(idx>=arr.length){
            return false;
        }
        if(arr[idx]==x){
            return true;
        }
        return search(arr,x,idx+1);
    }
    public static void main(String args[]){
        int [] arr = {1,2,4,6};
        int x = 4;
        if(search(arr,x,0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    
    }
    
}
