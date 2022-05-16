package week1.day2;

public class MyCalculator {

		public static void main(String[] args) {
			Calculator myCal = new Calculator();
			System.out.println("Addition = "+myCal.add(10,20,30));
			System.out.println("Subtraction = "+myCal.diff(100,90));
			System.out.println("Multiplication = "+myCal.mul(11.5,6));
			System.out.println("Division = "+myCal.div(50,5));
		}
}
