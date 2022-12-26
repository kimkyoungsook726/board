package kr.co.onlyone.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.onlyone.dao.MemberDao;
import kr.co.onlyone.domain.MemberVo;
import kr.co.onlyone.service.MemberService;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberDaoTest {

	@Autowired
	ApplicationContext context;

	@Autowired
	MemberService service;

	@Test
	@Ignore
	public void selectAll() {
		String memName = null;
		List<MemberVo> list = service.selectAll(memName);
		for (MemberVo vo : list) {
			System.out.println(vo);
		}
	}

	@Test
	public void selectOne() {
		
		MemberVo vo = service.getMember("kkkk","1234");
		assertNotNull(vo);
	}
	@Test
	@Ignore
	public void addMember() {
		MemberVo vo= new MemberVo();
		vo.setMemId("onlyone");
		vo.setMemName("kks");
		vo.setMemPwd("1234555");
		vo.setPhone("01010101010");
		int result = service.addMember(vo);
		assertEquals(result, 1);
		MemberVo resultVo= service.getMember(vo.getMemId(),vo.getMemName());
		checkVo(vo, resultVo);
		service.delMember(vo.getMemId());
	}
	private void checkVo(MemberVo inVo, MemberVo resultVo) {
		assertEquals(inVo.getMemName(), resultVo.getMemName());
		assertEquals(inVo.getMemPwd(), resultVo.getMemPwd());
		assertEquals(inVo.getMemId(), resultVo.getMemId());
	}
}
