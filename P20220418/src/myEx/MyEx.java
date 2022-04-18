package myEx;

import java.util.Arrays;
import java.util.Scanner;

// 두뇌를 사용하는 프로그램을 생성
//[0] [1] [2] [3] [4] =? 1 ~ 5까지 임의 값을 생성/
//[?] [?] [?] [?] [?] 이렇게 랜덤숫자가 들어가있으면 5가 들어가있는 위치를 찾는 게임
//game.java
public class MyEx {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// int ran = (int) (Math.random() * 5) + 1;
		int[] score = new int[5];

		System.out.println("랜덤값 생성");
		for (int i = 0; i < score.length; i++) {

			score[i] = (int) (Math.random() * 5) + 1;

			for (int j = 0; j < i; j++) {

				if (score[i] == score[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(score));
		
		while(true) {
			System.out.println("랜덤 숫자중 5가 몇번째에 있는지 맞추세요.");
			int sel = sc.nextInt();
//			sc.next
			int num = 0;
			if(score[0] < num) {
				System.out.println("틀리셨습니다");
			} else if(score[0] > num){
				System.out.println("틀리셨습니다");
			} else {
				System.out.println("맞추셨습니다");
				break;
			}
			
		}

	}

}
