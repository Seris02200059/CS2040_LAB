/**
 * Name         : Yu Chenghui
 * Matric. No   : A0194474U
 * PLab Acct.   :
 */

import java.util.*;

public class HelloWorld {
	private void run() {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		if (word.equals("Hello World")) {
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect");
		}
	}

	public static void main(String[] args) {
		HelloWorld newHelloWorld = new HelloWorld();
		newHelloWorld.run();
	}
}
