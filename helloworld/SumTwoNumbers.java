package helloworld;

import java.util.Scanner;

public class SumTwoNumbers {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner obj1 = new Scanner(System.in);
		num1 = obj1.nextInt();
		num2 = obj1.nextInt();
		num3 = num1 + num2;
		System.out.println(" The sum of 2 numbers is: " + num3);

	}

}
