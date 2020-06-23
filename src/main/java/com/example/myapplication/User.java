package com.example.myapplication;


public class User {
    protected String Expenses;
    protected String amounts;
    protected String dates;



    public User() {
    }

    public User(String expenses, String amount,String Date) {
        Expenses = expenses;
        amounts = amount;
        dates =Date;
    }

    public String getExpenses() {
        return Expenses;
    }

    public void setExpenses(String expenses) {
        Expenses = expenses;
    }

    public String getAmount() {
        return amounts;
    }

    public void setAmount(String amount) {
        amounts = amount;
    }

    public String getDates() { return dates;}
    public void setDates(String dates) {
        this.dates = dates;
    }


}
