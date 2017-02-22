package com.Andrei;
import java.util.Scanner;
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0744 286 406");


    public static void main(String[] args) {

      boolean quit = false;
      startPhone();
      printActions();
      while(!quit){
          System.out.println("\n Emter action: (6 to show available action)");
          int action = scanner.nextInt();
          quit = true;
          scanner.nextLine();

          switch (action){
              case 0:
                  System.out.println("\n System shutting down...");
                  quit =true;
                  break;
              case 1:
                  mobilePhone.printContacts();
                  break;
              case 2:
                  addNewContact();
                  break;
              case 3:
                  updateContact();
                  break;
              case 4:
                  removeContact();
                  break;
              case 5:
                  querryContact();
                  break;
              case 6:
                  printActions();
                  break;
          }

      }

    }




    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phone);
        if (mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added : name = " + name + "phone " + phone);
        }else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.querryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newNumber);
        if (mobilePhone.updateContact(existingContactRecord,newContact)){
            System.out.println("Successfuly updated record . ");

        }else{
            System.out.println("Error updating record ");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.querryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfuly deleted .");
        }else {
            System.out.println("Eroor deleting contact");
        }
    }

    private static void querryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.querryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());

    }









    public static void startPhone(){
        System.out.println("Starting phone...");
    }

    public static void printActions(){
        System.out.println("\nAvaible action:\npress");
        System.out.println("0 -  to shutdown\n" +
                           "1 -  to print contacts\n" +
                           "2 -  to add new contact\n" +
                           "3 -  to update existing contact\n" +
                           "4 -  to remove existing contact\n"  +
                           "5 -  querry if an existig contact exists\n" +
                           "6 -  to print a list of available actions.");
        System.out.println(" Choose your action: ");
    }






















}


