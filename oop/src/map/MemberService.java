/**
 * 
 */
package map;
import java.util.List;

/**
 * @date   :2016. 6. 28.
 * @author :오승준
 * @file   :MemberService.java
 * @story  :
 */
public interface MemberService {
	/*
	"--- 회원이 보는 화면 ---\n"
	+ "1회원가입 2로그인 3내정보보기(detail) 4내정보수정(비번) 5탈퇴 0종료\n"
	+ "--- 관리자 화면 ---\n"
	+ "11회원목록 12검색(ID) 13검색(이름) 14검색(성별) 15회원수 "))
	 * */
	public String join(MemberBean member); 
	public String login(MemberBean member);
	public MemberBean detail();
	public void updatePW(MemberBean member);
	public String delete();
	public List<MemberBean> list();
	public MemberBean findById(String id);
	public List<MemberBean> findByName(String name);
	public int countByGender(String gender);
	public int count();
}