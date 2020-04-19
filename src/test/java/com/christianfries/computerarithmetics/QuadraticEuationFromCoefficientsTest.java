package com.christianfries.computerarithmetics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import info.quantlab.numericalmethods.lecture.computerarithmetics.check.QuadraticEquationImplemenationChecker;

public class QuadraticEuationFromCoefficientsTest {

	@Test
	void test() {
		Class<?> classToTest = QuadraticEquationFromCoefficients.class;
		
		System.out.println("Testing " + classToTest.getCanonicalName());
		
		boolean success = QuadraticEquationImplemenationChecker.check(classToTest);

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
