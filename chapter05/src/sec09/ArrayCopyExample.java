package sec09;
// 배열 복사 System.arraycopy
public class ArrayCopyExample {
	public static void main(String[] args) {
		
		String[] oldStrArray = {"java", "array", "copy" };
		
		String[] newStrArray = new String[5];
		
		// 배열 복사
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		// 복사된 배열 항목 출력
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}

// 실행 결과
/*
java, array, copy, null, null, 
*/
