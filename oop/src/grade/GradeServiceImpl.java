/**
 * 
 */
package grade;

/**
 * @date   :2016. 6. 21.
 * @author :오승준
 * @file   :GradeServiceImpl.java
 * @story  : 
 */
public class GradeServiceImpl implements GradeService {
	
GradeBean service;
String stuRank = "";

public void reg(String name, int kor, int eng, int math) {
service = new GradeBean(name, kor, math, eng);

}	

	public int total() {
		return service.getKor() + service.getEng() + service.getMath();
	}
	public int evg() {
		return total()/3;
	}
	public String rank() {
		switch (evg()/10) {
		case 9: case 10:
			stuRank = "A";
			break;
		case 8:
			stuRank = "B";
			break;
		case 7:
			stuRank = "C";
			break;
		case 6:
			stuRank = "D";
			break;
		case 5:
			stuRank = "E";
			break;
		case 4:
			stuRank = "F";
			break;
		default:
			return null;
		}
		return stuRank;
		}
	}
//	total = kor + eng + math;
//	evg = total / 3;
//	switch (evg / 10) {
//	case 9: case 10:
//		qwe = "A";
//		break;
//	case 8:
//		qwe = "B";
//		break;
//	case 7:
//		qwe = "C";
//		break;
//	case 6:
//		qwe = "D";
//		break;
//	case 5:
//		qwe = "E";
//		break;
//	case 4:
//		qwe = "F";
//		break;
//	default:
//		System.out.println("1부터 100까지의 값만 입력하여 주세요.");
//		return;
//}
