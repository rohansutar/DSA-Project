package org.dsa.sorting;

import java.util.Arrays;

public class NobleElement {
    public static void main(String[] args) {
        int arr[] = {1,-5,3,5,-10,4};
        int count = new NobleElement().findNoble(arr, arr.length);
        System.out.println("Count----> "+count);
    }

    int findNoble(int arr[],int n){
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<n;i++){
            if(i == arr[i]){
                ans++;
            }
            System.out.println(ans);
        }
        return ans;
    }
}
