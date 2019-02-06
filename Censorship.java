/**
 * Name         :
 * Matric. No   :
 * PLab Acct.   :
 */

import java.util.*;

class Censorship {
	private void run() {
		Scanner sc = new Scanner(System.in);

		// num is the number of censored words
		int num = sc.nextInt();

		// declare an array list of censored words
		ArrayList<String> words = new ArrayList<String>();
		for (int i = 0; i < num; i++) {
			String word = sc.next();
			words.add(word);
		}

		// check if all other words should be censored and print the result
		int count = 0;

		while (sc.hasNext()) {
			String str = sc.next();

			// test whether str matches any word in words
			boolean flag = false;
			for (String word : words) {
				word = word.toLowerCase();
				if (word.equals(str.toLowerCase())) {
					flag = true;
				}
			}
			if (count != 0) {
				System.out.print(" ");
			}

			if (flag == true) {
				// str be censored
				for (int i = 0; i < str.length(); i++) {
					System.out.print("*");
				}
			} else {
					// str not censored
						System.out.print(str);
			}
			count++;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Censorship newCensorship = new Censorship();
		newCensorship.run();
	}
}
