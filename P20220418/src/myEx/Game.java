package myEx;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		// System.out.println("[*] [*] [*] [*] [*]");
		// System.out.println("[4] [*] [*] [*] [*]");
		Scanner sc = new Scanner(System.in);

		int[] problem = new int[5];

		for (int i = 0; i < problem.length; i++) {

			problem[i] = (int) (Math.random() * 5) + 1;

			for (int j = 0; j < i; j++) {

				if (problem[i] == problem[j]) {
					i--;
					break;
				}

			}
		}

		while (true) {
			System.out.println("숫자를 선택하세요.");
			int sel = sc.nextInt();
			sc.nextLine();

			for (int i = 0; i < problem.length; i++) {
				problem[i] = i + 1;
			}
			for (int i = 0; i < problem.length; i++) {
				if (i == 3) {
					System.out.print("[" + "*" + "]");
				} else {
					System.out.print("[*]");
				}
			}

		}
	}

}
