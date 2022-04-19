package collection;

import co.edu.friend.Friend;

public class FriendServiceArray implements FriendService {
	
	
	Friend[] friends = new Friend[10];

	@Override
	public void addFriend(Friend friend) {
		
		for(int i = 0; i < friends.length; i++) {
			
			friends[i] = friend;
			
			break;
		}
	}

	@Override
	public void modFriend(Friend friend) {

	}

	@Override
	public void remFriend(String name) {
	}

	@Override
	public Friend findFriend(String name) {
		return null;
	}

}
