package org.dsa.array;

public class CountPair {
    public static void main(String[] args) {
        String s = "acgdgag";
        char ch[] = s.toCharArray();
        int count_a=0;
        int sum =0;
        for(int i=0;i<ch.length;i++){
            if(ch[i] == 'a'){
                count_a++;
            }
            if(ch[i]=='g'){
                sum = sum+count_a;
            }
        }
        System.out.println("count of pairs(a,g) ====>"+sum);
    }
}
