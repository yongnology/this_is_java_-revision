package sec04;

public class MyResource implements AutoCloseable {
	// AutoCloseable : 자동으로 닫아주는 인터페이스를 구현
	private String name;
	
	public MyResource(String name) {
		this.name = name;
		System.out.println("[MyResouce(" + name + ")열기]");
	}
	
	public String read1() {
		System.out.println("[MyResouce(" + name + ")읽기]");
		return "100";
	}

	public String read2() {
		System.out.println("[MyResouce(" + name + ")읽기]");
		return "abc";
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("[MyResouce(" + name + ")닫기");
	}
}
