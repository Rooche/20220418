package co.edu.friend;

import java.util.Scanner;

public class FriendList2 {
	public static void main(String[] args) {

		Friend[] friends = new Friend[10]; // 배열 10개 선언

		// friends[0] = new UnivFriend("홍길동", "010-1111-2222", "대구대", "컴정");
		// friends[1] = new ComFriend("김길동", "010-2222-3333", "네이버", "개발팀");
		// friends[2] = new Friend("박길동", "010-5552-3333");
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("1.친구등로 2.리스트 3.조회(이름) 4.종료");
			int menu = scn.nextInt();
			if (menu == 1) {
				Friend friend = null;
				System.out.print("1.학교 2.회사 3.친구");
				// int menu1 = scn.nextInt();
				menu = scn.nextInt();

				System.out.println("친구이름>>");
				String name = scn.next();
				System.out.println("친구연락처>>");
				String phone = scn.next();
				// 이름과 전화번호는 콩통으로 입력할 필드.
				if (menu == 1) {
					System.out.println("회사정보>>");
					String company = scn.next();
					System.out.println("부서정보>>");
					String depart = scn.next();
					new ComFriend(name, phone, company, depart);
				}
				if (menu == 2) {
					System.out.println("학교정보>>");
					String univ = scn.next();
					System.out.println("전공정보>>");
					String major = scn.next();
					friend = new UnivFriend(name, phone, univ, major);
				}
				// 비어 있는 위치배열에 저장
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = friend;
						break;
					}
				}
			} else if (menu == 2) {
				System.out.println("리스트를 보여줍니다.");

				for (Friend friend : friends) {
					if (friend != null) {
						System.out.println("리스트: " + friend.toString());
					}
				}
			} else if (menu == 3) {
				for (Friend friend : friends) {
					if (friend != null) {
						System.out.println("조회: " + friend.toString());
					}
				}
			} else if (menu == 4) {
				System.out.println("프로그램 종료");
				break;
			}

		}

		for (Friend friend : friends) {
			if (friend != null) {
				System.out.println("리스트: " + friend.toString());
			}

		}
	}

	@Override
	public String toString() {
		return "FriendList [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}