package kr.co.onlyone.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class BoardVo {
	
	private int boardNum;
	private String boardTitle;
	private String irum;
	private String boardPwd;
	private String boardContent;
	private String regiDate;
}
