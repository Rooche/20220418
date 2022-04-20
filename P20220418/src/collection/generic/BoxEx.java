package collection.generic;

import java.util.ArrayList;

import collection.Friend;

class Orange extends Object {

}

public class BoxEx {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setField("Orange");
		String reslut = box.getField(); // Object -> String으로 캐스팅

		Box<Integer> box2 = new Box<Integer>();
		box2.setField(10);
		Integer result2 = box2.getField();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김길동");
		
		//<>는 어떤 형태의 타입을 받겠다는걸 지정해주는 의미
		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend("박길동", "010-2222"));
		
//		Orange orang = (Orange) box.getField(); // Object -> Orange

		System.out.println("end of prog.");
	}

}
