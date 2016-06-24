/**
 * 
 */
package grade;

/**
 * @date :2016. 6. 21.
 * @author :오승준
 * @file :GradeBean.java
 * @story :
 */
public class GradeBean {
	private int kor, eng, math, total, rank;
	private String name;
	private double evg;

	public GradeBean(String name, int kor, int math, int eng) {
	this.name = name;
	this.kor = kor;
	this.math = math;
	this.eng = eng;
	
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "GradeBean [kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total + ", rank=" + rank
				+ ", name=" + name + "]";
	}
}
