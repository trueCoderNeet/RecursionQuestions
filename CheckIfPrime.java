package com.src.practice.reccursive.basic;

import java.util.Arrays;
import java.util.List;


public class CheckIfPrime {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(22,6,51,11,61,63,87,99);

		list.stream().forEach(n -> {isPrimeWithoutLoops(n);});


	}
	
	static void isPrimeWithoutLoops(int n){
		System.out.println( (n%2==0 || n%3==0 ||n%5==0 || n==1) ? false : true);
		
	}

}
