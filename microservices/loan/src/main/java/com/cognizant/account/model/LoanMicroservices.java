package com.cognizant.account.model;

public class LoanMicroservices {
	private String number;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private long loan;
	public long getLoan() {
		return loan;
	}
	public void setLoan(long loan) {
		this.loan = loan;
	}
	public long getEmi() {
		return emi;
	}
	public void setEmi(long emi) {
		this.emi = emi;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	private long emi;
	private int tenure;
	private String type;

}
