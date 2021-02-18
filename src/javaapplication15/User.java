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
public abstract class User {
    private final String Name;
    private final int Age;
    private final Gender Gender;
    
    public User(String Name, int Age, Gender Gender){
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
    }
    
    @Override
    public String toString(){
        return String.format("User information\nName : %s\nAge : %s\nGender : %s", Name, Age, Gender);
    }
}
