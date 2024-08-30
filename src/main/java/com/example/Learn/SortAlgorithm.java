package com.example.Learn;

public interface SortAlgorithm {

    public default int[] sort(int[] numbers){
        return numbers;
    }
}
