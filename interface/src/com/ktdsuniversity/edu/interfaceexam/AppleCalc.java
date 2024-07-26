package com.ktdsuniversity.edu.interfaceexam;

public class AppleCalc implements Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double div(int a, int b) {
		double result = (double) a / b ;
		int intResult = (int)(result * 100);
		
		return  intResult / 100.0;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
