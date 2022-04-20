package collection;

import java.util.ArrayList;

public interface FriendService {
	// 규칙
	// 추가, 수정,삭제,조회

	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int SEARCH = 4;
	public int FIND_MEN = 5;
	public int FIND_WOMEN = 6;

	public void addFriend(Friend friend);

	public void modFriend(Friend friend);
//	public void modFriend(String name, String phone); 이런식으로 오면 안됨

	public void remFriend(String name);

	public Friend findFriend(String name);

	public ArrayList<Friend> findGender(Gender gender);

}
