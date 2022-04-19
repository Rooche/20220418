package collection;

import java.util.ArrayList;

import co.edu.friend.Friend;

// 배열사용해서 저장 vs 컬렉션을 사용해서 저장
// 배열을 활용한 추가적인 프로그램을 구현하고, 컬렉션을 활용한 프로그램을 구현
// 인터페이스를 선언해서 구현하는 클래스를 두가지 버전으로 만들겠다

public class ArrayEx {
	public static void main(String[] args) {
		// 배열은 크기가 변경 불가
		Friend[] friendAry = new Friend[10];
		friendAry[0] = new Friend("홍길동", "010-1111");
		friendAry[1] = new Friend("김길동", "010-2222");
		friendAry[10] = null;
		for (int i = 0; i < friendAry.length; i++) {
			if (friendAry[i] != null) {
				System.out.println(friendAry[i].toString());
			}
		}
		// 컬렉션을 활용. 인터페이스 => List:컬렉션 => ArrayList
		ArrayList<Friend> friendList = new ArrayList<Friend>();
		friendList.add(new Friend("박길동", "010-3333")); //추가
		friendList.add(new Friend("최길동", "010-4444"));
		friendList.remove(0); // 삭제
		
		for(int i=0; i<friendList.size(); i++) {
			System.out.println(friendList.get(i));
		}
	}

}
