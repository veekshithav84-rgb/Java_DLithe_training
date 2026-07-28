package com.nsam.strings;

class Bank {
    private int pin;
    String acc_number="SBI0001";
    double balance=200000.00;

    public void setData(int u_pin) {
        pin=u_pin;
    }
    public int getData()
    {
        return pin;
    }
    void deposite(int pin, double amount){
        if(this.pin==pin)
        {
            balance+=amount;
            System.out.println("amount deposited successfully");
        }
        else{
            System.out.println("invalid pin");
        }
    }
    void withdrawal(int pin,double amount){
        if(this.pin==pin)
        {
            if(amount>balance)
            {
                System.out.println("Insufficient balance");
            }
            else{
                balance -= amount;
                System.out.println("amount withdrawn successfully");
            }
        }
        else{
            System.out.println("Invalid pin");
        }
    }
    void checkBalance(int pin){
        if(this.pin==pin)
        {
            System.out.println("Current balance:"+balance);
        }
        else{
            System.out.println("Invalid pin");
        }
    }

}
