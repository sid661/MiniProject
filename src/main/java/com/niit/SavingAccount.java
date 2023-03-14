package com.niit;

public class SavingAccount
{
    AccountHolder holder;

    public AccountHolder getHolder() {
        return holder;
    }

    public void setHolder(AccountHolder holder) {
        this.holder = holder;
    }

    public void displayAccountDetails()
    {

        String name = holder.getAccountType();
        System.out.println(name);

    }
}
