import java.util.ArrayList;
import java.util.List;

public class FindTargetIndicesAfterSorting {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;
        int lessnum = 0, equalnum = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < target) lessnum++;
            if(nums[i] == target) equalnum++;
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < equalnum; i++){
            list.add(lessnum + i);
        }
        System.out.println(list);
    }
}
