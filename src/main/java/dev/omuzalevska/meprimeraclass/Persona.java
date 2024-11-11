package dev.omuzalevska.meprimeraclass;

public class Persona {
    private String firstName;
    private String lastName;
    private String idNumber;
    private int birthYear;
    private String birthCountry;
    private char gender;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}