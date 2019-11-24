package ProgramCreek.Array_String.BinarySearch;

//        [1,3,5,6], 5 -> 2
//        [1,3,5,6], 2 -> 1
//        [1,3,5,6], 7 -> 4
//        [1,3,5,6], 0 -> 0

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        if(nums ==null || nums.length<1){
            return 0;
        }

        int first = 0;
        int last = nums.length - 1;
        int mid;

        while (first<=last){
            mid = (first+last)/2;

            if(nums[mid]>target){
                last = mid-1;
            }else if(nums[mid]<target){
                first = mid+1;
            }else {
                return mid;
            }
        }

        return first;
    }
}
