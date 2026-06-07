package org.dsa.recursion;

public class DecInc {

    public static void main(String[] args) {

        new DecInc().solve(4);

    }
    public void solve(int A){
        DecThenInc(A);
        System.out.print("/n");
    }
    public void DecThenInc(int A){
        if(A == 0){
            return;
        }
        System.out.print(A+ " ");
        DecThenInc(A-1);
        System.out.print(A+" ");
    }
}
