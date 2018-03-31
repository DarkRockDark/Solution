package com.kcorkrad;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ransom {

    private static boolean isNoteFound(String[] mag, String[] note) {
        if (mag.length < note.length) return false;
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        for (String word : mag){
            if (!dictionary.containsKey(word)){
                dictionary.put(word, 1);
            } else {
                dictionary.replace(word, dictionary.get(word) + 1);
            }
        }

        for(String word : note){
            // magazine[magazine_i] = in.next();
            if (dictionary.containsKey(word)) {
                if (dictionary.get(word) == 1) {
                    dictionary.remove(word);
                } else{
                    dictionary.replace(word, dictionary.get(word)-1);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String[] mag = in.next().split("\\s+");
        String[] note = in.next().split("\\s+");
        */
        String[] testCases = {"give me one grand today night", "give one grand today", "two times three is not four", "two times two is four"};
        for (int i = 0; i < testCases.length; i += 2) {
            String[] mag = testCases[i].split("\\s+");
            String[] note = testCases[i+1].split("\\s+");
            System.out.println((isNoteFound(mag, note)) ? "Yes" : "No");
        }
    }
}