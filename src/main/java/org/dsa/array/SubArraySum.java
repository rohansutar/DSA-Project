package org.dsa.array;

public class SubArraySum {

    public static void main(String[] args) {
        int[] arr ={3,2,5};
        int total =0;
        for(int i=0;i<arr.length;i++){
            int sum =0;
           for(int j=i;j< arr.length;j++){
               sum += arr[j];
               total = total+sum;
           }

        }
        System.out.println("Total:: ->"+total);
        total = 0;
        for(int i=0;i< arr.length;i++){
            total+= (i+1) * (arr.length-i) * arr[i];
        }

        System.out.println("Total 1:: ->"+total);
    }
}
