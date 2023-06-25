package sec08.exam01;

public class CarExample {
	public static void main(String[] args) {
		// Car °´Ã¼ »ý¼º
		Car myCar = new Car();
		
		// Tire °´Ã¼ ÀåÂø
		myCar.tire = new Tire();
		myCar.run();
		
		// HankookTire °´Ã¼ ÀåÂø
		myCar.tire = new HankookTire();
		myCar.run();
		
		// KumhoTire °´Ã¼ ÀåÂø
		myCar.tire = new KumhoTire();
		myCar.run();
	}
}

// ½ÇÇà °á°ú
/*
È¸ÀüÇÕ´Ï´Ù.
±ÝÈ£ Å¸ÀÌ¾î°¡ È¸ÀüÇÑ´Ù.
ÇÑ±¹ Å¸ÀÌ¾î°¡ È¸ÀüÇÑ´Ù.
*/
