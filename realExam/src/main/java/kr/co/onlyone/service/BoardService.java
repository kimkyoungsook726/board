package kr.co.onlyone.service;

import java.util.List;

import kr.co.onlyone.domain.BoardVo;

public interface BoardService {

	BoardVo getBoard(int boardNum);

	List<BoardVo> getList();

	int addBoard(BoardVo vo);

	int delBoard(int boardNum);

}
