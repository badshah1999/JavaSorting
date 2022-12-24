import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int array[] = {6,5,1,3,2,8,4,7};
        sort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void sort(int[] nums,int low,int high){
        int start = low;
        int end = high;
        int m = start+(end-start)/2;
        int pivot = nums[m];
        if (low>=high){
            return;
        }
        while (start<=end){
            while (nums[start]<pivot){
                start++;
            }
            while (nums[end]>pivot){
                end--;
            }
            if (start<=end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        sort(nums,low,end);
        sort(nums,start,high);
    }
}
