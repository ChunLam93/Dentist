package LabWork;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Invoice  implements Serializable {

	private int invoiceNo = 0;
	static private int IDcounter = 1;
	private double invoiceAmt = 0;
	private Date invoiceDate ;
	private boolean isPaid = true;
	Patient patient;
	private ArrayList<Procedure> in_procList = new ArrayList<Procedure>();
	private ArrayList<Payment> in_paymentList = new ArrayList<Payment>();
	
	public Invoice(Date a){ //   b   hardcoding purpose
		
		invoiceNo = IDcounter;
		invoiceAmt = 0;
		invoiceDate = a;
		IDcounter ++;

	}

	public int getInvoiceNo( ) {
		return invoiceNo;
	}

	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public double getInvoiceAmt() {
		return invoiceAmt;
	}

	public void setInvoiceAmt() {
		this.invoiceAmt = 0;
		for(int i = 0 ; i < in_procList.size(); i++)
			this.invoiceAmt += in_procList.get(i).getProcCost();
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public boolean isPaid() {
		setInvoiceAmt();
		int total = 0;
		for(int i= 0; i < in_paymentList.size(); i++)
			total += in_paymentList.get(i).getPaymentAmt();
		if(this.invoiceAmt <= total )
		{
			return true;
		}
		else {
			System.out.println("Remain: " + (invoiceAmt - total));
			return false;
				}
	}

	public void setPaid(boolean isPaid) {
		
	}

	public Procedure getIn_procList(int a) {
		return in_procList.get(a);
	}

	public void setIn_procList(Procedure a) {
		a.setInvoice(this);
		setInvoiceAmt();
		in_procList.add(a);
	}

	public ArrayList<Payment> getIn_paymentList() {
		return in_paymentList;
	}

	public void setIn_paymentList(Payment a) {
		a.setInvoice(this);
		in_paymentList.add(a);
		
	}

	public double remainer()
	{
		setInvoiceAmt();
		return getInvoiceAmt()- totalPayment();
	}
	
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient a) {
		this.patient = a;
	}
	public void showPayment()
	{
		for(int i= 0; i < in_paymentList.size(); i++)
			System.out.println(in_paymentList.get(i));
	}
	public double totalPayment()
	{	double temp = 0;
		for(int i= 0; i < in_paymentList.size(); i++)
		{
			temp += in_paymentList.get(i).getPaymentAmt();
		}
		return temp;
	}
	public int getProceNo ()
	{
		return in_procList.size();
	}
	public int getPayNo ()
	{
		return in_paymentList.size();
	}


	public void showProc()
	{
		for(int i= 0; i < in_procList.size(); i++)
			System.out.println(in_procList.get(i));
	}
	public void removeProc(int a)
	{
		in_procList.remove(a);
	}
	public String toString ()
	{
		return this.invoiceNo + this.invoiceDate.toString() + invoiceAmt;
	}
	
	
	
}
