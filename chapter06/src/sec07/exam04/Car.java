package sec07.exam04;

public class Car {
	// 琶球 識情
	String company = "薄企切疑託";
	String model;
	String color;
	int maxSpeed;
	
	// 持失切 識情 1
	Car() {}
	
	// 持失切 識情 2
	Car(String model) {
		this.model = model;
	}
	
	// 持失切 識情 3
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// 持失切 識情 4
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
