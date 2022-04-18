package co.edu.inherit;

//상속 받을때는 extends 를 무조건 사용함
public class Taxi extends Car {

	// 필드
	String type; // 개인택시, 회사택시

	// 생성자
	public Taxi() {
		System.out.println("Taxi() 생성자 호출");
	}

	// 메소드
	public void metering() {
		System.out.println("요금 계기판");
	}
	
	@Override
	public void drive() { //자식 클래스에서 재정의
		System.out.println("택시가 운행을 합니다");
	}

	@Override
	public String toString() {
		return "택시의 종류는 " + type;
	}
	

}
