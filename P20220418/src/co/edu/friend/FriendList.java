package co.edu.friend;

import java.util.Scanner;

public class FriendList {
	public static void main(String[] args) {
		
	//	final String val = "Hong";
	//	val = "Hong2";

		Friend[] friends = new Friend[10];
		// friends[0] = new UnivFriend("홍길동", "010-1111-2222", "대구대", "컴공");
		// friends[1] = new ComFriend("김길동", "010-3333-4444", "네이버", "개발팀");
		// friends[2] = new Friend("박길동", "010-5555-6666");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. 친구등록 2.리스트 3.조회(이름) 4.종료");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("1.학교친구 2.회사동료");
				int sel = sc.nextInt();
				sc.nextLine();
				Friend friend = null;

				if (sel == 1) {
					System.out.println("이름을 등록합니다.");
					String name = sc.nextLine();
					System.out.println("전화번호를 등록합니다.");
					String phone = sc.nextLine();
					System.out.println("학교를 입력합니다.");
					String univ = sc.nextLine();
					System.out.println("전공를 입력합니다.");
					String major = sc.nextLine();
					System.out.println("정보가 저장되었습니다.");
					
					friend = new UnivFriend(name, phone, univ, major);
					
					for (int i = 0; i < friends.length; i++) {
						if (friends[i] == null) {
							friends[i] = new UnivFriend(name, phone, univ, major);
							break;
						}
					}
				}
				if (sel == 2) {
					System.out.println("이름을 등록합니다.");
					String name = sc.nextLine();
					System.out.println("전화번호를 등록합니다.");
					String phone = sc.nextLine();
					System.out.println("회사를 입력합니다.");
					String company = sc.nextLine();
					System.out.println("부서 입력합니다.");
					String department = sc.nextLine();
					System.out.println("정보가 저장되었습니다.");
					
					friend = new UnivFriend(name, phone, company, department);

					for (int j = 0; j < friends.length; j++) {
						if (friends[j] == null) {
							friends[j] = new ComFriend(name, phone, company, department);
							break;
						}
					}
				}
			} else if (menu == 2) {
				System.out.println("리스트를 보여줍니다.");
				for (Friend friend : friends) {
					if (friend != null) {
						System.out.println("친구정보 : " + friend.toString());
					}
				}

			} else if (menu == 3) {

			}else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;

			}

		}
	}

}
