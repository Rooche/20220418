package co.edu.abstracts;

public abstract class Car {

	private String model;

	public abstract void turnOn(); // 차 시동을 켜는 기능

	public abstract void start(); // 출발기능

	public abstract void run(); // 운전기능

	public abstract void stop(); // 정지기능(멈춤기능)

	public abstract void turnoff(); // 차 시동을 끄는 기능
}
