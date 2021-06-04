package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.text.DecimalFormat;

public class Main extends Application {

    Stage window;
    Scene mainMenu,scene1,scene2,scene3,scene4,scene5,scene6,scene7,scene8,scene9,scene10,scene11,scene12,scene13,scene14,scene15,scene16,scene17;
    TextField[] textFieldsArray = new TextField[1];



    public GridPane homePage(){
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(50,30,30,30));
        grid.setVgap(8);
        grid.setHgap(10);


        //Mortgage Calculator label
        Label nameLabel1 = new Label("Mortgage Calculator");
        nameLabel1.setId("labels");
        GridPane.setConstraints(nameLabel1,0,0);
        //Mortgage Calculator Button
        Button mortgageButton = new Button("Mortgage");
        mortgageButton.setId("buttons");
        mortgageButton.setPrefHeight(40);
        mortgageButton.setPrefWidth(100);
        GridPane.setConstraints(mortgageButton,1,0);
        mortgageButton.setOnAction(e->window.setScene(scene1));

        //Finance Calculator label
        Label nameLabel2 = new Label("Finance Calculators");
        nameLabel2.setId("labels");
        GridPane.setConstraints(nameLabel2,0,1);
        //Finance Calculator Button
        Button financeButton = new Button("Finance");
        financeButton.setId("buttons");
        financeButton.setPrefHeight(40);
        financeButton.setPrefWidth(100);
        GridPane.setConstraints(financeButton,1,1);
        financeButton.setOnAction(e->window.setScene(scene2));

        //Auto-Loan Calculator label
        Label nameLabel3 = new Label("Auto-Loan Calculators");
        nameLabel3.setId("labels");
        GridPane.setConstraints(nameLabel3,0,2);
        //Auto-Loan Calculator Button
        Button loanButton = new Button("Auto-Loan");
        loanButton.setId("buttons");
        loanButton.setPrefHeight(40);
        loanButton.setPrefWidth(100);
        loanButton.setOnAction(e->window.setScene(scene3));
        GridPane.setConstraints(loanButton,1,2);

        //Savings Calculator label
        Label nameLabel4 = new Label("Savings Calculators");
        nameLabel4.setId("labels");
        GridPane.setConstraints(nameLabel4,0,3);
        //Savings Calculator Button
        Button savingsBtn = new Button("Non-PMT");
        savingsBtn.setId("buttons");
        savingsBtn.setPrefHeight(40);
        savingsBtn.setPrefWidth(100);
        savingsBtn.setOnAction(e->window.setScene(scene12));
        GridPane.setConstraints(savingsBtn,1,3);

        //help label
        Label nameLabelHelp = new Label("HELP");
        nameLabelHelp.setId("labels");
        GridPane.setConstraints(nameLabelHelp,0,4);
        //help Button
        Button helpButton = new Button("HELP");
        helpButton.setId("buttons");
        helpButton.setPrefHeight(40);
        helpButton.setPrefWidth(100);
        helpButton.setOnAction(e->window.setScene(scene11));
        GridPane.setConstraints(helpButton,1,4);

        grid.getChildren().addAll(nameLabel4,savingsBtn,nameLabel1,mortgageButton,nameLabel2,financeButton,nameLabel3,loanButton,nameLabelHelp,helpButton);
        mainMenu = new Scene(grid, 600,300);

        return grid;
    }

    public GridPane mortgageCalculator(){

        //Mortgage Calculator Layout
        GridPane mortgageGrid = new GridPane();
        mortgageGrid.setPadding(new Insets(10,10,10,10));
        mortgageGrid.setVgap(8);
        mortgageGrid.setHgap(10);
        //Home Price label
        Label homeLabel1 = new Label("Home price");
        homeLabel1.setId("labels");
        GridPane.setConstraints(homeLabel1,0,0);
        //Home Price Input
        TextField homePriceInput = new TextField("");
        homePriceInput.setOnMouseClicked(e ->{textFieldsArray[0]=homePriceInput;});
        GridPane.setConstraints(homePriceInput,1,0);
        //Down Payment label
        Label downPaymentLabel1 = new Label("Down Payment");
        downPaymentLabel1.setId("labels");
        GridPane.setConstraints(downPaymentLabel1,0,1);
        //Down Payment Input
        TextField downPaymentInput = new TextField("");
        downPaymentInput.setOnMouseClicked(e ->{textFieldsArray[0]=downPaymentInput;});
        GridPane.setConstraints(downPaymentInput,1,1);
        //Loan Term label
        Label loanTermLabel1 = new Label("Loan Term");
        loanTermLabel1.setId("labels");
        GridPane.setConstraints(loanTermLabel1,0,2);
        //Loan Term Input
        TextField loanTermInput = new TextField("");
        loanTermInput.setOnMouseClicked(e ->{textFieldsArray[0]=loanTermInput;});
        GridPane.setConstraints(loanTermInput,1,2);
        //Interest Rate label
        Label interestRateLabel1 = new Label("Interest Rate");
        interestRateLabel1.setId("labels");
        GridPane.setConstraints(interestRateLabel1,0,3);
        //Interest Rate Input
        TextField interestRate1Input = new TextField("");
        interestRate1Input.setOnMouseClicked(e ->{textFieldsArray[0]=interestRate1Input;});
        GridPane.setConstraints(interestRate1Input,1,3);


        //Monthly Pay label
        Label monthlyPayLabel1 = new Label("Monthly Pay");
        monthlyPayLabel1.setId("labels");
        GridPane.setConstraints(monthlyPayLabel1,3,6);
        //Monthly Pay label 2
        Label monthlyPayLabel2 = new Label("");
        monthlyPayLabel2.setId("labels");
        GridPane.setConstraints(monthlyPayLabel2,4,6);
        //House Price label
        Label hPriceLabel = new Label("House Price");
        hPriceLabel.setId("labels");
        GridPane.setConstraints(hPriceLabel,3,7);
        //House Price label 2
        Label hPriceLabel2 = new Label("");
        hPriceLabel2.setId("labels");
        GridPane.setConstraints(hPriceLabel2,4,7);
        //Down Payment label
        Label downPaymentLabel111 = new Label("Down Payment");
        downPaymentLabel111.setId("labels");
        GridPane.setConstraints(downPaymentLabel111,3,8);
        //Down Payment label 2
        Label downPaymentLabel1112 = new Label("");
        downPaymentLabel1112.setId("labels");
        GridPane.setConstraints(downPaymentLabel1112,4,8);
        //Total 360 Payments label
        Label totalMortgagePrice = new Label("Total 360 mortgage payments");
        totalMortgagePrice.setId("labels");
        GridPane.setConstraints(totalMortgagePrice,3,9);
        //Total 360 Payments label 2
        Label totalMortgagePrice2 = new Label("");
        totalMortgagePrice2.setId("labels");
        GridPane.setConstraints(totalMortgagePrice2,4,9);

        //Calculate Button
        Button calculateButton1 = new Button("Calculate");
        calculateButton1.setId("buttons");
        calculateButton1.setOnAction(e->{
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            double homePrice = Double.parseDouble(homePriceInput.getText());
            hPriceLabel2.setText(decimalFormat.format(homePrice));
            double downPayment = Double.parseDouble(downPaymentInput.getText());
            downPaymentLabel1112.setText(decimalFormat.format(downPayment));
            double loanTerm = Double.parseDouble(loanTermInput.getText());
            double interestRate = Double.parseDouble(interestRate1Input.getText())/100;

            double startingMortgageBalance=homePrice-downPayment;
            double value =Math.pow(1+interestRate/12,loanTerm*12);
            double monthlyPayment=(startingMortgageBalance*interestRate/12*value)/(value-1);
            monthlyPayLabel2.setText(decimalFormat.format(monthlyPayment));
            double threeSixty = (monthlyPayment*360);
            totalMortgagePrice2.setText(decimalFormat.format(threeSixty));


        });
        GridPane.setConstraints(calculateButton1,0,4);
        //Back Button
        Button backButton = new Button("Main Menu");
        backButton.setId("buttons");
        backButton.setOnAction(e->window.setScene(mainMenu));
        GridPane.setConstraints(backButton,0,5);




        mortgageGrid.getChildren().addAll(homeLabel1,homePriceInput,hPriceLabel2,downPaymentLabel1,downPaymentLabel1112,totalMortgagePrice2,downPaymentInput,loanTermLabel1,loanTermInput,interestRateLabel1,interestRate1Input,backButton,calculateButton1,monthlyPayLabel1,hPriceLabel,downPaymentLabel111,totalMortgagePrice,monthlyPayLabel2);
        scene1 = new Scene(mortgageGrid, 800, 400);

        return mortgageGrid;


    }

    public GridPane financeMenu(){

        //Financial Calculator Layout
        GridPane financialGrid = new GridPane();
        financialGrid.setPadding(new Insets(10,10,10,10));
        financialGrid.setVgap(8);
        financialGrid.setHgap(10);

        //Future Value label
        Label futureValueLabel = new Label("Future Value");
        futureValueLabel.setId("labels");
        GridPane.setConstraints(futureValueLabel,0,0);
        //Future Value Button
        Button futureValueButton = new Button("Future");
        futureValueButton.setId("buttons");
        futureValueButton.setPrefHeight(40);
        futureValueButton.setPrefWidth(100);
        GridPane.setConstraints(futureValueButton,1,0);
        futureValueButton.setOnAction(e->window.setScene(scene4));

        //Periodic Payment label
        Label periodicPaymentLabel = new Label("Periodic Payment");
        periodicPaymentLabel.setId("labels");
        GridPane.setConstraints(periodicPaymentLabel,0,1);
        //Periodic Payment Button
        Button periodicPaymentButton = new Button("PMT");
        periodicPaymentButton.setId("buttons");
        periodicPaymentButton.setPrefHeight(40);
        periodicPaymentButton.setPrefWidth(100);
        GridPane.setConstraints(periodicPaymentButton,1,1);
        periodicPaymentButton.setOnAction(e->window.setScene(scene5));

        //Interest Rate label
        Label interestRateLabe2 = new Label("Interest Rate");
        interestRateLabe2.setId("labels");
        GridPane.setConstraints(interestRateLabe2,0,2);
        //Interest Rate Button
        Button interestRateButton2 = new Button("I / Y ");
        interestRateButton2.setId("buttons");
        interestRateButton2.setPrefHeight(40);
        interestRateButton2.setPrefWidth(100);
        GridPane.setConstraints(interestRateButton2,1,2);
        interestRateButton2.setOnAction(e->window.setScene(scene6));

        //Number Of Periods label
        Label numberOfPeriodsLabel = new Label("Number Of Periods");
        numberOfPeriodsLabel.setId("labels");
        GridPane.setConstraints(numberOfPeriodsLabel,0,3);
        //Number Of Periods Button
        Button numberOfPeriodsButton = new Button("N");
        numberOfPeriodsButton.setId("buttons");
        numberOfPeriodsButton.setPrefHeight(40);
        numberOfPeriodsButton.setPrefWidth(100);
        GridPane.setConstraints(numberOfPeriodsButton,1,3);
        numberOfPeriodsButton.setOnAction(e->window.setScene(scene7));

        //Start Principal label
        Label startPrincipalLabel = new Label("Start Principal");
        startPrincipalLabel.setId("labels");
        GridPane.setConstraints(startPrincipalLabel,0,4);
        //Start Principal Button
        Button startPrincipalButton = new Button("Start Principal");
        startPrincipalButton.setId("buttons");
        startPrincipalButton.setPrefHeight(40);
        startPrincipalButton.setPrefWidth(100);
        GridPane.setConstraints(startPrincipalButton,1,4);
        startPrincipalButton.setOnAction(e->window.setScene(scene8));

        //Back Button
        Button backButton2 = new Button("Main Menu");
        backButton2.setId("buttons");
        backButton2.setOnAction(e->window.setScene(mainMenu));
        GridPane.setConstraints(backButton2,0,5);

        financialGrid.getChildren().addAll(futureValueLabel,futureValueButton,periodicPaymentLabel,periodicPaymentButton,interestRateLabe2,interestRateButton2,numberOfPeriodsLabel,numberOfPeriodsButton,startPrincipalLabel,startPrincipalButton,backButton2);
        scene2 = new Scene(financialGrid, 800, 400);

        return financialGrid;

    }

    public GridPane autoLoanMenu(){

        //Auto-Loan Calculator Layout
        GridPane autoLoanGrid = new GridPane();
        autoLoanGrid.setPadding(new Insets(10,10,10,10));
        autoLoanGrid.setVgap(8);
        autoLoanGrid.setHgap(10);

        //Auto-Loan Calculator Topic label
        Label autoTopic = new Label("Auto-Loan Calculator");
        autoTopic.setId("labels");
        GridPane.setConstraints(autoTopic,0,0);

        //Total Price label
        Label totalPriceLabel1 = new Label("Total Price");
        totalPriceLabel1.setId("labels");
        GridPane.setConstraints(totalPriceLabel1,0,1);
        //Total Price Button
        Button totalPriceButton = new Button("T P");
        totalPriceButton.setId("buttons");
        totalPriceButton.setPrefHeight(40);
        totalPriceButton.setPrefWidth(100);
        totalPriceButton.setOnAction(e->window.setScene(scene9));
        GridPane.setConstraints(totalPriceButton,1,1);

        //Monthly Payment label
        Label monthlyPaymentLabel1 = new Label("Monthly Payment");
        monthlyPaymentLabel1.setId("labels");
        GridPane.setConstraints(monthlyPaymentLabel1,0,2);
        //Monthly Payment Button
        Button monthlyPaymentButton = new Button("M P");
        monthlyPaymentButton.setId("buttons");
        monthlyPaymentButton.setPrefHeight(40);
        monthlyPaymentButton.setPrefWidth(100);
        monthlyPaymentButton.setOnAction(e->window.setScene(scene10));
        GridPane.setConstraints(monthlyPaymentButton,1,2);

        //Back Button
        Button backButton13 = new Button("Main Menu");
        backButton13.setId("buttons");
        backButton13.setOnAction(e->window.setScene(mainMenu));
        GridPane.setConstraints(backButton13,0,5);

        autoLoanGrid.getChildren().addAll(autoTopic,totalPriceLabel1,totalPriceButton,monthlyPaymentLabel1,monthlyPaymentButton,backButton13);
        scene3 = new Scene(autoLoanGrid, 800, 400);

        return autoLoanGrid;


    }


    public GridPane futureValueCalculator(){

        //Future Value Calculator Layout
        GridPane futureValueGrid = new GridPane();
        futureValueGrid.setPadding(new Insets(10,10,10,10));
        futureValueGrid.setVgap(8);
        futureValueGrid.setHgap(10);
        //Future Topic label
        Label futureTopic = new Label("Future Value");
        futureTopic.setId("labels");
        GridPane.setConstraints(futureTopic,0,0);
        //Number of Periods label
        Label numberOfPeriodsLabel1 = new Label("Number of Periods(N)");
        numberOfPeriodsLabel1.setId("labels");
        GridPane.setConstraints(numberOfPeriodsLabel1,0,1);
        //Number of Periods Input
        TextField numberOfPeriodsInput1 = new TextField("");
        numberOfPeriodsInput1.setOnMouseClicked(e ->{textFieldsArray[0]=numberOfPeriodsInput1;});
        GridPane.setConstraints(numberOfPeriodsInput1,1,1);
        //Start Principal label
        Label startPrincipalLabel1 = new Label("Start Principal");
        startPrincipalLabel1.setId("labels");
        GridPane.setConstraints(startPrincipalLabel1,0,2);
        //Start Principal Input
        TextField startPrincipalInput1 = new TextField("");
        startPrincipalInput1.setOnMouseClicked(e ->{textFieldsArray[0]=startPrincipalInput1;});
        GridPane.setConstraints(startPrincipalInput1,1,2);
        //Interest Rate label
        Label interestRateLabel3 = new Label("Interest Rate(I / Y)");
        interestRateLabel3.setId("labels");
        GridPane.setConstraints(interestRateLabel3,0,3);
        //Interest Rate Input
        TextField interestRate1Input3 = new TextField("");
        interestRate1Input3.setOnMouseClicked(e ->{textFieldsArray[0]=interestRate1Input3;});
        GridPane.setConstraints(interestRate1Input3,1,3);
        //Annuity Payment label
        Label annuityPaymentLabel1 = new Label("Annuity Payment(PMT)");
        annuityPaymentLabel1.setId("labels");
        GridPane.setConstraints(annuityPaymentLabel1,0,4);
        //Annuity Payment Input
        TextField annuityPaymentInput1 = new TextField("");
        annuityPaymentInput1.setOnMouseClicked(e ->{textFieldsArray[0]=annuityPaymentInput1;});
        GridPane.setConstraints(annuityPaymentInput1,1,4);

        //Results label
        Label resultsLabelFuture = new Label("Results");
        resultsLabelFuture.setId("labels");
        GridPane.setConstraints(resultsLabelFuture,3,0);
        //Future Value  label
        Label futureValueFuture = new Label("Future Value");
        futureValueFuture.setId("labels");
        GridPane.setConstraints(futureValueFuture,3,1);
        //Future Value label 2
        Label futureValueFVEmpty = new Label("");
        futureValueFVEmpty.setId("labels");
        GridPane.setConstraints(futureValueFVEmpty,4,1);
        //Present Value label
        Label presentValueFuture = new Label("Present Value");
        presentValueFuture.setId("labels");
        GridPane.setConstraints(presentValueFuture,3,2);
        //Present Value label 2
        Label presentValueFVEmpty = new Label("");
        presentValueFVEmpty.setId("labels");
        GridPane.setConstraints(presentValueFVEmpty,4,2);
        //nOP label
        Label nOPFuture = new Label("Number Of Periods");
        nOPFuture.setId("labels");
        GridPane.setConstraints(nOPFuture,3,3);
        //nOP label 2
        Label nOPFutureEmpty = new Label("");
        nOPFutureEmpty.setId("labels");
        GridPane.setConstraints(nOPFutureEmpty,4,3);
        //iY label
        Label iYFuture = new Label("Interest Rate");
        iYFuture.setId("labels");
        GridPane.setConstraints(iYFuture,3,4);
        //iY label 2
        Label iYFutureEmpty = new Label("");
        iYFutureEmpty.setId("labels");
        GridPane.setConstraints(iYFutureEmpty,4,4);
        //PMT label
        Label pMTFuture = new Label("PMT");
        pMTFuture.setId("labels");
        GridPane.setConstraints(pMTFuture,3,5);
        //PMT label 2
        Label pMTFutureEmpty = new Label("");
        pMTFutureEmpty.setId("labels");
        GridPane.setConstraints(pMTFutureEmpty,4,5);
        //Starting Investment label
        Label startingInvestmentFuture = new Label("Starting Investment");
        startingInvestmentFuture.setId("labels");
        GridPane.setConstraints(startingInvestmentFuture,3,6);
        // Starting Investment label 2
        Label startingInvestmentFutureEmpty = new Label("");
        startingInvestmentFutureEmpty.setId("labels");
        GridPane.setConstraints(startingInvestmentFutureEmpty,4,6);
        //Total Principal label
        Label totalPrincipalFuture = new Label("Total Principal");
        totalPrincipalFuture.setId("labels");
        GridPane.setConstraints(totalPrincipalFuture,3,7);
        //Total Principal label 2
        Label totalPrincipalFutureEmpty = new Label("");
        totalPrincipalFutureEmpty.setId("labels");
        GridPane.setConstraints(totalPrincipalFutureEmpty,4,7);
        //Total Interest label
        Label totalInterestFuture = new Label("Total Interest");
        totalInterestFuture.setId("labels");
        GridPane.setConstraints(totalInterestFuture,3,8);
        //Total Interest label 2
        Label totalInterestFutureEmpty = new Label("");
        totalInterestFutureEmpty.setId("labels");
        GridPane.setConstraints(totalInterestFutureEmpty,4,8);


        //Calculate Button
        Button calculateButton2 = new Button("Calculate");
        calculateButton2.setId("buttons");
        calculateButton2.setOnAction(e->{
            DecimalFormat decimalFormat3 = new DecimalFormat("0.00");
            double nOfPFuture = Double.parseDouble(numberOfPeriodsInput1.getText());
            nOPFutureEmpty.setText(decimalFormat3.format(nOfPFuture));
            double sPFuture = Double.parseDouble(startPrincipalInput1.getText());
            startingInvestmentFutureEmpty.setText(decimalFormat3.format(sPFuture));
            double iRateFuture = Double.parseDouble(interestRate1Input3.getText())/100;
            iYFutureEmpty.setText(decimalFormat3.format(iRateFuture));
            double aPayFuture = Double.parseDouble(annuityPaymentInput1.getText());
            pMTFutureEmpty.setText(decimalFormat3.format(aPayFuture));

            double valueN=Math.pow(1+iRateFuture,nOfPFuture);
            double presentValueFV=sPFuture+(aPayFuture*(1-Math.pow(1+iRateFuture,-nOfPFuture))/iRateFuture);
            presentValueFVEmpty.setText(decimalFormat3.format(presentValueFV));
            double futureValue=sPFuture*valueN+aPayFuture*(valueN-1)/iRateFuture;
            futureValueFVEmpty.setText(decimalFormat3.format(futureValue));
            double totalPrincipalF = (sPFuture+(aPayFuture*nOfPFuture));
            totalPrincipalFutureEmpty.setText(decimalFormat3.format(totalPrincipalF));
            double totalInterestFV=futureValue-(sPFuture+(aPayFuture*nOfPFuture));
            totalInterestFutureEmpty.setText(decimalFormat3.format(totalInterestFV));

        });
        GridPane.setConstraints(calculateButton2,0,5);
        //Back Button
        Button backButton3 = new Button("Finance Menu");
        backButton3.setId("buttons");
        backButton3.setOnAction(e->window.setScene(scene2));
        GridPane.setConstraints(backButton3,0,6);
        //Back Button
        Button backButton4 = new Button("Main Menu");
        backButton4.setId("buttons");
        backButton4.setOnAction(e->window.setScene(mainMenu));
        GridPane.setConstraints(backButton4,0,7);

        futureValueGrid.getChildren().addAll(futureTopic,numberOfPeriodsLabel1,numberOfPeriodsInput1,startPrincipalLabel1,startPrincipalInput1,interestRateLabel3,interestRate1Input3,annuityPaymentLabel1,annuityPaymentInput1,calculateButton2,backButton3,backButton4,resultsLabelFuture,futureValueFuture,futureValueFVEmpty,presentValueFuture,presentValueFVEmpty,nOPFuture,nOPFutureEmpty,iYFuture,iYFutureEmpty,pMTFuture,pMTFutureEmpty,startingInvestmentFuture,startingInvestmentFutureEmpty,totalPrincipalFuture,totalPrincipalFutureEmpty,totalInterestFuture,totalInterestFutureEmpty);
        scene4 = new Scene(futureValueGrid, 800, 400);

        return futureValueGrid;


    }

    public GridPane pmtCalculator(){

        //Periodic Payment Calculator Layout
        GridPane periodicPaymentGrid = new GridPane();
        periodicPaymentGrid.setPadding(new Insets(10,10,10,10));
        periodicPaymentGrid.setVgap(8);
        periodicPaymentGrid.setHgap(10);
        //Periodic Payment Topic label
        Label pmtTopic = new Label("P M T ");
        pmtTopic.setId("labels");
        GridPane.setConstraints(pmtTopic,0,0);
        //Future Payment label
        Label futurePaymentLabel2 = new Label("Future Payment(FV)");
        futurePaymentLabel2.setId("labels");
        GridPane.setConstraints(futurePaymentLabel2,0,1);
        //Future Payment Input
        TextField futurePaymentInput2 = new TextField("");
        futurePaymentInput2.setOnMouseClicked(e ->{textFieldsArray[0]=futurePaymentInput2;});
        GridPane.setConstraints(futurePaymentInput2,1,1);
        //Start Principal label
        Label startPrincipalLabel2 = new Label("Start Principal");
        startPrincipalLabel2.setId("labels");
        GridPane.setConstraints(startPrincipalLabel2,0,2);
        //Start Principal Input
        TextField startPrincipalInput2 = new TextField("");
        startPrincipalInput2.setOnMouseClicked(e ->{textFieldsArray[0]=startPrincipalInput2;});
        GridPane.setConstraints(startPrincipalInput2,1,2);
        //Interest Rate label
        Label interestRateLabel4 = new Label("Interest Rate(I / Y)");
        interestRateLabel4.setId("labels");
        GridPane.setConstraints(interestRateLabel4,0,3);
        //Interest Rate Input
        TextField interestRate1Input4 = new TextField("");
        interestRate1Input4.setOnMouseClicked(e ->{textFieldsArray[0]=interestRate1Input4;});
        GridPane.setConstraints(interestRate1Input4,1,3);
        //Number of periods label
        Label nOfPLabel3 = new Label("Number of periods(N)");
        nOfPLabel3.setId("labels");
        GridPane.setConstraints(nOfPLabel3,0,4);
        // Number of periods Input
        TextField nOfPInput3 = new TextField("");
        nOfPInput3.setOnMouseClicked(e ->{textFieldsArray[0]=nOfPInput3;});
        GridPane.setConstraints(nOfPInput3,1,4);

        //Results label
        Label resultsLabelPMT = new Label("Results");
        resultsLabelPMT.setId("labels");
        GridPane.setConstraints(resultsLabelPMT,3,0);
        //Future Value  label
        Label futureValuePMT = new Label("Future Value");
        futureValuePMT.setId("labels");
        GridPane.setConstraints(futureValuePMT,3,1);
        //Future Value label 2
        Label futureValuePMTEmpty = new Label("");
        futureValuePMTEmpty.setId("labels");
        GridPane.setConstraints(futureValuePMTEmpty,4,1);
        //Present Value label
        Label presentValuePMT = new Label("Present Value");
        presentValuePMT.setId("labels");
        GridPane.setConstraints(presentValuePMT,3,2);
        //Present Value label 2
        Label presentValuePMTEmpty = new Label("");
        presentValuePMTEmpty.setId("labels");
        GridPane.setConstraints(presentValuePMTEmpty,4,2);
        //nOP label
        Label nOPPMT = new Label("Number Of Periods");
        nOPPMT.setId("labels");
        GridPane.setConstraints(nOPPMT,3,3);
        //nOP label 2
        Label nOPPMTEmpty = new Label("");
        nOPPMTEmpty.setId("labels");
        GridPane.setConstraints(nOPPMTEmpty,4,3);
        //iY label
        Label iYPMT = new Label("Interest Rate");
        iYPMT.setId("labels");
        GridPane.setConstraints(iYPMT,3,4);
        //iY label 2
        Label iYPMTEmpty = new Label("");
        iYPMTEmpty.setId("labels");
        GridPane.setConstraints(iYPMTEmpty,4,4);
        //PMT label
        Label pMTPMT = new Label("PMT");
        pMTPMT.setId("labels");
        GridPane.setConstraints(pMTPMT,3,5);
        //PMT label 2
        Label pMTPMTEmpty = new Label("");
        pMTPMTEmpty.setId("labels");
        GridPane.setConstraints(pMTPMTEmpty,4,5);
        //Starting Investment label
        Label startingInvestmentPMT = new Label("Starting Investment");
        startingInvestmentPMT.setId("labels");
        GridPane.setConstraints(startingInvestmentPMT,3,6);
        // Starting Investment label 2
        Label startingInvestmentPMTEmpty = new Label("");
        startingInvestmentPMTEmpty.setId("labels");
        GridPane.setConstraints(startingInvestmentPMTEmpty,4,6);
        //Total Principal label
        Label totalPrincipalPMT = new Label("Total Principal");
        totalPrincipalPMT.setId("labels");
        GridPane.setConstraints(totalPrincipalPMT,3,7);
        //Total Principal label 2
        Label totalPrincipalPMTEmpty = new Label("");
        totalPrincipalPMTEmpty.setId("labels");
        GridPane.setConstraints(totalPrincipalPMTEmpty,4,7);
        //Total Interest label
        Label totalInterestPMT = new Label("Total Interest");
        totalInterestPMT.setId("labels");
        GridPane.setConstraints(totalInterestPMT,3,8);
        //Total Interest label 2
        Label totalInterestPMTEmpty = new Label("");
        totalInterestPMTEmpty.setId("labels");
        GridPane.setConstraints(totalInterestPMTEmpty,4,8);

        //Calculate Button
        Button calculateButton3 = new Button("Calculate");
        calculateButton3.setId("buttons");
        calculateButton3.setOnAction(e->{
            DecimalFormat decimalFormat4 = new DecimalFormat("0.00");
            double fvPMT = Double.parseDouble(futurePaymentInput2.getText());
            futureValuePMTEmpty.setText(decimalFormat4.format(fvPMT));
            double spPMT = Double.parseDouble(startPrincipalInput2.getText());
            startingInvestmentPMTEmpty.setText(decimalFormat4.format(spPMT));
            double iRatePMT = Double.parseDouble(interestRate1Input4.getText())/100;
            iYPMTEmpty.setText(decimalFormat4.format(iRatePMT));
            double periodsPMT = Double.parseDouble(nOfPInput3.getText());
            nOPPMTEmpty.setText(decimalFormat4.format(periodsPMT));

            double valuePMT=Math.pow(1+iRatePMT,periodsPMT);
            double pmtCal = iRatePMT * (fvPMT - spPMT * valuePMT) / (valuePMT - 1);
            pMTPMTEmpty.setText(decimalFormat4.format(pmtCal));

            double presentValPMT =spPMT+(pmtCal*(1-Math.pow(1+iRatePMT,-periodsPMT))/iRatePMT);
            presentValuePMTEmpty.setText(decimalFormat4.format(presentValPMT));
            double totalPPMT = (spPMT+(pmtCal*periodsPMT));
            totalPrincipalPMTEmpty.setText(decimalFormat4.format(totalPPMT));
            double totalIPMT=fvPMT-(spPMT+(pmtCal*periodsPMT));
            totalInterestPMTEmpty.setText(decimalFormat4.format(totalIPMT));




        });
        GridPane.setConstraints(calculateButton3,0,5);
        //Back Button
        Button backButton5 = new Button("Finance Menu");
        backButton5.setId("buttons");
        backButton5.setOnAction(e->window.setScene(scene2));
        GridPane.setConstraints(backButton5,0,6);
        //Back Button
        Button backButton6 = new Button("Main Menu");
        backButton6.setId("buttons");
        backButton6.setOnAction(e->window.setScene(mainMenu));
        GridPane.setConstraints(backButton6,0,7);

        periodicPaymentGrid.getChildren().addAll(pmtTopic,futurePaymentLabel2,futurePaymentInput2,startPrincipalLabel2,startPrincipalInput2,interestRateLabel4,interestRate1Input4,nOfPLabel3,nOfPInput3,calculateButton3,backButton5,backButton6,resultsLabelPMT,futureValuePMT,futureValuePMTEmpty,presentValuePMT,presentValuePMTEmpty,nOPPMT,nOPPMTEmpty,iYPMT,iYPMTEmpty,pMTPMT,pMTPMTEmpty,startingInvestmentPMT,startingInvestmentPMTEmpty,totalPrincipalPMT,totalPrincipalPMTEmpty,totalInterestPMT,totalInterestPMTEmpty);
        scene5 = new Scene(periodicPaymentGrid, 800, 400);

        return periodicPaymentGrid;


    }

    public GridPane irCalculator(){

        //Interest Rate Calculator Layout
        GridPane interestRateGrid5 = new GridPane();
        interestRateGrid5.setPadding(new Insets(10,10,10,10));
        interestRateGrid5.setVgap(8);
        interestRateGrid5.setHgap(10);
        //Interest Rate Topic label
        Label interestRateTopic5 = new Label("Interest Rate(I / Y)");
        interestRateGrid5.setId("labels");
        GridPane.setConstraints(interestRateTopic5,0,0);
        //Future Payment label
        Label futurePaymentLabel3 = new Label("Future Payment(FV)");
        futurePaymentLabel3.setId("labels");
        GridPane.setConstraints(futurePaymentLabel3,0,1);
        //Future Payment Input
        TextField futurePaymentInput3 = new TextField("");
        futurePaymentInput3.setOnMouseClicked(e ->{textFieldsArray[0]=futurePaymentInput3;});
        GridPane.setConstraints(futurePaymentInput3,1,1);
        //Start Principal label
        Label startPrincipalLabel3 = new Label("Start Principal");
        startPrincipalLabel3.setId("labels");
        GridPane.setConstraints(startPrincipalLabel3,0,2);
        //Start Principal Input
        TextField startPrincipalInput3 = new TextField("");
        startPrincipalInput3.setOnMouseClicked(e ->{textFieldsArray[0]=startPrincipalInput3;});
        GridPane.setConstraints(startPrincipalInput3,1,2);
        //Annuity Payment label
        Label annuityPaymentLabel3 = new Label("Annuity Payment(PMT)");
        annuityPaymentLabel3.setId("labels");
        GridPane.setConstraints(annuityPaymentLabel3,0,3);
        //Annuity Payment Input
        TextField annuityPaymentInput3 = new TextField("");
        annuityPaymentInput3.setOnMouseClicked(e ->{textFieldsArray[0]=annuityPaymentInput3;});
        GridPane.setConstraints(annuityPaymentInput3,1,3);
        //Number of periods label
        Label nOfPLabel4 = new Label("Number of periods(N)");
        nOfPLabel4.setId("labels");
        GridPane.setConstraints(nOfPLabel4,0,4);
        // Number of periods Input
        TextField nOfPInput4 = new TextField("");
        nOfPInput4.setOnMouseClicked(e ->{textFieldsArray[0]=nOfPInput4;});
        GridPane.setConstraints(nOfPInput4,1,4);

        //Results label
        Label resultsLabelIR = new Label("Results");
        resultsLabelIR.setId("labels");
        GridPane.setConstraints(resultsLabelIR,3,0);
        //Future Value  label
        Label futureValueIR = new Label("Future Value");
        futureValueIR.setId("labels");
        GridPane.setConstraints(futureValueIR,3,1);
        //Future Value label 2
        Label futureValueIREmpty = new Label("");
        futureValueIREmpty.setId("labels");
        GridPane.setConstraints(futureValueIREmpty,4,1);
        //Present Value label
        Label presentValueIR = new Label("Present Value");
        presentValueIR.setId("labels");
        GridPane.setConstraints(presentValueIR,3,2);
        //Present Value label 2
        Label presentValueIREmpty = new Label("");
        presentValueIREmpty.setId("labels");
        GridPane.setConstraints(presentValueIREmpty,4,2);
        //nOP label
        Label nOPIR = new Label("Number Of Periods");
        nOPIR.setId("labels");
        GridPane.setConstraints(nOPIR,3,3);
        //nOP label 2
        Label nOPIREmpty = new Label("");
        nOPIREmpty.setId("labels");
        GridPane.setConstraints(nOPIREmpty,4,3);
        //iY label
        Label iYIR = new Label("Interest Rate");
        iYIR.setId("labels");
        GridPane.setConstraints(iYIR,3,4);
        //iY label 2
        Label iYIREmpty = new Label("");
        iYIREmpty.setId("labels");
        GridPane.setConstraints(iYIREmpty,4,4);
        //PMT label
        Label pMTIR = new Label("PMT");
        pMTIR.setId("labels");
        GridPane.setConstraints(pMTIR,3,5);
        //PMT label 2
        Label pMTIREmpty = new Label("");
        pMTIREmpty.setId("labels");
        GridPane.setConstraints(pMTIREmpty,4,5);
        //Starting Investment label
        Label startingInvestmentIR = new Label("Starting Investment");
        startingInvestmentIR.setId("labels");
        GridPane.setConstraints(startingInvestmentIR,3,6);
        // Starting Investment label 2
        Label startingInvestmentIREmpty = new Label("");
        startingInvestmentIREmpty.setId("labels");
        GridPane.setConstraints(startingInvestmentIREmpty,4,6);
        //Total Principal label
        Label totalPrincipalIR = new Label("Total Principal");
        totalPrincipalIR.setId("labels");
        GridPane.setConstraints(totalPrincipalIR,3,7);
        //Total Principal label 2
        Label totalPrincipalIREmpty = new Label("");
        totalPrincipalIREmpty.setId("labels");
        GridPane.setConstraints(totalPrincipalIREmpty,4,7);
        //Total Interest label
        Label totalInterestIR = new Label("Total Interest");
        totalInterestIR.setId("labels");
        GridPane.setConstraints(totalInterestIR,3,8);
        //Total Interest label 2
        Label totalInterestIREmpty = new Label("");
        totalInterestIREmpty.setId("labels");
        GridPane.setConstraints(totalInterestIREmpty,4,8);

        //Calculate Button
        Button calculateButton4 = new Button("Calculate");
        calculateButton4.setId("buttons");
        GridPane.setConstraints(calculateButton4,0,5);
        //Back Button
        Button backButton7 = new Button("Finance Menu");
        backButton7.setId("buttons");
        backButton7.setOnAction(e->window.setScene(scene2));
        GridPane.setConstraints(backButton7,0,6);
        //Back Button
        Button backButton8 = new Button("Main Menu");
        backButton8.setId("buttons");
        backButton8.setOnAction(e->window.setScene(mainMenu));
        GridPane.setConstraints(backButton8,0,7);

        interestRateGrid5.getChildren().addAll(interestRateTopic5,futurePaymentLabel3,futurePaymentInput3,startPrincipalLabel3,startPrincipalInput3,annuityPaymentLabel3,annuityPaymentInput3,nOfPLabel4,nOfPInput4,calculateButton4,backButton7,backButton8,resultsLabelIR,futureValueIR,futureValueIREmpty,presentValueIR,presentValueIREmpty,nOPIR,nOPIREmpty,iYIR,iYIREmpty,pMTIR,pMTIREmpty,startingInvestmentIR,startingInvestmentIREmpty,totalPrincipalIR,totalPrincipalIREmpty,totalInterestIR,totalInterestIREmpty);
        scene6 = new Scene(interestRateGrid5, 800, 400);

        return interestRateGrid5;


    }

    public  GridPane nopCalculator(){

        //Number Of Periods Calculator Layout
        GridPane numberOfPeriodsGrid = new GridPane();
        numberOfPeriodsGrid.setPadding(new Insets(10,10,10,10));
        numberOfPeriodsGrid.setVgap(8);
        numberOfPeriodsGrid.setHgap(10);
        //Number Of Periods Topic label
        Label numberOfPeriodsTopic = new Label("Number Of Periods(N)");
        numberOfPeriodsTopic.setId("labels");
        GridPane.setConstraints(numberOfPeriodsTopic,0,0);
        //Future Payment label
        Label futurePaymentLabel4 = new Label("Future Payment(FV)");
        futurePaymentLabel4.setId("labels");
        GridPane.setConstraints(futurePaymentLabel4,0,1);
        //Future Payment Input
        TextField futurePaymentInput4 = new TextField("");
        futurePaymentInput4.setOnMouseClicked(e ->{textFieldsArray[0]=futurePaymentInput4;});
        GridPane.setConstraints(futurePaymentInput4,1,1);
        //Start Principal label
        Label startPrincipalLabel4 = new Label("Start Principal");
        startPrincipalLabel4.setId("labels");
        GridPane.setConstraints(startPrincipalLabel4,0,2);
        //Start Principal Input
        TextField startPrincipalInput4 = new TextField("");
        startPrincipalInput4.setOnMouseClicked(e ->{textFieldsArray[0]=startPrincipalInput4;});
        GridPane.setConstraints(startPrincipalInput4,1,2);
        //Interest Rate label
        Label interestRateLabel8 = new Label("Interest Rate(I / Y)");
        interestRateLabel8.setId("labels");
        GridPane.setConstraints(interestRateLabel8,0,3);
        //Interest Rate Input
        TextField interestRate1Input8 = new TextField("");
        interestRate1Input8.setOnMouseClicked(e ->{textFieldsArray[0]=interestRate1Input8;});
        GridPane.setConstraints(interestRate1Input8,1,3);
        //Annuity Payment label
        Label annuityPaymentLabel5 = new Label("Annuity Payment(PMT)");
        annuityPaymentLabel5.setId("labels");
        GridPane.setConstraints(annuityPaymentLabel5,0,4);
        // Annuity Payment Input
        TextField annuityPaymentInput5 = new TextField("");
        annuityPaymentInput5.setOnMouseClicked(e ->{textFieldsArray[0]=annuityPaymentInput5;});
        GridPane.setConstraints(annuityPaymentInput5,1,4);

        //Results label
        Label resultsLabelNOP = new Label("Results");
        resultsLabelNOP.setId("labels");
        GridPane.setConstraints(resultsLabelNOP,3,0);
        //Future Value  label
        Label futureValueNOP = new Label("Future Value");
        futureValueNOP.setId("labels");
        GridPane.setConstraints(futureValueNOP,3,1);
        //Future Value label 2
        Label futureValueNOPEmpty = new Label("");
        futureValueNOPEmpty.setId("labels");
        GridPane.setConstraints(futureValueNOPEmpty,4,1);
        //Present Value label
        Label presentValueNOP = new Label("Present Value");
        presentValueNOP.setId("labels");
        GridPane.setConstraints(presentValueNOP,3,2);
        //Present Value label 2
        Label presentValueNOPEmpty = new Label("");
        presentValueNOPEmpty.setId("labels");
        GridPane.setConstraints(presentValueNOPEmpty,4,2);
        //nOP label
        Label nOPNOP = new Label("Number Of Periods");
        nOPNOP.setId("labels");
        GridPane.setConstraints(nOPNOP,3,3);
        //nOP label 2
        Label nOPNOPEmpty = new Label("");
        nOPNOPEmpty.setId("labels");
        GridPane.setConstraints(nOPNOPEmpty,4,3);
        //iY label
        Label iYNOP = new Label("Interest Rate");
        iYNOP.setId("labels");
        GridPane.setConstraints(iYNOP,3,4);
        //iY label 2
        Label iYNOPEmpty = new Label("");
        iYNOPEmpty.setId("labels");
        GridPane.setConstraints(iYNOPEmpty,4,4);
        //PMT label
        Label pMTNOP = new Label("PMT");
        pMTNOP.setId("labels");
        GridPane.setConstraints(pMTNOP,3,5);
        //PMT label 2
        Label pMTNOPEmpty = new Label("");
        pMTNOPEmpty.setId("labels");
        GridPane.setConstraints(pMTNOPEmpty,4,5);
        //Starting Investment label
        Label startingInvestmentNOP = new Label("Starting Investment");
        startingInvestmentNOP.setId("labels");
        GridPane.setConstraints(startingInvestmentNOP,3,6);
        // Starting Investment label 2
        Label startingInvestmentNOPEmpty = new Label("");
        startingInvestmentNOPEmpty.setId("labels");
        GridPane.setConstraints(startingInvestmentNOPEmpty,4,6);
        //Total Principal label
        Label totalPrincipalNOP = new Label("Total Principal");
        totalPrincipalNOP.setId("labels");
        GridPane.setConstraints(totalPrincipalNOP,3,7);
        //Total Principal label 2
        Label totalPrincipalNOPEmpty = new Label("");
        totalPrincipalNOPEmpty.setId("labels");
        GridPane.setConstraints(totalPrincipalNOPEmpty,4,7);
        //Total Interest label
        Label totalInterestNOP = new Label("Total Interest");
        totalInterestNOP.setId("labels");
        GridPane.setConstraints(totalInterestNOP,3,8);
        //Total Interest label 2
        Label totalInterestNOPEmpty = new Label("");
        totalInterestNOPEmpty.setId("labels");
        GridPane.setConstraints(totalInterestNOPEmpty,4,8);

        //Calculate Button
        Button calculateButton5 = new Button("Calculate");
        calculateButton5.setId("buttons");
        calculateButton5.setOnAction(e->{

            DecimalFormat decimalFormat5 = new DecimalFormat("0.00");
            double fvNOP = Double.parseDouble(futurePaymentInput4.getText());
            futureValueNOPEmpty.setText(decimalFormat5.format(fvNOP));
            double iRateNOP = Double.parseDouble(interestRate1Input8.getText())/100;
            iYNOPEmpty.setText(decimalFormat5.format(iRateNOP));
            double annuityPMTNOP = Double.parseDouble(annuityPaymentInput5.getText());
            pMTNOPEmpty.setText(decimalFormat5.format(annuityPMTNOP));
            double startPNOP = Double.parseDouble(startPrincipalInput4.getText());
            startingInvestmentNOPEmpty.setText(decimalFormat5.format(startPNOP));

            double nOfPCal =Math.log((iRateNOP*fvNOP+annuityPMTNOP)/(iRateNOP*startPNOP+annuityPMTNOP))/Math.log(1+iRateNOP);
            nOPNOPEmpty.setText(decimalFormat5.format(nOfPCal));

            double presentValNOP =startPNOP+(annuityPMTNOP*(1-Math.pow(1+iRateNOP,-nOfPCal))/iRateNOP);
            presentValueNOPEmpty.setText(decimalFormat5.format(presentValNOP));
            double totalPNOP = (startPNOP+(annuityPMTNOP*nOfPCal));
            totalPrincipalNOPEmpty.setText(decimalFormat5.format(totalPNOP));
            double totalINOP=fvNOP-(startPNOP+(annuityPMTNOP*nOfPCal));
            totalInterestNOPEmpty.setText(decimalFormat5.format(totalINOP));

        });
        GridPane.setConstraints(calculateButton5,0,5);
        //Back Button
        Button backButton9 = new Button("Finance Menu");
        backButton9.setId("buttons");
        backButton9.setOnAction(e->window.setScene(scene2));
        GridPane.setConstraints(backButton9,0,6);
        //Back Button
        Button backButton10 = new Button("Main Menu");
        backButton10.setId("buttons");
        backButton10.setOnAction(e->window.setScene(mainMenu));
        GridPane.setConstraints(backButton10,0,7);

        numberOfPeriodsGrid.getChildren().addAll(numberOfPeriodsTopic,futurePaymentLabel4,futurePaymentInput4,startPrincipalLabel4,startPrincipalInput4,interestRateLabel8,interestRate1Input8,annuityPaymentLabel5,annuityPaymentInput5,calculateButton5,backButton9,backButton10,resultsLabelNOP,futureValueNOP,futureValueNOPEmpty,presentValueNOP,presentValueNOPEmpty,nOPNOP,nOPNOPEmpty,iYNOP,iYNOPEmpty,pMTNOP,pMTNOPEmpty,startingInvestmentNOP,startingInvestmentNOPEmpty,totalPrincipalNOP,totalPrincipalNOPEmpty,totalInterestNOP,totalInterestNOPEmpty);
        scene7 = new Scene(numberOfPeriodsGrid, 800, 400);

        return numberOfPeriodsGrid;

    }

    public GridPane spCalculator(){

        //Start Principal Calculator Layout
        GridPane startPrincipalGrid5 = new GridPane();
        startPrincipalGrid5.setPadding(new Insets(10,10,10,10));
        startPrincipalGrid5.setVgap(8);
        startPrincipalGrid5.setHgap(10);
        //Start Principal Topic label
        Label startPrincipalTopic5 = new Label("Start Principal");
        startPrincipalTopic5.setId("labels");
        GridPane.setConstraints(startPrincipalTopic5,0,0);
        //Future Payment label
        Label futurePaymentLabel5 = new Label("Future Payment(FV)");
        futurePaymentLabel5.setId("labels");
        GridPane.setConstraints(futurePaymentLabel5,0,1);
        //Future Payment Input
        TextField futurePaymentInput5 = new TextField("");
        futurePaymentInput5.setOnMouseClicked(e ->{textFieldsArray[0]=futurePaymentInput5;});
        GridPane.setConstraints(futurePaymentInput5,1,1);
        //Interest Rate label
        Label interestRateLabel9 = new Label("Interest Rate (I / Y)");
        interestRateLabel9.setId("labels");
        GridPane.setConstraints(interestRateLabel9,0,2);
        //Interest Rate Input
        TextField interestRateInput9 = new TextField("");
        interestRateInput9.setOnMouseClicked(e ->{textFieldsArray[0]=interestRateInput9;});
        GridPane.setConstraints(interestRateInput9,1,2);
        //Annuity Payment label
        Label annuityPaymentLabel6 = new Label("Annuity Payment(PMT)");
        annuityPaymentLabel6.setId("labels");
        GridPane.setConstraints(annuityPaymentLabel6,0,3);
        //Annuity Payment Input
        TextField annuityPaymentInput6 = new TextField("");
        annuityPaymentInput6.setOnMouseClicked(e ->{textFieldsArray[0]=annuityPaymentInput6;});
        GridPane.setConstraints(annuityPaymentInput6,1,3);
        //Number of periods label
        Label nOfPLabel6 = new Label("Number of periods(N)");
        nOfPLabel6.setId("labels");
        GridPane.setConstraints(nOfPLabel6,0,4);
        // Number of periods Input
        TextField nOfPInput6 = new TextField("");
        nOfPInput6.setOnMouseClicked(e ->{textFieldsArray[0]=nOfPInput6;});
        GridPane.setConstraints(nOfPInput6,1,4);

        //Results label
        Label resultsLabelSP = new Label("Results");
        resultsLabelSP.setId("labels");
        GridPane.setConstraints(resultsLabelSP,3,0);
        //Future Value  label
        Label futureValueSP = new Label("Future Value");
        futureValueSP.setId("labels");
        GridPane.setConstraints(futureValueSP,3,1);
        //Future Value label 2
        Label futureValueSPEmpty = new Label("");
        futureValueSPEmpty.setId("labels");
        GridPane.setConstraints(futureValueSPEmpty,4,1);
        //Present Value label
        Label presentValueSP = new Label("Present Value");
        presentValueSP.setId("labels");
        GridPane.setConstraints(presentValueSP,3,2);
        //Present Value label 2
        Label presentValueSPEmpty = new Label("");
        presentValueSPEmpty.setId("labels");
        GridPane.setConstraints(presentValueSPEmpty,4,2);
        //nOP label
        Label nOPSP = new Label("Number Of Periods");
        nOPSP.setId("labels");
        GridPane.setConstraints(nOPSP,3,3);
        //nOP label 2
        Label nOPSPEmpty = new Label("");
        nOPSPEmpty.setId("labels");
        GridPane.setConstraints(nOPSPEmpty,4,3);
        //iY label
        Label iYSP = new Label("Interest Rate");
        iYSP.setId("labels");
        GridPane.setConstraints(iYSP,3,4);
        //iY label 2
        Label iYSPEmpty = new Label("");
        iYSPEmpty.setId("labels");
        GridPane.setConstraints(iYSPEmpty,4,4);
        //PMT label
        Label pMTSP = new Label("PMT");
        pMTSP.setId("labels");
        GridPane.setConstraints(pMTSP,3,5);
        //PMT label 2
        Label pMTSPEmpty = new Label("");
        pMTSPEmpty.setId("labels");
        GridPane.setConstraints(pMTSPEmpty,4,5);
        //Starting Investment label
        Label startingInvestmentSP = new Label("Starting Investment");
        startingInvestmentSP.setId("labels");
        GridPane.setConstraints(startingInvestmentSP,3,6);
        // Starting Investment label 2
        Label startingInvestmentSPEmpty = new Label("");
        startingInvestmentSPEmpty.setId("labels");
        GridPane.setConstraints(startingInvestmentSPEmpty,4,6);
        //Total Principal label
        Label totalPrincipalSP = new Label("Total Principal");
        totalPrincipalSP.setId("labels");
        GridPane.setConstraints(totalPrincipalSP,3,7);
        //Total Principal label 2
        Label totalPrincipalSPEmpty = new Label("");
        totalPrincipalSPEmpty.setId("labels");
        GridPane.setConstraints(totalPrincipalSPEmpty,4,7);
        //Total Interest label
        Label totalInterestSP = new Label("Total Interest");
        totalInterestSP.setId("labels");
        GridPane.setConstraints(totalInterestSP,3,8);
        //Total Interest label 2
        Label totalInterestSPEmpty = new Label("");
        totalInterestSPEmpty.setId("labels");
        GridPane.setConstraints(totalInterestSPEmpty,4,8);

        //Calculate Button
        Button calculateButton6 = new Button("Calculate");
        calculateButton6.setId("buttons");
        calculateButton6.setOnAction(e->{

            DecimalFormat decimalFormat6 = new DecimalFormat("0.00");
            double fvSP = Double.parseDouble(futurePaymentInput5.getText());
            futureValueSPEmpty.setText(decimalFormat6.format(fvSP));
            double noPeriodsSP = Double.parseDouble(nOfPInput6.getText());
            nOPSPEmpty.setText(decimalFormat6.format(noPeriodsSP));
            double iRateSP = Double.parseDouble(interestRateInput9.getText())/100;
            iYSPEmpty.setText(decimalFormat6.format(iRateSP));
            double annuityPMTSP = Double.parseDouble(annuityPaymentInput6.getText());
            pMTSPEmpty.setText(decimalFormat6.format(annuityPMTSP));

            double spVal =Math.pow(1+iRateSP,noPeriodsSP);
            double spCal=(fvSP-(annuityPMTSP*(spVal-1)/iRateSP))/spVal;
            startingInvestmentSPEmpty.setText(decimalFormat6.format(spCal));
            double presentValSP =spCal+(annuityPMTSP*(1-Math.pow(1+iRateSP,-noPeriodsSP))/iRateSP);
            presentValueSPEmpty.setText(decimalFormat6.format(presentValSP));
            double totalPSP = (spCal+(annuityPMTSP*noPeriodsSP));
            totalPrincipalSPEmpty.setText(decimalFormat6.format(totalPSP));
            double totalSP=fvSP-(spCal+(annuityPMTSP*noPeriodsSP));
            totalInterestSPEmpty.setText(decimalFormat6.format(totalSP));

        });
        GridPane.setConstraints(calculateButton6,0,5);
        //Back Button
        Button backButton11 = new Button("Finance Menu");
        backButton11.setId("buttons");
        backButton11.setOnAction(e->window.setScene(scene2));
        GridPane.setConstraints(backButton11,0,6);
        //Back Button
        Button backButton12 = new Button("Main Menu");
        backButton12.setId("buttons");
        backButton12.setOnAction(e->window.setScene(mainMenu));
        GridPane.setConstraints(backButton12,0,7);

        startPrincipalGrid5.getChildren().addAll(startPrincipalTopic5,futurePaymentLabel5,futurePaymentInput5,interestRateLabel9,interestRateInput9,annuityPaymentLabel6,annuityPaymentInput6,nOfPLabel6,nOfPInput6,calculateButton6,backButton11,backButton12,resultsLabelSP,futureValueSP,futureValueSPEmpty,presentValueSP,presentValueSPEmpty,nOPSP,nOPSPEmpty,iYSP,iYSPEmpty,pMTSP,pMTSPEmpty,startingInvestmentSP,startingInvestmentSPEmpty,totalPrincipalSP,totalPrincipalSPEmpty,totalInterestSP,totalInterestSPEmpty);
        scene8 = new Scene(startPrincipalGrid5, 800, 400);

        return startPrincipalGrid5;

    }

    public GridPane tPaymentCalculator(){

        //Total Price Calculator Layout
        GridPane totalPriceGrid = new GridPane();
        totalPriceGrid.setPadding(new Insets(10,10,10,10));
        totalPriceGrid.setVgap(8);
        totalPriceGrid.setHgap(10);
        //Total Price Topic label
        Label totalPriceTopic2 = new Label("Total Price");
        totalPriceTopic2.setId("labels");
        GridPane.setConstraints(totalPriceTopic2,0,0);
        //Auto Price label
        Label autoPriceLabel = new Label("Auto Price");
        autoPriceLabel.setId("labels");
        GridPane.setConstraints(autoPriceLabel,0,1);
        //Auto Price Input
        TextField autoPriceInput = new TextField("");
        autoPriceInput.setOnMouseClicked(e ->{textFieldsArray[0]=autoPriceInput;});
        GridPane.setConstraints(autoPriceInput,1,1);
        //Loan Term label
        Label loanTermLabel3 = new Label("Loan Term");
        loanTermLabel3.setId("labels");
        GridPane.setConstraints(loanTermLabel3,0,2);
        //Loan Term Input
        TextField loanTermInput3 = new TextField("");
        loanTermInput3.setOnMouseClicked(e ->{textFieldsArray[0]=loanTermInput3;});
        GridPane.setConstraints(loanTermInput3,1,2);
        //Interest Rate label
        Label interestRateLabel22 = new Label("Interest Rate");
        interestRateLabel22.setId("labels");
        GridPane.setConstraints(interestRateLabel22,0,3);
        //Interest Rate Input
        TextField interestRateInput22 = new TextField("");
        interestRateInput22.setOnMouseClicked(e ->{textFieldsArray[0]=interestRateInput22;});
        GridPane.setConstraints(interestRateInput22,1,3);
        //Down Payment label
        Label downPaymentLabel22 = new Label("Down Payment");
        downPaymentLabel22.setId("labels");
        GridPane.setConstraints(downPaymentLabel22,0,4);
        // Down Payment Input
        TextField downPaymentInput22 = new TextField("");
        downPaymentInput22.setOnMouseClicked(e ->{textFieldsArray[0]=downPaymentInput22;});
        GridPane.setConstraints(downPaymentInput22,1,4);
        //Trade In Value label
        Label tradeInValueLabel = new Label("Trade In Value");
        tradeInValueLabel.setId("labels");
        GridPane.setConstraints(tradeInValueLabel,0,5);
        //Trade In Value Input
        TextField tradeInValueInput = new TextField("");
        tradeInValueInput.setOnMouseClicked(e ->{textFieldsArray[0]=tradeInValueInput;});
        GridPane.setConstraints(tradeInValueInput,1,5);
        //Sales Tax label
        Label salesTaxLabel = new Label("Sales Tax");
        salesTaxLabel.setId("labels");
        GridPane.setConstraints(salesTaxLabel,0,6);
        // Sales Tax Input
        TextField salesTaxInput = new TextField("");
        salesTaxInput.setOnMouseClicked(e ->{textFieldsArray[0]=salesTaxInput;});
        GridPane.setConstraints(salesTaxInput,1,6);
        //Other Fees label
        Label otherFeesLabel = new Label("Other Fees");
        otherFeesLabel.setId("labels");
        GridPane.setConstraints(otherFeesLabel,0,7);
        // Other Fees Input
        TextField otherFeesInput = new TextField("");
        otherFeesInput.setOnMouseClicked(e ->{textFieldsArray[0]=otherFeesInput;});
        GridPane.setConstraints(otherFeesInput,1,7);

        //Monthly Pay label
        Label monthlyPayLabel444 = new Label("Monthly Pay");
        monthlyPayLabel444.setId("labels");
        GridPane.setConstraints(monthlyPayLabel444,4,5);
        //Monthly Pay label 2
        Label monthlyPayLabel4441 = new Label("");
        monthlyPayLabel4441.setId("labels");
        GridPane.setConstraints(monthlyPayLabel4441,5,5);
        //Total Auto Loan Amount label
        Label totalAutoLoanAmountLabel444 = new Label("Total Auto Loan Amount");
        totalAutoLoanAmountLabel444.setId("labels");
        GridPane.setConstraints(totalAutoLoanAmountLabel444,4,6);
        //Total Auto Loan Amount label 2
        Label totalAutoLoanAmount4441 = new Label("");
        totalAutoLoanAmount4441.setId("labels");
        GridPane.setConstraints(totalAutoLoanAmount4441,5,6);
        //Sales Tax label
        Label salesTaxLabel444 = new Label("Sales Tax ");
        salesTaxLabel444.setId("labels");
        GridPane.setConstraints(salesTaxLabel444,4,7);
        //Sales Tax  label 2
        Label salesTaxlabel4441 = new Label("");
        salesTaxlabel4441.setId("labels");
        GridPane.setConstraints(salesTaxlabel4441,5,7);
        //Upfront Payment label
        Label upfrontPaymentLabel444 = new Label("Upfront Payment ");
        upfrontPaymentLabel444.setId("labels");
        GridPane.setConstraints(upfrontPaymentLabel444,4,8);
        //Upfront Payment label 2
        Label upfrontPaymentLabel4441 = new Label("");
        upfrontPaymentLabel4441.setId("labels");
        GridPane.setConstraints(upfrontPaymentLabel4441,5,8);
        //Total 60 label
        Label totalLabel444 = new Label("Total of 60 loan payments ");
        totalLabel444.setId("labels");
        GridPane.setConstraints(totalLabel444,4,9);
        //Total 60 label 2
        Label totalLabel4441 = new Label("");
        totalLabel4441.setId("labels");
        GridPane.setConstraints(totalLabel4441,5,9);
        //Total Loan Interest label
        Label totalLoanInterestLabel444 = new Label("Total Loan Interest");
        totalLoanInterestLabel444.setId("labels");
        GridPane.setConstraints(totalLoanInterestLabel444,4,10);
        //Total Loan Interest label 2
        Label totalLoanInterestLabel4441 = new Label("");
        totalLoanInterestLabel4441.setId("labels");
        GridPane.setConstraints(totalLoanInterestLabel4441,5,10);
        // Total Cost label
        Label totalCostLabel444 = new Label("Total Cost");
        totalCostLabel444.setId("labels");
        GridPane.setConstraints(totalCostLabel444,4,11);
        //Total Cost label 2
        Label totalCostLabel4441 = new Label("");
        totalCostLabel4441.setId("labels");
        GridPane.setConstraints(totalCostLabel4441,5,11);


        //Calculate Button
        Button calculateButton8 = new Button("Calculate");
        calculateButton8.setId("buttons");
        calculateButton8.setOnAction(e->{
            double autoPrice444 = Double.parseDouble(autoPriceInput.getText());
            double loanTermInput444 = Double.parseDouble(loanTermInput3.getText());
            double interestRateInput444 = Double.parseDouble(interestRateInput22.getText())/100;
            double downPaymentInput444 = Double.parseDouble(downPaymentInput22.getText());
            double tradeValueInput444 = Double.parseDouble(tradeInValueInput.getText());
            double salesTaxInput444 = Double.parseDouble(salesTaxInput.getText())/100;
            double otherFeesInput444 = Double.parseDouble(otherFeesInput.getText());

            double startingLoneBalance=autoPrice444-downPaymentInput444;
            double val=Math.pow(1+interestRateInput444/12,loanTermInput444);
            double monthlyPayment2=(startingLoneBalance*interestRateInput444/12*val)/(val-1);
            DecimalFormat decimalFormat2 = new DecimalFormat();
            monthlyPayLabel4441.setText(decimalFormat2.format(monthlyPayment2));

            double totalLoanAmount=autoPrice444-downPaymentInput444;
            totalAutoLoanAmount4441.setText(decimalFormat2.format(totalLoanAmount));
            double salesTax1=autoPrice444*salesTaxInput444;
            salesTaxlabel4441.setText(decimalFormat2.format(salesTax1));
            double upFrontPayment=salesTax1+downPaymentInput444;
            upfrontPaymentLabel4441.setText(decimalFormat2.format(upFrontPayment));
            double totalPayment=monthlyPayment2*60;
            totalLabel4441.setText(decimalFormat2.format(totalPayment));
            double totalInterest=totalPayment-startingLoneBalance;
            totalLoanInterestLabel4441.setText(decimalFormat2.format(totalInterest));
            double totalCost=totalLoanAmount+upFrontPayment+totalInterest;
            totalCostLabel4441.setText(decimalFormat2.format(totalCost));


        });
        GridPane.setConstraints(calculateButton8,0,8);
        //Back Button
        Button backButton15 = new Button("A-Loan Menu");
        backButton15.setId("buttons");
        backButton15.setOnAction(e->window.setScene(scene3));
        GridPane.setConstraints(backButton15,0,9);
        //Back Button
        Button backButton16 = new Button("Main Menu");
        backButton16.setId("buttons");
        backButton16.setOnAction(e->window.setScene(mainMenu));
        GridPane.setConstraints(backButton16,0,10);

        totalPriceGrid.getChildren().addAll(totalPriceTopic2,autoPriceLabel,autoPriceInput,loanTermLabel3,loanTermInput3,interestRateLabel22,interestRateInput22,downPaymentLabel22,downPaymentInput22,tradeInValueLabel,tradeInValueInput,salesTaxLabel,salesTaxInput,otherFeesLabel,otherFeesInput,calculateButton8,backButton15,backButton16,monthlyPayLabel444,monthlyPayLabel4441,totalAutoLoanAmountLabel444,totalAutoLoanAmount4441,salesTaxLabel444,salesTaxlabel4441,upfrontPaymentLabel444,upfrontPaymentLabel4441,totalLabel444,totalLabel4441,totalLoanInterestLabel444,totalLoanInterestLabel4441,totalCostLabel444,totalCostLabel4441);
        scene9 = new Scene(totalPriceGrid, 800, 400);

        return totalPriceGrid;

    }

    public GridPane mPaymentCalculator(){

        //Monthly Payment Calculator Layout
        GridPane monthlyPaymentGrid = new GridPane();
        monthlyPaymentGrid.setPadding(new Insets(10,10,10,10));
        monthlyPaymentGrid.setVgap(8);
        monthlyPaymentGrid.setHgap(10);
        //Monthly Payment Topic label
        Label monthlyPaymentTopic2 = new Label("Monthly Payment");
        monthlyPaymentTopic2.setId("labels");
        GridPane.setConstraints(monthlyPaymentTopic2,0,0);
        //Monthly Pay label
        Label monthlyPayLabel = new Label("Monthly Pay");
        monthlyPayLabel.setId("labels");
        GridPane.setConstraints(monthlyPayLabel,0,1);
        //Monthly Pay Input
        TextField monthlyPayInput = new TextField("");
        monthlyPayInput.setOnMouseClicked(e ->{textFieldsArray[0]=monthlyPayInput;});
        GridPane.setConstraints(monthlyPayInput,1,1);
        //Loan Term label
        Label loanTermLabel4 = new Label("Loan Term");
        loanTermLabel4.setId("labels");
        GridPane.setConstraints(loanTermLabel4,0,2);
        //Loan Term Input
        TextField loanTermInput4 = new TextField("");
        loanTermInput4.setOnMouseClicked(e ->{textFieldsArray[0]=loanTermInput4;});
        GridPane.setConstraints(loanTermInput4,1,2);
        //Interest Rate label
        Label interestRateLabel44 = new Label("Interest Rate");
        interestRateLabel44.setId("labels");
        GridPane.setConstraints(interestRateLabel44,0,3);
        //Interest Rate Input
        TextField interestRateInput44 = new TextField("");
        interestRateInput44.setOnMouseClicked(e ->{textFieldsArray[0]=interestRateInput44;});
        GridPane.setConstraints(interestRateInput44,1,3);
        //Down Payment label
        Label downPaymentLabel44 = new Label("Down Payment");
        downPaymentLabel44.setId("labels");
        GridPane.setConstraints(downPaymentLabel44,0,4);
        // Down Payment Input
        TextField downPaymentInput44 = new TextField("");
        downPaymentInput44.setOnMouseClicked(e ->{textFieldsArray[0]=downPaymentInput44;});
        GridPane.setConstraints(downPaymentInput44,1,4);
        //Trade In Value label
        Label tradeInValueLabel44 = new Label("Trade In Value");
        tradeInValueLabel44.setId("labels");
        GridPane.setConstraints(tradeInValueLabel44,0,5);
        //Trade In Value Input
        TextField tradeInValueInput44 = new TextField("");
        tradeInValueInput44.setOnMouseClicked(e ->{textFieldsArray[0]=tradeInValueInput44;});
        GridPane.setConstraints(tradeInValueInput44,1,5);
        //Sales Tax label
        Label salesTaxLabel44 = new Label("Sales Tax");
        salesTaxLabel44.setId("labels");
        GridPane.setConstraints(salesTaxLabel44,0,6);
        // Sales Tax Input
        TextField salesTaxInput44 = new TextField("");
        salesTaxInput44.setOnMouseClicked(e ->{textFieldsArray[0]=salesTaxInput44;});
        GridPane.setConstraints(salesTaxInput44,1,6);
        //Other Fees label
        Label otherFeesLabel44 = new Label("Other Fees");
        otherFeesLabel44.setId("labels");
        GridPane.setConstraints(otherFeesLabel44,0,7);
        // Other Fees Input
        TextField otherFeesInput44 = new TextField("");
        otherFeesInput44.setOnMouseClicked(e ->{textFieldsArray[0]=otherFeesInput44;});
        GridPane.setConstraints(otherFeesInput44,1,7);

        //Auto Price label
        Label autoPriceLabel999 = new Label("Vehicle Price");
        autoPriceLabel999.setId("labels");
        GridPane.setConstraints(autoPriceLabel999,4,5);
        //Auto Price label 2
        Label autoPriceLabel9991 = new Label("");
        autoPriceLabel9991.setId("labels");
        GridPane.setConstraints(autoPriceLabel9991,5,5);
        //Total Auto Loan Amount label
        Label totalAutoLoanAmountLabel999 = new Label("Total Auto Loan Amount");
        totalAutoLoanAmountLabel999.setId("labels");
        GridPane.setConstraints(totalAutoLoanAmountLabel999,4,6);
        //Total Auto Loan Amount label 2
        Label totalAutoLoanAmount9991 = new Label("");
        totalAutoLoanAmount9991.setId("labels");
        GridPane.setConstraints(totalAutoLoanAmount9991,5,6);
        //Sales Tax label
        Label salesTaxLabel999 = new Label("Sales Tax ");
        salesTaxLabel999.setId("labels");
        GridPane.setConstraints(salesTaxLabel999,4,7);
        //Sales Tax  label 2
        Label salesTaxLabel9991 = new Label("");
        salesTaxLabel9991.setId("labels");
        GridPane.setConstraints(salesTaxLabel9991,5,7);
        //Upfront Payment label
        Label upfrontPaymentLabel999 = new Label("Upfront Payment ");
        upfrontPaymentLabel999.setId("labels");
        GridPane.setConstraints(upfrontPaymentLabel999,4,8);
        //Upfront Payment label 2
        Label upfrontPaymentLabel9991 = new Label("");
        upfrontPaymentLabel9991.setId("labels");
        GridPane.setConstraints(upfrontPaymentLabel9991,5,8);
        //Total 60 label
        Label totalLabel999 = new Label("Total of 60 loan payments ");
        totalLabel999.setId("labels");
        GridPane.setConstraints(totalLabel999,4,9);
        //Total 60 label 2
        Label totalLabel9991 = new Label("");
        totalLabel9991.setId("labels");
        GridPane.setConstraints(totalLabel9991,5,9);
        //Total Loan Interest label
        Label totalLoanInterestLabel999 = new Label("Total Loan Interest");
        totalLoanInterestLabel999.setId("labels");
        GridPane.setConstraints(totalLoanInterestLabel999,4,10);
        //Total Loan Interest label 2
        Label totalLoanInterestLabel9991 = new Label("");
        totalLoanInterestLabel9991.setId("labels");
        GridPane.setConstraints(totalLoanInterestLabel9991,5,10);
        // Total Cost label
        Label totalCostLabel999 = new Label("Total Cost");
        totalCostLabel999.setId("labels");
        GridPane.setConstraints(totalCostLabel999,4,11);
        //Total Cost label 2
        Label totalCostLabel9991 = new Label("");
        totalCostLabel9991.setId("labels");
        GridPane.setConstraints(totalCostLabel9991,5,11);

        //Calculate Button
        Button calculateButton9 = new Button("Calculate");
        calculateButton9.setId("buttons");
        calculateButton9.setOnAction(e->{
            double monthlyPrice888 = Double.parseDouble(monthlyPayInput.getText());
            double loanTermInput888 = Double.parseDouble(loanTermInput4.getText());
            double interestRateInput888 = Double.parseDouble(interestRateInput44.getText())/100;
            double downPaymentInput888 = Double.parseDouble(downPaymentInput44.getText());
            double tradeValueInput888 = Double.parseDouble(tradeInValueInput44.getText());
            double salesTaxInput888 = Double.parseDouble(salesTaxInput44.getText())/100;
            double otherFeesInput888 = Double.parseDouble(otherFeesInput44.getText());

            double val=Math.pow(1+interestRateInput888/12,loanTermInput888);
            double startingBalance=12*monthlyPrice888*(val-1)/(interestRateInput888*val);
            double vehiclePrice=startingBalance+downPaymentInput888;
            DecimalFormat decimalFormat3 = new DecimalFormat();
            autoPriceLabel9991.setText(decimalFormat3.format(vehiclePrice));

            double totalLoanAmount88=vehiclePrice-downPaymentInput888;
            totalAutoLoanAmount9991.setText(decimalFormat3.format(totalLoanAmount88));

            double salesTaxAmount11=vehiclePrice*salesTaxInput888;
            salesTaxLabel9991.setText(decimalFormat3.format(salesTaxAmount11));

            double upFrontPayment=salesTaxAmount11+downPaymentInput888+otherFeesInput888;
            upfrontPaymentLabel9991.setText(decimalFormat3.format(upFrontPayment));

            double totalLonePayment=monthlyPrice888*loanTermInput888;
            totalLabel9991.setText(decimalFormat3.format(totalLonePayment));

            double totalInterest888=totalLonePayment-totalLoanAmount88;
            totalLoanInterestLabel9991.setText(decimalFormat3.format(totalInterest888));

            double totalCost888=totalLoanAmount88+upFrontPayment+totalInterest888;
            totalCostLabel9991.setText(decimalFormat3.format(totalCost888));



        });
        GridPane.setConstraints(calculateButton9,0,8);
        //Back Button
        Button backButton17 = new Button("A-Loan Menu");
        backButton17.setId("buttons");
        backButton17.setOnAction(e->window.setScene(scene3));
        GridPane.setConstraints(backButton17,0,9);
        //Back Button
        Button backButton18 = new Button("Main Menu");
        backButton18.setId("buttons");
        backButton18.setOnAction(e->window.setScene(mainMenu));
        GridPane.setConstraints(backButton18,0,10);

        monthlyPaymentGrid.getChildren().addAll(monthlyPaymentTopic2,monthlyPayLabel,monthlyPayInput,loanTermLabel4,loanTermInput4,interestRateLabel44,interestRateInput44,downPaymentLabel44,downPaymentInput44,tradeInValueLabel44,tradeInValueInput44,salesTaxLabel44,salesTaxInput44,otherFeesLabel44,otherFeesInput44,calculateButton9,backButton17,backButton18,autoPriceLabel999,autoPriceLabel9991,totalAutoLoanAmountLabel999,totalAutoLoanAmount9991,salesTaxLabel999,salesTaxLabel9991,upfrontPaymentLabel999,upfrontPaymentLabel9991,totalLabel999,totalLabel9991,totalLoanInterestLabel999,totalLoanInterestLabel9991,totalCostLabel999,totalCostLabel9991);
        scene10 = new Scene(monthlyPaymentGrid, 800, 400);

        return monthlyPaymentGrid;

    }

    public GridPane keyBord() {
        GridPane key_bord = new GridPane();
        key_bord.setPrefSize(250,300);
        key_bord.setPadding(new Insets(20,0,30,0));
        key_bord.setHgap(2);
        key_bord.setVgap(2);

        Button one = new Button("1 ");
        one.setId("keypad");
        one.setOnAction(event -> {textFieldsArray[0].setText(textFieldsArray[0].getText()+"1");});
        key_bord.add(one,1,1);

        Button two = new Button("2 ");
        two.setId("keypad");
        two.setOnAction(event -> {textFieldsArray[0].setText(textFieldsArray[0].getText()+"2");});
        key_bord.add(two,2,1);

        Button three = new Button("3 ");
        three.setId("keypad");
        three.setOnAction(event -> {textFieldsArray[0].setText(textFieldsArray[0].getText()+"3");});
        key_bord.add(three,3,1);

        Button four = new Button("4 ");
        four.setId("keypad");
        four.setOnAction(event -> {textFieldsArray[0].setText(textFieldsArray[0].getText()+"4");});
        key_bord.add(four,1,2);

        Button five = new Button("5 ");
        five.setId("keypad");
        five.setOnAction(event -> {textFieldsArray[0].setText(textFieldsArray[0].getText()+"5");});
        key_bord.add(five,2,2);

        Button six = new Button("6 ");
        six.setId("keypad");
        six.setOnAction(event -> {textFieldsArray[0].setText(textFieldsArray[0].getText()+"6");});
        key_bord.add(six,3,2);

        Button seven = new Button("7 ");
        seven.setId("keypad");
        seven.setOnAction(event -> {textFieldsArray[0].setText(textFieldsArray[0].getText()+"7");});
        key_bord.add(seven,1,3);

        Button eight = new Button("8 ");
        eight.setId("keypad");
        eight.setOnAction(event -> {textFieldsArray[0].setText(textFieldsArray[0].getText()+"8");});
        key_bord.add(eight,2,3);

        Button nine = new Button("9 ");
        nine.setId("keypad");
        nine.setOnAction(event -> {textFieldsArray[0].setText(textFieldsArray[0].getText()+"9");});
        key_bord.add(nine,3,3);

        Button zero = new Button("0 ");
        zero.setId("keypad");
        zero.setOnAction(event -> {textFieldsArray[0].setText(textFieldsArray[0].getText()+"0");});
        key_bord.add(zero,2,4);

        Button clear = new Button("CE");
        clear.setId("keypad");
        clear.setOnAction(event -> {textFieldsArray[0].setText(textFieldsArray[0].getText(0,textFieldsArray[0].getLength()-1));});
        key_bord.add(clear,3,4);

        Button Dot = new Button(".");
        Dot.setId("keypad");
        Dot.setOnAction(event -> {textFieldsArray[0].setText(textFieldsArray[0].getText()+".");});
        Dot.setPrefSize(60,30);
        key_bord.add(Dot ,1,4);



        one.setPrefSize(60,30);
        two.setPrefSize(60,30);
        three.setPrefSize(60,30);
        four.setPrefSize(60,30);
        five.setPrefSize(60,30);
        six.setPrefSize(60,30);
        seven.setPrefSize(60,30);
        seven.setPrefSize(60,30);
        eight.setPrefSize(60,30);
        nine.setPrefSize(60,30);
        zero.setPrefSize(60,30);
        clear.setPrefSize(60,30);


        return key_bord;
    }

    public GridPane helpPage(){
        GridPane help = new GridPane();
        help.setPadding(new Insets(30,30,30,30));
        help.setVgap(8);
        help.setHgap(10);


        //Back Button
        Button backButton25 = new Button("Main Menu");
        backButton25.setId("buttons");
        backButton25.setOnAction(e->window.setScene(mainMenu));
        GridPane.setConstraints(backButton25,0,0);
        //Instructions label 2
        Label instructionsLabel2 = new Label("HELP\n\nDo not enter values using keypad without selecting the text field.\nDo not enter Down payment in percentage in Mortgage Calculator.");
        instructionsLabel2.setId("labels");
        instructionsLabel2.setPrefHeight(100);
        instructionsLabel2.setPrefWidth(600);
        GridPane.setConstraints(instructionsLabel2,0,1);
        //Mortgage help label
        Label mortgageHelpLabel1 = new Label("Mortgage Calculator");
        mortgageHelpLabel1.setId("labels");
        mortgageHelpLabel1.setPrefHeight(10);
        mortgageHelpLabel1.setPrefWidth(600);
        GridPane.setConstraints(mortgageHelpLabel1,0,2);
        //Mortgage help label 2
        Label mortgageHelpLabel2 = new Label("Mortgage calculator to estimate your monthly mortgage payment.\nYou can input a different home price, down payment, loan term\nand interest rate to see how your monthly payment changes.");
        mortgageHelpLabel2.setId("labels");
        mortgageHelpLabel2.setPrefHeight(100);
        mortgageHelpLabel2.setPrefWidth(600);
        GridPane.setConstraints(mortgageHelpLabel2,0,3);
        //Finance help label
        Label financeHelpLabel = new Label("Financial Calculators");
        financeHelpLabel.setId("labels");
        financeHelpLabel.setPrefHeight(10);
        financeHelpLabel.setPrefWidth(600);
        GridPane.setConstraints(financeHelpLabel,0,4);
        //Finance help label 2
        Label financeHelpLabel2 = new Label("This finance calculator can be used to calculate any number of the following parameters: future value (FV),\nnumber of compounding periods (N), interest rate (I/Y), annuity payment (PMT), and start principal if the\nother parameters are known.");
        financeHelpLabel2.setId("labels");
        financeHelpLabel2.setPrefHeight(100);
        financeHelpLabel2.setPrefWidth(600);
        GridPane.setConstraints(financeHelpLabel2,0,5);
        //Auto Loan help label
        Label autoLoanHelpLabel1 = new Label("Auto - Loan Calculators");
        autoLoanHelpLabel1.setId("labels");
        autoLoanHelpLabel1.setPrefHeight(10);
        autoLoanHelpLabel1.setPrefWidth(600);
        GridPane.setConstraints(autoLoanHelpLabel1,0,6);
        //Auto Loan help label
        Label autoLoanHelpLabel2 = new Label("The Auto Loan Calculator is mainly intended for car purchases within the U.S. People outside the U.S. may still\nuse the calculator, but please adjust accordingly. If only the monthly payment for any auto loan is given,\nuse the Monthly Payments tab (reverse auto loan) to calculate the actual vehicle purchase price and other auto\nloan informations.");
        autoLoanHelpLabel2.setId("labels");
        autoLoanHelpLabel2.setPrefHeight(100);
        autoLoanHelpLabel2.setPrefWidth(600);
        GridPane.setConstraints(autoLoanHelpLabel2,0,7);




        help.getChildren().addAll(backButton25,instructionsLabel2,mortgageHelpLabel1,mortgageHelpLabel2,financeHelpLabel,financeHelpLabel2,autoLoanHelpLabel1,autoLoanHelpLabel2);
        scene11 = new Scene(help, 600,300);

        return help;
    }


    public GridPane SavingsMenu(){

        //Financial Calculator Layout
        GridPane financialGridSV = new GridPane();
        financialGridSV.setPadding(new Insets(10,10,10,10));
        financialGridSV.setVgap(8);
        financialGridSV.setHgap(10);

        //Future Value label
        Label futureValueLabel = new Label("Future Value");
        futureValueLabel.setId("labels");
        GridPane.setConstraints(futureValueLabel,0,0);
        //Future Value Button
        Button futureValueButton = new Button("Future");
        futureValueButton.setId("buttons");
        futureValueButton.setPrefHeight(40);
        futureValueButton.setPrefWidth(100);
        GridPane.setConstraints(futureValueButton,1,0);
        futureValueButton.setOnAction(e->window.setScene(scene13));

        //Interest Rate label
        Label interestRateLabe2 = new Label("Interest Rate");
        interestRateLabe2.setId("labels");
        GridPane.setConstraints(interestRateLabe2,0,1);
        //Interest Rate Button
        Button interestRateButton2 = new Button("I / Y ");
        interestRateButton2.setId("buttons");
        interestRateButton2.setPrefHeight(40);
        interestRateButton2.setPrefWidth(100);
        GridPane.setConstraints(interestRateButton2,1,1);
        interestRateButton2.setOnAction(e->window.setScene(scene14));

        //Number Of Periods label
        Label numberOfPeriodsLabel = new Label("Number Of Periods");
        numberOfPeriodsLabel.setId("labels");
        GridPane.setConstraints(numberOfPeriodsLabel,0,2);
        //Number Of Periods Button
        Button numberOfPeriodsButton = new Button("N");
        numberOfPeriodsButton.setId("buttons");
        numberOfPeriodsButton.setPrefHeight(40);
        numberOfPeriodsButton.setPrefWidth(100);
        GridPane.setConstraints(numberOfPeriodsButton,1,2);
        numberOfPeriodsButton.setOnAction(e->window.setScene(scene15));

        //Start Principal label
        Label startPrincipalLabel = new Label("Start Principal");
        startPrincipalLabel.setId("labels");
        GridPane.setConstraints(startPrincipalLabel,0,3);
        //Start Principal Button
        Button startPrincipalButton = new Button("Start Principal");
        startPrincipalButton.setId("buttons");
        startPrincipalButton.setPrefHeight(40);
        startPrincipalButton.setPrefWidth(100);
        GridPane.setConstraints(startPrincipalButton,1,3);
        startPrincipalButton.setOnAction(e->window.setScene(scene16));

        //Back Button
        Button backButton2 = new Button("Main Menu");
        backButton2.setId("buttons");
        backButton2.setOnAction(e->window.setScene(mainMenu));
        GridPane.setConstraints(backButton2,0,4);

        financialGridSV.getChildren().addAll(futureValueLabel,futureValueButton,interestRateLabe2,interestRateButton2,numberOfPeriodsLabel,numberOfPeriodsButton,startPrincipalLabel,startPrincipalButton,backButton2);
        scene12 = new Scene(financialGridSV, 800, 400);

        return financialGridSV;

    }

    public GridPane futureValueCalculatorSV(){

        //Future Value Calculator Layout
        GridPane futureValueGridSV = new GridPane();
        futureValueGridSV.setPadding(new Insets(10,10,10,10));
        futureValueGridSV.setVgap(8);
        futureValueGridSV.setHgap(10);
        //Future Topic label
        Label futureTopic = new Label("Future Value");
        futureTopic.setId("labels");
        GridPane.setConstraints(futureTopic,0,0);
        //Number of Periods label
        Label numberOfPeriodsLabel1 = new Label("Number of Periods(N)");
        numberOfPeriodsLabel1.setId("labels");
        GridPane.setConstraints(numberOfPeriodsLabel1,0,1);
        //Number of Periods Input
        TextField numberOfPeriodsInput1 = new TextField("");
        numberOfPeriodsInput1.setOnMouseClicked(e ->{textFieldsArray[0]=numberOfPeriodsInput1;});
        GridPane.setConstraints(numberOfPeriodsInput1,1,1);
        //Start Principal label
        Label startPrincipalLabel1 = new Label("Start Principal");
        startPrincipalLabel1.setId("labels");
        GridPane.setConstraints(startPrincipalLabel1,0,2);
        //Start Principal Input
        TextField startPrincipalInput1 = new TextField("");
        startPrincipalInput1.setOnMouseClicked(e ->{textFieldsArray[0]=startPrincipalInput1;});
        GridPane.setConstraints(startPrincipalInput1,1,2);
        //Interest Rate label
        Label interestRateLabel3 = new Label("Interest Rate(I / Y)");
        interestRateLabel3.setId("labels");
        GridPane.setConstraints(interestRateLabel3,0,3);
        //Interest Rate Input
        TextField interestRate1Input3 = new TextField("");
        interestRate1Input3.setOnMouseClicked(e ->{textFieldsArray[0]=interestRate1Input3;});
        GridPane.setConstraints(interestRate1Input3,1,3);


        //Results label
        Label resultsLabelFuture = new Label("Results");
        resultsLabelFuture.setId("labels");
        GridPane.setConstraints(resultsLabelFuture,3,0);
        //Future Value  label
        Label futureValueFuture = new Label("Future Value");
        futureValueFuture.setId("labels");
        GridPane.setConstraints(futureValueFuture,3,1);
        //Future Value label 2
        Label futureValueFVEmpty = new Label("");
        futureValueFVEmpty.setId("labels");
        GridPane.setConstraints(futureValueFVEmpty,4,1);
        //Present Value label
        Label presentValueFuture = new Label("Present Value");
        presentValueFuture.setId("labels");
        GridPane.setConstraints(presentValueFuture,3,2);
        //Present Value label 2
        Label presentValueFVEmpty = new Label("");
        presentValueFVEmpty.setId("labels");
        GridPane.setConstraints(presentValueFVEmpty,4,2);
        //nOP label
        Label nOPFuture = new Label("Number Of Periods");
        nOPFuture.setId("labels");
        GridPane.setConstraints(nOPFuture,3,3);
        //nOP label 2
        Label nOPFutureEmpty = new Label("");
        nOPFutureEmpty.setId("labels");
        GridPane.setConstraints(nOPFutureEmpty,4,3);
        //iY label
        Label iYFuture = new Label("Interest Rate");
        iYFuture.setId("labels");
        GridPane.setConstraints(iYFuture,3,4);
        //iY label 2
        Label iYFutureEmpty = new Label("");
        iYFutureEmpty.setId("labels");
        GridPane.setConstraints(iYFutureEmpty,4,4);
        //PMT label
        Label pMTFuture = new Label("PMT");
        pMTFuture.setId("labels");
        GridPane.setConstraints(pMTFuture,3,5);
        //PMT label 2
        Label pMTFutureEmpty = new Label("");
        pMTFutureEmpty.setId("labels");
        GridPane.setConstraints(pMTFutureEmpty,4,5);
        //Starting Investment label
        Label startingInvestmentFuture = new Label("Starting Investment");
        startingInvestmentFuture.setId("labels");
        GridPane.setConstraints(startingInvestmentFuture,3,6);
        // Starting Investment label 2
        Label startingInvestmentFutureEmpty = new Label("");
        startingInvestmentFutureEmpty.setId("labels");
        GridPane.setConstraints(startingInvestmentFutureEmpty,4,6);
        //Total Principal label
        Label totalPrincipalFuture = new Label("Total Principal");
        totalPrincipalFuture.setId("labels");
        GridPane.setConstraints(totalPrincipalFuture,3,7);
        //Total Principal label 2
        Label totalPrincipalFutureEmpty = new Label("");
        totalPrincipalFutureEmpty.setId("labels");
        GridPane.setConstraints(totalPrincipalFutureEmpty,4,7);
        //Total Interest label
        Label totalInterestFuture = new Label("Total Interest");
        totalInterestFuture.setId("labels");
        GridPane.setConstraints(totalInterestFuture,3,8);
        //Total Interest label 2
        Label totalInterestFutureEmpty = new Label("");
        totalInterestFutureEmpty.setId("labels");
        GridPane.setConstraints(totalInterestFutureEmpty,4,8);


        //Calculate Button
        Button calculateButton2 = new Button("Calculate");
        calculateButton2.setId("buttons");
        calculateButton2.setOnAction(e->{
            DecimalFormat decimalFormat3 = new DecimalFormat("0.00");
            double nOfPFuture = Double.parseDouble(numberOfPeriodsInput1.getText());
            nOPFutureEmpty.setText(decimalFormat3.format(nOfPFuture));
            double sPFuture = Double.parseDouble(startPrincipalInput1.getText());
            startingInvestmentFutureEmpty.setText(decimalFormat3.format(sPFuture));
            double iRateFuture = Double.parseDouble(interestRate1Input3.getText())/100;
            iYFutureEmpty.setText(decimalFormat3.format(iRateFuture));
            double aPayFuture = 0;

            double valueN=Math.pow(1+iRateFuture,nOfPFuture);
            double presentValueFV=sPFuture+(aPayFuture*(1-Math.pow(1+iRateFuture,-nOfPFuture))/iRateFuture);
            presentValueFVEmpty.setText(decimalFormat3.format(presentValueFV));
            double futureValue=sPFuture*valueN+aPayFuture*(valueN-1)/iRateFuture;
            futureValueFVEmpty.setText(decimalFormat3.format(futureValue));
            double totalPrincipalF = (sPFuture+(aPayFuture*nOfPFuture));
            totalPrincipalFutureEmpty.setText(decimalFormat3.format(totalPrincipalF));
            double totalInterestFV=futureValue-(sPFuture+(aPayFuture*nOfPFuture));
            totalInterestFutureEmpty.setText(decimalFormat3.format(totalInterestFV));

        });
        GridPane.setConstraints(calculateButton2,0,5);
        //Back Button
        Button backButtonFSV = new Button("Savings Menu");
        backButtonFSV.setId("buttons");
        backButtonFSV.setOnAction(e->window.setScene(scene12));
        GridPane.setConstraints(backButtonFSV,0,6);
        //Back Button
        Button backButton4 = new Button("Main Menu");
        backButton4.setId("buttons");
        backButton4.setOnAction(e->window.setScene(mainMenu));
        GridPane.setConstraints(backButton4,0,7);

        futureValueGridSV.getChildren().addAll(futureTopic,numberOfPeriodsLabel1,numberOfPeriodsInput1,startPrincipalLabel1,startPrincipalInput1,interestRateLabel3,interestRate1Input3,calculateButton2,backButtonFSV,backButton4,resultsLabelFuture,futureValueFuture,futureValueFVEmpty,presentValueFuture,presentValueFVEmpty,nOPFuture,nOPFutureEmpty,iYFuture,iYFutureEmpty,pMTFuture,pMTFutureEmpty,startingInvestmentFuture,startingInvestmentFutureEmpty,totalPrincipalFuture,totalPrincipalFutureEmpty,totalInterestFuture,totalInterestFutureEmpty);
        scene13 = new Scene(futureValueGridSV, 800, 400);

        return futureValueGridSV;


    }

    public GridPane irCalculatorSV (){

        //Interest Rate Calculator Layout
        GridPane interestRateGrid5SV = new GridPane();
        interestRateGrid5SV.setPadding(new Insets(10,10,10,10));
        interestRateGrid5SV.setVgap(8);
        interestRateGrid5SV.setHgap(10);
        //Interest Rate Topic label
        Label interestRateTopic5 = new Label("Interest Rate(I / Y)");
        interestRateTopic5.setId("labels");
        GridPane.setConstraints(interestRateTopic5,0,0);
        //Future Payment label
        Label futurePaymentLabel3 = new Label("Future Payment(FV)");
        futurePaymentLabel3.setId("labels");
        GridPane.setConstraints(futurePaymentLabel3,0,1);
        //Future Payment Input
        TextField futurePaymentInput3 = new TextField("");
        futurePaymentInput3.setOnMouseClicked(e ->{textFieldsArray[0]=futurePaymentInput3;});
        GridPane.setConstraints(futurePaymentInput3,1,1);
        //Start Principal label
        Label startPrincipalLabel3 = new Label("Start Principal");
        startPrincipalLabel3.setId("labels");
        GridPane.setConstraints(startPrincipalLabel3,0,2);
        //Start Principal Input
        TextField startPrincipalInput3 = new TextField("");
        startPrincipalInput3.setOnMouseClicked(e ->{textFieldsArray[0]=startPrincipalInput3;});
        GridPane.setConstraints(startPrincipalInput3,1,2);
        //Number of periods label
        Label nOfPLabel4 = new Label("Number of periods(N)");
        nOfPLabel4.setId("labels");
        GridPane.setConstraints(nOfPLabel4,0,3);
        // Number of periods Input
        TextField nOfPInput4 = new TextField("");
        nOfPInput4.setOnMouseClicked(e ->{textFieldsArray[0]=nOfPInput4;});
        GridPane.setConstraints(nOfPInput4,1,3);

        //Results label
        Label resultsLabelIR = new Label("Results");
        resultsLabelIR.setId("labels");
        GridPane.setConstraints(resultsLabelIR,3,0);
        //Future Value  label
        Label futureValueIR = new Label("Future Value");
        futureValueIR.setId("labels");
        GridPane.setConstraints(futureValueIR,3,1);
        //Future Value label 2
        Label futureValueIREmpty = new Label("");
        futureValueIREmpty.setId("labels");
        GridPane.setConstraints(futureValueIREmpty,4,1);
        //Present Value label
        Label presentValueIR = new Label("Present Value");
        presentValueIR.setId("labels");
        GridPane.setConstraints(presentValueIR,3,2);
        //Present Value label 2
        Label presentValueIREmpty = new Label("");
        presentValueIREmpty.setId("labels");
        GridPane.setConstraints(presentValueIREmpty,4,2);
        //nOP label
        Label nOPIR = new Label("Number Of Periods");
        nOPIR.setId("labels");
        GridPane.setConstraints(nOPIR,3,3);
        //nOP label 2
        Label nOPIREmpty = new Label("");
        nOPIREmpty.setId("labels");
        GridPane.setConstraints(nOPIREmpty,4,3);
        //iY label
        Label iYIR = new Label("Interest Rate");
        iYIR.setId("labels");
        GridPane.setConstraints(iYIR,3,4);
        //iY label 2
        Label iYIREmpty = new Label("");
        iYIREmpty.setId("labels");
        GridPane.setConstraints(iYIREmpty,4,4);
        //PMT label
        Label pMTIR = new Label("PMT");
        pMTIR.setId("labels");
        GridPane.setConstraints(pMTIR,3,5);
        //PMT label 2
        Label pMTIREmpty = new Label("");
        pMTIREmpty.setId("labels");
        GridPane.setConstraints(pMTIREmpty,4,5);
        //Starting Investment label
        Label startingInvestmentIR = new Label("Starting Investment");
        startingInvestmentIR.setId("labels");
        GridPane.setConstraints(startingInvestmentIR,3,6);
        // Starting Investment label 2
        Label startingInvestmentIREmpty = new Label("");
        startingInvestmentIREmpty.setId("labels");
        GridPane.setConstraints(startingInvestmentIREmpty,4,6);
        //Total Principal label
        Label totalPrincipalIR = new Label("Total Principal");
        totalPrincipalIR.setId("labels");
        GridPane.setConstraints(totalPrincipalIR,3,7);
        //Total Principal label 2
        Label totalPrincipalIREmpty = new Label("");
        totalPrincipalIREmpty.setId("labels");
        GridPane.setConstraints(totalPrincipalIREmpty,4,7);
        //Total Interest label
        Label totalInterestIR = new Label("Total Interest");
        totalInterestIR.setId("labels");
        GridPane.setConstraints(totalInterestIR,3,8);
        //Total Interest label 2
        Label totalInterestIREmpty = new Label("");
        totalInterestIREmpty.setId("labels");
        GridPane.setConstraints(totalInterestIREmpty,4,8);

        //Calculate Button
        Button calculateButton4 = new Button("Calculate");
        calculateButton4.setId("buttons");
        calculateButton4.setOnAction(e->{

            DecimalFormat decimalFormat5 = new DecimalFormat("0.00");
            double fvIR = Double.parseDouble(futurePaymentInput3.getText());
            futureValueIREmpty.setText(decimalFormat5.format(fvIR));
            double annuityIR = 0;
            double startPIR = Double.parseDouble(startPrincipalInput3.getText());
            startingInvestmentIREmpty.setText(decimalFormat5.format(startPIR));
            double nopIR = Double.parseDouble(nOfPInput4.getText());
            nOPIREmpty.setText(decimalFormat5.format(nopIR));
            double interestRateIR=Math.pow(fvIR/startPIR,1/nopIR)-1;
            iYIREmpty.setText(decimalFormat5.format(interestRateIR));
            double presentValIR =startPIR+(annuityIR*(1-Math.pow(1+interestRateIR,-nopIR))/interestRateIR);
            presentValueIREmpty.setText(decimalFormat5.format(presentValIR));
            double totalPIR = (startPIR+(annuityIR*nopIR));
            totalPrincipalIREmpty.setText(decimalFormat5.format(totalPIR));
            double totalIIR=fvIR-(startPIR+(annuityIR*nopIR));
            totalInterestIREmpty.setText(decimalFormat5.format(totalIIR));

        });
        GridPane.setConstraints(calculateButton4,0,5);
        //Back Button
        Button backButton7 = new Button("Savings Menu");
        backButton7.setId("buttons");
        backButton7.setOnAction(e->window.setScene(scene12));
        GridPane.setConstraints(backButton7,0,6);
        //Back Button
        Button backButton8 = new Button("Main Menu");
        backButton8.setId("buttons");
        backButton8.setOnAction(e->window.setScene(mainMenu));
        GridPane.setConstraints(backButton8,0,7);

        interestRateGrid5SV.getChildren().addAll(interestRateTopic5,futurePaymentLabel3,futurePaymentInput3,startPrincipalLabel3,startPrincipalInput3,nOfPLabel4,nOfPInput4,calculateButton4,backButton7,backButton8,resultsLabelIR,futureValueIR,futureValueIREmpty,presentValueIR,presentValueIREmpty,nOPIR,nOPIREmpty,iYIR,iYIREmpty,pMTIR,pMTIREmpty,startingInvestmentIR,startingInvestmentIREmpty,totalPrincipalIR,totalPrincipalIREmpty,totalInterestIR,totalInterestIREmpty);
        scene14 = new Scene(interestRateGrid5SV, 800, 400);

        return interestRateGrid5SV;


    }

    public  GridPane nopCalculatorSV(){

        //Number Of Periods Calculator Layout
        GridPane numberOfPeriodsGridSV = new GridPane();
        numberOfPeriodsGridSV.setPadding(new Insets(10,10,10,10));
        numberOfPeriodsGridSV.setVgap(8);
        numberOfPeriodsGridSV.setHgap(10);
        //Number Of Periods Topic label
        Label numberOfPeriodsTopic = new Label("Number Of Periods(N)");
        numberOfPeriodsTopic.setId("labels");
        GridPane.setConstraints(numberOfPeriodsTopic,0,0);
        //Future Payment label
        Label futurePaymentLabel4 = new Label("Future Payment(FV)");
        futurePaymentLabel4.setId("labels");
        GridPane.setConstraints(futurePaymentLabel4,0,1);
        //Future Payment Input
        TextField futurePaymentInput4 = new TextField("");
        futurePaymentInput4.setOnMouseClicked(e ->{textFieldsArray[0]=futurePaymentInput4;});
        GridPane.setConstraints(futurePaymentInput4,1,1);
        //Start Principal label
        Label startPrincipalLabel4 = new Label("Start Principal");
        startPrincipalLabel4.setId("labels");
        GridPane.setConstraints(startPrincipalLabel4,0,2);
        //Start Principal Input
        TextField startPrincipalInput4 = new TextField("");
        startPrincipalInput4.setOnMouseClicked(e ->{textFieldsArray[0]=startPrincipalInput4;});
        GridPane.setConstraints(startPrincipalInput4,1,2);
        //Interest Rate label
        Label interestRateLabel8 = new Label("Interest Rate(I / Y)");
        interestRateLabel8.setId("labels");
        GridPane.setConstraints(interestRateLabel8,0,3);
        //Interest Rate Input
        TextField interestRate1Input8 = new TextField("");
        interestRate1Input8.setOnMouseClicked(e ->{textFieldsArray[0]=interestRate1Input8;});
        GridPane.setConstraints(interestRate1Input8,1,3);


        //Results label
        Label resultsLabelNOP = new Label("Results");
        resultsLabelNOP.setId("labels");
        GridPane.setConstraints(resultsLabelNOP,3,0);
        //Future Value  label
        Label futureValueNOP = new Label("Future Value");
        futureValueNOP.setId("labels");
        GridPane.setConstraints(futureValueNOP,3,1);
        //Future Value label 2
        Label futureValueNOPEmpty = new Label("");
        futureValueNOPEmpty.setId("labels");
        GridPane.setConstraints(futureValueNOPEmpty,4,1);
        //Present Value label
        Label presentValueNOP = new Label("Present Value");
        presentValueNOP.setId("labels");
        GridPane.setConstraints(presentValueNOP,3,2);
        //Present Value label 2
        Label presentValueNOPEmpty = new Label("");
        presentValueNOPEmpty.setId("labels");
        GridPane.setConstraints(presentValueNOPEmpty,4,2);
        //nOP label
        Label nOPNOP = new Label("Number Of Periods");
        nOPNOP.setId("labels");
        GridPane.setConstraints(nOPNOP,3,3);
        //nOP label 2
        Label nOPNOPEmpty = new Label("");
        nOPNOPEmpty.setId("labels");
        GridPane.setConstraints(nOPNOPEmpty,4,3);
        //iY label
        Label iYNOP = new Label("Interest Rate");
        iYNOP.setId("labels");
        GridPane.setConstraints(iYNOP,3,4);
        //iY label 2
        Label iYNOPEmpty = new Label("");
        iYNOPEmpty.setId("labels");
        GridPane.setConstraints(iYNOPEmpty,4,4);
        //PMT label
        Label pMTNOP = new Label("PMT");
        pMTNOP.setId("labels");
        GridPane.setConstraints(pMTNOP,3,5);
        //PMT label 2
        Label pMTNOPEmpty = new Label("");
        pMTNOPEmpty.setId("labels");
        GridPane.setConstraints(pMTNOPEmpty,4,5);
        //Starting Investment label
        Label startingInvestmentNOP = new Label("Starting Investment");
        startingInvestmentNOP.setId("labels");
        GridPane.setConstraints(startingInvestmentNOP,3,6);
        // Starting Investment label 2
        Label startingInvestmentNOPEmpty = new Label("");
        startingInvestmentNOPEmpty.setId("labels");
        GridPane.setConstraints(startingInvestmentNOPEmpty,4,6);
        //Total Principal label
        Label totalPrincipalNOP = new Label("Total Principal");
        totalPrincipalNOP.setId("labels");
        GridPane.setConstraints(totalPrincipalNOP,3,7);
        //Total Principal label 2
        Label totalPrincipalNOPEmpty = new Label("");
        totalPrincipalNOPEmpty.setId("labels");
        GridPane.setConstraints(totalPrincipalNOPEmpty,4,7);
        //Total Interest label
        Label totalInterestNOP = new Label("Total Interest");
        totalInterestNOP.setId("labels");
        GridPane.setConstraints(totalInterestNOP,3,8);
        //Total Interest label 2
        Label totalInterestNOPEmpty = new Label("");
        totalInterestNOPEmpty.setId("labels");
        GridPane.setConstraints(totalInterestNOPEmpty,4,8);

        //Calculate Button
        Button calculateButton5 = new Button("Calculate");
        calculateButton5.setId("buttons");
        calculateButton5.setOnAction(e->{

            DecimalFormat decimalFormat5 = new DecimalFormat("0.00");
            double fvNOP = Double.parseDouble(futurePaymentInput4.getText());
            futureValueNOPEmpty.setText(decimalFormat5.format(fvNOP));
            double iRateNOP = Double.parseDouble(interestRate1Input8.getText())/100;
            iYNOPEmpty.setText(decimalFormat5.format(iRateNOP));
            double annuityPMTNOP = 0;
            double startPNOP = Double.parseDouble(startPrincipalInput4.getText());
            startingInvestmentNOPEmpty.setText(decimalFormat5.format(startPNOP));

            double nOfPCal =Math.log((iRateNOP*fvNOP+annuityPMTNOP)/(iRateNOP*startPNOP+annuityPMTNOP))/Math.log(1+iRateNOP);
            nOPNOPEmpty.setText(decimalFormat5.format(nOfPCal));

            double presentValNOP =startPNOP+(annuityPMTNOP*(1-Math.pow(1+iRateNOP,-nOfPCal))/iRateNOP);
            presentValueNOPEmpty.setText(decimalFormat5.format(presentValNOP));
            double totalPNOP = (startPNOP+(annuityPMTNOP*nOfPCal));
            totalPrincipalNOPEmpty.setText(decimalFormat5.format(totalPNOP));
            double totalINOP=fvNOP-(startPNOP+(annuityPMTNOP*nOfPCal));
            totalInterestNOPEmpty.setText(decimalFormat5.format(totalINOP));

        });
        GridPane.setConstraints(calculateButton5,0,5);
        //Back Button
        Button backButton9 = new Button("Savings Menu");
        backButton9.setId("buttons");
        backButton9.setOnAction(e->window.setScene(scene12));
        GridPane.setConstraints(backButton9,0,6);
        //Back Button
        Button backButton10 = new Button("Main Menu");
        backButton10.setId("buttons");
        backButton10.setOnAction(e->window.setScene(mainMenu));
        GridPane.setConstraints(backButton10,0,7);

        numberOfPeriodsGridSV.getChildren().addAll(numberOfPeriodsTopic,futurePaymentLabel4,futurePaymentInput4,startPrincipalLabel4,startPrincipalInput4,interestRateLabel8,interestRate1Input8,calculateButton5,backButton9,backButton10,resultsLabelNOP,futureValueNOP,futureValueNOPEmpty,presentValueNOP,presentValueNOPEmpty,nOPNOP,nOPNOPEmpty,iYNOP,iYNOPEmpty,pMTNOP,pMTNOPEmpty,startingInvestmentNOP,startingInvestmentNOPEmpty,totalPrincipalNOP,totalPrincipalNOPEmpty,totalInterestNOP,totalInterestNOPEmpty);
        scene15 = new Scene(numberOfPeriodsGridSV, 800, 400);

        return numberOfPeriodsGridSV;

    }

    public GridPane spCalculatorSV(){

        //Start Principal Calculator Layout
        GridPane startPrincipalGrid5SV = new GridPane();
        startPrincipalGrid5SV.setPadding(new Insets(10,10,10,10));
        startPrincipalGrid5SV.setVgap(8);
        startPrincipalGrid5SV.setHgap(10);
        //Start Principal Topic label
        Label startPrincipalTopic5 = new Label("Start Principal");
        startPrincipalTopic5.setId("labels");
        GridPane.setConstraints(startPrincipalTopic5,0,0);
        //Future Payment label
        Label futurePaymentLabel5 = new Label("Future Payment(FV)");
        futurePaymentLabel5.setId("labels");
        GridPane.setConstraints(futurePaymentLabel5,0,1);
        //Future Payment Input
        TextField futurePaymentInput5 = new TextField("");
        futurePaymentInput5.setOnMouseClicked(e ->{textFieldsArray[0]=futurePaymentInput5;});
        GridPane.setConstraints(futurePaymentInput5,1,1);
        //Interest Rate label
        Label interestRateLabel9 = new Label("Interest Rate (I / Y)");
        interestRateLabel9.setId("labels");
        GridPane.setConstraints(interestRateLabel9,0,2);
        //Interest Rate Input
        TextField interestRateInput9 = new TextField("");
        interestRateInput9.setOnMouseClicked(e ->{textFieldsArray[0]=interestRateInput9;});
        GridPane.setConstraints(interestRateInput9,1,2);
        //Number of periods label
        Label nOfPLabel6 = new Label("Number of periods(N)");
        nOfPLabel6.setId("labels");
        GridPane.setConstraints(nOfPLabel6,0,3);
        // Number of periods Input
        TextField nOfPInput6 = new TextField("");
        nOfPInput6.setOnMouseClicked(e ->{textFieldsArray[0]=nOfPInput6;});
        GridPane.setConstraints(nOfPInput6,1,3);

        //Results label
        Label resultsLabelSP = new Label("Results");
        resultsLabelSP.setId("labels");
        GridPane.setConstraints(resultsLabelSP,3,0);
        //Future Value  label
        Label futureValueSP = new Label("Future Value");
        futureValueSP.setId("labels");
        GridPane.setConstraints(futureValueSP,3,1);
        //Future Value label 2
        Label futureValueSPEmpty = new Label("");
        futureValueSPEmpty.setId("labels");
        GridPane.setConstraints(futureValueSPEmpty,4,1);
        //Present Value label
        Label presentValueSP = new Label("Present Value");
        presentValueSP.setId("labels");
        GridPane.setConstraints(presentValueSP,3,2);
        //Present Value label 2
        Label presentValueSPEmpty = new Label("");
        presentValueSPEmpty.setId("labels");
        GridPane.setConstraints(presentValueSPEmpty,4,2);
        //nOP label
        Label nOPSP = new Label("Number Of Periods");
        nOPSP.setId("labels");
        GridPane.setConstraints(nOPSP,3,3);
        //nOP label 2
        Label nOPSPEmpty = new Label("");
        nOPSPEmpty.setId("labels");
        GridPane.setConstraints(nOPSPEmpty,4,3);
        //iY label
        Label iYSP = new Label("Interest Rate");
        iYSP.setId("labels");
        GridPane.setConstraints(iYSP,3,4);
        //iY label 2
        Label iYSPEmpty = new Label("");
        iYSPEmpty.setId("labels");
        GridPane.setConstraints(iYSPEmpty,4,4);
        //PMT label
        Label pMTSP = new Label("PMT");
        pMTSP.setId("labels");
        GridPane.setConstraints(pMTSP,3,5);
        //PMT label 2
        Label pMTSPEmpty = new Label("");
        pMTSPEmpty.setId("labels");
        GridPane.setConstraints(pMTSPEmpty,4,5);
        //Starting Investment label
        Label startingInvestmentSP = new Label("Starting Investment");
        startingInvestmentSP.setId("labels");
        GridPane.setConstraints(startingInvestmentSP,3,6);
        // Starting Investment label 2
        Label startingInvestmentSPEmpty = new Label("");
        startingInvestmentSPEmpty.setId("labels");
        GridPane.setConstraints(startingInvestmentSPEmpty,4,6);
        //Total Principal label
        Label totalPrincipalSP = new Label("Total Principal");
        totalPrincipalSP.setId("labels");
        GridPane.setConstraints(totalPrincipalSP,3,7);
        //Total Principal label 2
        Label totalPrincipalSPEmpty = new Label("");
        totalPrincipalSPEmpty.setId("labels");
        GridPane.setConstraints(totalPrincipalSPEmpty,4,7);
        //Total Interest label
        Label totalInterestSP = new Label("Total Interest");
        totalInterestSP.setId("labels");
        GridPane.setConstraints(totalInterestSP,3,8);
        //Total Interest label 2
        Label totalInterestSPEmpty = new Label("");
        totalInterestSPEmpty.setId("labels");
        GridPane.setConstraints(totalInterestSPEmpty,4,8);

        //Calculate Button
        Button calculateButton6 = new Button("Calculate");
        calculateButton6.setId("buttons");
        calculateButton6.setOnAction(e->{

            DecimalFormat decimalFormat6 = new DecimalFormat("0.00");
            double fvSP = Double.parseDouble(futurePaymentInput5.getText());
            futureValueSPEmpty.setText(decimalFormat6.format(fvSP));
            double noPeriodsSP = Double.parseDouble(nOfPInput6.getText());
            nOPSPEmpty.setText(decimalFormat6.format(noPeriodsSP));
            double iRateSP = Double.parseDouble(interestRateInput9.getText())/100;
            iYSPEmpty.setText(decimalFormat6.format(iRateSP));
            double annuityPMTSP = 0;

            double spVal =Math.pow(1+iRateSP,noPeriodsSP);
            double spCal=(fvSP-(annuityPMTSP*(spVal-1)/iRateSP))/spVal;
            startingInvestmentSPEmpty.setText(decimalFormat6.format(spCal));
            double presentValSP =spCal+(annuityPMTSP*(1-Math.pow(1+iRateSP,-noPeriodsSP))/iRateSP);
            presentValueSPEmpty.setText(decimalFormat6.format(presentValSP));
            double totalPSP = (spCal+(annuityPMTSP*noPeriodsSP));
            totalPrincipalSPEmpty.setText(decimalFormat6.format(totalPSP));
            double totalSP=fvSP-(spCal+(annuityPMTSP*noPeriodsSP));
            totalInterestSPEmpty.setText(decimalFormat6.format(totalSP));

        });
        GridPane.setConstraints(calculateButton6,0,5);
        //Back Button
        Button backButton11 = new Button("Savings Menu");
        backButton11.setId("buttons");
        backButton11.setOnAction(e->window.setScene(scene12));
        GridPane.setConstraints(backButton11,0,6);
        //Back Button
        Button backButton12 = new Button("Main Menu");
        backButton12.setId("buttons");
        backButton12.setOnAction(e->window.setScene(mainMenu));
        GridPane.setConstraints(backButton12,0,7);

        startPrincipalGrid5SV.getChildren().addAll(startPrincipalTopic5,futurePaymentLabel5,futurePaymentInput5,interestRateLabel9,interestRateInput9,nOfPLabel6,nOfPInput6,calculateButton6,backButton11,backButton12,resultsLabelSP,futureValueSP,futureValueSPEmpty,presentValueSP,presentValueSPEmpty,nOPSP,nOPSPEmpty,iYSP,iYSPEmpty,pMTSP,pMTSPEmpty,startingInvestmentSP,startingInvestmentSPEmpty,totalPrincipalSP,totalPrincipalSPEmpty,totalInterestSP,totalInterestSPEmpty);
        scene16 = new Scene(startPrincipalGrid5SV, 800, 400);

        return startPrincipalGrid5SV;

    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Financial Calculators ");

        BorderPane layout1 = new BorderPane();
        layout1.setCenter(homePage());
        mainMenu = new Scene(layout1,400,300);
        mainMenu.getStylesheets().add("sample/style.css");

        BorderPane layout2 = new BorderPane();
        layout2.setCenter(mortgageCalculator());
        layout2.setBottom(keyBord());
        scene1 = new Scene(layout2,1000,500);
        scene1.getStylesheets().add("sample/style.css");

        BorderPane layout3 = new BorderPane();
        layout3.setCenter(financeMenu());
        scene2 = new Scene(layout3,1000,400);
        scene2.getStylesheets().add("sample/style.css");

        BorderPane layout4 = new BorderPane();
        layout4.setCenter(autoLoanMenu());
        scene3 = new Scene(layout4,1000,400);
        scene3.getStylesheets().add("sample/style.css");

        BorderPane layout5 = new BorderPane();
        layout5.setCenter(futureValueCalculator());
        layout5.setBottom(keyBord());
        scene4 = new Scene(layout5,1000,500);
        scene4.getStylesheets().add("sample/style.css");

        BorderPane layout6 = new BorderPane();
        layout6.setCenter(pmtCalculator());
        layout6.setBottom(keyBord());
        scene5 = new Scene(layout6,1000,500);
        scene5.getStylesheets().add("sample/style.css");

        BorderPane layout7 = new BorderPane();
        layout7.setCenter(irCalculator());
        layout7.setBottom(keyBord());
        scene6 = new Scene(layout7,1000,500);
        scene6.getStylesheets().add("sample/style.css");

        BorderPane layout8 = new BorderPane();
        layout8.setCenter(nopCalculator());
        layout8.setBottom(keyBord());
        scene7 = new Scene(layout8,1000,500);
        scene7.getStylesheets().add("sample/style.css");

        BorderPane layout9 = new BorderPane();
        layout9.setCenter(spCalculator());
        layout9.setBottom(keyBord());
        scene8 = new Scene(layout9,1000,500);
        scene8.getStylesheets().add("sample/style.css");

        BorderPane layout10 = new BorderPane();
        layout10.setCenter(tPaymentCalculator());
        layout10.setRight(keyBord());
        scene9 = new Scene(layout10,1000,500);
        scene9.getStylesheets().add("sample/style.css");


        BorderPane layout11 = new BorderPane();
        layout11.setCenter(mPaymentCalculator());
        layout11.setRight(keyBord());
        scene10 = new Scene(layout11,1000,500);
        scene10.getStylesheets().add("sample/style.css");

        BorderPane layout12 = new BorderPane();
        layout12.setCenter(helpPage());
        scene11 = new Scene(layout12,1000,500);
        scene11.getStylesheets().add("sample/style.css");

        BorderPane layout13 = new BorderPane();
        layout13.setCenter(SavingsMenu());
        scene12 = new Scene(layout13,1000,400);
        scene12.getStylesheets().add("sample/style.css");

        BorderPane layout14 = new BorderPane();
        layout14.setCenter(futureValueCalculatorSV());
        scene13 = new Scene(layout14,1000,400);
        scene13.getStylesheets().add("sample/style.css");

        BorderPane layout15 = new BorderPane();
        layout15.setCenter(irCalculatorSV());
        scene14 = new Scene(layout15,1000,400);
        scene14.getStylesheets().add("sample/style.css");

        BorderPane layout16 = new BorderPane();
        layout16.setCenter(nopCalculatorSV());
        scene15 = new Scene(layout16,1000,400);
        scene15.getStylesheets().add("sample/style.css");

        BorderPane layout17 = new BorderPane();
        layout17.setCenter(spCalculatorSV());
        scene16 = new Scene(layout17,1000,400);
        scene16.getStylesheets().add("sample/style.css");

        window.setScene(mainMenu);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
