package co.edu.interfaces;

//인터페이스를 구현클래스를 통해서 구현이 되어야한다
public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("TV의 Volume을 올립니다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("TV의 Volume을 내립니다.");
	}
	
	@Override
	public void adjustScreen() {
		System.out.println("화면을 조정합니다.");
	}
	
}
