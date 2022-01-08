package ArrayPractise;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        Sort(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    public static void Sort(int a[], int n) {//a是数组，n是数组长度
        int i, j, temp;
        for (i = 0; i < n-1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
