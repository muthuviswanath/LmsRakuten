package com.libman.models;

import java.util.Date;

public class Lends {
	private int lendid;
	private Date requestdate;
	private Date defaultreturndate;
	private Date actualreturndate;
	private int userid;
	private int bookid;
	private String requeststatus;
	private int fineamount;
	
	public int getLendid() {
		return lendid;
	}
	public void setLendid(int lendid) {
		this.lendid = lendid;
	}
	public Date getRequestdate() {
		return requestdate;
	}
	public void setRequestdate(Date requestdate) {
		this.requestdate = requestdate;
	}
	public Date getDefaultreturndate() {
		return defaultreturndate;
	}
	public void setDefaultreturndate(Date defaultreturndate) {
		this.defaultreturndate = defaultreturndate;
	}
	public Date getActualreturndate() {
		return actualreturndate;
	}
	public void setActualreturndate(Date actualreturndate) {
		this.actualreturndate = actualreturndate;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getRequeststatus() {
		return requeststatus;
	}
	public void setRequeststatus(String requeststatus) {
		this.requeststatus = requeststatus;
	}
	public int getFineamount() {
		return fineamount;
	}
	public void setFineamount(int fineamount) {
		this.fineamount = fineamount;
	}
	public void setUser(Users user) {
		// TODO Auto-generated method stub
		
	}
	public void setBook(Books book) {
		// TODO Auto-generated method stub
		
	}
	
}
