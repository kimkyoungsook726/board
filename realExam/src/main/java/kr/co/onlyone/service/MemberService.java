package kr.co.onlyone.service;

import java.util.List;

import kr.co.onlyone.domain.MemberVo;

public interface MemberService {

	List<MemberVo> selectAll(String memName);

	MemberVo getMember(String string, String memPwd);

	int addMember(MemberVo vo);

	int delMember(String memId);



	

}
