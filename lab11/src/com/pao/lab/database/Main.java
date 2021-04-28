package com.pao.lab.database;

import com.pao.lab.database.config.DataSetup;
import com.pao.lab.database.model.Person;
import com.pao.lab.database.repository.PersonRepository;

public class Main {

    public static void main(String[] args) {
        DataSetup setUpData = new DataSetup();

        setUpData.setUp();
        setUpData.addPerson();
        setUpData.displayPerson();

        PersonRepository personRepository = new PersonRepository();
        Person person = personRepository.getPersonById(1);

        System.out.println("Name = " + person.getName());

        personRepository.updatePersonName("Silvia", 1);
        Person updatedPerson = personRepository.getPersonById(1);

        System.out.println("Name = " + updatedPerson.getName());

        personRepository.insertPerson(new Person("Silvia2", 26));

    }
}
