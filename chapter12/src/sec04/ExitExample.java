package sec04;
// 프로세스 종료
public class ExitExample {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			// i출력
			System.out.println(i);
			if(i==5) {
				// JVM 프로세스 종료
				System.out.println("프로세스 강제 종료");
				System.exit(0);
			}
		}
	}
}

// 실행 결과
/*
0
1
2
3
4
5
프로세스 강제 종료
*/
