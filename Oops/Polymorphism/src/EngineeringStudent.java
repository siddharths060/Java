public class EngineeringStudent extends Student {

    // method study is overriding (run time polymorphism) base class method study
    @Override
    void study(){
        System.out.println("Engineering Student is Studying Data Strucutures and Algorithms");
    }
}
