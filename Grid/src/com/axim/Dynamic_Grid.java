package com.axim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dynamic_Grid {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of words you are going to Enter");
		System.out.println("ok");
		int n = s.nextInt();
		System.out.println("Enter the words");
		List<String> l = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			l.add(s.next());

		}

		if (n <= 5) {

			for (int i = 0; i <= 5 - n; i++) {
				l.add(" ");}

				System.out.println("------------------------------------------------------------");

				System.out.format("|%10s |%10s |%10s |%10s |%10s|", l.get(0), l.get(1), l.get(2), l.get(3), l.get(4));
				System.out.println();
				System.out.println("------------------------------------------------------------");

			
		} else if (n <= 10) {
			for (int i = 0; i < 10 - n; i++) {
				l.add(" ");
			}
			System.out.println("------------------------------------------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.format("|%10s ", l.get(i));
			}
			System.out.println("|");
			System.out.println("------------------------------------------------------------");
			for (int i = 5; i < 10; i++) {
				System.out.format("|%10s ", l.get(i));

			}
			System.out.println("|");
			System.out.println("------------------------------------------------------------");

		} else if (n <= 15) {
			for (int i = 0; i < 15 - n; i++) {
				l.add(" ");
			}
			System.out.println("------------------------------------------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.format("|%10s ", l.get(i));
			}
			System.out.println("|");
			System.out.println("------------------------------------------------------------");
			for (int i = 5; i < 10; i++) {
				System.out.format("|%10s ", l.get(i));

			}
			System.out.println("|");
			System.out.println("------------------------------------------------------------");
			for (int i = 10; i < 15; i++) {
				System.out.format("|%10s ", l.get(i));

			}
			System.out.println("|");
			System.out.println("------------------------------------------------------------");

		} else if (n <= 20) {
			for (int i = 0; i < 20 - n; i++) {
				l.add(" ");
			}
			System.out.println("------------------------------------------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.format("|%10s ", l.get(i));
			}
			System.out.println("|");
			System.out.println("------------------------------------------------------------");
			for (int i = 5; i < 10; i++) {
				System.out.format("|%10s ", l.get(i));

			}
			System.out.println("|");
			System.out.println("------------------------------------------------------------");
			for (int i = 10; i < 15; i++) {
				System.out.format("|%10s ", l.get(i));

			}
			System.out.println("|");
			System.out.println("------------------------------------------------------------");
			for (int i = 15; i < 20; i++) {
				System.out.format("|%10s ", l.get(i));

			}
			System.out.println("|");
			System.out.println("------------------------------------------------------------");

		} else if(n<=25) {
			for (int i = 0; i < 25 - n; i++) {
				l.add(" ");
			}
			System.out.println("------------------------------------------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.format("|%10s ", l.get(i));
			}
			System.out.println("|");
			System.out.println("------------------------------------------------------------");
			for (int i = 5; i < 10; i++) {
				System.out.format("|%10s ", l.get(i));

			}
			System.out.println("|");
			System.out.println("------------------------------------------------------------");
			for (int i = 10; i < 15; i++) {
				System.out.format("|%10s ", l.get(i));

			}
			System.out.println("|");
			System.out.println("------------------------------------------------------------");
			for (int i = 15; i < 20; i++) {
				System.out.format("|%10s ", l.get(i));

			}
			System.out.println("|");
			System.out.println("------------------------------------------------------------");
			for (int i = 20; i < 25; i++) {
				System.out.format("|%10s ", l.get(i));

			}
			System.out.println("|");
			System.out.println("------------------------------------------------------------");


		}

	}
}
