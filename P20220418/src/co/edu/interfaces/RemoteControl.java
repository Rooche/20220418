package co.edu.interfaces;

//인터페이스로 기능을 달리할수있다
public interface RemoteControl {
	// 상수
	public static final int MAX_VOLUME = 10;

	public void turnOn(); // 추상메소드

	public void turnOff();

	public void volumeUp();

	public void volumeDown();

	public default void adjustScreen() {
		System.out.println("화면을 조정합니다.");
	}
	
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
