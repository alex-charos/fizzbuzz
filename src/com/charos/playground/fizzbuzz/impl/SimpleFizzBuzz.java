package com.charos.playground.fizzbuzz.impl;

import java.util.ArrayList;
import java.util.List;

import com.charos.playground.fizzbuzz.FizzBuzz;

public class SimpleFizzBuzz implements FizzBuzz{

	@Override
	public List<String> getBuzz(int from, int to) {
		assert from < to;
		
		List<String> resps = new ArrayList<String>();
		for (int i=from; i<=to;i++) {
			String resp = "";
			if (i%3==0) {
				resp += "Fizz";
			} 
			if (i%5==0) {
				resp += "Buzz";
			}
			
			if (resp.length()==0) {
				resp = String.valueOf(i);
			}
			resps.add(resp);
		}
		
		return resps;
	}

}
