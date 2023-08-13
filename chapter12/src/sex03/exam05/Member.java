package sex03.exam05;

import lombok.Data;

@Data
public class Member {
	private String id;
	private String name;
	private int age;
}

// @Data 가 붙게 되면 컴파일 과정에서 기본 생성자와 함께
// Getter, Setter, hashCode(), equals(), toString() 메소드가 자동 생성된다.
