package org.dsa.array;

public class SubArrayWithGivenSumAndLength {

    public static void main(String[] args) {
        int[] A = {4, 3, 2, 6, 1};
        int B = 2;
        int C = 7;
        System.out.println(new SubArrayWithGivenSumAndLength().checkSubArrayExist(A,B,C));
    }

    public int checkSubArrayExist(int A[],int B,int C){
        if(A.length<B){
            System.out.println("0");
        }

        int curr_sum =0;
        for(int i=0;i<B;i++){
            curr_sum+=A[i];
        }
        if(curr_sum == C){
            return 1;
        }
        int s=1;
        int e = B;

        while(s<=A.length-B){
            curr_sum = curr_sum - A[s-1]+A[e];
            if(curr_sum == C){
                return 1;
            }
            e++;
            s++;

        }
        return 0;

    }
}
