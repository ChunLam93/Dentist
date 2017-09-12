package LabWork;

import java.util.Date;

/**
 * Created by chunlam on 31/03/2017.
 */
public class Hardcode {
    public static void main(String[] args) {


        //Dentists
        Dentist d1 = new Dentist("Dentist1" , "cork" , "password1");
        Dentist d2 = new Dentist("Dentist2" , "cork" , "password2");
        Dentist d3 = new Dentist("Dentist3" , "cork" , "password3");
        Main.setDl(d1);
        Main.setDl(d2);
        Main.setDl(d3);


        //Patrients
        Patient d1p1 = new Patient("Patient1" , "Cork" );
        Patient d1p2 = new Patient("Patient2" , "Cork" );
        Patient d1p3 = new Patient("Patient3" , "Cork" );
        Patient d2p1 = new Patient("Patient4" , "Cork" );
        Patient d2p2 = new Patient("Patient5" , "Cork" );
        Patient d2p3 = new Patient("Patient6" , "Cork" );
        Patient d3p1 = new Patient("Patient7" , "Cork" );
        Patient d3p2 = new Patient("Patient8" , "Cork" );
        Patient d3p3 = new Patient("Patient9" , "Cork" );

        d1.setPl(d1p1); d1.setPl(d1p2); d1.setPl(d1p3);
        d2.setPl(d2p1); d2.setPl(d2p2); d2.setPl(d2p3);
        d3.setPl(d3p1); d3.setPl(d3p2); d3.setPl(d3p3);


        //Invoice
        Date today = new Date();
        Invoice p1i1 = new Invoice(today);
        Invoice p1i2 = new Invoice(today);
        Invoice p2i1 = new Invoice(today);
        Invoice p3i1 = new Invoice(today);
        Invoice p3i2 = new Invoice(today);
        Invoice p3i3 = new Invoice(today);

        d1p1.setInvoiceList(p1i1); d1p1.setInvoiceList(p1i2);
        d2p1.setInvoiceList(p2i1);
        d3p1.setInvoiceList(p3i1); d3p1.setInvoiceList(p3i2); d3p1.setInvoiceList(p3i3);










    }
}
