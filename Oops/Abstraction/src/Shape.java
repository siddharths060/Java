// Abstraction is the process of hiding the internal implementation while exposing only the essential details or features of an object
// it allows users to interact with objects at a higher level rather than the internal details

// Abstraction is achieved using the abstract keyword (abstract classes) and Interfaces

public abstract class Shape {
    String name;
    // this being a abstract class, if any class inherits from Shape, then the area() method must be implemented
    abstract double area();
    // concrete class (ie, the inherited class does not need to implement this method)
    void print(){
        System.out.println("This is a Shape!");
    }
}
