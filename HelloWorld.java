/**
 *
 * author	: Yu Chenghui
 * matric no: A0194474U
 *
 */

import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {

		// declare the necessary variables
    int method;
		String type;
		int i;
		int j;

		// declare a Scanner object to read input
    Scanner scanner = new Scanner(System.in);

		// read input and process them accordingly
    method = scanner.nextInt();

		// method 1
		if (method == 1) {
			int num = scanner.nextInt();
			for (int count = 0; count < num; count++) {
				type = scanner.next();
    		i = scanner.nextInt();
				j = scanner.nextInt();
    		if (type.equals("AND")) {
					System.out.println(i * j);
				} else {
					System.out.println((i + j == 0) ? 0 : 1);
				}
			}
		} else if (method == 2) {
			// method 2

			boolean flag2 = false;
			boolean flag = scanner.hasNextInt();
			if (flag) {
				int number = scanner.nextInt();
			  flag2 = (number == -1 || number == 0);
			}

			while (!flag2) {
				type = scanner.next();
				i = scanner.nextInt();
				j = scanner.nextInt();
				if (type.equals("AND")) {
				 	System.out.println(i * j);
			 	} else {
				 	System.out.println((i + j == 0) ? 0 : 1);
			 	}
				flag = scanner.hasNextInt();
				if (flag) {
					int number2 = scanner.nextInt();
					flag2 = (number2 == -1 || number2 == 0);
				}
			}
		} else {
			// method 3
			while (scanner.hasNext()) {
				type = scanner.next();
				i = scanner.nextInt();
				j = scanner.nextInt();
				if (type.equals("AND")) {
				 	System.out.println(i * j);
			 	} else {
				 	System.out.println((i + j == 0) ? 0 : 1);
			 	}
			}
		}
	}
}
