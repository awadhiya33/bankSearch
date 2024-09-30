package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class BankList {
	@Column(name="bank")
	private String bank;
	
	@Id
	@Column(name="ifsc")
	private String ifsc;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city1")
	private String city1;
	
	@Column(name="city2")
	private String city2;
	
	@Column(name="state")
	private String state;
	
	@Column(name="stdcode")
	private String stdcode;
	
	@Column(name="phone")
	private String phone;
	
	

	public BankList() {
		super();
	}



	public BankList(String bank, String ifsc, String branch, String address, String city1, String city2, String state,
			String stdcode, String phone) {
		super();
		this.bank = bank;
		this.ifsc = ifsc;
		this.branch = branch;
		this.address = address;
		this.city1 = city1;
		this.city2 = city2;
		this.state = state;
		this.stdcode = stdcode;
		this.phone = phone;
	}



	public String getBank() {
		return bank;
	}



	public void setBank(String bank) {
		this.bank = bank;
	}



	public String getIfsc() {
		return ifsc;
	}



	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}



	public String getBranch() {
		return branch;
	}



	public void setBranch(String branch) {
		this.branch = branch;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity1() {
		return city1;
	}



	public void setCity1(String city1) {
		this.city1 = city1;
	}



	public String getCity2() {
		return city2;
	}



	public void setCity2(String city2) {
		this.city2 = city2;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getStdcode() {
		return stdcode;
	}



	public void setStdcode(String stdcode) {
		this.stdcode = stdcode;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	@Override
	public String toString() {
		return "BankList [bank=" + bank + ", ifsc=" + ifsc + ", branch=" + branch + ", address=" + address + ", city1="
				+ city1 + ", city2=" + city2 + ", state=" + state + ", stdcode=" + stdcode + ", phone=" + phone + "]";
	}
	
}
