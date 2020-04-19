package com.christianfries.computerarithmetics;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import info.quantlab.numericalmethods.lecture.computerarithmetics.check.DoubleVectorImplemenationChecker;

class DoubleVectorFromArrayTest {

	@Test
	void test() {
		Class<?> classToTest = DoubleVectorFromArray.class;
		
		System.out.println("Testing " + classToTest.getCanonicalName());
		
		boolean success = DoubleVectorImplemenationChecker.check(classToTest);

		if(!success) {
			System.out.println("Sorry, the test failed.");
		}
		else {
			System.out.println("Congratulation! You solved the exercise.");
		}

		System.out.println("_".repeat(79));

		if(!success) fail();
	}
}
