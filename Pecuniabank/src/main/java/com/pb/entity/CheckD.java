package com.pb.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cheque")	
public class CheckD {
	@Id   //primary
	@Column(length=12)  //length of column      
	private long accountId;
	@Column(length=7)
	private long amount;
	@Column(length=6)
	private int Chequeno;
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public int getChequeno() {
		return Chequeno;
	}
	public void setChequeno(int chequeno) {
		Chequeno = chequeno;
	}
	public String getIfsc() {
		return Ifsc;
	}
	public void setIfsc(String ifsc) {
		Ifsc = ifsc;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	@Column(length=10)
	private String Ifsc;
	@Column(length = 10)
	private Date issueDate;
}
