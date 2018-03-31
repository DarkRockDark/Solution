package com.kcorkrad;

import java.util.*;

public class BitwiseAnd {

    static class Pair{
        int setLength;
        int maxValue;

        private Pair(int al, int mv){
            maxValue = mv;
            setLength = al;
        }

        private void bitwiseAndResults(){
            for (int i = 1; i < setLength; i++){
                for (int j = i+1; j <= setLength; j++){
                    System.out.println("A = " + i + ", B = " + j + "; A&B = " +
                            (i & j));
                }
            }
        }

        private int maxBitwiseAndLessThan(){
            int result = 0;
            for (int i = 1; i < setLength; i++){
                for (int j = i+1; j <= setLength; j++){
                    result = (i & j) < maxValue && (i & j) > result ? (i & j) : result;
                }
            }
            return result;
        }

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
/*        Scanner in = new Scanner(System.in);
        int numTestCases = in.nextInt();
        Pair cases[] = new Pair[numTestCases];
        for (int i = 0; i < numTestCases; i++){
            cases[i] = new Pair(in.nextInt(),in.nextInt());
        }*/
        Pair cases[] = new Pair[3];
        cases[0] = new Pair(5,2);
        cases[1] = new Pair(8,5);
        cases[2] = new Pair(2,2);


        for (Pair item : cases){
            // System.out.println(item.setLength + " " + item.maxValue);
            // item.bitwiseAndResults();
            System.out.println(item.maxBitwiseAndLessThan());
        }

    }
}