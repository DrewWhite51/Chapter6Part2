/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientCharges;

/**
 *
 * @author drewm
 */
public class Patient {
    String firstName;
    String lastName;
    String middleName;
    String address;
    String city;
    String state;
    String zipCode;
    String phoneNumber;
    String emergencyFirstName;
    String emergencyLastName;
    String emergencyPhoneNumber;

    public Patient(String firstName, String lastName, String middleName, String address, String city, String state, String zipCode, String phoneNumber, String emergencyFirstName, String emergencyLastName, String emergencyPhoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyFirstName = emergencyFirstName;
        this.emergencyLastName = emergencyLastName;
        this.emergencyPhoneNumber = emergencyPhoneNumber;
    }

    @Override
    public String toString() {
        return "Patient{" + " First Name = " + firstName + ", Last Name = " + lastName + ", Middle Name = " + middleName + ", Address = " + address + ", City = " + city + ", State = " + state + ", Zip Code = " + zipCode + ", Phone Number = " + phoneNumber + ", Emergency First Name = " + emergencyFirstName + ", Emergency Last Name = " + emergencyLastName + ", Emergency Phone Number = " + emergencyPhoneNumber + '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    
}
