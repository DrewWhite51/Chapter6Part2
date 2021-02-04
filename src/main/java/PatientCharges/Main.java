/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientCharges;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author drewm
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Enter the patient's first name");
        String firstName = keyboard.nextLine();
        System.out.println("Enter the patient's last name");
        String lastName = keyboard.nextLine();
        System.out.println("Enter the patient's middle name");
        String middleName = keyboard.nextLine();
        System.out.println("Enter the patient's address");
        String address = keyboard.nextLine();
        System.out.println("Enter the patient's city");
        String city = keyboard.nextLine();
        System.out.println("Enter the patient's state");
        String state = keyboard.nextLine();
        System.out.println("Enter the patient's zipcode");
        String zip = keyboard.nextLine();
        System.out.println("Enter the patient's phone number (numbers only, no dash)");
        String phone = keyboard.nextLine();
        System.out.println("Enter the patient's emergency contact's first name");
        String emergencyFirst = keyboard.nextLine();
        System.out.println("Enter the patient's emergency contact's last name");
        String emergencyLast = keyboard.nextLine();
        System.out.println("Enter the patient's emergency contact's phone number (number only, no dash)");
        String emergencyPhone = keyboard.nextLine();
        
        Patient firstPatient = new Patient(firstName,lastName,middleName,address,city,state,zip,phone,emergencyFirst,emergencyLast,emergencyPhone);
        System.out.println("Information on the patient...");
        System.out.println(firstPatient.toString());
        Procedure firstProcedure = new Procedure("Physical exam", "Today's date", "Dr. Irving", 250.00);
        Procedure secondProcedure = new Procedure("X-Ray", "Today's date", "Dr. Jameson", 500.00);
        Procedure thirdProcedure = new Procedure("Blood test", "Today's date", "Dr. Smith", 200.00);
        double firstProcedureCharge = firstProcedure.getProcedureCharges();
        double secondProcedureCharge = secondProcedure.getProcedureCharges();
        double thirdProcedureCharge = thirdProcedure.getProcedureCharges();
        double totalProcedureCharges = firstProcedureCharge + secondProcedureCharge + thirdProcedureCharge;
        System.out.println("Information on the patient's first procedure...");
        System.out.println(firstProcedure.toString());
        System.out.println("Information on the patient's second procdure...");
        System.out.println(secondProcedure.toString());
        System.out.println("Information on the patient's third procedure...");
        System.out.println(thirdProcedure.toString());
        System.out.println("The total charges on " + firstPatient.getFirstName() + " " + 
                firstPatient.getLastName() + "'s account is " + formatter.format(totalProcedureCharges));
    }
}
