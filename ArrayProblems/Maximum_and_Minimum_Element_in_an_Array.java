// An easy level of problem
// https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
package ArrayProblems;
import java.util.ArrayList;

public class Maximum_and_Minimum_Element_in_an_Array {
    public static void main(String[] args) {
        int arr[]={8,2,4,1,3,6,7,10};
        ArrayList<Integer> res=new ArrayList<>();
        int maxEle=Integer.MIN_VALUE;
        int minEle=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxEle){
                maxEle=arr[i];
            }
            if(arr[i]<minEle){
                minEle=arr[i];
            }
        }
        res.add(minEle); 
        res.add(maxEle);
        System.out.println(res);
    }
}