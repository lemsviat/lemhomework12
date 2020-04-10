package main.java.com.lemsviat.lemhomework12;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Integer[] testArray = new Integer[100];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(testArray);
        System.out.println("testArray = " + Arrays.toString(testArray));

        Map<Integer, Integer> result = new TreeMap<>();
        int count = 1;
        for (int i = 0; i < testArray.length-1; i++) {
            if (testArray[i].equals(testArray[i + 1])) {
                count++;
                result.put(testArray[i], count);
                continue;
            }
            count = 1;
        }
        for (Map.Entry<Integer, Integer> item : result.entrySet()) {
            System.out.println("Число " + item.getKey() + " повторяется "
                    + item.getValue()+" раза.");
        }
    }


}
