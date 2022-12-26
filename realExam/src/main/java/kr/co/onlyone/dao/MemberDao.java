package kr.co.onlyone.dao;

import java.util.List;

import kr.co.onlyone.domain.MemberVo;

public interface MemberDao {

	List<MemberVo> seletAll(String memName);

	MemberVo getMember(String memId);

	int addMember(MemberVo vo);

	int delMember(String memId); 

}
