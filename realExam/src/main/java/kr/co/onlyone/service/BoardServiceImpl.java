package kr.co.onlyone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.onlyone.dao.BoardDao;
import kr.co.onlyone.domain.BoardVo;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardDao dao;
	
	@Override
	public BoardVo getBoard(int boardNum) {
		
		return dao.getBoard(boardNum);
	}

	@Override
	public List<BoardVo> getList() {
		
		return dao.getList();
	}

	@Override
	public int addBoard(BoardVo vo) {
		
		return dao.addBoard(vo);
	}

	@Override
	public int delBoard(int boardNum) {
	
		return dao.delBoard(boardNum);
	}
	

}
