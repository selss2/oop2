package something;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 17.
 * @author :오승준
 * @file   :SomethingController.java
 * @story  :
 */
public class SomethingController {
public static void main(String[] args) {
    Something something = null;

    while (true) {
        switch (JOptionPane.showInputDialog("1.등록 2.조회 0.종료")) {
        case "1":
        String aaa = JOptionPane.showInputDialog("aaa");
        String bbb = JOptionPane.showInputDialog("bbb");
        int ccc = Integer.parseInt( JOptionPane.showInputDialog("ccc"));
        // int ccc = Integer.parseInt(sccc);
        int ddd = Integer.parseInt( JOptionPane.showInputDialog("ddd"));
       something = new Something(aaa, bbb, ccc, ddd);

        break;
        case "2":
        JOptionPane.showMessageDialog(null, "aaa = "+something.getAaa()
        +"bbb = "+something.getBbb()
        +"ccc = "+something.getCcc()
        +"ddd = "+something.getDdd());
        break;
        case "0":
            JOptionPane.showConfirmDialog(null, "정말로 종료하시겠습니까?");
            return;
        }
    }
}
}
