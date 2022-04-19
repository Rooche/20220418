package co.edu.interfaces;

public class RemoteEx {
	public static void main(String[] args) {
		//상속관계에서는 부모클래스의 참조변수 자식클래스의 인스턴스가 할당
		//
		//	RemoteControl rc = new Television(); //RemoteContrl구현하는 Television을 통해서 인스턴스를 만든다
		RemoteControl rc = null;
//		rc = new Television();
		rc = new Audio(); // 
		
		rc.turnOn();
		rc.volumeUp();
		rc.volumeDown();
		rc.turnOff();
		
		RemoteControl.changeBattery(); //import메소드나 static메소드는 반드시 구현하지 않아도 됨..?
	
	}
}
