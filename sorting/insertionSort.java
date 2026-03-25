import java.util.*;
public class insertionSort {
    public static void main(String[] args) {
        int nums[] = {4,2,6,1,5,3,7};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    
    }
    private static void insertionSort(int nums[]){
        int n =nums.length;
        for(int i = 1; i < n; i++){
            int key = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        
    }
}
//Dekho simply we just hum unsorted part se ek element uthate and sorted part mein correct position pr rakhte uss element ko intially sirf index 0 is sorted!
