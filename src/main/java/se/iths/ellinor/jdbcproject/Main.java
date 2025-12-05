package se.iths.ellinor.jdbcproject;

import se.iths.ellinor.jdbcproject.dao.PersonDAO;
import se.iths.ellinor.jdbcproject.dao.PersonDAOimpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Skriver ut alla personer i listan
        PersonDAO dao = new PersonDAOimpl();

        List<Person> list = dao.findAll();
        for (Person person : list) {
            System.out.println(person);
        }

        //Infogar ny person i listan
        Person newPerson = new Person(
                "Ingvar",
                "Ivarsson",
                java.sql.Date.valueOf("1991-08-23"),
                33000
        );

        dao.insert(newPerson);

    }
}
