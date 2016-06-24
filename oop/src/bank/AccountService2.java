/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

/**
 * @date :2016. 6. 20.
 * @author :오승준
 * @file :AccountService.java
 * @story :
 */

public class AccountService2 {
	// AccountBean에서 생성자를 오버로딩 했음
	// 1.개설 2.입금 3.조회 4.출금, 5.통장내역 6.해지
	AccountBean account = new AccountBean();

	// 1. 개설
	public void openAccount(String name, String id, String pw) {
		account = new AccountBean(name, id, pw);
	}

	// 2. 입금
	public void deposit(int inputMoney) {
		int money = account.getMoney();
		money += inputMoney;
		account.setMoney(money);
	}

	// 3. 조회
	public void findAccount() {
	}

	// 4. 출금
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

	// 5. 통장내역
	public String showAccount() {
		return account.toString();
	}

	// 6. 해지
	public String deletAccount() {
		account = null;
		return "해지";
	}
}
