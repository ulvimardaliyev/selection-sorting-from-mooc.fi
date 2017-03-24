package sortingnew;
//we have to import this java util in order to print array's elements
import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        //initialize an array
        int[] values = {8, 3, 7, 9, 1, 2, 4, 11, 10,111,1,-1, 74,78787, 888888888};
        //sorting and printing array
        sort(values);
    }
//creating new static method to help to create solution algorithm
    public static void sort(int[] array) {
        //first, we can see all elements of array and print them
        System.out.println(Arrays.toString(array));
        //we need an int in order to 
        //determine how many times we want to find the smallest number
        int times = 0;
        while (times < array.length) {
            smallest(array, times);
            times++;
            System.out.println(Arrays.toString(array));
        }
    }

    public static void small(int[] array, int index1, int index2) {
        int firstIndexNumber = array[index1], secondIndexNumber = array[index2];
        array[index1] = secondIndexNumber;
        array[index2] = firstIndexNumber;
    }

    public static void smallest(int[] array, int index) {
        int i = index, j = index, enBalacaIndex;
        while (i < array.length) {
            if (j >= array.length) {
                break;
            }
            if (array[i] <= array[j]) {
                j++;
            } else {
                i = j;
            }
        }
        //show index
        enBalacaIndex = i;
        small(array, index, enBalacaIndex);
    }
}
