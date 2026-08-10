package DesignPatterns.Creational.Builder;

public class StudentBuilder {
    String id;
    String firstName;
    String grade;
    String className;
    String lastName;

    public StudentBuilder(String id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public StudentBuilder id(String id) {
        this.id = id;
        return this;
    }

    public StudentBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder grade(String grade) {
        this.grade = grade;
        return this;
    }

    public StudentBuilder className(String className) {
        this.className = className;
        return this;
    }

    public StudentBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
