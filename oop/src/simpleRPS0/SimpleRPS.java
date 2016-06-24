package simpleRPS0;
/**
 * 
 */


import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date :2016. 6. 21.
 * @author :오승준
 * @file :SimpleRPS.java
 * @story :
 */
public class SimpleRPS {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "===가위바위보 게임===");
		int comp=0,player=0;
		String result = "";
		Random r = new Random();
		while (true) {
			switch (JOptionPane.showConfirmDialog(null, "GO?")) {
			case 0:
				String p = JOptionPane.showInputDialog("1가위2바위3보");
				result = gameEngine(result, r, p);
				JOptionPane.showMessageDialog(null, result);
				break;
			default:
				return;
			}
		}
	}
	private static String gameEngine(String result, Random r, String p) {
		switch (p) {
		case "1":
			switch (r.nextInt(3)+1) {
			case 1: result = "TIE"; break;
			case 2: result = "LOSE"; break;
			case 3: result = "WIN"; break;
			default:
				break;
			}
			break;
		case "2":
			switch (r.nextInt(3)+1) {
			case 1: result = "WIN"; break;
			case 2: result = "TIE"; break;
			case 3: result = "LOSE"; break;
			default:
				break;
			}
			break;
		case "3":
			switch (r.nextInt(3)+1) {
			case 1: result = "LOSE"; break;
			case 2: result = "WIN"; break;
			case 3: result = "TIE"; break;
			default:
				break;
			}
			break;
		default:
			break;
		}
		return result;
	}
}