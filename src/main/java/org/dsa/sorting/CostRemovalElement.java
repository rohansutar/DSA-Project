package org.dsa.sorting;

/*
Given N elements, at every step remove an array element.
Cost to remove an element = Sum of array of elements present in an array Find minimum cost to remove all elements.
*/

import java.util.Arrays;
import java.util.Collections;

public class CostRemovalElement {

    public static void main(String[] args) {
        Integer [] arr={6,2,8,4};

        Arrays.sort(arr, Collections.reverseOrder());
        int ans =0;
        for(int i=0;i< arr.length;i++){
            ans += arr[i] * (i+1);
            System.out.println(ans);
        }
        System.out.println("Ans====> "+ans);
    }
}
