import java.util.*;
public class mergeSort {
    private static void merge(int nums[], int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(nums[left] < nums[right]){
                temp.add(nums[left++]);
            }else{
                temp.add(nums[right++]);
            }
        }
        while(left <= mid){
            temp.add(nums[left++]);
        }
        while(right <= high){
            temp.add(nums[right++]);
        }
        //copy back to original array:
        for(int i=low; i <= high; i++){
            nums[i] = temp.get(i - low);
        }
    }
    private static void merge_sort(int[] nums, int low, int high){
        if(low >= high) return;
        int mid = (low + high)/2;
        merge_sort(nums, low, mid);
        merge_sort(nums, mid+1, high);
        merge(nums, low, mid, high);
    }
    public static void main(String[] args) {
        int nums[] = {2,1,3,4,2,4,1,7,5,8};
        int n = nums.length;
        merge_sort(nums,0,n-1);
        System.out.println(Arrays.toString(nums));
    }
}
//merge sort: is a classical divide and conquer algo. jahan par hum problem ko uske smaller problems mein todhte. so hum arraya ko left half and right half mein todhte jab tak array mein 1ek el aya that is already sorted, then we merge two sorted array.