package sec08.exam04;
// 오버로딩
public class Calculator {
	// 정사각형 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 직사각형 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
