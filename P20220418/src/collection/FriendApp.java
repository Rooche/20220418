package collection;

import java.util.Scanner;

//친구목록저장하기 위한 App.
//추가, 수정, 삭제, 조회
// 1)배열 2)컬렉션 <= 인터페이스 구현
public class FriendApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		FriendService service = new FriendServiceArray();
		// FriendService service = new FriendServiceList();
		// 추가, 수정, 삭제, 조회 => 컨트롤 역할

		while (true) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회");
			System.out.println("선택 >>");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				System.out.println("친구이름을 추가합니다.");
				String name = sc.nextLine();
				System.out.println("연락처를 추가합니다.");
				String phone = sc.nextLine();
				
				Friend friend1 = new Friend(name, phone);
				service.addFriend(null); // 메소드
				
				
				System.out.println("정보를 저장했습니다");

			} else if (menu == 2) {
				service.addFriend(null); // 메소드

			} else if (menu == 3) {
				service.modFriend(null); // 메소드

			} else if (menu == 4) {
				service.modFriend(null); // 메소드

			} else {
				System.out.println("프로그램 종료");
				break;
			}



		}
	}
}