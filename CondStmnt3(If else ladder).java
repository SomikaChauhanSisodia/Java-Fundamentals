
//Find a number is odd or even......(If else)

import java.util.Scanner;

public class CondStmnt3 {
	/*
	 * public static void main(String[] args) { int n;
	 *
	 * Scanner sc = new Scanner(System.in); System.out.println("Enter a number"); n
	 * = sc.nextInt();
	 *
	 * if (n % 2 == 0) { System.out.println("It is a Even Number"); } else {
	 * System.out.println("Its is a Odd Number"); } } }
	 */

//Find person is young or not young.....(If else)

	/*
	 * public static void main(String[] args) { int age; Scanner sc = new
	 * Scanner(System.in); System.out.println("Enter your Age"); age = sc.nextInt();
	 *
	 * if (age >= 14 && age <= 55) { System.out.println("You are Young"); } else {
	 * System.out.println("You are not young"); } } }
	 */

	// Find grades for given marks.....(If else if Ladder)

	public static void main(String[] args) {
		int m1, m2, m3;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks of 3 Subjects");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();

		float avg = (float) (m1 + m2 + m3) / 3;

		if (avg >= 70) {
			System.out.println("You scored,'A'");
		} else if (avg >= 60 && avg < 70) {
			System.out.println("You scored,B");
		} else if (avg >= 50 && avg < 60) {
			System.out.println("You scored,'C'");
		} else if (avg >= 40 && avg < 50) {
			System.out.println("You scored,D");
		} else {
			System.out.println("Grade E");
		}
	}
}
