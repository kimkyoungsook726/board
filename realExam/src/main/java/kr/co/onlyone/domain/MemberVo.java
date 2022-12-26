package kr.co.onlyone.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class MemberVo {

	private String memId;
	private String memName;
	private String memPwd;
	private String phone;
	private String regiDate;
	
}
