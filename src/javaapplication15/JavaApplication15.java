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
public class JavaApplication15 {
    static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Flow flow = new Flow(getUser());
            flow.beginFlow();
        }catch(Exception ex){
            System.out.println("Wrong user information");
        }finally{
            System.out.println("Have a nice day");
        }
        
    }
    
    public static Client getUser(){
        System.out.println("Enter user name");
        String name = scanner.next();
        System.out.println("Enter age");
        int age = scanner.nextInt();
        System.out.println("0: Male\n1: Female");
        int genderInt = scanner.nextInt();
        Gender gender = (genderInt == 0) ? Gender.MALE : Gender.FEMALE;
        return new Client(name, age, gender);
    }
}
