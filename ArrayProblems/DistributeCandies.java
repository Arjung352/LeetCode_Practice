import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
     Set<Integer> set=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        int n=candyType.length/2;
        if(set.size()>=n){
            System.out.println(n);
        }
        else{
            System.out.println(set.size());
        }

    }
}