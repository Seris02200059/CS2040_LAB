/**
 * Name         : Yu Chenghui
 * Matric. No   : A0194474U
 * PLab Acct.   :
 */

import java.util.*;

public class Ballpassing {
	// attributes
	public int size = 0;
	public Node head = null;
	public Node tail = null;

	private void run() {
		// read initial students
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String student = sc.next();
			addNodeToTail(student);
		}

		int Q = sc.nextInt();

		// j keeps track of the pointer
		int j = 0;

		// n keeps track of the total number of students
		int n = N;

		// every step
		for (int i = 0; i < Q; i++) {
			// read event
			String event = sc.next();

			if (event.equals("NEXT")) {
				// next
				System.out.println(head.next.element);
				head = head.next;
				tail = tail.next;
			} else if (event.equals("LEAVE")) {
				// leave
				System.out.println(head.next.element);
				removeNodeFromHead();
			} else {
				// join
				String newStudent = sc.next();
				addNodeAfterHead(newStudent);
			}
		}
	}

	class Node {
		String element;
	  Node next;
		public Node(String element) {
		  this.element = element;
		}
	}

		public void addNodeToTail(String element) {
			Node node = new Node(element);
			if (size == 0) {
				head = node;
				tail = node;
				node.next = head;
			} else {
				tail.next = node;
				tail = node;
				tail.next = head;
			}
			size++;
		}

		public void addNodeAfterHead(String element) {
			System.out.println(element);
			Node node = new Node(element);
			Node temp = head.next;
			head.next = node;
			head.next.next = temp;
			head = head.next;
			tail = tail.next;
			size++;
		}

		public void removeNodeFromHead() {
			Node temp = head.next;
			tail.next = temp;
			head = temp;
			size--;
		}

	public static void main(String[] args) {
		Ballpassing newBallpassing = new Ballpassing();
		newBallpassing.run();
	}
}
