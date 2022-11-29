package de.neuefische.smartphone;

import java.util.Arrays;

public class Smartphone implements Radio, GPS {

    String modelName;
    String manufacturer;
    Contact[] contact;

    public Smartphone() {
    }

    public Smartphone(String modelName, String manufacturer, Contact[] contact) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.contact = contact;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;

    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;

    }

    public Contact[] addContact(Contact newContact){
        Contact[] theNewContacts = new Contact[contact.length +1];

        for(int i = 0; i < contact.length; i++) {
            theNewContacts[i] = contact[i];
        }
        theNewContacts[theNewContacts.length - 1] = newContact;

        contact = theNewContacts;

        return contact;

    }

    public Contact getByIndex(int index){
        return contact[index];
    }

    public String getContactByName(String contactName) {
        for (int i = 0; i < contact.length; i++) {
            if(contact[i].getName().equals(contactName)) {

            }
        }

        return contactName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Contact[] getContact() {
        return contact;
    }

    public void setContact(Contact[] contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modelName='" + modelName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", contact=" + Arrays.toString(contact) +
                '}';
    }
}
