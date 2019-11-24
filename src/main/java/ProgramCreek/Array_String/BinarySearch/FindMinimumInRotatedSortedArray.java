package ProgramCreek.Array_String.BinarySearch;

public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums){

       if(nums == null || nums.length == 0){
           return -1;
       }

       int i =0;
       int j = nums.length-1;

       while (i<=j){

           if(nums[i] <= nums[j]){
               return nums[i];
           }

           int mid = (i+j)/2;

           if(nums[i]> nums[mid]){
               j = mid;
           }else {
               i = mid+1;
           }
       }

       return -1;
    }


}
