package kr.co.onlyone.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.onlyone.domain.BoardVo;
import kr.co.onlyone.service.BoardService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardDaoTest {
	
	@Autowired
	BoardService service;
	
	@Test
	@Ignore
	public void getBoard() {
		BoardVo vo= service.getBoard(13);
		assertNotNull(vo);
		System.out.println(vo);
	}
	
	@Test
	public void getList() {
	
		List<BoardVo> list = service.getList();
		for(BoardVo vo:list) {
			System.out.println(vo);
		}
	}
	@Ignore
	@Test
	public void addBoard() {
		BoardVo vo= new BoardVo();
		vo.setBoardTitle("게시판");
		vo.setIrum("kks");
		vo.setBoardPwd("1234");
		vo.setBoardContent("qwerttyyituoikjlka");
		int addResult = service.addBoard(vo);
		assertEquals(addResult, 1);
		
		
	}
	@Test
	@Ignore
	public void delBoardTest() {
		
		int delResult= service.delBoard(15);
		assertEquals(delResult, 1);
		
	}

}
