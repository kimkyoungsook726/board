package kr.co.onlyone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //@Controller의 하위 controller가 RestController
@RequestMapping(value = {"/kks/","/onlyone/","/kyoungsook/"}) 
public class KksController {

	@RequestMapping("/")
	public String root() {
		//중간에 처리할 내용 => DB목록을 aaa.jsp에게 보내줌...
		return "/kks/aaa";
	}
	@RequestMapping({"ppp","eee","hhh","lll"})
	public String qwer() {
		return "/kks/aaa";
	}
	/*
	@RequestMapping({"/ttt"})
	public String tttt() {//단순하게 해당페이지로만 연결한다.
		return "/kks/ttt";
	}
	@RequestMapping({"/zzz"})
	public String zzz() {
		return "/kks/zzz";
	}
	@RequestMapping({"/xxx"})
	public String xxx() {
		return "/kks/xxx";
	}
*/
	// /tiime/ =>일반회원, /onlyone/ => 우수회원, /kyoungsook/ =>vip회원. 이렇게 구분하여 경로를 지정해준다.
	// /ttt => 가전제품, /zzz=> 미용제품, /xxx=> 식음료품
	@RequestMapping({"ttt","zzz","xxx"})
	public void tzx() {}//위의 메소드3개와 같은 기능을 한다
}   //return 이 없는 void타입의 메소드는 클래스레벨의 value값이 폴더로 존재하여야 한다. 경로가 곧 url이다.
