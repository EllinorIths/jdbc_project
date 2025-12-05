package se.iths.ellinor.jdbcproject;

import java.sql.Date;

public class Person {
    private Integer personID;
    private String firstName;
    private String lastName;
    private java.sql.Date dob;
    private double income;

    public Person(Integer personID, String firstName, String lastName,
                  java.sql.Date dob, double income) {
        this.personID = personID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.income = income;
    }

    public Person(String firstName, String lastName, java.sql.Date dob, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.income = income;
    }

    public Integer getPersonID() {
        return personID;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public Date getDob() {
        return dob;
    }


    public double getIncome() {
        return income;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID=" + personID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", income=" + income +
                '}';
    }
}
