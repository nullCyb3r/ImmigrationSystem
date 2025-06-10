/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.arakanpeoplesgovernment.immigrationsystem;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author nullByte
 */
public class ImmigrationSystem {
    
    public static void main(String[] args) throws InvalidVisitorDataException {
       Scanner scanner = new Scanner(System.in);
       ImmigrationOfficer officer = new ImmigrationOfficer("Htun Naing Soe");
       try{
           System.out.println("==== Immigration Control System ====");
           
           System.out.print("Name : ");
           String name = scanner.nextLine().trim();
           if(name.isEmpty()) throw new InvalidVisitorDataException("Name cannot be empty.");
           
           System.out.print("Passprot Number : ");
           String passport = scanner.nextLine().trim();
           if(passport.isEmpty()) throw new InvalidVisitorDataException("Passport cannot be empty.");
           
           System.out.print("Nationality : ");
           String nationality = scanner.nextLine().trim();
           if(nationality.isEmpty()) throw new InvalidVisitorDataException("Nationalty cannot be empty.");
           
           System.out.print("Reason for Visit : ");
           String reason = scanner.nextLine().trim();
           if(reason.isEmpty()) throw new InvalidVisitorDataException("Reason for Visit cannot be empty.");
           
           System.out.print("Duration of Stay(in Days) : ");
           int duration;
           try{
               duration = scanner.nextInt();
               if(duration <= 0 ) throw new InvalidVisitorDataException("Duration must be positive.");
           }catch(InputMismatchException e){
               throw new InvalidVisitorDataException("Duration must be number.");
           }
           scanner.nextLine();
           
           System.out.print("Criminal Record? (yes,no): ");
           String criminalInput = scanner.nextLine().trim().toLowerCase();
           boolean hasCriminalRecord;
           if(criminalInput.equals("yes")){
               hasCriminalRecord = true;
           }else if(criminalInput.equals("no")){
               hasCriminalRecord = false;
           }else{
               throw new InvalidVisitorDataException("Criminal record must be (yes) or (no).");
           }
           Visitor visitor = new Visitor(name,passport,nationality,reason,duration,hasCriminalRecord);
           officer.checkVisitor(visitor);
       }catch(InvalidVisitorDataException e){
           System.out.println("Input Error : "+ e.getMessage());
       }catch(Exception e){
           System.out.println("Unexcepted Error : " + e.getMessage());
       }finally{
           scanner.close();
       }
       
    }
}
