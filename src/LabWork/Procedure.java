package LabWork;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.io.Serializable;
import java.util.ArrayList;

public class Procedure  implements Serializable {



	private int procNo = 0;
	private static int counter = 1;
	private String procName = "";
	private double procCost = 0;
	private Invoice invoice;

	public Procedure(String a, double b)
	{
		procName = a;
		procCost = b;
		procNo = counter;
		counter++;


	}

	public int getProcNo() {
		return procNo;
	}

	public void setProcNo(int procNo) {
		this.procNo = procNo;
	}

	public String getProcName() {
		return procName;
	}

	public void setProcName(String procName) {
		this.procName = procName;
	}

	public double getProcCost() {
		return procCost;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice a) {
		this.invoice = a;
	}

	public void setProcCost(double procCost) {
		this.procCost = procCost;
	}
	public String toString ()
	{
		return procNo + "\t" + procName + "\t" +  procCost;
	}
	
	
}
