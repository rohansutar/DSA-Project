package org.dsa.recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(new SumOfDigits().sumOfDigit(56));
    }
    public int sumOfDigit(int A){
        System.out.println("A"+A);
        return A == 0? 0 : A%10 + sumOfDigit(A/10);
    }
}

