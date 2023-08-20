package sec05;

import java.util.StringTokenizer;

// StringTokenizer 클래스
public class StringTokenizerExample {
	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		String[] arr = data1.split("&|,");
		for(String token : arr) {
			System.out.println(token);
		}
		System.out.println();
		
		String data2 = "홍길동/김이박/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");
		while(st.hasMoreElements() ) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}

// 실행 결과
/*
홍길동
이수홍
박연수

홍길동
김이박
박연수
*/
