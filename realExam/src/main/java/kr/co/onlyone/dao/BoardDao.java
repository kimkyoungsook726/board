package kr.co.onlyone.dao;

import java.util.List;

import kr.co.onlyone.domain.BoardVo;

public interface BoardDao {

	BoardVo getBoard(int boardNum);

	List<BoardVo> getList();

	int addBoard(BoardVo vo);

	int delBoard(int boardNum);

}
