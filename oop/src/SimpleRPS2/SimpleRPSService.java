/**
 * 
 */
package SimpleRPS2;
import java.util.Random;
/**
 * @date   :2016. 6. 21.
 * @author :오승준
 * @file   :SimpleRPSService.java
 * @story  : 
 */
public interface SimpleRPSService {
		public abstract String playGame(String player); 
		public abstract String getResult(String result); 
	}

