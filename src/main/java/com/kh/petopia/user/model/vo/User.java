package com.kh.petopia.user.model.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
public class User {

	private int userNo;
	private int userMethod;
	private String userEmail;
	private String userPass;
	private String userNickname;
	private String userPhone;
	private String roldId;
	private Date userCreateDate;
	private Date userUpdateDate;
	private String userEnableState;
	private int fileMypageNo;
	
		
}
