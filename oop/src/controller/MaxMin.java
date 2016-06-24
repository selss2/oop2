package controller;

import java.util.Scanner;

/**
 * @date :2016. 6. 14.
 * @author :오승준
 * @file :Num1.java
 * @story :1등을 출력하시오
 */
public class MaxMin {
	public void execute(int[] scores) {
		/**
		 * 학생수는 입력받습니다. 학생의 점수만 입력해서 최고점과 최저점만 출력하는 로직을 작성하시오
		 **/
		Scanner s = new Scanner(System.in);
		int max = 0, min = 100;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
			if (scores[i] < min) {
				min = scores[i];
			}
		}
		System.out.println("최고점 : " + max + "점 / 최저점 :" + min + "점");
	}
}
