package DesignPatterns.Creational.Builder;

public class Runner {
    public static void main(String[] args) {
        Student s = new StudentBuilder("1", "Sujit")
        .className("Class1").build();
        System.out.println(s.toString());
    }
}
