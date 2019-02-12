package com.msaccess.bean;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Account")
public class Account {
	@Id
	@Column(name="ACCOUNT")
	private String ACCOUNT;
	@Column(name="CUR")
	private String CUR;
	@Column(name="BANKNAME")
	private String BANKNAME;
	@Column(name="AMOUNT")
	private BigDecimal AMOUNT;
	@Override
	public String toString() {
		return "Account [ACCOUNT=" + ACCOUNT + ", CUR=" + CUR + ", BANKNAME=" + BANKNAME + ", AMOUNT=" + AMOUNT + "]";
	}
	
	public String getACCOUNT() {
		return ACCOUNT;
	}
	public void setACCOUNT(String aCCOUNT) {
		ACCOUNT = aCCOUNT;
	}
	public String getCUR() {
		return CUR;
	}
	public void setCUR(String cUR) {
		CUR = cUR;
	}
	public String getBANKNAME() {
		return BANKNAME;
	}
	public void setBANKNAME(String bANKNAME) {
		BANKNAME = bANKNAME;
	}
	public BigDecimal getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(BigDecimal aMOUNT) {
		AMOUNT = aMOUNT;
	}
	

	
	

}
