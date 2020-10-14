package chap06.exercises.q19;

public class Account {
	private int balance;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	public void setBalance(int balance) {
		if (MIN_BALANCE <= balance && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}

	public int getBalance() {
		return this.balance;
	}
}
