package kr.co.onlyone.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.onlyone.domain.BoardVo;
import kr.co.onlyone.domain.MemberVo;
import kr.co.onlyone.service.BoardService;
import kr.co.onlyone.service.MemberService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor //필드 주입대신 롬복의 기능을 사용했다.(필드가final)
public class BoardController {

	//@Autowired 와 @Qualifier를 같이 쓰는 경우가 있는데 @Qualifier(value=서비스클래스의 클래스명을 써준다) serviceImpl클래스가 여러개 일때
	
	@Autowired	//비슷한것으로 @Resource는 이름을 기준으로 해서 객체를 주입받는다.  99%@Autowired를 쓴다
	BoardService service;
	//@Autowired는 타입을 기준으로 해서 객체를 주입받는다. 타입우선이다.
	@Resource  //비슷한것으로 @Inject라는 것도 있다. 3가지 중 가장 안쓰는것이다. spring 어노테이션이 아니고 자바에서제공해주는 것이다. 아주 오래된 프로젝트에서 아주 가끔 쓰는것을 볼수 있다.
	MemberService memberService;
	
	@RequestMapping("/boardLogin") //"/"+"/boardLogin"
	public String login(String memId, String memPwd, HttpSession session, Model model) {
		MemberVo mvo = memberService.getMember(memId, memPwd);
		if( mvo==null) {
			return "member/loginFail";
		}
		session.setAttribute("mvo", mvo);
		return "/board/boardMain";
	}
	@RequestMapping("/boardMain")
	public String BoardMain(HttpServletRequest req, Model model) {
		if (req.getSession().getAttribute("vo") == null ) return "/member/loginJoin";
		List<BoardVo> list = service.getList();
		
		model.addAttribute("list", list);
		return "/board/boardMain";
	}
	
}
