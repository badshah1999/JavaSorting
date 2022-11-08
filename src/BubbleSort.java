import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int array[]=new int[]{2,5,4,6,3,1};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j]>array[j+1]){
                    int temp  = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array:"+ Arrays.toString(array));

    }
}
