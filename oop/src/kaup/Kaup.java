/**
 * 
 */
package kaup;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * @date :2016. 6. 10.
 * @author :오승준
 * @file :kaup.java
 * @story : 카우푸 지수 구하는 프로그램
 */
public class Kaup {
	String name, height, weight;

	public void setName(String name) { // write
		this.name = name;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}

	public String getHeight() {
		return this.height;
	}

	public String getweight() {
		return this.weight;
	}
	public String excute() {
		String result = "";
		double height = Double.parseDouble(this.height), weight = Double.parseDouble(this.weight), kaup = 0.0;

		kaup = weight / (height / 100) / (height / 100);

		if (kaup < 18.5) {
			result = "저체중";
		} else if (kaup < 22.9 && kaup > 18.5) {
			result = "정상";
		} else if (kaup < 24.9 && kaup > 23.0) {
			result = "위험체중";
		} else if (kaup < 29.9 && kaup > 25.0) {
			result = "비만1단계";
		} else if (kaup < 40 && kaup > 30.0) {
			result = "비만2단계";
		} else if (kaup >= 40) {
			result = "비만3단계";
		}
		return name + "님의 BMI지수는" + Double.parseDouble(String.format("%.2f", kaup)) + "이고, " + result;

	}
}