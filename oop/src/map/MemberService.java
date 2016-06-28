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
	
	
	// 1 회원가입
	public String join(MemberBean member);
	// 2 로그인
	public String login(MemberBean member);
	// 3 내정보보기
	public MemberBean detail();
	// 4 내정보수정(비번)
	public void updatePw(MemberBean member);
	// 5 회원탈퇴
	public String delete();
	
	// 11 회원목록
	public List<MemberBean> list();
	// 12 검색(ID)
	public MemberBean findById(String id);
	// 13 검색(이름)
	public List<MemberBean> findByName(String name);
	// 14 검색(성별)
	public List<MemberBean> findByGender(String gender);
	// 15 회원수
	public int count();
}
