package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;import java.util.Map.Entry;

/**
 * @date :2016. 6. 28.
 * @author :오승준
 * @file :MemberServiceImpl.java
 * @story :
 */
public class MemberServiceImpl implements MemberService {
	List<MemberBean> list;
	Map<String, MemberBean> map = new java.util.HashMap<String, MemberBean>();
	MemberBean session;
	String result = "";
	
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
	public void updatePW(MemberBean member) {
		session.setPw(member.getPw());
		map.put(session.getId(), session);
		}
	@Override
	public String delete() {
		map.remove(session).getId();
		session = null;
		return "";
	}
	@Override
	public List<MemberBean> list() {
		List<MemberBean> memberList = new ArrayList<>();
		for (Map.Entry<String, MemberBean> member : map.entrySet()) {
			memberList.add(member.getValue());
		}
		return memberList;
	}
	@Override
	public MemberBean findById(String id) {
		// TODO Auto-generated method stub
		return map.get(id);
	}
	@Override
	public List<MemberBean> findByName(String name) {
		List<MemberBean> list = new ArrayList<MemberBean>();
		for (String key : map.keySet()) {
			if (name.equals(map.get(key).getName())) {
				list.add(map.get(key));
			}
		}
		return list;
	}
		@Override
	public int countByGender(String gender) {
		int count = 0;
		for (String key : map.keySet()) {
			if (gender.equals(map.get(key).getGender())) {
				count++;
			}
		}
		return count;
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return map.size();
	}
}