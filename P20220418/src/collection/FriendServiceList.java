package collection;

import java.util.ArrayList;


public class FriendServiceList implements FriendService {

	ArrayList<Friend> friends = new ArrayList<Friend>();

	@Override
	public void addFriend(Friend friend) {
		friends.add(friend);
	}

	@Override
	public void modFriend(Friend friend) {
		for (int i = 0; i < friends.size(); i++) {
//			Friend findFriend = (Friend) friends.get(i); //형변환(캐스팅) 해줘야함
			//ArrayList<Friend> friends = new ArrayList<Friend>() 덕분에 위에 있는거처럼 안하고
			//friends.get(i)만 빼서 밑으로 옮겨도 실행됨
			if (friends.get(i).getName().equals(friend.getName())) {
				friends.get(i).setPhone(friend.getPhone());
				break;
			}
		}
	}

	@Override
	public void remFriend(String name) {
		for (int i = 0; i < friends.size(); i++) {
			Friend findFriend = (Friend) friends.get(i);
			if (findFriend.getName().equals(name)) {
				friends.remove(i);
				break;
			}
		}

	}

	@Override
	public Friend findFriend(String name) {
		for (int i = 0; i < friends.size(); i++) {
			Friend findFriend = (Friend) friends.get(i);
			if (findFriend.getName().equals(name)) {
				return findFriend;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		ArrayList<Friend> list = new ArrayList<Friend>();
		for(int i=0; i<friends.size(); i++) {
			if(friends.get(i).getGender() == gender) { 
				//열거형 타입도 클래스타입과 같은 참조타입이다.
				// 기본타입 == 비교연산자
				// 열거형 == 비교연산자로 비교
				list.add(friends.get(i));
			}
		}
		return list;
	}

}
