package lotto;

import java.util.Arrays;

/**
 * @date :2016. 6. 24.
 * @author :오승준
 * @file :LottoBallServiceImpl.java
 * @story :
 */
public class LottoBallServiceImpl implements LottoBallService {
	private int[] lotto;

	public LottoBallServiceImpl() {
		this.lotto = new int[6];
	}

	@Override
	public void setLottoBall() {
		LottoBean lot = new LottoBean();
		int i = 0;
		while (true) {
			lot.setNumber();
			int num = lot.getNumber();
			this.lotto[i] = num;
			if (isDuplication(num, i)) {
				continue;
			}

			i++;
			if (i == lotto.length) {
				i = 0;
				break;
			}
		}
		Arrays.sort(lotto);
	}

	@Override
	public int[] getLottoBall() {
		return lotto;
	}

	@Override
	public boolean isDuplication(int num, int i) {
		for (int j = 0; j < i; j++) {
			if (lotto[j] == num) {
				return true;
			}
		}
		return false;
	}


}
