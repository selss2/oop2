package matrix;

/**
 * @date :2016. 6. 22.
 * @author :오승준
 * @file :Zigzag.java
 * @story :
 */
public class Zigzag {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int flag = 1, k = 1, i = 0, j = 0;
		for (i = 0; i < 5; i++) {
			if (flag == 1) {
				for (j = 0; j < 5; j++) {
					mtx[i][j] = k;
				}
			} else {
				// 여기를 채우시오 (for-loop)
			}
			// 여기를 채우시오
		}
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println(mtx[i][j] + "\t");
			}
		}
		System.out.println();
	}
}
