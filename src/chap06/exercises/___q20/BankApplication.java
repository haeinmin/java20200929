package chap06.exercises.___q20;

import java.util.Scanner;


public class BankApplication {
	private static Account[] accountArray = new Account[100]; //account를 100개 저장할 수 있는 공간 생성, 현재 null 100개 있는 상태
	private static Scanner scanner = new Scanner(System.in);
	private static int size = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1. Create Account | 2. Account List | 3. Deposit | 4. Withdraw | 5. Exit");
			System.out.println("-------------------------------------------------------");
			System.out.println("Select> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo==3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("Exit");
	}
	
	private static void createAccount() {
		String ano;
		String owner;
		int money;
		
		System.out.println("---------------------");
		System.out.println("Create Account");
		System.out.println("---------------------");
		System.out.println("Account No: ");
		ano = scanner.next();
		System.out.println("Name: ");
		owner = scanner.next();
		System.out.println("Amount: ");
		money = scanner.nextInt();
		
		Account account = new Account(ano, owner, money);
		accountArray[size] = account; //????????????????????????????????
		size++;
		
	}
	
	private static void accountList() {
		System.out.println("---------------------");
		System.out.println("Account List");
		System.out.println("---------------------");
		
		for (int i=0; i<size; i++) {
			Account cur = accountArray[i];
			System.out.println(cur.getAno() + "\t" + cur.getOwner() + "\t" + cur.getBalance());
		}
	}
	
	private static void deposit() {
		System.out.println("---------------------");
		System.out.println("Deposit");
		System.out.println("---------------------");
		
		String ano;
		int money;
		
		System.out.println("Account No: ");
		ano = scanner.next();
		System.out.println("Deposit Amount: ");
		money = scanner.nextInt();
		
		Account cur = findAccount(ano);
		int sum = cur.getBalance() + money;
		cur.setBalance(sum);
		
		System.out.println("Deposit completed");
		
	}
	
	private static void withdraw() {
		System.out.println("---------------------");
		System.out.println("Withdrawal");
		System.out.println("---------------------");
		
		String ano;
		int money;
		
		System.out.println("Account No: ");
		ano = scanner.next();
		System.out.println("Withdrawal Amount: ");
		money = scanner.nextInt();
		
		Account cur = findAccount(ano);
		int sum = cur.getBalance() - money;
		cur.setBalance(sum);
		
		System.out.println("Withdrawal completed");
		
	}
	
	private static Account findAccount(String ano) {
		for(int i=0; i<size; i++) {
			if (accountArray[i].getAno().equals(ano) ) { //?????????????????????
				return accountArray[i];
			}
		}
		return null;
		
	}
}
