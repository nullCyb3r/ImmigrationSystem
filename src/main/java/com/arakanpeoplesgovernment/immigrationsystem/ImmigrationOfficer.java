/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arakanpeoplesgovernment.immigrationsystem;

/**
 *
 * @author nullByte
 */
public class ImmigrationOfficer {
    private String officerName;
    
    public ImmigrationOfficer(String officerName){
        this.officerName = officerName;
    }
    
    public void checkVisitor(Visitor visitor){
        System.out.println("\nOfficer "+ officerName + " is inspecting the visitor....");
        visitor.showInformation();
        verifyEntryPermission(visitor);
    }

    private void verifyEntryPermission(Visitor visitor) {
        if(visitor.hasCriminalRecord()){
            denyEntry(visitor);
        }else{
            alloEntry(visitor);
        }
    }

    private void denyEntry(Visitor visitor) {
       System.out.println("Entry Deny : "+ visitor.getName() + " has a Criminal record.");
    }

    private void alloEntry(Visitor visitor) {
        System.out.println("Entry Allowed : "+ visitor.getName());
    }
}

