package com.toyproject.comm.dto;

import java.util.Date;

public class BoardDTO {
private String Menu_ID, BOARD_ID, TITLE, INSERT_USER_ID;
private long CONTENT;
private int VIEW_CNT, LIKE_CNT, UNLICK_CNT;
private Date DATE;

public String getMenu_ID() {
	return Menu_ID;
}
public void setMenu_ID(String menu_ID) {
	Menu_ID = menu_ID;
}
public String getBOARD_ID() {
	return BOARD_ID;
}
public void setBOARD_ID(String bOARD_ID) {
	BOARD_ID = bOARD_ID;
}
public String getTITLE() {
	return TITLE;
}
public void setTITLE(String tITLE) {
	TITLE = tITLE;
}
public String getINSERT_USER_ID() {
	return INSERT_USER_ID;
}
public void setINSERT_USER_ID(String iNSERT_USER_ID) {
	INSERT_USER_ID = iNSERT_USER_ID;
}
public long getCONTENT() {
	return CONTENT;
}
public void setCONTENT(long cONTENT) {
	CONTENT = cONTENT;
}
public int getVIEW_CNT() {
	return VIEW_CNT;
}
public void setVIEW_CNT(int vIEW_CNT) {
	VIEW_CNT = vIEW_CNT;
}
public int getLIKE_CNT() {
	return LIKE_CNT;
}
public void setLIKE_CNT(int lIKE_CNT) {
	LIKE_CNT = lIKE_CNT;
}
public int getUNLICK_CNT() {
	return UNLICK_CNT;
}
public void setUNLICK_CNT(int uNLICK_CNT) {
	UNLICK_CNT = uNLICK_CNT;
}
public Date getDATE() {
	return DATE;
}
public void setDATE(Date dATE) {
	DATE = dATE;
}
}
