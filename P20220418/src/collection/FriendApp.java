package collection;

import java.util.ArrayList;
import java.util.Scanner;

//친구목록저장하기 위한 App.
//추가, 수정, 삭제, 조회
// 1)배열 2)컬렉션 <= 인터페이스 구현
public class FriendApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// FriendService service = new FriendServiceArray();
		FriendService service = new FriendServiceList();
		// 추가, 수정, 삭제, 조회 => 컨트롤 역할

		while (true) {
			System.out.println("1.추가 2.수정 3.삭제 4.조회 5.남자 6.여자");
			System.out.println("선택 >>");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == FriendService.ADD) {
				System.out.println("이름을 추가합니다.");
				String name = sc.nextLine();
				System.out.println("연락처를 추가합니다.");
				String phone = sc.nextLine();
				System.out.println("성별을 적어주세요. ex)남자 / 여자");
				String gender = sc.next();
				Gender gen = Gender.MEN;
				if (gender.startsWith("남")) {
					gen = Gender.MEN;
				} else if (gender.startsWith("여")) {
					gen = Gender.WOMEN;
				}
				Friend friend = new Friend(name, phone, gen);
				service.addFriend(friend); // 메소드

				System.out.println("정보를 저장했습니다");

			} else if (menu == FriendService.MOD) {
				System.out.println("변경할 이름을 적어주세요");
				String name = sc.nextLine();
				System.out.println("변경할 연락처을 적어주세요");
				String phone = sc.nextLine();
				Friend friend = new Friend(name, phone);
				service.modFriend(friend); // 메소드

			} else if (menu == FriendService.DEL) {
				System.out.println("삭제할 이름을 적어주세요");
				String name = sc.nextLine();
				service.remFriend(name); // 메소드

			} else if (menu == FriendService.SEARCH) {
				System.out.println("조회할 이름을 적어주세요");
				String name = sc.nextLine();
				Friend searchFriend = service.findFriend(name);
				service.findFriend(searchFriend.toString()); // 메소드

			} else if (menu == FriendService.FIND_MEN) { //남자친구리스트
				ArrayList<Friend> list = service.findGender(Gender.MEN);
				for (Friend friend : list) {
					System.out.println(friend.toString());
				}

			} else if (menu == FriendService.FIND_WOMEN) { //여자친구리스트
				ArrayList<Friend> list = service.findGender(Gender.WOMEN);
				for (Friend friend : list) {
					System.out.println(friend.toString());
				}
			} else {
				System.out.println("프로그램 종료");
				break;
			}
		}
		System.out.println("end of prog.");
	}
}