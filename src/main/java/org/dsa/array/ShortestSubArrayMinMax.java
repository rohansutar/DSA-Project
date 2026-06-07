package org.dsa.array;

import java.util.Arrays;

public class ShortestSubArrayMinMax {

    public static void main(String[] args) {
       //int[] arr = {1, 5, 2, 3, 5, 1, 4};
        int[] arr = {5,1,1,1,1};
        System.out.println("Length ::"+new ShortestSubArrayMinMax().shortestSubArray(arr));

    }

    public int shortestSubArray(int[] arr){
        int result = -1;// worst case
        if(arr != null && arr.length !=0) {
             result = arr.length;// worst case
            int max = Arrays.stream(arr).max().getAsInt();
            int min = Arrays.stream(arr).min().getAsInt();
            int last_min_idx = -1;
            int last_max_idx = -1;

            for (int i=0;i<arr.length;i++){
                if(arr[i] == max){
                    last_max_idx = i;
                    if(last_min_idx != -1){
                        result = Math.min(result, i-last_min_idx+1);
                    }
                }

                if(arr[i] == min){
                    last_min_idx = i;
                    if(last_max_idx != -1){
                        result = Math.min(result, i-last_max_idx+1);
                    }
                }
            }


        }
        return result;
    }
}
