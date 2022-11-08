import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int array[] = new int[]{2,4,5,8,3,9,1,6,7};
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Selection Sorted Array:"+ Arrays.toString(array));

    }
}
