package LabWork;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
	static private ArrayList<Dentist> dl = new ArrayList<Dentist>();
	private static final String text = null;
	private Dentist currentD;
	private Patient currentP;

	@Override
	public void start(Stage primaryStage) {
		Buttons.thestage = primaryStage;
	//Creating Button and Labels
		//Login screen
		Buttons.output = new Label();
		Buttons.loginButton.setText("Login");
		Buttons.loginButton.setMinSize(40,10);
		Buttons.loginButton.setDefaultButton(true);

		//Main Menu
		Buttons.backButton1.setFitHeight(40);
		Buttons.backButton2.setFitHeight(40);
		Buttons.backButton3.setFitHeight(40);
		Buttons.backButton4.setFitHeight(40);
		Buttons.backButton5.setFitHeight(45);
		Buttons.backButton6.setFitHeight(40);
		Buttons.backButton7.setFitHeight(40);
		Buttons.backButton8.setFitHeight(40);
		Buttons.backButton9.setFitHeight(40);
		Buttons.ppAddButton.setFitHeight(40);
		Buttons.ppRemoveButton.setFitHeight(40);
		Buttons.ppRemoveButton.setFitWidth(40);
		Buttons.ppAddButton.setFitWidth(40);
		Buttons.backButton1.setFitWidth(40);
		Buttons.backButton2.setFitWidth(40);
		Buttons.backButton3.setFitWidth(40);
		Buttons.backButton4.setFitWidth(40);
		Buttons.backButton5.setFitWidth(45);
		Buttons.backButton6.setFitWidth(40);
		Buttons.backButton7.setFitWidth(40);
		Buttons.backButton8.setFitWidth(40);
		Buttons.backButton9.setFitWidth(40);
		Buttons.enterbutton.setFitWidth(60);
		Buttons.rpenterbutton.setFitWidth(60);
		Buttons.vpenterbutton.setFitWidth(60);


		Buttons.piAddButton.setFitHeight(40);
		Buttons.piRemoveButton.setFitHeight(40);
		Buttons.piEditButton.setFitHeight(40);
		Buttons.piPreviewButton.setFitHeight(40);
		Buttons.piAddButton.setFitWidth(40);
		Buttons.piRemoveButton.setFitWidth(40);
		Buttons.piEditButton.setFitWidth(40);
		Buttons.piPreviewButton.setFitWidth(40);

		Buttons.addPaimg.setFitWidth(130);
		Buttons.removePaimg.setFitWidth(130);
		Buttons.viewPaimg.setFitWidth(130);
		Buttons.exitimg.setFitWidth(130);
		Buttons.payButton.setFitWidth(130);
		Buttons.invoiceButton.setFitWidth(130);
		Buttons.proceButton.setFitWidth(130);
		Buttons.prolistButton.setFitWidth(130);
		Buttons.addPaimg.setFitHeight(130);
		Buttons.removePaimg.setFitHeight(130);
		Buttons.viewPaimg.setFitHeight(130);
		Buttons.exitimg.setFitHeight(130);
		Buttons.enterbutton.setFitHeight(60);
		Buttons.rpenterbutton.setFitHeight(60);
		Buttons.vpenterbutton.setFitHeight(60);

		Buttons.payButton.setFitHeight(130);
		Buttons.invoiceButton.setFitHeight(130);
		Buttons.proceButton.setFitHeight(130);
		Buttons.prolistButton.setFitHeight(130);

	//Putting Node in VBox/HBox
		//login screen
		Buttons.userbox.getChildren().addAll(Buttons.userLabel , Buttons.username);
		Buttons.passbox.getChildren().addAll(Buttons.passLabel , Buttons.password);
		Buttons.button.getChildren().addAll(Buttons.loginButton , Buttons.output);
		Buttons.button.setAlignment(Pos.BOTTOM_RIGHT);
		Buttons.layout.getChildren().addAll(Buttons.userbox, Buttons.passbox, Buttons.button);

		//Main Menu
		Buttons.showUser = new Label();
		Buttons.roll1.getChildren().addAll(Buttons.addPaimg,Buttons.viewPaimg);
		Buttons.roll1.setAlignment(Pos.CENTER);
		Buttons.roll3.getChildren().addAll(Buttons.removePaimg,Buttons.exitimg);
		Buttons.roll3.setAlignment(Pos.CENTER);

		Buttons.line = new Separator();
		Buttons.line2 = new Separator();
		Buttons.line3 = new Separator();
		Buttons.line4 = new Separator();
		Buttons.line5 = new Separator();
		Buttons.line6 = new Separator();
		Buttons.line7 = new Separator();
		Buttons.line8 = new Separator();
		Buttons.line9 = new Separator();
		Buttons.line10 = new Separator();

		Buttons.line.setMinWidth(500);
		Buttons.line2.setMinWidth(500);
		Buttons.line3.setMinWidth(500);
		Buttons.line4.setMinWidth(500);
		Buttons.line5.setMinWidth(500);
		Buttons.line6.setMinWidth(500);
		Buttons.line7.setMinWidth(500);
		Buttons.line8.setMinWidth(500);
		Buttons.line9.setMinWidth(500);
		Buttons.line10.setMinWidth(500);
		Buttons.roll2.getChildren().add(Buttons.line);
		Buttons.showUser.setFont(new Font("Arial", 30));
		Buttons.roll4.getChildren().add(Buttons.showUser);
		Buttons.setLayout.getChildren().addAll(Buttons.roll4,Buttons.roll2,Buttons.roll1,Buttons.roll3);

		//AddPatien
		Buttons.apToptitle.setFont(new Font("Arial", 30));
		Buttons.apPatNumber.setFont(new Font("Arial", 20));
		Buttons.apPatName.setFont(new Font("Arial", 20));
		Buttons.apPataddress.setFont(new Font("Arial", 20));
		Buttons.apPatDentist.setFont(new Font("Arial", 20));
		Buttons.aproll5.getChildren().addAll(Buttons.backButton1, Buttons.apToptitle);
		Buttons.aproll1.getChildren().addAll(Buttons.apPatNumber, Buttons.patNumberText);
		Buttons.aproll2.getChildren().addAll(Buttons.apPatName, Buttons.patNameText);
		Buttons.aproll3.getChildren().addAll(Buttons.apPataddress, Buttons.patAddressText);
		Buttons.aproll4.getChildren().addAll(Buttons.apPatDentist, Buttons.patDentistText);
		Buttons.aproll6.getChildren().addAll(Buttons.apinputerror,Buttons.enterbutton);
		Buttons.textinput.getChildren().addAll(Buttons.aproll1, Buttons.aproll2, Buttons.aproll3, Buttons.aproll4);
		Buttons.textinput.setAlignment(Pos.CENTER);
		Buttons.textinput.setStyle(" -fx-padding: 50");
		Buttons.aproll6.setAlignment(Pos.BOTTOM_RIGHT);
		Buttons.apLayout.getChildren().addAll(Buttons.aproll5,Buttons.line2, Buttons.textinput,Buttons.aproll6);

		//removePatient

		Buttons.rpcolPatNo.setCellValueFactory(new PropertyValueFactory<Patient , Integer>("PatNo"));
		Buttons.rpcolName.setCellValueFactory(new PropertyValueFactory<Patient , String>("Name"));
		Buttons.rpcolAddress.setCellValueFactory(new PropertyValueFactory<Patient , String>("Address"));
		Buttons.rptable.getColumns().addAll(Buttons.rpcolPatNo, Buttons.rpcolName , Buttons.rpcolAddress);
		Buttons.rpintro.setText("Please Select Patient:");
		Buttons.rpToptitle.setFont(new Font("Arial", 30));
		Buttons.rpsearchButton.setText("Search");
		Buttons.rpsearchButton.setDefaultButton(true);
		Buttons.rproll1.getChildren().addAll(Buttons.backButton2, Buttons.rpToptitle);

		Buttons.rproll2.setAlignment(Pos.CENTER);
		Buttons.rproll3.getChildren().add(Buttons.rpenterbutton);
		Buttons.rproll3.setAlignment(Pos.CENTER_RIGHT);
        Buttons.rproll4.getChildren().addAll(Buttons.rpsearchBar, Buttons.rpsearchButton);
        Buttons.rpLayout.setAlignment(Pos.CENTER);
		Buttons.rpLayout.getChildren().addAll(Buttons.rproll1, Buttons.line3, Buttons.rpintro, Buttons.rproll4, Buttons.rptable, Buttons.rproll3);

		//viewPatient
		Buttons.vpToptitle.setFont(new Font("Arial", 30));
		Buttons.vpcolPatNo.setCellValueFactory(new PropertyValueFactory<Patient , Integer>("PatNo"));
		Buttons.vpcolName.setCellValueFactory(new PropertyValueFactory<Patient , String>("Name"));
		Buttons.vpcolAddress.setCellValueFactory(new PropertyValueFactory<Patient , String>("Address"));
		Buttons.vptable.getColumns().addAll(Buttons.vpcolPatNo, Buttons.vpcolName , Buttons.vpcolAddress);
		Buttons.vpsearchButton.setText("Search");
		Buttons.vpsearchButton.setDefaultButton(true);
		Buttons.vproll2.getChildren().addAll(Buttons.vpsearchBar,Buttons.vpsearchButton);
		Buttons.vproll1.getChildren().addAll(Buttons.backButton3, Buttons.vpToptitle);
		Buttons.vproll3.getChildren().add(Buttons.vpenterbutton);
		Buttons.vproll3.setAlignment(Pos.CENTER_RIGHT);
		Buttons.vpLayout.getChildren().addAll(Buttons.vproll1, Buttons.line4, Buttons.vproll2, Buttons.vptable , Buttons.vproll3);

		//confirmlog
		Buttons.clToptitle.setFont(new Font("Arial", 15));
		Buttons.clToptitle.setText("ConFirm");
		Buttons.confirmButton.setText("Confirm");
		Buttons.cancelButton.setText("Cancel");
		Buttons.clroll1.getChildren().add(Buttons.clToptitle);
		Buttons.clroll2.getChildren().addAll( Buttons.cancelButton, Buttons.confirmButton  );
		Buttons.clroll2.setAlignment(Pos.BASELINE_CENTER);
		Buttons.clLayout.getChildren().addAll(Buttons.clroll1, Buttons.clroll2);

		//Patient Invoice
		Buttons.piToptitle.setFont(new Font("Arial", 30));
		Buttons.piInvoiceNo.setCellValueFactory(new PropertyValueFactory<Invoice , Integer>("InvoiceNo"));
		Buttons.piInvocieDate.setCellValueFactory(new PropertyValueFactory<Invoice , String>("invoiceDate"));
		Buttons.pitable.getColumns().addAll(Buttons.piInvoiceNo, 	Buttons.piInvocieDate );
		Buttons.piroll1.getChildren().addAll(Buttons.backButton7, Buttons.piToptitle);
		Buttons.piTextArea.setPrefWidth(300);
		Buttons.piTextArea.setPrefHeight(400);
		Buttons.piTextArea.setDisable(false);



		Buttons.pitableFunctionBottom.getChildren().addAll(Buttons.piAddButton, Buttons.piEditButton, Buttons.piRemoveButton);

		Buttons.pitableFunction.getChildren().addAll(Buttons.piTextArea, Buttons.pitableFunctionBottom);
		Buttons.piroll2.getChildren().addAll(Buttons.pitable , Buttons.pitableFunction );
		Buttons.piLayout.getChildren().addAll(Buttons.piroll1, Buttons.line9, Buttons.piroll2);


		//Patient Prodce
		Buttons.ppToptitle.setFont(new Font("Arial", 30));
		Buttons.ppProceNo.setCellValueFactory(new PropertyValueFactory<Procedure , Integer>("ProcNo"));
		Buttons.ppName.setCellValueFactory(new PropertyValueFactory<Procedure , String>("procName"));
		Buttons.ppCost.setCellValueFactory(new PropertyValueFactory<Procedure , Double>("procCost"));
		Buttons.pptable.getColumns().addAll(Buttons.ppProceNo, Buttons.ppName, Buttons.ppCost);
		Buttons.papProceNo.setCellValueFactory(new PropertyValueFactory<Procedure , Integer>("ProcNo"));
		Buttons.papName.setCellValueFactory(new PropertyValueFactory<Procedure , String>("procName"));
		Buttons.papCost.setCellValueFactory(new PropertyValueFactory<Procedure , Double>("procCost"));

		/*

			static	TextField pProcName = new TextField();
	static	TextField pProcCost = new TextField();
	static	Button	addProc = new Button();
	static	Button	rmProc	=	new Button();
		 */


		Buttons.paptable.getColumns().addAll(Buttons.papProceNo, Buttons.papName, Buttons.papCost);
		Buttons.pproll1.getChildren().addAll(Buttons.backButton6, Buttons.ppToptitle);
		Buttons.pproll2.getChildren().addAll(Buttons.piProceWar, Buttons.pptotal, Buttons.pptotalAmount, Buttons.ppMoveToPayment );
		Buttons.pproll2.setAlignment(Pos.BOTTOM_RIGHT);
		Buttons.pProcName.setPromptText("Name");
		Buttons.pProcCost.setPromptText("Cost");
		Buttons.pproll4.getChildren().addAll(Buttons.addProcMess, Buttons.pProcName, Buttons.pProcCost, Buttons.addProc, Buttons.rmProc);
		Buttons.tableFunctions.getChildren().addAll(Buttons.ppAddButton,Buttons.ppRemoveButton);
		Buttons.pproll3.getChildren().addAll( Buttons.paptable , Buttons.tableFunctions, Buttons.pptable);
		Buttons.pproll3.setAlignment(Pos.CENTER_RIGHT);
		Buttons.ppLayout.getChildren().addAll(Buttons.pproll1, Buttons.line8, Buttons.pproll3,Buttons.pproll4, Buttons.pproll2);


		//Payment
		Buttons.pToptitle.setFont(new Font("Arial", 30));
		Buttons.pPayNo.setCellValueFactory(new PropertyValueFactory<Payment , Integer>("paymentNo"));
		Buttons.pPayDate.setCellValueFactory(new PropertyValueFactory<Payment , String>("paymentDate"));
		Buttons.pPayAmount.setCellValueFactory(new PropertyValueFactory<Payment , Double>("paymentAmt"));
		Buttons.pPayTable.getColumns().addAll(Buttons.pPayNo, Buttons.pPayDate, Buttons.pPayAmount);
		Buttons.proll1.getChildren().addAll(Buttons.backButton8, Buttons.pToptitle);
		Buttons.proll2.getChildren().addAll(Buttons.ptotal);
		Buttons.proll3.getChildren().addAll(Buttons.premain);
		Buttons.proll4.getChildren().addAll(Buttons.Amount, Buttons.ppAdd);
		Buttons.pLayout.getChildren().addAll(Buttons.proll1,Buttons.line10,Buttons.proll2,Buttons.proll3, Buttons.pPayTable, Buttons.proll4);







////////////////////////////////////////////////////////////////////////////////////////////////////



	//Creating Pane
		//login screen
		Buttons.loginPane = new FlowPane(10,10);
		Buttons.mainMenuPane = new FlowPane(10,10);
		Buttons.addPPane = new FlowPane(20,20);
		Buttons.removePPane = new FlowPane(20,20);
		Buttons.viewPPane = new FlowPane(20,20);
		Buttons.confirmLog = new FlowPane(20,20);
		Buttons.pMenu = new FlowPane(20,20);
		Buttons.pProc = new FlowPane(20,20);
		Buttons.pInvoice = new FlowPane(20,20);
		Buttons.pPayment = new FlowPane(20,20);

		Buttons.loginPane.getChildren().add(Buttons.layout);
		Buttons.loginPane.setAlignment(Pos.CENTER);
		Buttons.mainMenuPane.setAlignment(Pos.CENTER);
		Buttons.addPPane.getChildren().add(Buttons.apLayout);
		Buttons.addPPane.setAlignment(Pos.CENTER);
		Buttons.removePPane.getChildren().add(Buttons.rpLayout);
		Buttons.removePPane.setAlignment(Pos.CENTER);
		Buttons.viewPPane.getChildren().add(Buttons.vpLayout);
		Buttons.viewPPane.setAlignment(Pos.CENTER);
		Buttons.confirmLog.getChildren().add(Buttons.clLayout);
		Buttons.confirmLog.setAlignment(Pos.CENTER);
		Buttons.pProc.getChildren().add(Buttons.ppLayout);
		Buttons.pProc.setAlignment(Pos.CENTER);
		Buttons.pInvoice.getChildren().add(Buttons.piLayout);
		Buttons.pInvoice.setAlignment(Pos.CENTER);
		Buttons.pPayment.getChildren().addAll(Buttons.pLayout);
		Buttons.pPayment.setAlignment(Pos.CENTER);

	//Controller
		Buttons.enterbutton.setPickOnBounds(true);
		Buttons.addPaimg.setPickOnBounds(true);
		Buttons.removePaimg.setPickOnBounds(true);
		Buttons.exitimg.setPickOnBounds(true);
		Buttons.viewPaimg.setPickOnBounds(true);
		Buttons.backButton1.setPickOnBounds(true);
		Buttons.backButton2.setPickOnBounds(true);
		Buttons.backButton3.setPickOnBounds(true);
		Buttons.backButton4.setPickOnBounds(true);
		Buttons.vpenterbutton.setPickOnBounds(true);
		Buttons.rpenterbutton.setPickOnBounds(true);
		Buttons.backButton1.setOnMouseClicked(e -> LabWork.Controller.changeScene(1, primaryStage, Buttons.mainMenuScene , currentD));
		Buttons.backButton2.setOnMouseClicked(e -> LabWork.Controller.changeScene(1, primaryStage, Buttons.mainMenuScene, currentD));
		Buttons.backButton3.setOnMouseClicked(e -> LabWork.Controller.changeScene(1, primaryStage, Buttons.mainMenuScene, currentD));
		Buttons.backButton4.setOnMouseClicked(e -> LabWork.Controller.changeScene(1, primaryStage, Buttons.mainMenuScene, currentD));
		Buttons.addPaimg.setOnMouseClicked(e ->
                {
                    LabWork.Controller.changeScene(2, primaryStage, Buttons.addPScene, currentD);
                    /* currentD.setPl(new Patient("pat1", "hi"));
                    currentD.setPl(new Patient("pat2", "hi"));
                    currentD.setPl(new Patient("pat3", "hi")); */
                }

		);

		Buttons.removePaimg.setOnMouseClicked(e ->
		{
			LabWork.Controller.changeScene(3, primaryStage, Buttons.removePScene, currentD);
			Buttons.rptable.setItems(Controller.loadPatientData(currentD));


		});
		Buttons.viewPaimg.setOnMouseClicked(e -> {
					LabWork.Controller.changeScene(4, primaryStage, Buttons.viewPScene, currentD);
					Buttons.vptable.setItems(Controller.loadPatientData(currentD));
				}
			);

		Buttons.loginButton.setOnAction(e -> {

					String namecheck = Buttons.username.getText();
					String passcheck = Buttons.password.getText();
			try {
				currentD = Controller.loginCheck(dl.size(), namecheck, passcheck, primaryStage, Buttons.mainMenuScene);
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}

		});


		Buttons.rpenterbutton.setOnMouseClicked(e -> {

				if(Buttons.rptable.getSelectionModel().getSelectedItem() != null)
				LabWork.Controller.confirmDia(1, primaryStage, Buttons.confirmScene, currentD, Buttons.rptable.getSelectionModel().getSelectedItem());

			}
			);

			Buttons.confirmButton.setOnAction(e -> {
				LabWork.Controller.confirmDia(2, primaryStage, Buttons.confirmScene, currentD, Buttons.rptable.getSelectionModel().getSelectedItem());
				Buttons.rptable.setItems(Controller.loadPatientData(currentD));
			});

		Buttons.cancelButton.setOnAction(e -> {
			LabWork.Controller.confirmDia(3, primaryStage, Buttons.confirmScene, currentD, Buttons.rptable.getSelectionModel().getSelectedItem());
			Buttons.rptable.setItems(Controller.loadPatientData(currentD));

		});

		Buttons.rpsearchButton.setOnAction(e -> {

			Buttons.rptable.setItems(Controller.seachPatientData(currentD, Buttons.rpsearchBar.getText(), Buttons.rpsearchBar));
			Buttons.rpsearchBar.clear();
		});
		Buttons.vpsearchButton.setOnAction(e -> {

			Buttons.vptable.setItems(Controller.seachPatientData(currentD, Buttons.vpsearchBar.getText(), Buttons.vpsearchBar));

		});

		Buttons.exitimg.setOnMouseClicked(e -> {

		LabWork.Controller.changeScene(6,primaryStage,Buttons.loginScene,null);
		Buttons.password.clear();
		Buttons.username.clear();
			try {
				Controller.Save(currentD);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	});
		Buttons.vpenterbutton.setOnMouseClicked(e ->

		{ if(Buttons.vptable.getSelectionModel().getSelectedItem() != null){
			LabWork.Controller.patientChangeScene(1, Buttons.vptable.getSelectionModel().getSelectedItem() , currentD, Buttons.pInvoiceScene, primaryStage );
			currentP = Buttons.vptable.getSelectionModel().getSelectedItem();
			Buttons.pitable.setItems(Controller.loadInvoiceData(currentP))
			;}
		});

		Buttons.enterbutton.setOnMouseClicked(e -> {

			if(Buttons.patNameText.getText().equals("") || Buttons.patAddressText.getText().equals("")) {
				Buttons.apinputerror.setText("Please Fill In Require Field");
				Buttons.apinputerror.setTextFill(Color.web("red"));
			}
			else
			{
				Controller.addingPat(currentD, Buttons.patNameText.getText(), Buttons.patAddressText.getText(), primaryStage, Buttons.addPScene);
				Buttons.apinputerror.setText("Patient Added");
				Buttons.apinputerror.setTextFill(Color.web("green"));
				Buttons.patNameText.clear();
				Buttons.patAddressText.clear();
			}
		});
		Buttons.backButton7.setOnMouseClicked(e -> {
			Controller.changeScene(4, primaryStage, Buttons.viewPScene,currentD);

		});
		//Buttons.proceButton.setOnMouseClicked(e -> Controller.patientChangeScene(2,  currentP , currentD, Buttons.pProcScene, primaryStage));

		Buttons.backButton5.setOnMouseClicked(e -> Controller.changeScene(1 , primaryStage, Buttons.mainMenuScene,currentD));

		Buttons.pitable.setOnMouseClicked(e -> {
			Controller.invoicePreview(currentP, Buttons.pitable.getSelectionModel().getSelectedItem());
		});
		Buttons.piEditButton.setOnMouseClicked(e -> {Controller.patientChangeScene(2,currentP,currentD,Buttons.pProcScene,primaryStage);
			Buttons.pptable.setItems(Controller.loadProcedureData(Buttons.pitable.getSelectionModel().getSelectedItem()));
			Buttons.paptable.setItems(Controller.loadProceListData(currentD));
			Buttons.pitable.getSelectionModel().getSelectedItem().setInvoiceAmt();
			Buttons.pptotalAmount.setText("" + Buttons.pitable.getSelectionModel().getSelectedItem().getInvoiceAmt());
		});
		Buttons.piAddButton.setOnMouseClicked(e -> Controller.addInvoice(currentP , currentD, primaryStage, Buttons.pInvoiceScene)
													);
		Buttons.backButton6.setOnMouseClicked(e -> {
			Buttons.pitable.setItems(Controller.loadInvoiceData(currentP));
			Controller.patientChangeScene(1, currentP, currentD, Buttons.pInvoiceScene, primaryStage);

		});
		Buttons.piRemoveButton.setOnMouseClicked(e -> Controller.removeInvoice(Buttons.pitable.getSelectionModel().getSelectedItem(), currentP));
		Buttons.ppAddButton.setOnMouseClicked(e -> {
			if(Buttons.paptable.getSelectionModel().getSelectedItem() != null)
			{
				Controller.addProcedure(Buttons.pitable.getSelectionModel().getSelectedItem(), Buttons.paptable.getSelectionModel().getSelectedItem() );
				Buttons.pptable.setItems(Controller.loadProcedureData(Buttons.pitable.getSelectionModel().getSelectedItem()));
				Buttons.pitable.getSelectionModel().getSelectedItem().setInvoiceAmt();
				Buttons.pptotalAmount.setText("" + Buttons.pitable.getSelectionModel().getSelectedItem().getInvoiceAmt());
			}
			else
			{
				Buttons.piProceWar.setTextFill(Color.web("red"));
			}
		});
		Buttons.ppRemoveButton.setOnMouseClicked(e ->
		{
			if(Buttons.pptable.getSelectionModel().getSelectedItem() != null)
			{
				Controller.rmProcedure(Buttons.pitable.getSelectionModel().getSelectedItem(), Buttons.pptable.getSelectionModel().getSelectedItem());
				Buttons.pptable.setItems(Controller.loadProcedureData(Buttons.pitable.getSelectionModel().getSelectedItem()));
				Buttons.pitable.getSelectionModel().getSelectedItem().setInvoiceAmt();
				Buttons.pptotalAmount.setText("" + Buttons.pitable.getSelectionModel().getSelectedItem().getInvoiceAmt());
			}
		});

		Buttons.ppMoveToPayment.setOnAction(e -> {
			Buttons.ptotal.setText("Total:\t\t" + Buttons.pitable.getSelectionModel().getSelectedItem().getInvoiceAmt() );
			Buttons.premain.setText("Remain:\t\t" + Buttons.pitable.getSelectionModel().getSelectedItem().remainer() );
			Buttons.pPayTable.setItems(Controller.loadPaymentData(Buttons.pitable.getSelectionModel().getSelectedItem()));
			Controller.patientChangeScene(3 ,currentP,currentD,Buttons.pPaymentScene,primaryStage);
		});
		Buttons.ppAdd.setOnAction(e ->{ Controller.makePayment(Buttons.pitable.getSelectionModel().getSelectedItem(), Buttons.Amount);
			Buttons.premain.setText("Remain:\t\t" + Buttons.pitable.getSelectionModel().getSelectedItem().remainer() );

		});
		Buttons.backButton8.setOnMouseClicked(e -> Controller.patientChangeScene( 2 , currentP,currentD,Buttons.pProcScene, primaryStage));

		Buttons.addProc.setOnAction(e -> {
			Procedure temp = new Procedure(Buttons.pProcName.getText(),Double.parseDouble(Buttons.pProcCost.getText()) );
			Controller.addProtoList(currentD, temp);
			Buttons.paptable.setItems(Controller.loadProceListData(currentD));
		});
		Buttons.rmProc.setOnAction(e -> {
			if(Buttons.paptable.getSelectionModel().getSelectedItem()!= null)
			{
				Controller.rmProtoList(currentD, Buttons.paptable.getSelectionModel().getSelectedItem());
			}
		});
		Buttons.save.setOnAction(e -> {
			try {
				Controller.Save(currentD);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});



		//Main Menu
		Buttons.mainMenuPane.getChildren().addAll(Buttons.setLayout);
		Buttons.mainMenuPane.setStyle("-fx-background-color: White");
		
		//addPatient
		Buttons.addPPane.setStyle("-fx-background-color: White");
		//removePatient
		Buttons.removePPane.setStyle("-fx-background-color: White");
		//viewPatient
		Buttons.viewPPane.setStyle("-fx-background-color: White");
		
		//Creating scene
		Buttons.loginScene = new Scene(Buttons.loginPane, 400, 200);
		Buttons.mainMenuScene = new Scene(Buttons.mainMenuPane ,800,600);
		Buttons.addPScene = new Scene(Buttons.addPPane ,800,600);
		Buttons.removePScene= new Scene(Buttons.removePPane ,800,600);
		Buttons.viewPScene= new Scene(Buttons.viewPPane ,800,600);
		Buttons.confirmScene= new Scene(Buttons.confirmLog ,300,150);
		Buttons.pMenuScene = new Scene(Buttons.pMenu, 800 ,600);
		Buttons.pProcScene = new Scene(Buttons.pProc, 800 , 600);
		Buttons.pInvoiceScene = new Scene(Buttons.pInvoice, 800, 600);
		Buttons.pPaymentScene = new Scene(Buttons.pPayment, 800 ,600);
		//Set PrimaryStage
		primaryStage.setTitle("Dentist Login");
		primaryStage.setScene(Buttons.loginScene);
		primaryStage.setResizable(true);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		

		Hardcode.main(args);
		launch(args);
	}
	
	public static Dentist getdl(int i)
	{
		return dl.get(i);
	}

	public static void setDl(Dentist d) {
		dl.add(d);
	}
}
