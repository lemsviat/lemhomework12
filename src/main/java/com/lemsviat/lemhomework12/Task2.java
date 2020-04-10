package main.java.com.lemsviat.lemhomework12;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        Integer[] testArray = new Integer[30];
        TreeSet<Integer> testSet = new TreeSet<>();
        int number = 56;

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 100);
        }
        Collections.addAll(testSet, testArray); //убираем дубликаты
        Integer[] arrayWithoutDuplicate = (testSet.toArray(Integer[]::new));
        System.out.println("Массив без дубликатов: " + Arrays.toString(arrayWithoutDuplicate));
        System.out.println("Number = " + number);
        printPairSums(arrayWithoutDuplicate, number);

    }

    static void printPairSums(Integer[] array, int sum) {
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            int s = array[first] + array[last];
            if (s == sum) {
                System.out.println("Элементы "+array[first] + "," + array[last]+" с индексами ["+first+","+last+"].");
                first++;
                last--;
            } else {
                if (s < sum) first++;
                else last--;
            }
        }
    }
}

