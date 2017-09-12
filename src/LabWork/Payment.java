package LabWork;

import java.io.Serializable;
import java.util.Date;

public class Payment  implements Serializable {

	static private int counter = 1;
	private int paymentNo = 0;
	private double paymentAmt = 0;
	private Date paymentDate ;
	private Invoice invoice;
	
	public Payment (Date a, double b)
	{
		paymentDate = a;
		paymentNo = counter;
		paymentAmt = b;
		counter ++;
	}
	public int getPaymentNo() {
		return paymentNo;
	}
	public void setPaymentNo(int paymentNo) {
		this.paymentNo = paymentNo;
	}
	public double getPaymentAmt() {
		return paymentAmt;
	}
	public void setPaymentAmt(double paymentAmt) {
		this.paymentAmt = paymentAmt;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice a) {
		this.invoice = a;
	}
	
	
	
}
