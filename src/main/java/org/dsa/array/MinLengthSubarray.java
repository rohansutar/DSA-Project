package org.dsa.array;


import java.util.Arrays;

public class MinLengthSubarray {
    public static void main(String[] args) {
        //int arr[] = {1, 2, 3, 1, 3, 4, 6, 4, 6, 3};
        int arr[] = {1,1,4,1};
        System.out.println("Length====>"+smallestSubarrayLength(arr));
    }
    public static int smallestSubarrayLength(int[] arr) {


    int n = arr.length;
    int max = Arrays.stream(arr).max().getAsInt();
    int min = Arrays.stream(arr).min().getAsInt();
    int lastMin = -1;
    int lastMax = -1;
    int result = n;

    for(int i = 0;i<n;i++)
    {
        if (arr[i] == max) {
            lastMax = i;
            if (lastMin != -1) {
                result = Math.min(result, i - lastMin + 1);
            }
        }
        if (arr[i] == min) {
            lastMin = i;
            if (lastMax != -1) {
                result = Math.min(result, i - lastMax + 1);
            }
        }
    }

    return result;
}

}
