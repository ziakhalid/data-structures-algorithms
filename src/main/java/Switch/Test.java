package Switch;

public class Test {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6};
        loopTest(input);
    }


    private static void loopTest(int[] nums){

        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            start++;
            end--;
        }

        System.out.println("Value of start : "+nums[start]);
        System.out.println("Value of end : "+nums[end]);

    }

}
