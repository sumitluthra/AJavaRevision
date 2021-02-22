package com.beans;

public class ElectricityBill {

	private int meterNo;
	private String name;
	private String address;

	public int getMeterNo() {
		return this.meterNo;
	}

	public void setMeterNo(int meterNo) {
		this.meterNo = meterNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ElectricityBill [meterNo=" + meterNo + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return this.meterNo;
	}

	@Override
	public boolean equals(Object b) {
		ElectricityBill bill = (ElectricityBill) b;
		if (this.meterNo != bill.meterNo) {
			return false;
		}
		return true;
	}
}
