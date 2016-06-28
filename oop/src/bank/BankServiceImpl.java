package bank;

import java.util.ArrayList;
import java.util.List;

/**
 * @date :2016. 6. 27.
 * @author :오승준
 * @file :BankServiceImpl.java
 * @story :
 */

public class BankServiceImpl implements BankService {
	List<AccountBean> list = new ArrayList<AccountBean>();

	public void openAccount(AccountBean bean) {
		list.add(bean);
	}

	public List<AccountBean> list() {
		return list;
	}

	public AccountBean findByAccountNo(String account) {
		AccountBean acc = new AccountBean();
		int i = 0;
		for (; i < list.size(); i++) {
			if (account.equals(String.valueOf(list.get(i).getName()))) {
				acc = list.get(i);
				break;
			}
		}
		return acc;
	}

	public AccountBean findByName(String name) {
		AccountBean findName = new AccountBean();
		int i = 0;
		for (; i < list.size(); i++) {
			if (findName.equals(String.valueOf(list.get(i).getName()))) {
				findName = list.get(i);
				break;
			}
		}
		return findName;
	}
	public int count() {
		return list.size();
	}
	public String updateAccount(AccountBean acc) {
		AccountBean update = new AccountBean();
		String result = "";
		AccountBean temp = this.findByAccountNo(String.valueOf(acc.getAccountNo()));
		if (temp.getId()==null) {
			result = "계좌번호가 존재하지 않습니다.";
		} else {
			temp.setPw(acc.getPw());
			result = "비밀번호가 변경되었습니다.";
		}
		return result;
	}
	
	@Override
	public void showAccount() {
		
	}

	@Override
	public String deleteAccount(AccountBean del) {
		return null;
	}
}
	
