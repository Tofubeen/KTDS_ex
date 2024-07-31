package com.ktdsuniversity.edu.exceptions.questexam;

public class CalculatorRegistor {


	public boolean opeRegist(Calculator calculator) {
		
		if(!calculator.getOperator().equals("+") && 
				!calculator.getOperator().equals("-")&&
					!calculator.getOperator().equals("*")&&
						!calculator.getOperator().equals("/")&&
							!calculator.getOperator().equals("exit")) {
			throw new WrongOperatorException("잘못된 연산자를 입력하셨습니다 올바르게 입력해주세요");
		}
		
		return true;
	}
	
}
