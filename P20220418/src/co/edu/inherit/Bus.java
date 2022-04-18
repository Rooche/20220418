package co.edu.inherit;

public class Bus extends Car {

	// 필드
	String busNo;

	// 생성자
	public Bus() {
		super(); // 부모와 자식의 관계에서는 super라는 키워드는 부모를 가르킴
		System.out.println("Bus() 생성자 호출");
	}

	// 메소드
	public void fee() {
		System.out.println("요금을 받습니다");
	}

	@Override //재정의하는 코드입니다
			  //부모클래스의 규칙에 맞춰서 오류도 알려줌
	public void drive() { //자식 클래스에서 재정의
		System.out.println("버스가 운행을 합니다.");
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", model " + super.model + "]";
	//	return super.toString();
	}
	
	
	
}
