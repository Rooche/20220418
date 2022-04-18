package co.edu.abstracts;

public abstract class Animal { //abstract이걸 사용하면 추상클래스가 됨
	//Animal() 클래스의 생성자로 인스턴스를 생성 못하도록 하겠습니다 라는 목적이 있음
	
	public Animal() {
		
	}
	
	//여기에서는 구현을 하지 않고 메소드만 정의한다는 뜻
	public abstract void eat();	//강제로 eat()를 구현하도록
	
	public abstract void run();
	
	public abstract void sleep();
	
}
