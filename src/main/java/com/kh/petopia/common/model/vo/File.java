package com.kh.petopia.common.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class File {
	
	private int fileNo;
	private int refBno;
	private String originalName;
	private String uploadName;
	private String filePath;
	private int fileLevel;
}
