/*                Tiling Problem      
 * Given a "2*n" board  and tiles of size "2*1" ,count the number of ways
 * to tile the given board using 2*1 tiles.
 * (A tile can either be placed horizontally or vertically)
 */
import java.util.*;
public class rec23 {
    static int tilingproblem(int n){
        if(n==0 || n==1){
            return 1;
        }


        int verticaltiles = tilingproblem(n-1);
        int horizontaltiles = tilingproblem(n-2);

        int total = verticaltiles + horizontaltiles;
        return total;
    }
    public static void main(String args[]){
        System.out.println(tilingproblem(3));
    }
    
}
