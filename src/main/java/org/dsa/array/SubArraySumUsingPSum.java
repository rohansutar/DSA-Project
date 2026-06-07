package org.dsa.array;

public class SubArraySumUsingPSum {
    public static void main(String[] args) {
        int[] arr = {3,2,5};
       int total =0 ;
       int [] pfsum= new int[arr.length];
       for(int s=0;s<arr.length;s++){
           if(s==0){
               pfsum[0] = arr[0];
           }else {
               pfsum[s] = pfsum[s-1]+arr[s];
           }
       }
        int sum = 0;
        for(int s =0;s< pfsum.length;s++){

          for(int e=s;e< pfsum.length;e++){
              if(s==0){
                  sum = pfsum[e];
              }else {
                  System.out.println("pfsum["+e+"] - pfsum["+(s-1)+"]"+pfsum[e]+"-"+pfsum[s-1]);
                  sum = pfsum[e] - pfsum[s-1];
              }
              total += sum;
          }
        }
        System.out.println("Total :: "+total);
    }

}
