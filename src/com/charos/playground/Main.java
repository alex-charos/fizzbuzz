package com.charos.playground;

import java.util.List;

import com.charos.playground.fizzbuzz.FizzBuzz;
import com.charos.playground.fizzbuzz.impl.SimpleFizzBuzz;

public class Main {
	
	public static void main(String args[]) {
		FizzBuzz fb = new SimpleFizzBuzz();
		
		List<String> items = fb.getBuzz(1, 100);
		
		items.stream().forEachOrdered(System.out::println);
		
	}

}
