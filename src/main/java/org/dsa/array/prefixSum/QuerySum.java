package org.dsa.array.prefixSum;

public class QuerySum {
    public static void main(String[] args) {

        int[] arr = {-3,6,2,4,5,2,8,-9,3,1};
        int[][] queries = new int[2][2];
        queries[0][0]= 4;
        queries[0][1]= 8;
        queries[1][0]= 3;
        queries[1][1]= 7;

        for(int i=0;i< queries.length;i++){
            int L = queries[i][0];
            int R = queries[i][1];
            int sum = 0;
            for(int j=L;j<=R;j++){
                sum+=arr[j];
            }
            System.out.println("sum::::"+sum);
        }

    }
}
