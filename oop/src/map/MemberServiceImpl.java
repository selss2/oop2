package map;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

/**
 * @date :2016. 6. 28.
 * @author :오승준
 * @file :MemberServiceImpl.java
 * @story :
 */
public class MemberServiceImpl implements MemberService {
	
	Map<String,MemberBean> map;
	MemberBean session;
	
	public MemberServiceImpl() {
		map = new HashMap<String,MemberBean>();
	}

	@Override
	public String join(MemberBean member) {
		// 1.회원가입
		String result = "";
		if (map.containsKey(member.getId())) {
			result = "중복된 ID";
		} else {
			map.put(member.getId(), member);
			System.out.println("가입된 비번"+member.getPw());
			result = "가입성공";
		}
		return result;
	}


	@Override
	public String login(MemberBean member) {
		// 2.로그인
		String result = "";
		
		if (map.containsKey(member.getId())) {
			if (findById(member.getId()).getPw().equals(member.getPw())) {
				result = "로그인성공";
				session = findById(member.getId());
			}else{
				result = "로그인실패";
			}
		}else{
			result = "ID가 없습니다";
		}
		
		return result;
	}

	@Override
	public MemberBean detail() {
		return session;
	}

	@Override
	public void updatePw(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean findById(String id) {
		// TODO Auto-generated method stub
		return map.get(id);
	}

	@Override
	public List<MemberBean> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberBean> findByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return map.size();
	}
}