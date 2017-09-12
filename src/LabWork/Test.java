package LabWork;

import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Dentist> dl = new ArrayList<Dentist>();
		Date today = new Date();
		Dentist d1 = new Dentist("Chun", "21 jamestown ave", "12345");
		Patient p1 = new Patient("patient1", "cork");
		Patient p2 = new Patient("patient2", "dublin");
		Patient p3 = new Patient("patient3", "wexford");
		
		dl.add(d1);
		d1.setPl(p1);
		Invoice i1 = new Invoice(today);
		Invoice i2 = new Invoice(today);
		Invoice i3 = new Invoice(today);
		Invoice i4 = new Invoice(today);
		p1.setInvoiceList(i1);
		p1.setInvoiceList(i2);
		p2.setInvoiceList(i3);
		p2.setInvoiceList(i4);
		Procedure po1 = new Procedure("Gum Surgery", 202.00);
		Procedure po2 = new Procedure("Bridges and Implants", 252.00);
		Procedure po3 = new Procedure("Teeth Whitening", 150.00);
		p1.getInvoiceList(0).setIn_procList(po1);
		p1.getInvoiceList(0).setIn_procList(po2);
		p1.getInvoiceList(0).setIn_procList(po3);
		d1.setPl(p2);
		d1.setPl(p3);
		
		d1.showPat();
		
		
		
		
	}

}
