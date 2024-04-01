package com.zipcodewilmington.arrayutility;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

    private final T[] inputArray;
    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        int count = 0;

        for (T value : inputArray) {
            if (value.equals(valueToEvaluate)) {
                count++;
            }
        }

        for (T value : arrayToMerge) {
            if (value.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }


    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        int count = 0;

        for (T value : inputArray) {
            if (value.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }

    public Integer[] getMostCommonFromMerge(Integer[] arrayToMerge) {
        return arrayToMerge;
    }


    public T[] removeValue(T valueToRemove) {
        List<T> newList = new ArrayList<>();

        for (T value : inputArray) {
            if (!value.equals(valueToRemove)) {
                newList.add(value);
            }
        }
        return newList.toArray((T[]) java.lang.reflect.Array.newInstance(inputArray.getClass().getComponentType(), newList.size()));
    }
}
