package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //creating an instance

        CellPhone phone = new CellPhone();

        //prompt the user
        System.out.println("What is the serial number? ");
        phone.setSerialNumber(sc.nextInt());            //using a setters
        sc.nextLine();

        System.out.println("What model is the phone? ");
        phone.setModel(sc.nextLine());                //using a setters

        System.out.println("Who is the carrier? ");
        phone.setCarrier(sc.nextLine());                  //using a setters

        System.out.println("What is the phone number? ");
        phone.setPhoneNumber(sc.nextLine());                //using a setters

        System.out.println("Who is the owner of the phone? ");
        phone.setOwner(sc.nextLine());            //using a setters

        //Using the getters of the CellPhone

        System.out.println("\n Cell Phone Info:\n" +
                "Serial Number: " + phone.getSerialNumber() + "\n" +
                "Model: " + phone.getModel() + "\n" +
                "Carrier: " + phone.getCarrier() + "\n" +
                "Phone Number: " + phone.getPhoneNumber() + "\n" +
                "Owner: " + phone.getOwner()
        );
    }
}









