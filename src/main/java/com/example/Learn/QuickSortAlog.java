package com.example.Learn;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlog implements SortAlgorithm{

    public int[] sort(int[] numbers){
        return numbers;
    }
}
