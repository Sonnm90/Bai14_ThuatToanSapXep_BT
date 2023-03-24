package BT1;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
//
        int[] arr = new int[500000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        long begin = (System.nanoTime());
        insertionSort(arr);
        long end = (System.nanoTime());

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("thời gian:"+(end-begin));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
//            System.out.println("Step "+i+" ");
            int key = arr[i];
//            System.out.println("key: " +key);
            int j = i - 1;
//            System.out.println("index "+j+" "+arr[j]);
//            System.out.println(Arrays.toString(arr));

            /* Di chuyển các phần tử có giá trị lớn hơn key về sau một vị trí */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
//            System.out.println(Arrays.toString(arr));
            arr[j + 1] = key;
        }
    }
}