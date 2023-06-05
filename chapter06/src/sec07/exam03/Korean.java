package sec07.exam03;

public class Korean {
	// 필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 생성자 선언
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

// 필드를 구분하기 위해 this 키워드를 필드명 앞에 붙여준다.
// 즉 this는 현재 객체를 말하며, this.name은 현재 객체의 데이터(필드)로서의 name을 뜻한다.
