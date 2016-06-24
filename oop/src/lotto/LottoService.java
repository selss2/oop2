package lotto;

/**
 * @date   :2016. 6. 23.
 * @author :오승준
 * @file   :LottoService.java
 * @story  :
 */
public interface LottoService {
	public void setLottos(LottoBean lot);
	public int[][] getLottos();
	public boolean isDuplication(int count, int num);
	public void  sort(int []arr);
	public int count(LottoBean lot);
	
}