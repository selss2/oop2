/**
 * 
 */
package bank;

import java.util.Random;

import javax.swing.JOptionPane;

import global.MyConstants;

/**
 * @date :2016. 6. 15.
 * @author :오승준
 * @file :BankController.java
 * @story :
 */
public class BankController {
	
	
	public static void main(String[] args) {
		int ok = 0;
		AccountServiceImpl service = new AccountServiceImpl();

		while (true) {
			switch (JOptionPane.showInputDialog("1.개설 2.입금 3.조회 4.출금, 5.통장내역 0.종료")) {
			case "1":
				ok = JOptionPane.showConfirmDialog(null, "통장을 개설하시겠습니까?");
				String spec = JOptionPane.showInputDialog("이름, ID, PW");
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
			default:
				JOptionPane.showConfirmDialog(null, "정말로 종료하시겠습니까?");
				return;
			}
		}
	}
}
