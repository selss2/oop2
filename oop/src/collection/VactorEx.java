package collection;

import java.util.List;
import java.util.Vector;

/**
 * @date   :2016. 6. 23.
 * @author :오승준
 * @file   :ListSet.java
 * @story  :
 */
public class VactorEx {
public static void main(String[] args) {
	List<String> v = new Vector<String>(2,5);
	System.out.println("::::::::::Vertor 생성시::::::::::::");
	System.out.println("capacity : "+v);
	System.out.println("size : " +v.size());

v.add("박지성");
v.add("박주영");
v.add("유상철");

System.out.println("::::::::::요소 추가후::::::::::::");
System.out.println("capacity : "+v);
System.out.println("size  : "+v.size());

}
}
