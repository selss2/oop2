/**
 * 
 */
package school;

/**
 * @date   :2016. 6. 20.
 * @author :오승준
 * @file   :StudentServiceImpl.java
 * @story  : 
 */

public class StudentServiceImpl implements StudentService{
	StudentBean stuBean;
	
	@Override
	public void registStudent(String name, String id, String pw, String ssn) {
		stuBean = new StudentBean(name, id, pw, ssn);
	}

	@Override
	public String findStudent() {
		return stuBean.toString();
	}

	@Override
	public void updateStudent(String pw) {
		stuBean.setPw(pw);
	}
	@Override
	public void deleteStudent() {
		stuBean = null;
	}
	@Override
	public boolean checkPassword(String pw2){
		return stuBean.getPw().equals(pw2) ? true : false;
	}

	/* (non-Javadoc)
	 * @see school.StudentService#showStudent()
	 */
	@Override
	public String showStudent() {
		// TODO Auto-generated method stub
		return null;
	}
	
}