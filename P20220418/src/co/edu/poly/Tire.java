package co.edu.poly;

public class Tire {
	// 필드
	public int maxRotation; // 최대 10;
	public int accumulateRotation; // 현재까지 사용한 누적회전수
	public String location; // 자동차의 위치

	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;

	}

	// 메소드
	public boolean roll() { // 회전하는 메소드
		accumulateRotation++;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "Trie 수명" + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
}
