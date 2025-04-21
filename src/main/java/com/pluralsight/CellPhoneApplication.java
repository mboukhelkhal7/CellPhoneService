package com.pluralsight;

import java.util.Scanner;

import static com.pluralsight.CellPhone.display;

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
        phone.setOwner(sc.nextLine());//using a setters


        //Exercise3 new instance and calling settters

        CellPhone phone2 = new CellPhone(1234567, "iPhone 16", "Verizon", "222-333-4444", "Mahmoud");

        // calling display method

        CellPhone.display(phone);
        CellPhone.display(phone2);

        // Call each other

        phone.dial(phone.getPhoneNumber());
        phone2.dial(phone2.getPhoneNumber());

    }


}

