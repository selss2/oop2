package matrix;

/**
 * @date :2016. 6. 22.
 * @author :오승준
 * @file :Matrix5.java
 * @story :
 */
public class Matrix99dan {
	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 6; j++) {
				int result = i*j;
				System.out.print(j+"*"+i+ "="+ result +"\t");
			}
			System.out.println("");
		}
		System.out.println("\n");
		for (int i = 1; i < 10; i++) {
			for (int j = 6; j < 10; j++) {
				int result = i*j;
				System.out.print(j+"*"+i+ "="+ result +"\t");
			}
			System.out.println("");
	}
}
}
