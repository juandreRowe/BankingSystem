/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author juandre
 */
public final class Flow {
    private final Client Client;
    private Scanner scanner;
    public Flow(Client Client){
        this.Client = Client;
        this.scanner = new Scanner(System.in);
        beginFlow();
    }
    
    public void beginFlow(){
        printOptions();
        getOption();
    }
    
    public void printOptions(){
        System.out.println("0: Exit\n1: Deposit money\n2: Withdraw money\n3: Client statement");
    }
    
    public void getOption(){
        try{
            int option = scanner.nextInt();
            switch(option){
                case 0:
                    System.exit(0);
                case 1:
                    System.out.print("Amount to deposit\nR");
                    Client.Deposit(scanner.nextInt());
                    System.out.println(Client);
                    break;
                case 2:
                    System.out.print("Amount to withdraw\nR");
                    if(Client.Withdraw(scanner.nextInt())){
                        System.out.println("Withdrawel completed");
                        System.out.println(Client);
                        break;
                    }
                    System.out.println("Insufficient funds");
                    System.out.println(Client);
                    break;
                case 3:
                    System.out.println(Client);
                default:
                    break;
            }
        }catch(Exception ex){
            System.out.println("Integers only!");
        }finally{
            scanner = new Scanner(System.in);
            beginFlow();
        }
    }
}
