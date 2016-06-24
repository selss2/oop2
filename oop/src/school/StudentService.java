/**
 * 
 */
package school;

/**
 * @date   :2016. 6. 17.
 * @author :오승준
 * @file   :StudentService.java
 * @story  : 
 */
public interface StudentService {
	
	// 1. 등록
public void registStudent(String id, String pw, String name, String ssn);

// 2. 조회
public String showStudent();

// 3. 수정
public void updateStudent(String newPw);

// 4. 삭제
public void deleteStudent();

/**
 * @return
 */
String findStudent();

/**
 * @param pw2
 * @return
 */
boolean checkPassword(String pw2);

}
