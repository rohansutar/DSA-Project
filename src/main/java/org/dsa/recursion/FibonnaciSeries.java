package org.dsa.recursion;

public class FibonnaciSeries {
    public static void main(String[] args) {
        System.out.println(new FibonnaciSeries().fibonaci(-4));
    }
    public int fibonaci(int A){

        if (A < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        if(A == 0){
            return 0;
        }
        if(A == 1){
            return 1;
        }
        System.out.println("A "+A);
        return fibonaci(A-1)+fibonaci(A-2);
    }
}
