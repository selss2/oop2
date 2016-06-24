package lotto;

/**
 * @date :2016. 6. 24.
 * @author :오승준
 * @file :LottoBallServiceImpl.java
 * @story :
 */
public class LottoBallServiceImpl implements LottoBallService{

	private int[]lottos;
	
	@Override
	public void setLottoBall(LottoBean lot) {
		this.lottos = new int[6];
			int i=0;
			while (true) {
				lot.setNumber();
				int num = lot.getNumber();
				this.lottos[i] = num;
				if (isDuplication(num, i)) {
					continue;
				}
				
				i++;
				if (i==lottos.length) {
					i=0;
					break;
				}
		}
	}

	@Override
	public int[] getLottoBall() {
		return lottos;
	}

	@Override
	public boolean isDuplication (int num, int i) {
		for (int j = 0; j < i; j++) {
			if (lottos[j]==num) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void setLottoBall() {
		
	}

	@Override
	public void sort(int[] arr) {
		
	}

	}
