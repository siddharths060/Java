// Polymorphism where poly means many and morphism mean forms (ie, many forms)
//Polymorphism is the ability of the object to take many forms
// it allows interfaces and method to behave differently based on the objects invoking it
// there are two types of polymorphism :
// compile time(method overloading)
// run time (method overriding)



public class Main {
    public static void main(String[] args) {
        // method overriding
        Student s = new Student();
        s.study();
        System.out.println("method overriding");
        EngineeringStudent Es = new EngineeringStudent();
        Es.study();
        MedicalStudent Ms = new MedicalStudent();
        Ms.study();

        // method overloading

        Calculator c = new Calculator();
        System.out.println("method overloading");
        System.out.println( c.add(10));
        System.out.println(c.add(10 + 30));
    }
}
