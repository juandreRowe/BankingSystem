/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author juandre
 */
public class Client extends User {
    private int Balance;
    public Client(String Name, int Age, Gender Gender){
        super(Name, Age, Gender);
        this.Balance = 0;
    }
    
    public void Deposit(int amount){
        Balance += amount;
    }
    
    public boolean Withdraw(int amount){
        if(amount > Balance) return false;
        Balance -= amount;
        return true;
    }
    
    @Override
    public String toString(){
        return super.toString() + String.format("\nBalance : %s", Balance);
    }
}
