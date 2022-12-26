package kr.co.onlyone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import kr.co.onlyone.dao.MemberDao;
import kr.co.onlyone.domain.MemberVo;

@Service
public class MemberServiceImpl implements MemberService{

	private MemberDao dao;
	
	@Autowired
	public void setDao(MemberDao dao) {
		this.dao = dao;
	}

	@Override
	public List<MemberVo> selectAll(String memName) {
		
		return dao.seletAll(memName);
	}
	
	@Override
	 public MemberVo getMember(String memId, String memPwd) {
	
		MemberVo vo=null;
		vo= dao.getMember(memId);
		 if( vo !=null) {
			 if( memPwd.equals(vo.getMemPwd())) {
				 return vo;
			 }
		 }
		 return null;
	 }

	@Override
	public int addMember(MemberVo vo) {
		
		return dao.addMember(vo);
	}

	@Override
	public int delMember(String memId) {
		
		return dao.delMember(memId);
	}
}
