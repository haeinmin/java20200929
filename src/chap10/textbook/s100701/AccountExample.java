package chap10.textbook.s100701;

import chap05.lecture.Account;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		//deposit
		account.deposit(10000);
		System.out.println("예금액:"+account.getBalance());
		//withdraw
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace(); //exception이 어디서 발생했는지 track해주는 코드
		}
	}
}
