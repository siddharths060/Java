// Final keyword in java is a modifier to apply restrictions on variables, methods and classes ensuring certain behaviors that promote immutability and safer code

// Final on variables
// final variables can only be assigned once
// typically it is for storing constants
// ex: public static final int PI = 3.14
// name convention for constants is all caps, if it is two words separate them with an underscore
// once assigned it cannot be changed


// final on classes
// when a class is made final, then nothing can extend from it, basically it prevents other classes to become subclass of the final class
// only make the class final if we don't want other classes to extend or inherit from it


// final on methods
// final is used on methods when we dont want the sub class to override the method present in the sub class
//
public  final class  Final_Keyword {
    final void print(){
        System.out.println("hello from final class !");

    }

}


