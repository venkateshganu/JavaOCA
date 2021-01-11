package Operators;

public class Test {
    public static void main(String[] args) {
        int x = 9;
        System.out.println(x & 3); //If both bits 1 then 1
        System.out.println(x | 3); //If either bit is one then 1
        System.out.println(x ^ 3); // If both bits different then 1
        System.out.println(x << 3); //Move decimal point 3 points after zeroes
        System.out.println(x >>> 1); //Move decimal point 3 poinst before zeroes
//        System.out.println(x <<< 3); There is no unsigned left shift operator compiler error
        System.out.println(x >>> 3);
    }
}
