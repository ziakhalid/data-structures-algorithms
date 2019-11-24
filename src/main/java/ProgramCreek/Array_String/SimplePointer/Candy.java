package ProgramCreek.Array_String.SimplePointer;

public class Candy {

    public int candy(int[] rating){

        if(rating == null || rating.length<1){
            return -1;
        }

        int[] candies = new int[rating.length];
        candies[0] = 1;

        for(int i=1;i<rating.length;i++){
            if(rating[i]>rating[i-1]){
                candies[i] = candies[i-1]+1;
            }else {
                candies[i] = 1;
            }
        }

        int result = candies[rating.length-1];

        for(int i=rating.length-2;i>=0;i--){
            int temp =1;
            if(rating[i]>rating[i+1]){
                temp = candies[i+1]+1;
            }

            temp = Math.max(temp, candies[i]);
            result += temp;
            candies[i] = temp;
        }
        return result;
    }

}
