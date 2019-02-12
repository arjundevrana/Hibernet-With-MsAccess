package com.msaccess.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Advances")
public class Advances {
	@Column(name="desigcode")
	private String desigcode;
	@Override
	public String toString() {
		return "Advances [desigcode=" + desigcode + ", empcode=" + empcode + ", hoa=" + hoa + ", subcode=" + subcode
				+ ", typ=" + typ + ", dedhoa=" + dedhoa + ", finyr=" + finyr + ", minhd=" + minhd + ", paocode="
				+ paocode + ", amount=" + amount + ", loanamt=" + loanamt + ", crinstl=" + crinstl + ", totinstl="
				+ totinstl + ", lstamt=" + lstamt + ", srno=" + srno + "]";
	}
	@Id
	@Column(name="empcode")
	private String empcode;
	@Column(name="hoa")
	private String hoa;
	@Column(name="subcode")
	private String subcode;
	@Column(name="typ")
	private String typ;
	@Column(name="dedhoa")
	private String dedhoa;
	@Column(name="finyr")
	private String finyr;
	@Column(name="minhd")
	private String minhd;
	@Column(name="paocode")
	private String paocode;
	@Column(name="amount")
	private BigDecimal amount;
	@Column(name="loanamt")
	private BigDecimal loanamt;
	@Column(name="crinstl")
	private BigDecimal crinstl;
	@Column(name="totinstl")
	private BigDecimal totinstl;
	@Column(name="lstamt")
	private BigDecimal lstamt;
	@Column(name="srno")
	private String srno;
	public String getDesigcode() {
		return desigcode;
	}
	public void setDesigcode(String desigcode) {
		this.desigcode = desigcode;
	}
	public String getEmpcode() {
		return empcode;
	}
	public void setEmpcode(String empcode) {
		this.empcode = empcode;
	}
	public String getHoa() {
		return hoa;
	}
	public void setHoa(String hoa) {
		this.hoa = hoa;
	}
	public String getSubcode() {
		return subcode;
	}
	public void setSubcode(String subcode) {
		this.subcode = subcode;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public String getDedhoa() {
		return dedhoa;
	}
	public void setDedhoa(String dedhoa) {
		this.dedhoa = dedhoa;
	}
	public String getFinyr() {
		return finyr;
	}
	public void setFinyr(String finyr) {
		this.finyr = finyr;
	}
	public String getMinhd() {
		return minhd;
	}
	public void setMinhd(String minhd) {
		this.minhd = minhd;
	}
	public String getPaocode() {
		return paocode;
	}
	public void setPaocode(String paocode) {
		this.paocode = paocode;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getLoanamt() {
		return loanamt;
	}
	public void setLoanamt(BigDecimal loanamt) {
		this.loanamt = loanamt;
	}
	public BigDecimal getCrinstl() {
		return crinstl;
	}
	public void setCrinstl(BigDecimal crinstl) {
		this.crinstl = crinstl;
	}
	public BigDecimal getTotinstl() {
		return totinstl;
	}
	public void setTotinstl(BigDecimal totinstl) {
		this.totinstl = totinstl;
	}
	public BigDecimal getLstamt() {
		return lstamt;
	}
	public void setLstamt(BigDecimal lstamt) {
		this.lstamt = lstamt;
	}
	public String getSrno() {
		return srno;
	}
	public void setSrno(String srno) {
		this.srno = srno;
	}
	
}
