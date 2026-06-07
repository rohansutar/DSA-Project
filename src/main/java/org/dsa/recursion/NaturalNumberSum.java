package org.dsa.recursion;

public class NaturalNumberSum {

    public static void main(String[] args) {
        int n=3;
        System.out.println(new NaturalNumberSum().fun(3));
        System.out.println("==================");
        int sum = n*(n+1)/2;
        System.out.println(sum);
    }
    public int fun(int n){
        if(n==1){
            return 1;
        }

        return n + fun(n-1);
    }
}
