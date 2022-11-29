package de.neuefische;

public class Main {
    public static void main(String[] args) {

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
}