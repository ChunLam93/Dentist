package LabWork;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Buttons {
	
	
	static FlowPane loginPane, mainMenuPane, addPPane, removePPane,viewPPane, confirmLog;
	static FlowPane pMenu, pProc, pPayment, pInvoice;
	static BorderPane b1;
	static Scene mainMenuScene, loginScene, addPScene, removePScene , viewPScene, confirmScene;
	static Scene pMenuScene, pProcScene, pPaymentScene, pInvoiceScene;
	static Stage thestage;
	static Separator line, line2, line3, line4, line5,line6, line7, line8, line9,line10;
	
	//Login Screen
	static Label output = new Label("");
	static VBox layout = new VBox(20);
	static VBox button = new VBox();
	static HBox userbox = new HBox(10);
	static HBox passbox = new HBox(10);
	static Label userLabel = new Label("Username :");
	static TextField username = new TextField();
	static Label passLabel = new Label("Password :");
	static PasswordField password = new PasswordField();
	static Button loginButton = new Button();
	
	//Main Menu
	static	Label showUser ;
	static	HBox roll1 = new HBox(150);
	static	HBox roll2 = new HBox(100);
	static	HBox roll3 = new HBox(150);
	static	HBox roll4 = new HBox(100);
	static	VBox setLayout = new VBox(50);
	static 	Button save = new Button("Save");
		
	//AddPatient
	static	VBox apLayout = new VBox(20);
	static	VBox textinput = new VBox(30);
	static	Label apToptitle = new Label();
	static	HBox aproll1 = new HBox(40);
	static	HBox aproll2 = new HBox(85);
	static	HBox aproll3 = new HBox(40);
	static	HBox aproll4 = new HBox(40);
	static	HBox aproll5 = new HBox(40);
	static	HBox aproll6 = new HBox(40);
	static	Label apPatNumber = new Label("Patient Number:\t");
	static	Label apPatName = new Label("Patient Name:\t");
	static	Label apPataddress = new Label("Patient Address:\t");
	static	Label apPatDentist = new Label("Patient's Dentist:\t");
	static	Label patNumberText = new Label();
	static	TextField patNameText = new TextField();
	static	TextField patAddressText = new TextField();
	static	Label patDentistText = new Label();
	static	Label apinputerror = new Label();
	
	//removePatient
	static	VBox rpLayout = new VBox(10);
	static	Label rpToptitle = new Label();
	static	Label rpintro = new Label();
	static	HBox rproll1 = new HBox(40);
	static	HBox rproll2 = new HBox(85);
	static	HBox rproll3 = new HBox(40);
	static	HBox rproll4 = new HBox(40);


	
	//viewPatient
	static	VBox vpLayout = new VBox(10);
	static	Label vpToptitle = new Label();
	static	HBox vproll1 = new HBox(40);
	static	HBox vproll2 = new HBox(85);
	static	HBox vproll3 = new HBox(85);


	//confirmLog
	static	VBox clLayout = new VBox(10);
	static	Label clToptitle = new Label();
	static	HBox clroll1 = new HBox(40);
	static	HBox clroll2 = new HBox(40);
	static Button confirmButton = new Button();
	static Button cancelButton = new Button();




	//PatientProce
	static	VBox ppLayout = new VBox(10);
	static	Label ppToptitle = new Label();
	static	HBox pproll1 = new HBox(40);
	static	HBox pproll2 = new HBox(85);
	static	HBox pproll3 = new HBox(40);
	static	HBox pproll4 = new HBox(40);
	static	Label pptotal = new Label("Total:");
	static	Label addProcMess = new Label("Add Procedure");


	//PatientPayment
	static	VBox pLayout = new VBox(10);
	static	Label pToptitle = new Label();
	static	HBox proll1 = new HBox(40);
	static	HBox proll2 = new HBox(85);
	static	HBox proll3 = new HBox(40);
	static	HBox proll4 = new HBox(40);
	static	HBox proll5 = new HBox(40);
	static	HBox proll6 = new HBox(40);
	static	VBox tableFunctions = new VBox(10);
	static	Label pptotalAmount = new Label("");
	static Button ppMoveToPayment = new Button("Payment");
	static	Label ptotal = new Label("Total:");
	static	Label premain = new Label("Remain:");
	static	TextField Amount = new TextField();
	static Button ppAdd = new Button("Pay");



	//PatientInvoice
	static	VBox piLayout = new VBox(10);
	static	Label piToptitle = new Label();
	static	VBox pitableFunction = new VBox(10);
	static	HBox pitableFunctionBottom = new HBox(5);
	static	HBox pitableFunctionmiddle = new HBox(5);
	static	HBox piroll1 = new HBox(40);
	static	HBox piroll2 = new HBox(10);
	static 	TextArea piTextArea = new TextArea();
	static	Label piProceWar = new Label("Please Select a Procedure");
	static	TextField pProcName = new TextField();
	static	TextField pProcCost = new TextField();
	static	Button	addProc = new Button("Add");
	static	Button	rmProc	=	new Button("Remove");



	//ButtonImages
	static	Image addPaImage = new Image("file:/Users/chunlam/Google Drive/Year 2/Sem2/Java(Mac)/OOP2/add-contact.png");
	static	Image removePaImage = new Image("file:/Users/chunlam/Google Drive/Year 2/Sem2/Java(Mac)/OOP2/remove-contact.png");
	static	Image viewPaImage = new Image("file:/Users/chunlam/Google Drive/Year 2/Sem2/Java(Mac)/OOP2/list.png");
	static	Image exitPro = new Image("file:/Users/chunlam/Google Drive/Year 2/Sem2/Java(Mac)/OOP2/exit.png");
	static	Image prolist = new Image("file:/Users/chunlam/Google Drive/Year 2/Sem2/Java(Mac)/OOP2/clipboard.png");
	static	Image back = new Image("file:/Users/chunlam/Google Drive/Year 2/Sem2/Java(Mac)/OOP2/back.png");
	static	Image enter = new Image("file:/Users/chunlam/Google Drive/Year 2/Sem2/Java(Mac)/OOP2/enter.png");
	static	Image pProcePic = new Image("file:/Users/chunlam/Google Drive/Year 2/Sem2/Java(Mac)/OOP2/pProc.png");
	static	Image pInvoicePic = new Image("file:/Users/chunlam/Google Drive/Year 2/Sem2/Java(Mac)/OOP2/pInvoice.png");
	static	Image pPaymentPic = new Image("file:/Users/chunlam/Google Drive/Year 2/Sem2/Java(Mac)/OOP2/pPayment.png");
	static	Image add = new Image("file:/Users/chunlam/Google Drive/Year 2/Sem2/Java(Mac)/OOP2/plus.png");
	static	Image remove = new Image("file:/Users/chunlam/Google Drive/Year 2/Sem2/Java(Mac)/OOP2/remove.png");
	static	Image edit = new Image("file:/Users/chunlam/Google Drive/Year 2/Sem2/Java(Mac)/OOP2/edit.png");
	static	Image preview = new Image("file:/Users/chunlam/Google Drive/Year 2/Sem2/Java(Mac)/OOP2/preview.png");

	static	ImageView addPaimg = new ImageView(addPaImage);
	static	ImageView removePaimg = new ImageView(removePaImage);
	static	ImageView viewPaimg = new ImageView(viewPaImage);
	static	ImageView exitimg = new ImageView(exitPro);
	static	ImageView backButton1 = new ImageView(back);
	static	ImageView backButton2 = new ImageView(back);
	static	ImageView backButton3 = new ImageView(back);
	static	ImageView backButton4 = new ImageView(back);
	static	ImageView backButton5 = new ImageView(back);
	static	ImageView backButton6 = new ImageView(back);
	static	ImageView backButton7 = new ImageView(back);
	static	ImageView backButton8 = new ImageView(back);
	static	ImageView backButton9 = new ImageView(back);
	static	ImageView ppAddButton = new ImageView(add);
	static	ImageView ppRemoveButton = new ImageView(remove);

	static	ImageView enterbutton = new ImageView(enter);
	static	ImageView rpenterbutton = new ImageView(enter);
	static	ImageView vpenterbutton = new ImageView(enter);
	static	ImageView proceButton = new ImageView(pProcePic);
	static	ImageView payButton = new ImageView(pPaymentPic);
	static	ImageView invoiceButton = new ImageView(pInvoicePic);
	static	ImageView prolistButton = new ImageView(prolist);


	static	ImageView piAddButton = new ImageView(add);
	static	ImageView piRemoveButton = new ImageView(remove);
	static	ImageView piEditButton = new ImageView(edit);
	static	ImageView piPreviewButton = new ImageView(preview);

	//Table
	static TableView<Patient> rptable = new TableView<Patient>();
	static TableColumn<Patient, Integer > rpcolPatNo = new TableColumn("Patient No.");
	static TableColumn<Patient, String > rpcolName = new TableColumn("Name");
	static TableColumn<Patient, String > rpcolAddress = new TableColumn("Address");
	static Button rpsearchButton = new Button();
	static TextField rpsearchBar = new TextField();


	//VPTable
	static TableView<Patient> vptable = new TableView<Patient>();
	static TableColumn<Patient, Integer > vpcolPatNo = new TableColumn("Patient No.");
	static TableColumn<Patient, String > vpcolName = new TableColumn("Name");
	static TableColumn<Patient, String > vpcolAddress = new TableColumn("Address");
	static Button vpsearchButton = new Button();
	static TextField vpsearchBar = new TextField();

	//ProceTable
	static TableView<Procedure> pptable = new TableView<Procedure>();
	static TableColumn<Procedure, Integer > ppProceNo = new TableColumn("Procedure No.");
	static TableColumn<Procedure, String > ppName = new TableColumn("Name");
	static TableColumn<Procedure, Double > ppCost = new TableColumn("Cost");

	//InvoiceTable
	static TableView<Invoice> pitable = new TableView<Invoice>();
	static TableColumn<Invoice, Integer > piInvoiceNo = new TableColumn("Invoice No.");
	static TableColumn<Invoice, Double > piInvoiceAmt = new TableColumn("Amount");
	static TableColumn<Invoice, String > piInvocieDate = new TableColumn("Date");

	//ProceTable
	static TableView<Procedure> paptable = new TableView<Procedure>();
	static TableColumn<Procedure, Integer > papProceNo = new TableColumn("Procedure No.");
	static TableColumn<Procedure, String >  papName = new TableColumn("Name");
	static TableColumn<Procedure, Double > papCost = new TableColumn("Cost");

	//Paymenttable
	static TableView<Payment> pPayTable = new TableView<Payment>();
	static TableColumn<Payment, Integer > pPayNo = new TableColumn("Payment No.");
	static TableColumn<Payment, String >  pPayDate = new TableColumn("Payment Date");
	static TableColumn<Payment, Double > pPayAmount = new TableColumn("Amount");

}
