package info.quantlab.numericalmethods.assignments.computerarithmetics.summation;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import info.quantlab.numericalmethods.assignments.computerarithmetics.check.DoubleVectorImplemenationChecker;
import info.quantlab.numericalmethods.lecture.computerarithmetics.summation.DoubleVectorFactory;

public class SummationAssignmentTest {

	@Test
	void testBasicFunctionality() {
		if(!DoubleVectorImplemenationChecker.check(new SummationAssignmentSolution(), "basic")) fail();
	}

	@Test
	void testAccuracy() {
		if(!DoubleVectorImplemenationChecker.check(new SummationAssignmentSolution(), "accuracy")) fail();
	}
}
