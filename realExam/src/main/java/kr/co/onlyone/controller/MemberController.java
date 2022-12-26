package kr.co.onlyone.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.onlyone.domain.MemberVo;
import kr.co.onlyone.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {

	@Autowired
	private MemberService service;
	
	@GetMapping("/memberJoin")
	public String addMemberForm() {
		return "/member/memberJoin";// WEB-INF/view/member/memberJoin.jsp
	}
	@PostMapping("/memberJoin")// memberJoin이름을 같이 해도 받는방식이 서로 다르므로 사용할 수 있다.
	public String addMember(MemberVo vo, Model model, HttpSession session) {
		int result = service.addMember(vo);
		if(result == 1) {
			session.setAttribute("vo", vo);
		}
		return "home";
	}
	@RequestMapping("/logOut")
	public String logOut(HttpServletRequest request) {
		request.getSession().invalidate();//invalidate() 세션을 끊어버림
		return "home";
	}
	@PostMapping("/logIn")
	public String logIn(String memId, String memPwd, Model model, HttpSession session) {
		MemberVo vo= service.getMember(memId,memPwd);
		if(vo == null) {
			model.addAttribute("msg","아이디와 비밀번호가 일치 하지 않습니다");
			return "/member/loginFail";
		} 
		session.setAttribute("vo", vo);
		//세션의 유효시간 설정해주면 좋다.
		return "home";
	}
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "/member/loginJoin";
	}
	@RequestMapping("/loginFail")
	public String loginFail() {
		return "/member/loginFail";
	}
}
