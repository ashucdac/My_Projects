package com.src.biFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bFunc = (x1,x2) -> x1+x2;
		
		var result = bFunc.apply(7, 8);
		System.out.println(result);
		
		BiFunction<Integer, Integer, List<Integer>> bFunc1 = (x1,x2) -> Arrays.asList(x1+x2);
		
		var list = bFunc1.apply(1,3);
		System.out.println(list);

	}

}
