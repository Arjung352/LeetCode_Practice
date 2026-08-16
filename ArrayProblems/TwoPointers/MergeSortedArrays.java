public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // here m and n are the length for the arrays nums1 and nums2
        
        // pointers for the nums1 and nums2
        int arr1=0;
        int arr2=0;

        int res[]=new int[m+n];
        int i=0;

        while (arr1 < m && arr2 < n) {

            if (nums1[arr1] < nums2[arr2]) {
                res[i] = nums1[arr1];
                i++;
                arr1++;
            }
            else if (nums1[arr1] > nums2[arr2]) {
                res[i] = nums2[arr2];
                i++;
                arr2++;
            }
            else {
                res[i] = nums1[arr1];
                i++;
                res[i] = nums2[arr2];
                i++;
                arr1++;
                arr2++;
            }
        }
        
        // Add remaining elements from nums1
        while (arr1 < m) {
            res[i] = nums1[arr1];
            i++;
            arr1++;
        }

        // Add remaining elements from nums2
        while (arr2 < n) {
            res[i] = nums2[arr2];
            i++;
            arr2++;
        }

        for (i = 0; i < m + n; i++) {
            nums1[i] = res[i];
        }
    }
}
