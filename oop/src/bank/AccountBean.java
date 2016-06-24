/**
 * 
 */
package bank;

import java.util.Random;

/**
 * @date :2016. 6. 16.
 * @author :오승준
 * @file :Account.java
 * @story :
 */
public class AccountBean {
	private int accountNo; // 인스턴스 변수는 초기화를 하지 않는다
	private String name;
	private int money;

	private String pw;
	private String id;

	/**
	 * 
	 */
	public AccountBean() {
		// default constructor 기본 생성자
		// 생성자 오버로딩
	}

	public AccountBean(String name, String id, String pw) {
		this.accountNo = (int) (Math.random() * 999999) + 100000;
		this.name = name;
		this.id = id;
		this.pw = pw;
	}

	public void setAccountNo() {
	}

	public void setName(String name) {
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAccount() {
		return this.accountNo;
	}

	public String getName() {
		return this.name;
	}

	public int getMoney() {
		return this.money;
	}

	public String getPw() {
		return this.pw;
	}

	public String getId() {
		return this.id;
	}

	@Override
	public String toString() { // 메소드 오버라이딩 - 한사람당 하나의 값을 가져야하기 때문에 오버라이딩!
		return "Account [계좌번호=" + accountNo + ", " + "이름=" + name + ", " + "잔액=" + money + ", " + "비번=" + pw + ", "
				+ "아이디=" + id + "]";
	}
}
