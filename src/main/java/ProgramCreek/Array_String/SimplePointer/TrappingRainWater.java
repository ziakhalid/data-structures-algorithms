package ProgramCreek.Array_String.SimplePointer;

public class TrappingRainWater {

    /**
     * Algorithm
     * <p>
     * Find maximum height of bar from the left end upto an index i in the array \text{left\_max}left_max.
     * Find maximum height of bar from the right end upto an index i in the array \text{right\_max}right_max.
     * Iterate over the \text{height}height array and update ans:
     * Add \min(\text{max\_left}[i],\text{max\_right}[i]) - \text{height}[i]min(max_left[i],max_right[i])−height[i] to ansans
     */

    public int trap(int[] height) {

        int result =0;

        if(height == null || height.length<=2){
            return result;
        }

        int[] leftSupport = new int[height.length];
        int[] rightSupport = new int[height.length];

        int max = height[0];
        leftSupport[0] = height[0];

        for (int i = 1; i < height.length; i++) {
            if (height[i] > max) {
                leftSupport[i] = height[i];
                max = height[i];
            } else {
                leftSupport[i] = max;
            }
        }

        rightSupport[height.length - 1] = height[height.length - 1];
        max = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            if(height[i] >max){
                rightSupport[i] = height[i];
                max = height[i];
            }else {
                rightSupport[i] = max;
            }
        }

        for(int i=0; i<height.length;i++){
            result += Math.min(leftSupport[i], rightSupport[i]) - height[i];
        }

        return result;
    }


}
