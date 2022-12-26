package kr.co.onlyone.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SampleDaoImpl implements SampleDao{

	@Autowired
	SqlSession session; 
	
	@Override
	public String getTime() {
	
		return session.selectOne("SampleDaoNs.getTime");
	}

}
