package com.infogalaxy;

import com.sun.deploy.nativesandbox.NativeSandboxOutputStream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<Contact> contactlist = new ArrayList<>();

    public void addContact() {
        Contact contact = new Contact();
        System.out.println("Enter The First Name :");
        contact.setFirstName(sc.next());
        System.out.println("Enter The Last Name :");
        contact.setLastName(sc.next());
        System.out.println("Enter The Address : ");
        contact.setAddress(sc.next());
        System.out.println("Enter The City :");
        contact.setCity(sc.next());
        System.out.println("Enter The State: ");
        contact.setState(sc.next());
        System.out.println("Enter The Mobile No :");
        contact.setMobno(sc.next());
        System.out.println("Enter The Email ID : ");
        contact.setEmail(sc.next());
        System.out.println("Enter Zip Code : ");
        contact.setZip(sc.next());
        contactlist.add(contact);
    }
    public void displayContact() {
        for (int i = 0; i < contactlist.size(); i++) {
            Contact contact = contactlist.get(i);
            System.out.println(contact.toString());
        }
    }
    public void editContact() {
        System.out.println("Enter First Name : ");
        String fName;
        int i ;
        fName = sc.next();
        int flag = 0;
        for ( i = 0; i < contactlist.size(); i++) {
            Contact contact = contactlist.get(i);
            if (fName.equals(contact.getFirstName())) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Contact Not Found ");
        } else {
            Contact contact = contactlist.get(i);
            System.out.println("Enter The Last Name :");
            contact.setLastName(sc.next());
            System.out.println("Enter The Address : ");
            contact.setAddress(sc.next());
            System.out.println("Enter The City :");
            contact.setCity(sc.next());
            System.out.println("Enter The State: ");
            contact.setState(sc.next());
            System.out.println("Enter The Mobile No :");
            contact.setMobno(sc.next());
            System.out.println("Enter The Email ID : ");
            contact.setEmail(sc.next());
            System.out.println("Enter Zip Code : ");
            contact.setZip(sc.next());
        }
    }
    public void findState() {
        System.out.println("Enter The State");
        String stateName = sc.next();
        for (int i = 0; i < contactlist.size(); i++) {
            Contact contact = contactlist.get(i);
            if (stateName.equals(contact.getState())) {
                System.out.println(contact.getFirstName());
                System.out.println(contact.getMobno());
            }
        }
    }
   public void delete(){
       System.out.println("Enter Delete Name");
       String delete = sc.next();
       for (int i = 0 ; i < contactlist.size() ; i++){
           Contact contact = contactlist.get(i);
           if(delete.equals(contact.getFirstName())){
               contactlist.remove(i);
           }
       }
   }
    public void backupToFile(){
        String contactData = null ;
        for (int i =0 ; i < contactlist.size() ; i++){
            Contact contact = contactlist.get(i);
            contactData = contact.getFirstName()+","+contact.getLastName()+","+contact.getAddress()+","+contact.getCity()+"'"+
                    contact.getState()+"'"+contact.getMobno()+","+contact.getEmail()+","+contact.getZip()+"\n"+contactData;

        }
        try {
            Path file = Paths.get("MyData");
            byte[] filedata = contactData.getBytes();
                Files.write(file, filedata);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int choice;
        do {
            System.out.println("*** CONTACT INVENTORY MANAGEMENT ***");
            System.out.println("\n1. ADD CONTACT \n2. DISPLAY CONTACT \n3. Edit Contact \n4. Find State \n5. Delete Contact \n6. Backup To File \n7. Exxit  ");
            System.out.println("Enter Your Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.displayContact();
                    break;
                case 3:
                    addressBook.editContact();
                    break;
                case 4:
                    addressBook.findState();
                case 5:
                    addressBook.delete();
                    break;
                case 6:
                    addressBook.backupToFile();
                    break;
            }
        } while (choice != 7);
    }
}