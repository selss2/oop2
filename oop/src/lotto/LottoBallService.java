package lotto;

/**
 * @date   :2016. 6. 24.
 * @author :오승준
 * @file   :LottoBallService.java
 * @story  :
 */
public interface LottoBallService {
	public void setLottoBall();
	public int[] getLottoBall();
	boolean isDuplication(int num, int i);
}
