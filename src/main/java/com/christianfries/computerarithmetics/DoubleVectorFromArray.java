package com.christianfries.computerarithmetics;

import info.quantlab.numericalmethods.computerarithmetics.DoubleVector;

public class DoubleVectorFromArray implements info.quantlab.numericalmethods.computerarithmetics.DoubleVector {

	private final double[] values;

	public DoubleVectorFromArray(double[] values) {
		super();
		this.values = values;
	}

	public DoubleVector of(double[] values) {
		return new DoubleVectorFromArray(values);
	}

	public double sum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
