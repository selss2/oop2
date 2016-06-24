package controller;
import java.util.Scanner;
/**
 * @date :2016. 6. 14.
 * @author :오승준
 * @file :Num1.java
 * @story :1등을 출력하시오
 */
public class Num1 {
	/**
	 * 학생수는 입력받습니다. 학생의 점수만 입력해서 최고점과 최저점만 출력하는 로직을 작성하시오
	 **/
	public String execute(int[] score) {
		int max = 0, min = 100;
		for (int i = 0; i < score.length; i++) {
			if (score[i] >max) {
				max = i;
			} else if (score[i]< min) {
				min = i;
			}
		}
			return "최고점 : "+max+", 최저점 : "+min;
		}
	}
