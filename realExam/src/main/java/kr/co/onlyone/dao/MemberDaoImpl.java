package kr.co.onlyone.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.onlyone.domain.MemberVo;
@Service
public class MemberDaoImpl implements MemberDao {

	/*
	 * @Autowired SqlSessionTemplate session;
	 */
	@Autowired
	SqlSession session;
	
	@Override
	public List<MemberVo> seletAll(String memName) {

		return session.selectList("membersNs.selectAll", memName);
	}

	@Override
	public MemberVo getMember(String memId) {

		return session.selectOne("membersNs.selectOne", memId);
	}

	@Override
	public int addMember(MemberVo vo) {
		
		return session.update("membersNs.addOne", vo);
	}

	@Override
	public int delMember(String memId) {
		
		return session.delete("membersNs.deleteOne", memId);
	}

}
