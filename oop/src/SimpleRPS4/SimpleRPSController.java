/**
 * 
 */
package SimpleRPS4;
import java.util.Random;

import javax.swing.JOptionPane;
/**
 * @date   :2016. 6. 21.
 * @author :오승준
 * @file   :simpleRPSController.java
 * @story  : 
 */
//System.out.println("1부터 100까지의 값만 입력하여 주세요.");
//return;
//}
//System.out.println("" + name + "님의 총점은" + total + "점이며, 평균은 " + evg + "입니다. 학점은 " + qwe);
//}
	public class SimpleRPSController {
		public static void main(String[] args) {
			JOptionPane.showMessageDialog(null, "===가위바위보 게임===");
			SimpleRPSService service = new SimpleRPSServiceImpl();
			int comp=0,player=0;
			while (true) {
				switch (JOptionPane.showConfirmDialog(null, "GO?")) {
				case 0:
					JOptionPane.showMessageDialog(null, 
							service.getResult
							(service.playGame
							(Integer.parseInt(JOptionPane.showInputDialog("1가위2바위3보")))));
					break;
				default:
					return;
				}
			}
		}
	}
