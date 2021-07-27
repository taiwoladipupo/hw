package com.tts.project;

import java.util.Scanner;

public class Entry  {


private String firstName;
private String lastName;
private String phoneNumber;
private String emailAddress;

    public Entry() {
        firstName = "";
        lastName = "";
        phoneNumber = "";
        emailAddress = "";
    }

    public Entry(String firstName,String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(Scanner scanner) {

        this.firstName = scanner.next();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(Scanner scanner) {

        this.lastName = scanner.next();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Scanner scanner) {

        this.phoneNumber =scanner.next();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(Scanner scanner) {

        this.emailAddress = scanner.next();
    }

    @Override
    public String toString() {
        return "Entry{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}




