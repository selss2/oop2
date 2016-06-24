/**
 * 
 */
package bank;

/**
 * @date   :2016. 6. 20.
 * @author :오승준
 * @file   :AccountServiceImpl.java
 * @story  : 
 */

public class AccountServiceImpl implements AccountService {
	// 1개설 2입금 3조회 4출금 5통장내역 6해지
	AccountBean account;
	
	@Override
	// 1개설
	public void openAccount(String name, String id, String pw) {
		account = new AccountBean(name,id,pw);
	}

	@Override
	// 2입금
	public void deposit(int inputMoney) {
		int money = account.getMoney() ;
		money+=inputMoney;
		account.setMoney(money);
	}

	@Override
	// 3조회
	public void findAccount() {
		
	}

	@Override
	// 4출금
	public String withdraw(int output) {
		String result = "잔액부족";
		int money = account.getMoney();
		if (output <= money) {
			money -= output;
			account.setMoney(money);
			result = String.valueOf(account.getMoney());
		}
		return result;
	}

	@Override
	// 5통장내역
	public String showAccount() {
		return account.toString();
	}

	@Override
	// 6해지
	public String deleteAccount() {
		account = null;
		return "해지";
	}

}