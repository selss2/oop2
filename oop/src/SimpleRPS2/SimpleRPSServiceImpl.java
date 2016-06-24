/**
 * 
 */
package SimpleRPS2;
import java.util.Random;
/**
 * @date   :2016. 6. 21.
 * @author :오승준
 * @file   :SimpleRPSServiceImpl.java
 * @story  : 
 */
public class SimpleRPSServiceImpl implements SimpleRPSService {
public String playGame(String p) {
	Random r = new Random();
	String result = "";
	
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
@Override
public String getResult(String result) {
	
	return "플레이어 : "+result;
}

}