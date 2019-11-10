package ProgramCreek.Array_String;

public class MinimumSizeSubarraySum {

    public int minSubArray(int target, int[] nums) {

        if (nums == null || nums.length < 1) {
            return 0;
        }

        int i = 0;
        int start = 0;
        int sum = 0;
        int result = nums.length;
        boolean exists = false;

        while (i <= nums.length) {

            if (sum >= target) {
                exists = true;
                if (start == i - 1) {
                    return 1;
                }
                result = Math.min(result, i - start);
                sum = sum - nums[start];
                start++;

            } else {
                if (i == nums.length) break;
                sum = sum + nums[i];
                i++;
            }
        }

        if (exists) {
            return result;
        }

        return 0;
    }
}
