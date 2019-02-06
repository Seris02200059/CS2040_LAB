/**
 * Name         : Yu Chenghui
 * Matric. No   : A0194474U
 * PLab Acct.   :
 */

import java.util.*;

public class Sequences {
	private void run() {
		//use 'DR' to express number D or R
		int N, T;
		long A, DR;
		int i;
		long num;
		Scanner sc = new Scanner(System.in);

		// read input
		N = sc.nextInt();
		T = sc.nextInt();
		A = sc.nextLong();
		DR = sc.nextLong();

		// loop to generate numbers
		for (i = 0; i < N; i++) {
			if (T == 1) {
				// arithmatic sequence
				System.out.print(A + i * DR);
			} else {
				// geometric sequence
				System.out.print(A);
				A = A * DR;
			}

			// format of output
			if (i < N - 1) {
				System.out.print(" ");
			} else {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Sequences newSequences = new Sequences();
		newSequences.run();
	}
}
