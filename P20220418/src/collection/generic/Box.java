package collection.generic;

public class Box<T> {// T를 사용하여 타입을 파라미터로 사용 String타입으로 사용
	T field; // Object라는 클래스는 클래스의 부모클래스

	public void setField(T field) {
		this.field = field;

	}

	public T getField() {
		return field;

	}

}
