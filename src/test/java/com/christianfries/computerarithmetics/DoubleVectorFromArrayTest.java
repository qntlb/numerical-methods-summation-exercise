package com.christianfries.computerarithmetics;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import info.quantlab.numericalmethods.lecture.computerarithmetics.check.DoubleVectorImplemenationChecker;

class DoubleVectorFromArrayTest {

	@Test
	void test() {
		boolean success = DoubleVectorImplemenationChecker.check(DoubleVectorFromArray.class);

		if(!success) {
			System.out.println("Sorry, the test failed.");
			fail();
		}
		else {
			System.out.println("Congratulation! You solved the exercise.");
		}
	}

}
