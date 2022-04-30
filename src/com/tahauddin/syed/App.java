package com.tahauddin.syed;

import java.util.Arrays;

/**
 * Selection Sort ::
 * its in place algorithm
 * O(n2) nsquare - its Quadratic
 * Selection sort will usually perform better than bubble sort
 * Selection sort is unstable algorithm, if there are duplicates then it might move one step ahead
 * of another duplicate value.
 */
public class App {

    public static void main(String[] args) {

        Integer[] intArrays = {20,35,-1,-55,55,30,0,20,-20};

        System.out.println("Before Sort :: ");
        Arrays.stream(intArrays).forEach(number -> {
            System.out.print(number + " , ");
        });


        /**
         * getting the largest element index and moving it to the last index
         * initially starting with largest = 0, intArray[largest] = 20
         * and then comparing the intArray[i] > intArray[0], if yes then assigning it to largesst
         * now largest element is at ith Position. iterating this for rest of the loop and then
         * calling swap method to move the largest element to last index
         *
         */
        for(int lastUnsortedIndex = intArrays.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;
            for(int i = 0; i <= lastUnsortedIndex; i++){
                if(intArrays[i] > intArrays[largest]){
                    largest = i;
                }
            }
            swapNumbers(intArrays, largest,lastUnsortedIndex);
        }

        System.out.println();
        System.out.println("After Sort :: ");
        Arrays.stream(intArrays).forEach(number -> {
            System.out.print(number + " , ");
        });
    }

    public static void swapNumbers(Integer[] intArray, int i, int j){
        if(i == j){
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
