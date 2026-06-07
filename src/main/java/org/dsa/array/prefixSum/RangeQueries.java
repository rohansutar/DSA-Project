package org.dsa.array.prefixSum;

public class RangeQueries {

    public static void main(String[] args) {
        //int[] arr = {2,3,4,6,7,8,9};
        int[] arr = {-3,6, 2, 4, 5, 2, 8, -9, 3,1};
        //int[][] queries = {{2,5},{1,4},{0,3},{3,6}};
        int[][] queries = {{4,8},{3,7},{1,3},{0,4},{7,7}};

        //create prefix sum
        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        for(int i=1;i<arr.length;i++){
           pf[i] = pf[i-1]+arr[i];
        }

        //Queries operation

        for(int i=0;i<queries.length;i++){
            int sum =0;
            int left = queries[i][0];
            int right = queries[i][1];
            if(left == 0)
                sum = pf[right];
            else
                sum = pf[right] - pf[left-1];
            System.out.println("left ="+left+" right ="+right+" sum ="+sum);
        }

    }
}
