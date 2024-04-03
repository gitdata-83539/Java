package com.sunbeam.tester;
import com.sunbeam.invoice.Invoice;

public class InvoiceTester {

	public static void main(String[] args) {
		Invoice i=new Invoice("001","keyboard",6,500);
		System.out.println("part numberner:"+i.getPartnum());
		System.out.println("PartDescription :"+i.getPartdesc() );
		System.out.println("Quantity :"+i.getQty());
		System.out.println("Price per Quantity :"+i.getPrice());
		System.out.println("calculate Invoice:"+ i.calculateInvoice());
		
		
				

	}

}
