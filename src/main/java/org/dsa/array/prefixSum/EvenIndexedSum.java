package org.dsa.array.prefixSum;

public class EvenIndexedSum {
    public static void main(String[] args) {

        //int[] arr = {-3,6, 2, 4, 5, 2, 8, -9, 3,1};
        int[] arr = {2,3,1,6,4,5};
        int[][] queries = {{1,3},{2,5},{0,4},{3,3}};
        //int[][] queries = {{4,8},{3,7},{1,3},{0,4},{7,7}};

        int[] pfe = new int[arr.length];
        pfe[0] = arr[0];

        for(int i=1;i< pfe.length;i++){
            if(i%2 == 0)
                pfe[i] = pfe[i-1] + arr[i];
            else
                pfe[i] = pfe[i-1];
        }

        for(int i=0;i< queries.length;i++){
            int sum =0;
            int left = queries[i][0];
            int right = queries[i][1];
            if(left == 0)
                sum = pfe[right];
            else
                sum = pfe[right] - pfe[left-1];

            System.out.println("left ="+left+" right ="+right+" sum ="+sum);
        }
    }
}
