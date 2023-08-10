package sec06;

import javax.naming.InsufficientResourcesException;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		// 출금하기
		try {
			account.withdraw(30000);
		} catch(InsufficientResourcesException  e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}
}

// 실행 결과
/*
예금액 : 10000
잔고부족: 20000모자람
*/
