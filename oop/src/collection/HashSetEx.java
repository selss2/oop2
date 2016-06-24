package collection;

import java.util.HashSet;
import java.util.Set;

import school.StudentBean;

/**
 * @date :2016. 6. 23.
 * @author :오승준
 * @file :SetEx.java
 * @story :
 */
public class HashSetEx {
	public static void main(String[] args) {
		String[] str = { "Java", "Beans", "Java", "XML" };

		Set<StudentBean> stu = new HashSet<StudentBean>();

		StudentBean hong = new StudentBean("hong", "1", "홍길동", "800101-1");
		StudentBean kim = new StudentBean("kim", "1", "김유신", "900101-1");
		StudentBean lee = new StudentBean("lee", "1", "이순식", "010101-1");

		stu.add(hong);
		stu.add(kim);
		stu.add(lee);

		System.out.println(stu.toString());

	}
}
