/**
 * 
 */
package school;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


/**
 * @date :2016. 6. 16.
 * @author :오승준
 * @file :Student.java
 * @story :
 */
public class StudentBean {
	
	private String id;
	private String pw;
	private String name;
	private String gender;
	private String regDate;
	private String ssn;
	private int    age;
	
	public StudentBean() {
	}
	
	public StudentBean(String id, String pw,String name,String ssn){
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.ssn = ssn;
		
		
		int sCode = Integer.parseInt(ssn.split("-")[1]);
		this.gender = (sCode+10)%2==0 ? "여" : "남";
		this.regDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
		
		int nowYear = Integer.parseInt(regDate.substring(0,4));
		int birthYear = Integer.parseInt(ssn.substring(0, 2));
		
		switch (sCode) {
			case 1:case 2:case 5:case 6:
				this.age = nowYear - (1900+birthYear)+1;
				break;
			case 9:case 0:
				this.age = nowYear - (1800+birthYear)+1;
				break;
			default:
				this.age = nowYear - (2000+birthYear)+1;
				break;
		}
		
	}
	
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getGender() {
		return gender;
	}
	public String getRegDate() {
		return regDate;
	}
	public String getSsn() {
		return ssn;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return MyConstants.SCHOOL_NAME + " [id=" + id + ", pw=" + pw + ", name=" + name + ", gender=" + gender + ", regDate=" + regDate
				+ ", ssn=" + ssn + ", age=" + age + "]";
	}
}
