/**
 * 
 */
package SimpleRPS2;
import java.util.Random;

import javax.swing.JOptionPane;
/**
 * @date   :2016. 6. 21.
 * @author :오승준
 * @file   :simpleRPSController.java
 * @story  : 
 */


	public class SimpleRPSController {
		public static void main(String[] args) {
			JOptionPane.showMessageDialog(null, "===가위바위보 게임===");
			SimpleRPSService service = new SimpleRPSServiceImpl();
			int comp=0,player=0;
			while (true) {
				switch (JOptionPane.showConfirmDialog(null, "GO?")) {
				case 0:
					JOptionPane.showMessageDialog(null, service.getResult(service.playGame(JOptionPane.showInputDialog("1가위2바위3보"))));
					break;
				default:
					return;
				}
			}
		}
	}
