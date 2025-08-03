public class Main {
    public static void main(String[] args) {
        Class2  myclass = new Class2();
        // it is printing the subclass method ie, overriding the main class method
        // if we dont want to override the main method, then we make it final
        myclass.print();

        // also objects can be made final
        // once assigned a value it can never change
       final Class2 myfinalClass = new Class2();
       // lets say we try to call the object with a different constructor then it will throw an error
       myfinalClass = new Class2();


    }
}
