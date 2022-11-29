package de.neuefische;

import de.neuefische.smartphone.Contact;
import de.neuefische.smartphone.Friend;
import de.neuefische.smartphone.Smartphone;

public class Main {
    public static void main(String[] args) {
/*
        Cat cat1 = new Cat("Kitty", 3);
        Cat cat2 = new Cat("Fischi", 4);
        Dog dog1 = new Dog("Rex", 2);

        Cat[] catArray = {cat1, cat2};
        Dog[] dogArray = {dog1};

        Animal[] allAnimalsArray = {cat1, cat2, dog1};

        BiologyStudent BioStudent1 = new BiologyStudent("Hamburg", 1234);
        ComputerScienceStudent CsStudent1 = new ComputerScienceStudent("Bergen", 5678);

        Citizen[] allStudents = {BioStudent1, CsStudent1};

        for(int i = 0; i < allStudents.length; i++){
            System.out.println(allStudents[i]);
        }

    }

 */
        Contact[] contacts ={
                new Friend("123","muslim"),
                new Friend("456","Doreen"),
                new Friend("678","Adrian")};

        Smartphone smartphone= new Smartphone("Nokia","DE",contacts);

        for (int i = 0; i < smartphone.getContact().length; i++) {
            System.out.println(smartphone.getContact()[i]);
        }

        Friend friend = new Friend("8888","ThNewFriend");


        smartphone.addContact(friend);

        System.out.println("------------------------------");

        for (int i = 0; i < smartphone.getContact().length; i++) {
            System.out.println(smartphone.getContact()[i]);
        }

        System.out.println("----------------------------");

        System.out.println(smartphone.getByIndex(1));

        System.out.println("-------------------------");
        System.out.println(smartphone.getContactByName("Adrian"));


    }

}