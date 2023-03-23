package com.menes.leetcode;

public class AddBinary {
    public String addBinary(String a, String b) {
        BigNumber n1 = new BigNumber(a);
        BigNumber n2 = new BigNumber(b);
        n1.add(n2);
        return n1.toString();
    }

}
class BigNumber{
    private static final int CAPACITY = 1500;
    int[] digits;
    int length;
    public BigNumber(String str){
        digits = new int[CAPACITY];
        length = str.length();
        for(int i = 0, j = length - 1;i<length;i++,j--){
            digits[i] = Character.getNumericValue(str.charAt(j));
        }
    }
    public void add(BigNumber other){
        int mem = 0;
        length = Math.max(other.length,this.length);
        for(int i =0;i<length;i++){
            mem+= this.digits[i] + other.digits[i];
            digits[i] = mem%2;
            System.out.println(mem);
            mem/=2;
            System.out.println(mem);
        }
        if(mem > 0)
            digits[length++] = mem;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++)
            sb.append(digits[i]);

        return sb.reverse().toString();
    }
}
