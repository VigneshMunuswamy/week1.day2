package week1.day2;

public class Calculator {
 int sum,div;
 double mul,diff;
 
 
	public int add(int a, int b) {
		sum=a+b;
		return sum;
	}
	public double diff(double a, double b) {
		diff=a-b;
		return diff;
	}
	public double mul(double a, double b) {
		mul=a*b;
		return mul;
	}
	public int div(int a, int b) {
		div=a/b;
		return div;
	}
	
	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		System.out.println("sum : "+myCal.add(10,20));
		System.out.println("diff : " +myCal.diff(10,20));
		System.out.println("mul : "+myCal.div(10,20));
		System.out.println("div : " +myCal.mul(10,20));

	}
}
