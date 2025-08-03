// Inheritance is an Object oriented programming concept in which one class(called subclass) acquires properties and behaviors from another class (called base class)
// Inheritance can be exhibited  in java using extends and implements keyword
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        // inheriting fields and properties from base class
        s.name = "Michael";
        s.age = 25;
        s.branch = "Artificial intelligence and machine learning";

        s.introduce();
        s.study();
    }
}
