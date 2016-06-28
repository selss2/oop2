package bank;

import javax.swing.JOptionPane;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

/**
 * @date :2016. 6. 15.
 * @author :오승준
 * @file :BankController.java
 * @story :
 */
public class BankController {

	public static void main(String[] args) {
		int ok = 0;
		String spec = "";
		AccountBean bean = new AccountBean();
		AccountServiceImpl service = new AccountServiceImpl();
		BankServiceImpl bankService = new BankServiceImpl();

		while (true) {
			switch (JOptionPane.showInputDialog("========개인인터넷뱅킹========\n" + "1.개설 2.입금 3.조회 4.출금, 5.통장내역"
					+ "\n========은행창구========\n" + " 11.개설(은행)  12.조회(전체) 13.조회(계좌번호) 14.조회(이름) 15.조회(전체통장수) "
					+ "\n 16.수정(비밀번호) 17.해지 0.종료")) {
			case "1":
				spec = JOptionPane.showInputDialog("이름,ID,PW");

				String[] specArr = spec.split(",");
				service.openAccount(specArr[0], specArr[1], specArr[2]);

				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액 ? ");
				// account.setMoney(Integer.parseInt(inputMoney));
				service.deposit(Integer.parseInt(inputMoney));
				break;
			case "3":
				// JOptionPane.showMessageDialog(null, service.findAccount());
				break;
			case "4":
				String output = JOptionPane.showInputDialog("출금액 ? ");
				service.withdraw(Integer.parseInt(output));
				JOptionPane.showMessageDialog(null, service.withdraw(Integer.parseInt(output)));

				break;
			case "5":
				JOptionPane.showMessageDialog(null, service.showAccount());
				break;
			case "6":
				JOptionPane.showMessageDialog(null, service.deleteAccount());
				break;
			case "11":
				String list = JOptionPane.showInputDialog("이름,ID,PW");

				String[] listArr = list.split(",");
				// listArr = new ArrayList<AccountBean>();
				// service.openAccount(listArr[0],listArr[1],listArr[2]);
				AccountBean acc = new AccountBean();
				acc.setAccountNo();
				acc.setName(listArr[0]);
				acc.setId(listArr[1]);
				acc.setPw(listArr[2]);
				bankService.openAccount(acc);
				break;
			case "12":
				// 조회
				JOptionPane.showMessageDialog(null, bankService.list());
				break;
			case "13":
				// 계좌번호 조회
				String searchAccount = JOptionPane.showInputDialog("검색 계좌 번호 입력하세요");
				bankService.findByAccountNo(searchAccount);
				JOptionPane.showMessageDialog(null, bankService.findByAccountNo(searchAccount));
				break;
			case "14":
				String searchName = JOptionPane.showInputDialog("검색 이름 입력하세요");
				bankService.findByName(searchName);
				JOptionPane.showMessageDialog(null, bankService.findByAccountNo(searchName));
				// 이름 조회
				break;
			case "15":
				JOptionPane.showMessageDialog(null, bankService.count());
				break;
			case "16":
				String change = JOptionPane.showInputDialog("수정하려는 계좌번호, 비밀번호");
				String[] changeArr = change.split(",");
				bean.setAccountNo(Integer.parseInt(changeArr[0]));
				bean.setPw(changeArr[1]);
				JOptionPane.showMessageDialog(null, bankService.updateAccount(bean));
				break;
			case "17":
				String delete = JOptionPane.showInputDialog("해지할 통장의 계좌번호 입력");
				
				
				
				
				
			case "0":
				JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");

				return;

			}
		}
	}
}