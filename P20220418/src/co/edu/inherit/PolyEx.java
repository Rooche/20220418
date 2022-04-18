package co.edu.inherit;

class Driver{
	
	public void drive(Car car) { //Car라고 하는 인스턴스를 받겠다
		car.drive();
	}
}

public class PolyEx {
	public static void main(String[] args) {
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		Driver driver = new Driver();
		driver.drive(bus); // 매개변수의 다형성
		driver.drive(taxi); // 매개변수의 다형성
	}

}
