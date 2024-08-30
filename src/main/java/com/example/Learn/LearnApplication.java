package com.example.Learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlog());
		int result = binarySearch.binarySearch(new int[]{ 12,4,6},3);
		System.out.println(result);
		//SpringApplication.run(LearnApplication.class, args);
	}

}
