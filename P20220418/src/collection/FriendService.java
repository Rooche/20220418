package collection;

import co.edu.friend.Friend;

public interface FriendService {
	// 규칙
	// 추가, 수정,삭제,조회
	public void addFriend(Friend friend);

	public void modFriend(Friend friend);

	public void remFriend(String name);

	public Friend findFriend(String name);

}
