package edu.handong.csee.java;

public class BinaryCalculator {

	private int num1;
	private int num2;
	private int result;
	
	public static void main(String[] args) {
		BinaryCalculator b = new BinaryCalculator(5, 3);
		System.out.println(b.getResult());

	}
	
	public BinaryCalculator()
	{
		num1 = 0;
		num2 = 0;
	}
	
	public BinaryCalculator(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getResult()
	{
		result = num1 + num2;
		return result;
	}
}
