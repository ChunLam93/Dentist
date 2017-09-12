package LabWork;

import java.io.Serializable;
import java.util.ArrayList;

public class Dentist extends Person  implements Serializable {
	
		private String password = "";
		private ArrayList<Patient> pl = new ArrayList<Patient>();
		private int Pcounter = 0;
		private ArrayList<Procedure> ListOfPro= new ArrayList<Procedure>();
		
		public Dentist(String a, String b, String c)
		{
			super(a,b);
			password = c;
		}

	public ArrayList<Procedure> getListOfPro() {
		return ListOfPro;
	}

	public void setListOfPro(ArrayList<Procedure> listOfPro) {
		ListOfPro = listOfPro;
	}

	public void setPl(ArrayList<Patient> pl) {

		this.pl = pl;
	}

	public ArrayList<Patient> getPl() {

		return pl;
	}

	public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Patient getPl(int a) {
			return pl.get(a);
		}

		public void setPl(Patient a) {
			a.setDentist(this); //having ref of the dentist
			pl.add(a);
			Pcounter++;
			
			System.out.println("Patient Added");
		}
		//public void 
		public void removePat(int a)
		{

			pl.remove(a);
			Pcounter--;
		}

	public Procedure getListOfPro(int a) {
		return ListOfPro.get(a);
	}

	public void setListOfPro(Procedure p) {
		ListOfPro.add(p);
	}
	public int numberOfProc()
	{
		return ListOfPro.size();
	}
	public void rmProce(int a)
	{
		ListOfPro.remove(a);
	}
	public  int getPcounter() {
			return Pcounter;
		}

		public void showPat()
		{
			for (int i = 0; i < pl.size(); i++)
			{
				System.out.println("\t" + pl.get(i));
			}
		}

		public String toString ()
		{
			return "Name:\t" + this.getName() + "\t\tAddress:\t" + this.getAddress();
		}
		
		
		
}
