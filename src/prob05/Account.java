package prob05;

public class Account {
	
	private String accountNo;
	private int balance;
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(accountNo + " 계좌가 개설되었습니다.");
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void save(int saveMoney) {
		setBalance(saveMoney);
		System.out.println(accountNo + " 계좌에 " + balance + "만원이 입금되었습니다.");
	}

	public void deposit(int depositMoney) {
		if(depositMoney > 0) {
			balance = balance - depositMoney;
		}
		System.out.println(accountNo + " 계좌에 " + depositMoney + "만원이 출금되었습니다.");
	}
	
}
