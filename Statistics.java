/**
 * Name         :
 * Matric. No   :
 * PLab Acct.   :
 */

import java.util.*;

public class Statistics {
	private void run() {
		long sum = 0;
		double average;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			sum = sum + sc.nextLong();
		}

		average = sum / (double)N;

		System.out.println("Sum: " + sum);
		System.out.println(String.format("Average: %.2f", average));
	}

	public static void main(String[] args) {
		Statistics newStatistics = new Statistics();
		newStatistics.run();
	}
}
