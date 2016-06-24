/**
 * 
 */
package grade;

import bank.AccountBean;

/**
 * @date   :2016. 6. 21.
 * @author :오승준
 * @file   :GradeService.java
 * @story  : 
 */
public interface GradeService {
	
	public void reg(String name, int kor, int eng, int math);
	public abstract int total(); 
	public abstract int evg(); 
	public abstract String rank(); 
}