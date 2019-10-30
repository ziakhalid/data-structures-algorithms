package ProgramCreek.Stack;

import java.util.Stack;

public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights){
        return largestRectangleAreaSolution2(heights);
    }

    private int largestRectangleAreaSolution1(int[] heights) {
        if (heights == null || heights.length < 1) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int max = 0;

        while (i < heights.length) {
            if (stack.isEmpty() || heights[i] > heights[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                int p = stack.pop();
                int height = heights[p];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(height * width, max);
            }
        }

        while (!stack.isEmpty()) {
            int p = stack.pop();
            int height = heights[p];
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            max = Math.max(height * width, max);
        }
        return max;
    }

    private int largestRectangleAreaSolution2(int[] height) {
        Stack<Integer> stack = new Stack<Integer>();

        if (height == null || height.length < 1) {
            return 0;
        }

        int i = 0;
        int max = 0;

        while (i < height.length) {
            if (stack.isEmpty() || height[stack.peek()] <= height[i]) {
                stack.push(i++);
            } else {
                int t = stack.pop();
                max = Math.max(max, height[t]
                        * (stack.isEmpty() ? i : i - stack.peek() - 1));
            }
        }

        return max;
    }
}
