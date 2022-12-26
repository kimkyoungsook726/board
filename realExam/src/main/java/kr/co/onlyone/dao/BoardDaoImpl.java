package kr.co.onlyone.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.onlyone.domain.BoardVo;

@Repository
public class BoardDaoImpl implements BoardDao{

	@Autowired
	SqlSession session;
	
	@Override
	public BoardVo getBoard(int boardNum) {
	System.out.println(boardNum);
		return session.selectOne("boardNs.getBoard", boardNum);
	}

	@Override
	public List<BoardVo> getList() {

		return session.selectList("boardNs.getList" );
	}

	@Override
	public int addBoard(BoardVo vo) {
		
		return session.update("boardNs.addBoard", vo );
	}

	@Override
	public int delBoard(int boardNum) {
		
		return session.delete("boardNs.delBoard", boardNum);
	}

}
