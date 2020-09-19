package com.pb.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ChequeTransactions")

public class CheckC {
	@Id
	@Column(length = 12)
	private String payeeAccountNo;
	@Column(length = 12)
	private String recipientAccountNo;
	@Column(length=7)
	private double amount;
	@Column(length = 12)
	private String bankName;
	@Column(length=10)
	private String Ifsc;
	@Column(length = 10)
	private Date issueDate;
	@Column(length=6)
	private int Chequeno;

}
