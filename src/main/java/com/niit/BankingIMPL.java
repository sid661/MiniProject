package com.niit;


import java.util.Scanner;

public class BankingIMPL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   AccountHolder accountHolder= new AccountHolder();
   SavingAccount sa = new SavingAccount();
   String acc= accountHolder.accoutNumber();
   System.out.println(acc);
   Wallet wallet = new Wallet();

   //*************************************GENERATING--ACCOUNT*******************************************************//
        System.out.println("PLEASE ENTER YOUR DETAILS FOR ACCOUNT OPENING");
        System.out.println("PLEASE ENTER YOUR FIRST NAME");
        accountHolder.setFirstName(sc.next());
        System.out.println("PLEASE ENTER YOUR SECOND NAME");
        accountHolder.setSecondName(sc.next());
        System.out.println("PLEASE ENTER YOUR AGE");
        accountHolder.setAge(sc.nextInt());
        System.out.println("PLEASE ENTER YOUR DATE OF BIRTH");
        accountHolder.setDateOfBirth(sc.next());
  //**********************************************************************************************************//



  //****************************************ACCOUNT--TYPE**********************************************//
       accountHolder.accountType();
        sa.setHolder(accountHolder);/// 
        sa.displayAccountDetails();
        wallet.setHolder(accountHolder);//very important line//
        wallet.showMenu();
//*************************************************************************************************************//

    }
}
