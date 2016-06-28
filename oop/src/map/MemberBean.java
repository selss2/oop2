/**
 * 
 */
package map;

/**
 * @date   :2016. 6. 28.
 * @author :오승준
 * @file   :MemberBean.java
 * @story  :
 */
public class MemberBean {
	private String id,pw,name,gender;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "회원정보 [id=" + id + ", 비번=" + pw + ", 이름=" + name + ", 성별=" + gender + "]";
	}
	
}
