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
		BankServiceImpl bankservice = new BankServiceImpl();
			
		while (true) {
			switch (JOptionPane.showInputDialog("========개인인터넷뱅킹========\n"
					+ "1.개설 2.입금 3.조회 4.출금, 5.통장내역"
					+ "\n========은행창구========\n"
					+ " 11.개설(은행)  12.조회(전체) 13.조회(계좌번호) 14.조회(이름) 15.조회(전체통장수) "
							+ "\n 16.통장내역 17.수정(비밀번호) 18.해지 0.종료")) {
			case "1":
				ok = JOptionPane.showConfirmDialog(null, "통장을 개설하시겠습니까?");
				spec = JOptionPane.showInputDialog("이름, ID, PW");
				String []specArr = spec.split(",");
				service.openAccount(specArr[0], specArr[1], specArr[2]);
				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액?");
				service.deposit(Integer.parseInt(inputMoney));
				//				account.setMoney(Integer.parseInt(inputMoney));
				break;
			case "3":
			//	JOptionPane.showMessageDialog(null, account.getMoney());
				break;
			case "4":
				String output = JOptionPane.showInputDialog("출금액?");
				JOptionPane.showMessageDialog(null, service.withdraw(Integer.parseInt(output)));
				
				break;
			case "5":
				JOptionPane.showMessageDialog(null,service.showAccount());
				break;
			case "11":
				spec = JOptionPane.showInputDialog("이름, ID, PW");
				specArr = spec.split(",");
				AccountBean acc = new AccountBean();
				acc.setAccountNo();
				acc.setName(specArr[0]);
				acc.setId(specArr[1]);
				acc.setPw(specArr[2]);
				bankservice.openAccount(acc);
				break;
			case "12":
				JOptionPane.showMessageDialog(null, bankservice.accountList());
				break;
			case "13":
				String searchAcc = JOptionPane.showInputDialog("검색하려는 계좌번호");
				JOptionPane.showMessageDialog(null, bankservice.findByAccountNo(searchAcc));
				break;
			case "14":
				//bankservice.findByName(JOptionPane.showInputDialog("검색하려는 이름 : "))
				break;
			case "15":
				JOptionPane.showMessageDialog(null, bankservice.count()+"개");
				
				break;
			case "16":
				String showAccount = JOptionPane.showInputDialog("?");
				break;
			case "17":
				String updateAccount = JOptionPane.showInputDialog("?");
				break;
			case "18":
				String deleteAccount = JOptionPane.showInputDialog("?");
				break;
			
			default:
				JOptionPane.showConfirmDialog(null, "정말로 종료하시겠습니까?");
				return;
			}
		}
	}
}
