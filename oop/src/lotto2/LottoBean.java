package lotto2;

import java.util.Random;

/**
 * @date   :2016. 6. 23.
 * @author :오승준
 * @file   :LottoBean.java
 * @story  :
 */
public class LottoBean {
		private int money,number;

		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}

		public int getNumber() {
		//	System.out.println( number);
			return number;
		}

		public void setNumber() {
			this.number = (int) ((Math.random() * 45) + 1);
			 // 로도를 구성하는 랜덤 숫자 하나 발생
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "LottoBean [money=" + money + ", number=" + number + "]";
		}
		
			
	}