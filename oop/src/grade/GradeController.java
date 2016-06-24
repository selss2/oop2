/**
 * 
 */
package grade;

import javax.swing.JOptionPane;

/**
 * @date :2016. 6. 21.
 * @author :오승준
 * @file :GradeController.java
 * @story :
 */
public class GradeController {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();

		while (true) {
			switch (JOptionPane.showInputDialog("1.입력 2.확인")) {
			case "1":		
				String spec = JOptionPane.showInputDialog("이름, 국,영,수 점수");
				String []specArr = spec.split(",");
				service.reg(specArr[0],Integer.parseInt(specArr[1]),Integer.parseInt(specArr[2]),Integer.parseInt(specArr[3]));
				
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "총점"+service.total()+"평균"+service.evg()+"학점"+service.rank());
				break;
			default:
				JOptionPane.showConfirmDialog(null, "정말로 종료하시겠습니까?");
				return;
			}
		}

	}
}
