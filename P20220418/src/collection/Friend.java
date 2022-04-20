package collection;

// 친구의 주소록 : 이름, 연락처
// 학교친구 : 학교이름, 전공과목
// 회사친구 : 회사이름, 부서
public class Friend {
	// 필드
//	public String name;
//	public String phone;

	private String name;
	private String phone;
	private Gender gender; // Stirng 타입이면 남자,남,여,여자 이렇게하지만
							// Gender 파일을 만들어 지정해둔 글자 MEN, WOMEN로 나오게함

	// 생성자
	public Friend() {

	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public Friend(String name, String phone, Gender gender) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
	}

	// 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "친구의 [이름은=" + name + ", 연락처는=" + phone + ", 성별은 =" + gender + " 입니다]";
	}

}
