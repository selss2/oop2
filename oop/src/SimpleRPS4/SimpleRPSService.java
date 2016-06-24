/**
 * 
 */
package SimpleRPS4;
import java.util.Random;
/**
 * @date   :2016. 6. 21.
 * @author :오승준
 * @file   :SimpleRPSService.java
 * @story  : 
 */
public interface SimpleRPSService {
		public abstract String playGame(int player); 
		public abstract String getResult(String result); 
	}

