package myEx;

import java.util.Arrays;
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
		System.out.println(Arrays.toString(problem));
		
		System.out.println("숫자를 선택하세요.");
		while (true) {
			int sel = sc.nextInt();
			for (int i = 0; i < problem.length; i++) {
				if((sel - 1) == 5) {
					System.out.println("[" + problem[i]+ "]");
				}
			}
		}
	}

}
