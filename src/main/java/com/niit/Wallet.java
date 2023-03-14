package com.niit;
import java.lang.Math;
import java.util.Scanner;


public class Wallet {
    private float balance;
    private float previousTransaction;
    AccountHolder holder;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public AccountHolder getHolder() {
        return holder;
    }

    public void setHolder(AccountHolder holder) {
        this.holder = holder;
    }

    public float getPreviousTransaction()
    {

        if(previousTransaction>0)
        {
            return this.previousTransaction;
        }
        else if(previousTransaction<0)
        {
            return Math.abs(previousTransaction);
        }

          return this.previousTransaction;
    }

    public void setPreviousTransaction(float previousTransaction) {
        this.previousTransaction = previousTransaction;

    }

    //***************************************************************************************************************//
    public void deposite(float amount)
    { if(amount!=0)
        {
            this.balance= balance+amount;
            this.previousTransaction=amount;
        }
    }
    public void withdraw(float amount)
    { if(amount!=0)
       {
        this.balance= balance-amount;
        this.previousTransaction= -amount;
        }
    }
    public float intrestCalculation(float amount)
    {   // amount =0;
        float intrest = (getBalance() * 2.5f)/100;
        return intrest;
    }


    public void showMenu(){

        char option ='\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome "+holder.getFirstName()+" "+holder.getSecondName()+" "+holder.accoutNumber()+" "
                +holder.getAccountType());
        System.out.println("\n");
        System.out.println("A--> CHECK BALANCE");
        System.out.println("B--> DEPOSITE");
        System.out.println("C--> WITHDRAW");
        System.out.println("d--> PREVIOUS TRANSACTION");
        System.out.println("E--> GET ACCOUNT DETAILS");
        System.out.println("F--> CALCULATE INTEREST");

        do{
            System.out.println("***********************************************************************************");
            System.out.println("PLEASE--ENTER--OPTION");
            System.out.println("***********************************************************************************");
            option = sc.next().charAt(0);
            System.out.println("\n");

            switch(option){
                case 'a':
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("BALANCE ==  " +this.getBalance());
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'b':
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("ENTER THE AMOUNT TO BE DEPOSITED");
                    System.out.println("----------------------------------------------------------------------------");
                    float amount = sc.nextFloat();
                    deposite(amount);
                    System.out.println("\n");
                    break;


                case 'c':
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("ENTER THE AMOUNT TO BE WITHDRAWN");
                    System.out.println("----------------------------------------------------------------------------");
                    float amount1 = sc.nextFloat();
                    withdraw(amount1);
                    System.out.println("\n");
                    break;


                case 'd':
                    System.out.println("----------------------------------------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("\n");
                    break;


                case 'e':
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("FIRST NAME --"+holder.getFirstName()+"\n"+
                            "LAST NAME --"+holder.getSecondName()+" "+
                            "ACCOUNT NUMBER --"+holder.accoutNumber()+" "+
                            "ACCOUNT TYPE --"+holder.getAccountType()+
                            "AVAILABLE BALANCE --"+this.getBalance());
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("\n");
                    break;


                case 'f':
                    System.out.println("----------------------------------------------------------------------------");
                    float intrest = intrestCalculation(getBalance());
                    System.out.println("---AMOUNT---"+intrest+"----IS---YOUR---INTREST---ON---AVAILABLE---BALANCE---");
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("PLEASE----------------ENTER-----------------VALID-------------------- OPTION");
                    System.out.println("----------------------------------------------------------------------------");
                    break;
            }

        }while (option !='e');
        {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("THANKYOU----------------FOR-----------------USING----------------OUR SERVICE");
            System.out.println("---------------------------ING BANK-----------------------------------------");

        }

    }

}
