package com.purbarun.junit5;

public class MathUtils {
	public int add() {
		int a=2;
		int b=4;
		return a + b;
	}

	public int mul() {
		int a=4;
		return add()*a;
	}

	public int div() {
		int a=6;
		return mul() / a;
	}
}
