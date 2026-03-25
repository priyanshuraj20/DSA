import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {
        int nums[] = {2, 32, 4, 1, 54, 63};
        bubble_Sort(nums);
        System.err.println(Arrays.toString(nums));
    }
    private static void bubble_Sort(int nums[]){
        int n = nums.length;
        for(int i = n-1; i >= 0; i--){
            for(int j =0; j < i; j++){
                if(nums[j] > nums[j+1]){
                    int temp =nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    

}

