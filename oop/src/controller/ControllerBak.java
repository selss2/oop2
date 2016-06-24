/**
 * 
 */
package controller;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @date :2016. 6. 14.
 * @author :오승준
 * @file :Controller.java
 * @story :
 */
public class ControllerBak {
	public static void main(String[] args) {
		String menu = "";
		Scanner s = new Scanner(System.in);
		Calc calc = new Calc();
		kaup kaup = new kaup();
		MonthEnd monthEnd=new MonthEnd();
		Num1 num1 = new Num1();

		while (true) {
			menu = JOptionPane.showInputDialog("1. 계산기\t" + "2. 카우푸\t" + "3. 년월말 구하기\t" + "4. 1등 구하기\t" + "5. 학번/나이\t"
					+ "6. 최고최저 점수\t" + "7. 세금액\t" + "8. 성별판별\t" + "9. 시분초 구하기\t" + "0. 종료 ");
			switch (menu) {
			case "1":
				System.out.print("첫번째숫자 : ");
				System.out.print("기호를 입력하세요");
				System.out.print("연산자 : ");
				System.out.print("두번째숫자 : ");
				System.out.println(calc.execute(s.nextInt(), s.next(), s.nextInt()));
				break;
			case "2":
				System.out.println("이름을 입력해주세요 : ");
				System.out.println("키를 입력해주세요 : ");
				System.out.println("몸무게를 입력해주세요 : ");
				System.out.println(kaup.input2(s.next(), s.nextDouble(), s.nextDouble()));
				break;
			case "3":
				System.out.println("년 입력?(예)2016");
				System.out.println("월 입력?(예)2");
				System.out.println(monthEnd.input3(s.nextInt(),s.nextInt()));
			case "4":
				

				break;
			case "0":
				JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				return;
			default:
				JOptionPane.showInputDialog(null, "메뉴에 없는 번호입니다.");
				System.out.println("1. 계산기\t" + "2. 카우푸\t" + "3. 년월말 구하기\t" + "4. 1등 구하기\t" + "5. 학번/나이\t"
						+ "6. 최고최저 점수\t" + "7. 세금액\t" + "8. 성별판별\t" + "9. 시분초 구하기\t" + "0. 종료 ");
				break;
			}
		}
	}
}