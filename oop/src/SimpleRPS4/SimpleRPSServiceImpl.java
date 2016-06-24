/**
 * 
 */
package SimpleRPS4;
import java.util.Random;
/**
 * @date   :2016. 6. 21.
 * @author :오승준
 * @file   :SimpleRPSServiceImpl.java
 * @story  : 
 */
public class SimpleRPSServiceImpl implements SimpleRPSService{
	SimpleRPSBean rps = new SimpleRPSBean();
	@Override
	public String playGame(int player) {
		String result = "";
		rps.setPlay(player);
		rps.setComp();
		int com = rps.getComp();
		int ply = rps.getPlay();
		
		
		
		return result;
	}

	@Override
	public String getResult(String result) {
		
		return "플레이어 : "+rps.getValue(rps.getPlay())+"\n"
		+"컴퓨터 : "+rps.getValue(rps.getComp())+"\n"
		+this.playGame(rps.getPlay());
	}

}