package map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @date :2016. 6. 29.
 * @author :오승준
 * @file :MapEx.java
 * @story :
 */
public class MapEx {
public static void main(String[] args) {
	Map<String, Object> map = new java.util.HashMap<String, Object>();
	Phone note = new Phone();
	note.setFacrtory("삼성");
	note.setProduct("SM-N920F");
	note.setPrice(100);
	
	Phone iphone = new Phone();
	iphone.setFacrtory("애플");
	iphone.setProduct("iphone6plus");
	iphone.setPrice(110);
	
	Phone g5 = new Phone(); 
	g5.setFacrtory("LG");
	g5.setProduct("LG-H830");
	g5.setPrice(90);
	
	map.put("갤노트", note);
	map.put("아이폰", iphone);
	map.put("g5", g5);
	
	List<String> keyList = new ArrayList<String>();
	List<Phone> entryList = new ArrayList<Phone>();
	for (Map.Entry<String, Object> entry: map.entrySet()){ // 엔트리값이 바깥에 있을 경우 맵과 엔트리 둘다 얻는 소스
		keyList.add(entry.getKey());
		entryList.add((Phone) entry.getValue());
		System.out.println("키값목록: "+keyList);
		System.out.println("엔트리값목록 : "+entryList);
	}
	
	for(Map.Entry<String,Object> entry : map.entrySet()){}
	
	}
}

class Phone{
private String facrtory;
private String product;
private int price;


public String getFacrtory() {
	return facrtory;
}

public void setFacrtory(String facrtory) {
	this.facrtory = facrtory;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String toString() {
	return "Phone [facrtory=" + facrtory + ", product=" + product + ", price=" + price + "]";
}
}
