package bank;

import java.util.List;

/**
 * @date   :2016. 6. 27.
 * @author :오승준
 * @file   :BankService.java
 * @story  :
 */
public interface BankService {
	// 11. 개설
	public String openAccount(AccountBean acc);
	//  READ : 12.조회 (전체)
	public List<AccountBean> accountList();
	//  READ : 13.조회(계좌번호)
	public String findByAccountNo(String accountNo);
	//  READ : 14.조회 (이름)
	public String findByName(String searchName);
	//  READ : 15.조회 (전체 통장수)
	public int count();
	//  READ : 16.통장내역
	public String showAccount();
	//  UPDATE : 17.수정 - 사용자의 요청에 의해 비번만 전환가능
	public void updateAccount();
	// DELETE : 18.해지
	public void deleteAccount();
	/**
	 * @return
	 */
	List<AccountBean> list();
	/**
	 * @return
	 */
	List<AccountBean> AccountList();
}
