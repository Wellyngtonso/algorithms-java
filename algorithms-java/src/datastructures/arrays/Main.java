package datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayInput = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9, 0));

        QuickSort.quickSort(arrayInput, 0, arrayInput.size() - 1);
        System.out.println(arrayInput);
    }
}

class QuickSort {

    public static void quickSort(ArrayList<Integer> array, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(array, start, end);

            quickSort(array, start, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }

    private static int partition(ArrayList<Integer> array, int start, int end) {
        int pivot = array.get(end);
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (array.get(j) <= pivot) {
                i++;

                int temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
            }
        }

        int temp = array.get(i + 1);
        array.set(i + 1, array.get(end));
        array.set(end, temp);

        return i + 1;
    }
}

