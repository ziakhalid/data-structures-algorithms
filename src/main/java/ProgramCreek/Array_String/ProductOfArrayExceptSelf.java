package ProgramCreek.Array_String;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums){

        int[] result = new int[nums.length];

        int[] start = new int[nums.length];
        int[] end = new int[nums.length];

        start[0] = 1;
        end[nums.length-1] = 1;

        for(int i=0;i<nums.length-1;i++){
            start[i+1] = nums[i] * start[i];
        }

        for(int i=nums.length-1;i>0;i--){
            end[i-1] = nums[i] * end[i];
        }

        for(int i=0;i<nums.length;i++){
            result[i] = start[i] * end[i];
        }

        return result;

    }

}
