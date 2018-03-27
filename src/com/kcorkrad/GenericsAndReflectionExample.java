package com.kcorkrad;

public class GenericsAndReflectionExample {

    static class Printer<T> {
        /**
         * Method Name: printArray
         * Print each element of the generic array on a new line. Do not return anything.
         *
         * @param arr is a generic array
         **/

        // Write your code here
        public void printArray(T[] arr) {
            for (T item : arr) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        int numOfClasses = Printer.class.getDeclaredClasses().length;

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);
        System.out.println("The Printer class has " + numOfClasses + " classes");
        //String[] emptyHead = new String [3];
        String[] emptyHead = {"","",""};
    }

}