/**
 * Name         :
 * Matric. No   :
 * PLab Acct.   :
 */

import java.util.*;

public class Transpose {
	private void run() {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		ArrayList<String> strs = new ArrayList<String>();

		for (int i = 0; i < R; i++) {
			strs.add(sc.next());
		}

		for (int j = 0; j < C; j++) {
			for (int i = 0; i < R; i++) {
				System.out.print(strs.get(i).charAt(j));
				if (i == R - 1) {
					System.out.println();
				}
			}
		}
	}

	public static void main(String[] args) {
		Transpose newTranspose = new Transpose();
		newTranspose.run();
	}
}
