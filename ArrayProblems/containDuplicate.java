import java.util.HashSet;
import java.util.Set;

public class containDuplicate {
    public static boolean solution(int arr[]){
Set<Integer> st=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(st.contains(arr[i])){
                return true;
            }
            else{
                st.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(solution(arr));
    }
}
