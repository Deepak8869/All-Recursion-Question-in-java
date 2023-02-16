//Givam an array of size an N and an integer X.The task is to find all the indices of the intger X in an array..
import java.util.*;
public class rec14 {
    static void findindices(int [] arr,int x,int idx){
        if(idx>=arr.length){
            return;
        }
        if(arr[idx]==x){
            System.out.println(idx);
        }
        findindices(arr, x, idx+1);
    } 
    public static void main(String args[]){
        int [] arr = {1,2,4,4,4,5,6};
        int x = 4;
        findindices(arr, x , 0);
    }
}
