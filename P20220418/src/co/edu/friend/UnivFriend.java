package co.edu.friend;

public class UnivFriend extends Friend {

	private String univ;
	private String major;

	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone); // name과 phone을 부모클래스의 생성자에서 호출하겠습니다
		this.univ = univ;
		this.major = major;
	}

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "학교친구 정보[이름 : " + this.getName() + ", 연락처 :  " + super.getPhone() + ", 학교 : " + univ + ", 학과 : " + major + "]";
	}

}