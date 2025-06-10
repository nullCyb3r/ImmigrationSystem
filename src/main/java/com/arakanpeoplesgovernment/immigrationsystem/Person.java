/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arakanpeoplesgovernment.immigrationsystem;

/**
 *
 * @author nullByte
 */
public class Person {
    private String name;
    private String passportNumber;
    private String nationality;
    
    public Person(String name, String passportNumber, String nationality){
        this.name = name;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }
    public String getName(){ return name;}
    
    public String getPassportNumber(){return passportNumber;}
    
    public String getNationality(){return nationality;}
    
    public void showInformation(){
        System.out.println("Name : " + name);
        System.out.println("Passport Number : "+ passportNumber);
        System.out.println("Nationality : "+ nationality);
    }
}
