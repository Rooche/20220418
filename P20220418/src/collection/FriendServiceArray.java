package collection;

import java.util.ArrayList;

public class FriendServiceArray implements FriendService {

	Friend[] friends = new Friend[10];

	@Override
	public void addFriend(Friend friend) { //매개변수와 리턴타입을 알아야함
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null){
				friends[i] = friend;
				break;
			}
		}
	}

	@Override
	public void modFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(friend.getName())) {
				friends[i].setPhone(friend.getPhone());
				break;
			}
		}
	}

	@Override
	public void remFriend(String name) {

		for(int i = 0; i < friends.length; i++) {
			if(friends[i]!= null && friends[i].getName().equals(name)) {
				friends[i] = null;
				break;
			}
		}
	}

	@Override
	public Friend findFriend(String name) {
		
		for(int i = 0; i < friends.length; i++) {
			if(friends[i]!= null && friends[i].getName().equals(name)) {
				return friends[i];
			}
		}
		return null;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		return null;
	}

}
