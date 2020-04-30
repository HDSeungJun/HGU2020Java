package edu.handong.csee.java;

public class BinaryCalculator {

	private int num1;
	private int num2;
	private char operator;
	private String result;
	
	public static void main(String[] args) {
		int firstNumber = Integer.parseInt(args[0]);
		char operator = args[1].charAt(0);
		int secondNumber = Integer.parseInt(args[2]);
		
		BinaryCalculator myCalculator = new BinaryCalculator();
		myCalculator.setNum1(firstNumber);
		myCalculator.setNum2(secondNumber);
		myCalculator.setOperator(operator);
		
		System.out.println(myCalculator.getResult());
		

	}
	
	public BinaryCalculator()
	{
		num1 = 0;
		num2 = 0;
		operator = '+';
	}
	public BinaryCalculator(int num1, char op, int num2)
	{
		this.num1 = num1;
		operator = op;
		this.num2 = num2;
	}
	
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	public void setOperator(char op)
	{
		operator = op;
	}
	
	public int getNum1()
	{
		return num1;
	}
	public int getNum2()
	{
		return num2;
	}
	public char getOperator()
	{
		return operator;
	}
	
	
	public String getResult()
	{
		if(operator == '+')
			result = num1 + " " + operator + " " + num2 + " = " + (num1+num2);
		else if(operator == '-')
			result = num1 + " " + operator + " " + num2 + " = " + (num1-num2);
		else if(operator == '*')
			result = num1 + " " + operator + " " + num2 + " = " + (num1*num2);
		else if(operator == '/')
			result = num1 + " " + operator + " " + num2 + " = " + (num1/num2);
		
		return result;
	}
}
