package LabWork;

import java.io.Serializable;
import java.util.ArrayList;

public class Patient extends Person  implements Serializable {
	static private int counter = 1;
	private int patNo = 1;
	ArrayList<Invoice> invoiceList = new ArrayList<Invoice>();
	Dentist dentist;
	
	public Patient (String a , String b)
	{
		super(a,b);
		patNo = counter;
		counter++;
		
	}


	public int getPatNo() {
		return patNo;
	}


	public void setPatNo(int patNo) {
		this.patNo = patNo;
	}
	
	public Dentist getDentist() {
		return dentist;
	}


	public void setDentist(Dentist a) {
		this.dentist = a;
	}


	public Invoice getInvoiceList(int a) {
		return invoiceList.get(a);
	}


	public void setInvoiceList(Invoice a) {
		a.setPatient(this);
		invoiceList.add(a);
		
	}
	public void removeIn(int a)
	{
		invoiceList.remove(a);
	}
	public void showIn()
	{
		for(int i =0; i< invoiceList.size() ; i++)
		{
			System.out.println(invoiceList.get(i));
		}
	}
	public int numberOfIN()
	{
		return invoiceList.size();
	}

	public static int getCounter() {
		return counter;
	}

	public String toString()
	{
		return "Name:\t" + this.getName() + "\t\tAddress:\t" + this.getAddress();
	}
	
	
}
