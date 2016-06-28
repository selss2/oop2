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
public class AccountBean { // 클래스 ,헤더 접근제한 -클래스 종류
	private int accountNo; // 인스턴스 변수는 초기화 하지 않는다.
	private String name;
	private int money;
	
	private String id;
	private String pw;
	
	/* (non-Javadoc)
		 * @see java.lang.Object#clone()
		 */
			
	public AccountBean(){
		// default constructor 기본 생성자
		// 생성자 오버로딩
		
	}	
	public AccountBean(String name, String id, String pw) {
		this.accountNo = (int) ((Math.random() * 99999) + 100000);
		this.name = name;
		this.id =id;
		this.pw=pw;
		
	}
	public void setAccountNo() {
		this.accountNo = (int) ((Math.random() * 99999) + 100000);
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public void setMoney(int money) {
		this.money += money;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAccountNo() {
		return this.accountNo;
	}
	public void setName(String name) {
		this.name= name;
		// TODO Auto-generated method stub
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}

	public int getMoney() {
		return this.money;

	}
	public String getId() {
		return this.id;
	}

	public String getPw() {
		return this.pw;
	}
	@Override
	public String toString() { // 메소드 오버라이딩 - 한사람당 하나의 값을 가져야하기 때문에 오버라이딩!
		return "Account [계좌번호=" + accountNo + ", " + "이름=" + name + ", " + "잔액=" + money + ", " + "아이디=" + id + "비밀번호=" + pw + "]";
	}
}
