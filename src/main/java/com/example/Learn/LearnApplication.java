package com.example.Learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnApplication {

	public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlog());
//		int result = binarySearch.binarySearch(new int[]{ 12,4,6},3);
//		System.out.println(result);
		ApplicationContext applicationContext = SpringApplication.run(LearnApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[]{ 12,4,6},3);
		System.out.println(result);

	}

}
