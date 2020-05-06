package main;

public class Salary {
	public static void main(String[] args) {
		int pay = 8590;
		double hour = 8;
		int month = 20;
		double tax = 0.033;
		double result = (pay * hour * month) - ((pay * hour * month) * tax);
		System.out.println("총 알바비: " + result);
		
	}
}
