package com.kh.petopia.board.model.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
public class Board {

	private int boardNo; 
	private String boardTitle;
	private String boardContent;
	private int boardViews;
	private Date boardCreateDate;
	private Date boardUpdateDate;
	private int userNo; 
	private int ctgNo; 
	private int petCtgNo; 
	private String boardStatus;
	private String fileImg;
	
}
