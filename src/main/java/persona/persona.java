package co.edu.cesde.ga.app;

import co.edu.cesde.ga.models.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person person = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person.setFirstName("John");
        person.getFirstName();

        person2.setFirstName("Juan");
        person2.getFirstName();

        person3.setFirstName("Erice");
        person3.getFirstName();
    }
}
package com.demo.domain;

import jakarta.persistence.*;
        import lombok.Data;

@Data
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String status;

    public Customer() {
    }

    public Customer(Long id, String firstName, String lastName, String email, String status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.status = status;
    }
} @Override
public String toString() {
    return "Cliente: " + this.firstName + " | Email: " + this.email;
}
}


