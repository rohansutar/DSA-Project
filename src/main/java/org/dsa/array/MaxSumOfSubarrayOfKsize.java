package org.dsa.array;

import static java.lang.Integer.max;

public class MaxSumOfSubarrayOfKsize {
    public static void main(String[] args) {
        int arr[] ={-3,4,-2,5,3,-2,8,2,-1,4};
        int max=new MaxSumOfSubarrayOfKsize().maxSubArraySum(arr,5,10);
        System.out.println(max);
         max=new MaxSumOfSubarrayOfKsize().maxSubArraySumSlidingWindow(arr,5,10);
        System.out.println(max);
    }
    public int maxSubArraySumSlidingWindow(int arr[], int k,int n){

        int ans= Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<=k-1;i++){
            sum +=arr[i];
        }
        ans = Math.max(sum,ans);
        int s=1;
        int e=k;
        while (s<=(n-k)){
            sum = sum  + arr[e] - arr[s-1];
            ans = max(ans,sum);
            e++;
            s++;
        }

        return ans;
    }
    public int maxSubArraySum(int arr[], int k,int n){

        int s=0;
        int e=k-1;
        int ans = Integer.MIN_VALUE;

        while(s<=n-k){
            int sum =0;
            for(int i=s;i<=e;i++){
                sum+=arr[i];
            }
            ans = max(ans,sum);
            s++;
            e++;
        }
        System.out.println(ans);
        return ans;
    }
}
