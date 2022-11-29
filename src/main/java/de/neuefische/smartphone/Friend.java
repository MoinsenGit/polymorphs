package de.neuefische.smartphone;


public class Friend extends Contact{
    String phoneNumber;

    // Konstruktor leer
    public Friend() {
    }

    // Konstruktor
    public Friend(String contactName, String phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    String getName() {
        return this.contactName;
    }

    @Override
    public String toString() {
        return "Friend{" +
                ", contactName='" + contactName + '\'' +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
