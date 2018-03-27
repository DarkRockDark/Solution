package com.kcorkrad;

import java.util.ArrayList;
import java.util.Collections;

public class EmailList {

    private static final String DELIM = "@";
    private static final String GMAIL_COM = "gmail.com";

    static class Email{
        String name;
        String email;

        private Email(String line){
            // default constructor expects a single space between valid name and valid email
            String[] nameEmail = line.split("\\s+");
            name = nameEmail[0];
            email = nameEmail[1];
        }

        private String getName(){
            return this.name;
        }
        private String getEmail(){
            return this.email;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        String[] db = {"riya riya@gmail.com", "julia julia@julia.me", "julia sjulia@gmail.com", "julia julia@gmail.com",
                "samantha samantha@gmail.com", "tanya tanya@gmail.com"};
        int items = 6;
        Email[] list = new Email[items];
        for (int i = 0; i < items; i++){
            list[i] = new Email(db[i]);
        }
        for (Email item : list) {
            System.out.println(item.getName() + " yes man " + item.getEmail());
        }
        ArrayList<String> result = new ArrayList<String>();
        String[] emailCheck;
        for (Email item : list) {
            emailCheck = item.email.split(DELIM);
            if (emailCheck[1].equals(GMAIL_COM)){
                result.add(item.name);
            }
        }
        Collections.sort(result);
        for (String name : result){
            System.out.println(name);
        }
    }
}
