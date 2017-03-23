package sortingnew;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4, 11, 10,111,1,-1, 74,78787, 888888888};
        sort(values);
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        int length = 0;
        while (length < array.length) {
            smallest(array, length);
            length++;
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
