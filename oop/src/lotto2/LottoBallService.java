package lotto2;

/**
 * @date   :2016. 6. 24.
 * @author :오승준
 * @file   :LottoBallService.java
 * @story  :
 */
public interface LottoBallService {
	public void setLottoBall();
	public int[] getLottoBall();
	public void  sort(int []arr);
	void setLottoBall(LottoBean lot);
	boolean isDuplication(int num, int i);
}
