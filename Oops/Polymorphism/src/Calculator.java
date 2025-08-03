public class Calculator {

    // this is an example of method overloading (ie, same function name but different digital signature)
    // method overloading is an example of compile time polymorphism
    int add(int a ){
        return a + a;
    }

    int add(int a, int b){
        return a + b;
    }
}
