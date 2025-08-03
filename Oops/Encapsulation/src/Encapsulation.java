// Encapsulation is the process of binding fields(variables) and methods that operate on that data into a single unit(through classes)
// and restricting access to some objects components to protect data from outside interference and misuse
// restriction through access modifiers like public, private and protected
// by default all fields and methods are private unless specified

//Encapsulation is necessary because it ensures data integrity, security, and modularity in your code. It helps you build robust, maintainable, and reusable software by protecting internal object state and exposing only what is required.
public class Encapsulation {
    private String name;
    private int age;

    Encapsulation(String name, int age){
        this.name = name;
        this.age = age;
    }

    // getter method for name
    public String getName(){
        return name;

    }

    // setter method for name
    public void setName(String name){
        this.name = name;
    }

    // getter method for age
    public int getAge(){
        return age;
    }

    // setter method for age
    public void setAge(int age){
       if(age > 0){
           this.age = age;
       }
    }

}
