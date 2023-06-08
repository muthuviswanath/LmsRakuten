package com.libman.models;


import java.time.LocalDate;


public class Lends {
	private int lendid;
	private LocalDate requestdate;
	private LocalDate defaultreturndate;
	private LocalDate actualreturndate;
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
	public LocalDate getRequestdate() {
		return requestdate;
	}
	public void setRequestdate(LocalDate requestdate) {
		this.requestdate = requestdate;
	}
	public LocalDate getDefaultreturndate() {
		return defaultreturndate;
	}
	public void setDefaultreturndate(LocalDate defaultreturndate) {
		this.defaultreturndate = defaultreturndate;
	}
	public LocalDate getActualreturndate() {
		return actualreturndate;
	}
	public void setActualreturndate(LocalDate actualreturndate) {
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
