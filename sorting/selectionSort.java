// "static void main" must be defined in a public class.
import java.util.Arrays;
public class selectionSort {
    public static void main(String[] args) {
        int nums[] = {4,6,1,3,6,4};
        selection_sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    private static void selection_sort(int nums[]){
        for(int i =0; i < nums.length-1; i++){
            int minIndex =i;
            for(int j =i+1; j < nums.length; j++){
                if(nums[j] < nums[minIndex]) minIndex = j;
            }
        
        //swap:
        int temp = nums[i];
        nums[i] = nums[minIndex];
        nums[minIndex] = temp;
            }
        
    }
}
//Logic: Slection sort: jaisa ki word selection bolta : select karo aur sort karo bascially humlog ek ek karke sort karte hum minindex(element) find karte uska correct position mein laate jaise i index ka correct banda ko dhundoh aur lao.
