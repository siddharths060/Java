public class Class2 extends Final_Keyword{
    // here as i am trying to inherit or extend from Final_Keyword it is giving an error
    void print(){
        // here we are overriding the main class method print()
        System.out.println("Hello from subclass!");
        // once it is made final we get an error message :
        // java: print() in Class2 cannot override print() in Final_Keyword
        //  overridden method is final

    }

}
