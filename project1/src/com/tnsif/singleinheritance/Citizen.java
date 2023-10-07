package com.tnsif.singleinheritance;
//program for single inheritance
public class Citizen {
private String name;
private long aadharno;
private String adress;
private long phnpo;
public Citizen() {
	super();
}
public Citizen(String name, long aadharno, String adress, long phnpo) {
	super();
	this.name = name;
	this.aadharno = aadharno;
	this.adress = adress;
	this.phnpo = phnpo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getAadharno() {
	return aadharno;
}
public void setAadharno(long aadharno) {
	this.aadharno = aadharno;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public long getPhnpo() {
	return phnpo;
}
public void setPhnpo(long phnpo) {
	this.phnpo = phnpo;
}
@Override
public String toString() {
	return "Citizen [name=" + name + ", aadharno=" + aadharno + ", adress=" + adress + ", phnpo=" + phnpo + "]";
}
	
}

