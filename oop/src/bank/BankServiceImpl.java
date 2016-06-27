/**
 * 
 */
package bank;

import java.util.ArrayList;
import java.util.List;

/**
 * @date   :2016. 6. 27.
 * @author :오승준
 * @file   :BankServiceImpl.java
 * @story  :
 */
public class BankServiceImpl implements BankService{
	private List<AccountBean> accountList;
	public BankServiceImpl() {
		accountList = new ArrayList<AccountBean>();
	}
	public String openAccount(AccountBean acc) {
		accountList.add(acc);
		return null;
	}
	public String findByAccountNo(String accountNo) {
		String searchAccount = "";
		return accountList.toString();
	}
	public String findByName(String searchName) {
		return accountList.toString();
	}
	public int count() {
		return accountList.size();
	}
	public String showAccount() {
		return null;
	}
	public void updateAccount() {
	}
	public void deleteAccount() {
	}
	public List<AccountBean> list() {
		return null;
	}
	public List<AccountBean> AccountList() {
		return null;
	}
	@Override
	public List<AccountBean> accountList() {
		return accountList();
	}
	}
