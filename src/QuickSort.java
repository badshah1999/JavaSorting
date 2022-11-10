import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int array[] = {6,5,1,3,2,8,4,7};
        sort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void sort(int[] nums,int low,int high){
        int s = low;
        int l = high;
        int m = s+(l-s)/2;
        int pivot = nums[m];
        if (low>=high){
            return;
        }
        while (s<=l){
            while (nums[s]<pivot){
                s++;
            }
            while (nums[l]>pivot){
                l--;
            }
            if (s<=l){
                int temp = nums[s];
                nums[s] = nums[l];
                nums[l] = temp;
                s++;
                l--;
            }
        }
        sort(nums,low,l);
        sort(nums,s,high);
    }
}
