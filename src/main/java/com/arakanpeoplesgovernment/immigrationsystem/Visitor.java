/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arakanpeoplesgovernment.immigrationsystem;

/**
 *
 * @author nullByte
 */
public class Visitor extends Person{

    private final String visitReason;
    private final int stayDuration;
    private final boolean hasCriminalRecord;
    
    public Visitor(String name, String passportNumber, String nationality, String visitReason, int stayDuration, boolean hasCriminalRecord) {
        super(name, passportNumber, nationality);
        this.visitReason = visitReason;
        this.stayDuration = stayDuration;
        this.hasCriminalRecord = hasCriminalRecord;
    }
    
    public boolean hasCriminalRecord(){
        return hasCriminalRecord;
    }
    public void showInformation(){
        super.showInformation();
        System.out.println("Reason for Visit : "+visitReason);
        System.out.println("Duration of Stay : " + stayDuration + " days.");
        System.out.println("Criminal Record : " + (hasCriminalRecord ? "Yes" : "No"));
    }
}
