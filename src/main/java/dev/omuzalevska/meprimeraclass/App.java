package dev.omuzalevska.meprimeraclass;

public final class App { 
    public static void main(String[] args) {  

        Persona person1 = new Persona("Juan", 
                                      "Gomez", 
                                      "12345678", 
                                      1998, 
                                      "Spain", 
                                      'H');
        Persona person2 = new Persona("Maria", 
                                      "Gonzalez", 
                                      "87654321", 
                                      2014, 
                                      "Mexico", 
                                      'M');
        System.out.println("Details of Person 1:");
        person1.printDetails();
        
        System.out.println("Details of Person 2:");
        person2.printDetails();
    }
}
