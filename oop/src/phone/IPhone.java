package phone;

/**
 * @date   :2016. 6. 22.
 * @author :오승준
 * @file   :IPhone.java
 * @story  :
 */
public class IPhone extends CelPhone{
	private String data;
	public final static String KIND = "스마트폰";
	public final static String BRAND = "아이폰";
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
	return KIND + "이기때문에 "+super.getMove()+","
	+ super.getCompany()+ "제품을 가지고," 
	+ super.getCall()+ "(이)라고 통화하고"
	+ this.getData()+ "를 문자로 보냈다.";
	}
}
