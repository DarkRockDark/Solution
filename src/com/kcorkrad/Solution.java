package com.kcorkrad;

public class Solution {

    static private boolean isPrime(int num) {
        if (num == 1) return false;
        if (num == 2) return true;


        // eliminate checking values > sqrt
        double limit = Math.sqrt((double) num) + 1;
        // System.out.println(num + " " + limit );
        // looping by 2 halves time
        for (int i = 3; i < limit; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /*
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        int[] arr = new int[testCases];
        for (int i = 1; i < testCases; i++){
            arr[i] = in.nextInt();
        }
        */
        int[] arr = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529, 576, 625, 676, 729, 784, 841, 907};

        final String PRIME = "Prime";
        final String NOT_PRIME = "Not prime";

        for (int num : arr) {
            System.out.println(isPrime(num) ? num + " is " + PRIME : num + "  " + NOT_PRIME);
        }
    }
}
