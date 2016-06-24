package collection;

import java.util.List;
import java.util.Vector;

import school.StudentBean;

/**
 * @date :2016. 6. 23.
 * @author :오승준
 * @file :VartorEx2.java
 * @story :
 */
public class VactorEx2 {
	public static void main(String[] args) {
		List<StudentBean> v = new Vector<StudentBean>();
		StudentBean searchMan = new StudentBean();
		StudentBean hong = new StudentBean("hong", "1", "홍길동", "800101-1");
		StudentBean kim = new StudentBean("kim", "1", "김유신", "900101-1");
		StudentBean lee = new StudentBean("lee", "1", "이순신", "010101-1");
		// searchMan = null;
		
		v.add(hong);
		v.add(kim);
		v.add(lee);
		String searchName = "홍길동";
		
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).getName().equals(searchName)) {
				searchMan = v.get(i);
			}
		}
		if (!searchName.equals(searchMan.getName())) {
			// if(searchMan.getId()==null) {
			System.out.println(searchName + "이라는 이름은 없습니다.");
		} else {
			System.out.println(searchMan.toString());
		}
		if (v.contains(searchMan)) {
			v.remove(v.indexOf(searchMan));
		}else{
			System.out.println("존재X");
		}
		System.out.println(v.size());
	}
}