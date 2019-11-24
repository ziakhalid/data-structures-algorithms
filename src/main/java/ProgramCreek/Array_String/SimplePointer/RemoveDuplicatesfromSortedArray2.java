package ProgramCreek.Array_String.SimplePointer;

public class RemoveDuplicatesfromSortedArray2 {

    /**
     * Follow up for "Remove Duplicates": What if duplicates are allowed at most twice?
     *
     * For example, given sorted array A = [1,1,1,2,2,3], your function should return length = 5, and A is now [1,1,2,2,3].
     * So this problem also requires in-place array manipulation.
     *
     */


    // 1,1,1,2,2,3
    //   i j
    //   i   j
    //     i j  - swap

    public int removeDuplicates(int[] nums){

        if(nums == null){
            return 0;
        }

        if(nums.length<=2){
            return nums.length;
        }

        int i=1;
        int j=2;

        while (j<nums.length){

            if(nums[i] == nums[j] && nums[j] == nums[i-1]){
                j++;
            }else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
    }

}
