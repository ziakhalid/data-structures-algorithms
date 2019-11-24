package ProgramCreek.Array_String.SimplePointer;

public class RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums){

        if(nums == null || nums.length<1){
            return -1;
        }

        int uniqueIndex = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }
}
