package co.edu.cesde.ga.models;

public class Student extends Person {

    private String birthDate;

    public Student() {
        super();
    }

    public Student(Long userId, String code, String documentNumber, String firstName, String lastName, String birthDate) {
        super(userId, code, documentNumber, firstName, lastName);
        this.birthDate = birthDate;
    }
}