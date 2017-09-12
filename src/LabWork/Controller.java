package LabWork;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

import static javax.print.attribute.standard.MediaSizeName.D;

public class Controller {
	static Stage newstage;

	static  public void changeScene(int a, Stage b, Scene c , Dentist d)
	{
		if  (a ==1)
		{
			Buttons.showUser.setText("Welcome " + d.getName().toUpperCase());
			b.setTitle("Menu");
			b.setScene(c);
		}

		else if(a == 2)
		{
			Buttons.apToptitle.setText("DR. " + d.getName().toUpperCase() + ": Add Patient ");
			Buttons.patDentistText.setText(d.getName().toUpperCase());
			Buttons.patNumberText.setText(""+ Patient.getCounter());
			b.setTitle("Add Patient");
			b.setScene(c);
		}
		else if(a == 3)
		{

			Buttons.rpToptitle.setText("DR. " + d.getName().toUpperCase() + ": Remove Patient ");
			b.setTitle("Remove Patient");
			b.setScene(c);
		}
		else if(a == 4)

		{
			Buttons.vpToptitle.setText("DR. " + d.getName().toUpperCase() + ": Find Patient ");
			b.setTitle("View Patients");
			b.setScene(c);
		}
		else if(a == 5)
		{

			b.close();
		}
		else if (a == 6)
		{
			b.setTitle("Login");
			b.setScene(c);
		}


	}

	static public void patientChangeScene (int operation , Patient p , Dentist d, Scene s, Stage st)
	{
		if(operation == 1)
		{

			Buttons.piToptitle.setText("DR. " + d.getName().toUpperCase() + ": " + p.getName().toUpperCase());
			st.setTitle("Invoice");
			st.setScene(s);
			Buttons.pitable.setItems(loadInvoiceData(p));
		}
		else if(operation == 2)
		{
			Buttons.ppToptitle.setText("DR. " + d.getName().toUpperCase() + ": " + p.getName().toUpperCase());
			st.setTitle("Procedure");
			st.setScene(s);
		}
		else if(operation == 3)
		{

			Buttons.pToptitle.setText("DR. " + d.getName().toUpperCase() + ": " + p.getName().toUpperCase());
			st.setTitle("Payment");
			st.setScene(s);
		}
		else if(operation == 4)
		{

		}
		else if(operation == 5)
		{

		}

	}

	static public Dentist loginCheck(int a , String username, String password,  Stage b, Scene c) throws IOException, ClassNotFoundException {			Dentist d = null;
				boolean check1 = true;
		boolean check2 = true;


				for(int i = 0 ; i < a ; i++) {
					if (username.equals(Main.getdl(i).getName())) {

						if (Main.getdl(i).getPassword().equals(password)) {

							d = Main.getdl(i);
							loadDentistProce(d);
							//d.setListOfPro(derialization("src/ListOfProce.ser"));
							//d.setPl(derialization("src/ListOfPatient.ser"));
							changeScene(1, b, c, d);

						}
						  check2 = false;

					}
					else
					{
						check1 = false;
					}
				}

		             if(check1 == false)
		                           Buttons.output.setText("Incorrect UserName");

					if(check2 == false)

										Buttons.output.setText("Incorrect password");
				return d;
	}
	static public void confirmDia (int o ,Stage a, Scene s, Dentist c, Patient p)

	{
		if(o == 1) {
			newstage = new Stage();

			Buttons.clToptitle.setText("Confirm to delete Patient:\t" + p.getName());
			newstage.initModality(Modality.APPLICATION_MODAL);
			newstage.setTitle("Confirm");
			newstage.setScene(s);
			newstage.show();
		}
		if(o == 2) {
			for (int i = 0; i < c.getPcounter(); i++) {
				if (p.equals(c.getPl(i))) {
					c.removePat(i);
					newstage.close();

				}
			}
		}
		if(o ==3)
		{
			newstage.close();
		}

	}
	static public void addingPat(Dentist d, String name, String address, Stage s, Scene c)
	{
			Patient temp = new Patient(name , address);
			d.setPl(temp);
		changeScene(2, s,c,d);

	}
	public static ObservableList<Patient> loadPatientData(Dentist currentD)
	{
		ObservableList<Patient> data = FXCollections.observableArrayList();
		for(int i = 0; i < currentD.getPcounter() ; i++)
		{
			data.addAll(currentD.getPl(i));
		}
		return data;
	}
	public static ObservableList<Patient> seachPatientData(Dentist currentD, String name, TextField a)
	{
		ObservableList<Patient> data = FXCollections.observableArrayList();
		Boolean pass = false;
		for(int i = 0; i < currentD.getPcounter() ; i++)
		{
			if(name.toLowerCase().equals(currentD.getPl(i).getName().toLowerCase())) {
				data.addAll(currentD.getPl(i));
				pass = true;
			}

		}
		if (pass == false)
		{
			a.clear();
			a.setPromptText("Patient Not Found");
			Buttons.rptable.setItems( loadPatientData(currentD));
		}
		return data;
	}

	public static ObservableList<Invoice> loadInvoiceData(Patient p )
	{

		ObservableList<Invoice> data = FXCollections.observableArrayList();
		for(int i = 0; i < p.numberOfIN() ; i++)
		{
			p.getInvoiceList(i).setInvoiceAmt();
			data.addAll(p.getInvoiceList(i));

		}

		return data;
	}
	public static void invoicePreview(Patient p, Invoice in)
	{
		Buttons.piTextArea.setFont(new Font("Arial", 12));
		Buttons.piTextArea.setText("\n------------------------------------------------------\t\t\n\nInvoice \n\n\n"  +
				"Patient No.:\t\t" +  p.getPatNo() +
				"\n\nPatient Name:\t\t" + p.getName() +
				"\n\nPatient Address:\t\t" +  p.getAddress() +
				"\n\nDentist:\t\t" + p.getDentist().getName() +
				"\n------------------------------------------------------\nInvoice No.:\t\t" + in.getInvoiceNo() +
				"\n\nInvoice Amount:\t\t" + in.getInvoiceAmt()+
				"\n\nInvoice Date:\t\t" + in.getInvoiceDate());
	}
	public static void addInvoice(Patient p, Dentist dtemp, Stage S, Scene s)
	{
		Date today = new Date();
		Invoice temp = new Invoice(today);
		p.setInvoiceList(temp);
		Buttons.pitable.setItems(loadInvoiceData(p));

	}
	public static void removeInvoice(Invoice in, Patient p)
	{
		for(int i = 0 ; i < p.numberOfIN() ; i++)
		{
			if(in.equals(p.getInvoiceList(i)))
			{
				p.removeIn(i);
			}
		}
		Buttons.pitable.setItems(loadInvoiceData(p));
	}
	public static ObservableList<Procedure> loadProcedureData(Invoice in)
	{
		ObservableList<Procedure> data = FXCollections.observableArrayList();
		for(int i = 0; i < in.getProceNo() ; i++)
		{
			data.addAll(in.getIn_procList(i));

		}
		return data;
	}
	public static ObservableList<Payment> loadPaymentData(Invoice in)
	{
		ObservableList<Payment> data = FXCollections.observableArrayList();
		for(int i = 0; i < in.getPayNo() ; i++)
		{
			data.addAll(in.getIn_paymentList().get(i));
		}
		return data;
	}
	public static void loadDentistProce(Dentist D)
	{
		Procedure dp1 = new Procedure("Whitening", 100);
		Procedure dp2 = new Procedure("Removal", 200);
		D.setListOfPro(dp1);
		D.setListOfPro(dp2);
	}
	public static ObservableList<Procedure> loadProceListData(Dentist D)
	{
		ObservableList<Procedure> data = FXCollections.observableArrayList();
		for(int i = 0; i < D.numberOfProc() ; i++)
		{
			data.addAll(D.getListOfPro(i));

		}
		return data;
	}
	public static void addProcedure(Invoice in ,Procedure pp)
	{
		in.setIn_procList(pp);
		in.setInvoiceAmt();
	}
	public static void rmProcedure(Invoice In ,Procedure pp)
	{	boolean pass = true;
		int i = 0;


		while (pass)
		{
			if(pp.equals(In.getIn_procList(i)));
			{

				In.removeProc(i);
				pass= false;
			}
			i++;
		}


	}
	public static void makePayment(Invoice in, TextField t )
	{
		double pay = Double.parseDouble(t.getText());
		Date today = new Date();
		Payment temp = new Payment(today, pay );
		in.setIn_paymentList(temp);
		Buttons.pPayTable.setItems(loadPaymentData(in));


	}
	public static void addProtoList(Dentist D, Procedure P) {
		D.setListOfPro(P);
	}
	public static void rmProtoList(Dentist D, Procedure P) {
		for(int i = 0; i < D.numberOfProc() ; i++) {
			if (D.getListOfPro(i).equals(P))
			{
				D.rmProce(i);
				Buttons.paptable.setItems(loadProceListData(D));
			}

		}
	}

	public static void Save(Dentist D) throws IOException {
        serialization(D.getListOfPro(), "src/ListOfProce.ser");
        serialization(D.getPl(), "src/ListOfPatient.ser");


    }
	public static void serialization(ArrayList a, String file) throws IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(a);




	}
    public static ArrayList derialization( String file) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        return (ArrayList) in.readObject();
    }
}
