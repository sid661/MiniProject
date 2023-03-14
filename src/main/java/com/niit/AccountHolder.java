package com.niit;

import java.util.Random;
import java.util.Scanner;

public class AccountHolder
{
    private String firstName;
    private String secondName;
    private int age;
    private String dateOfBirth;
    private String accountType;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    //****************************************METHODS********************************************************//
    public long generateAccountNumber()
    {
        Random random = new Random();
        long accountNumber = random.nextLong();

        return accountNumber;

    }
    public String accoutNumber()
    {
        String accountNumber = "AccNO-:IFSC:ICICI0001"+generateAccountNumber();
        //accountNumber.trim();
        return accountNumber;

    }

   //***********************************Setting Account type**************************************************************//
    public void accountType(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Select The Account Type");
        System.out.println("1- FOR -- SAVING ACCOUNT"+ "\n" +"2- FOR -- PAY ACCOUNT");

        int choice = sc.nextInt();

        if(choice==1){
            this.setAccountType("Saving Account");

        }
        else if(choice==2){
            this.setAccountType("Pay Account");

        }
        else
            System.out.println("Please Enter Valid Input");

    }

///*****************************************************************************************************//


    /* public void displayAccountDetails(){
         System.out.println(this.getFirstName()+this.getSecondName());

    }*/
}
