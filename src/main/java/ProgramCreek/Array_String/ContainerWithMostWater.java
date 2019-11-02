package ProgramCreek.Array_String;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int max = 0;
        if (height == null || height.length < 2) {
            return max;
        }

        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            max = Math.max(max, h * w);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
