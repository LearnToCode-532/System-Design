package DesignPatterns.Creational.Builder;

public class Student {
    private String id;
    private String firstName;
    private String grade;
    private String className;
    private String lastName;

    Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.id;
        this.firstName = studentBuilder.firstName;
        this.grade = studentBuilder.grade;
        this.className = studentBuilder.className;
        this.lastName = studentBuilder.lastName;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", grade=" + grade + ", className=" + className
                + ", lastName=" + lastName + "]";
    }
}
