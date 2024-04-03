package com.sunbeam.invoice;

public class Invoice {
private	String partnum;
private	String partdesc;
private int qty;
private double price;
 public Invoice()
{
this.partnum ="";
this.partdesc="";
this.qty=0;
this.price=0;
}
public  Invoice(String partnum,String partdesc,int qty,double price)
 {
	 this.partnum =partnum;
	 this.partdesc=partdesc;
	 this.qty=qty;
	 this.price=price; 
 }
public String getPartnum() {
	return partnum;
}
public void setPartnum(String partnum) {
	this.partnum = partnum;
}
public String getPartdesc() {
	return partdesc;
}
public void setPartdesc(String partdesc) {
	this.partdesc = partdesc;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	if(qty<0)
	{
		qty=0;
	}

	this.qty = qty;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	if(price<0) {
		price=0.0;
	}		
	else
	this.price = price;
}
public double calculateInvoice()
{
	return price*qty;
	

}

}
