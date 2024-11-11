package dev.omuzalevska.meprimeraclass;

public class Persona {
    public String firstName;
    public String lastName;
    public String idNumber;
    public int birthYear;
    public String birthCountry;
    public char gender;

    public Persona(String firstName, String lastName, String idNumber,
            int birthYear, String birthCountry, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthYear = birthYear;
        this.birthCountry = birthCountry;
        this.gender = gender;
    }

    public void printDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("ID Document: " + idNumber);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Birth Country: " + birthCountry);
        System.out.println("Gender: " + gender);
    }
}